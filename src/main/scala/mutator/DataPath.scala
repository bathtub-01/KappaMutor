package mutator

import chisel3._
import chisel3.util._
import chisel3.experimental.BundleLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._
import common.Helper._

class DataPath extends Module {
  val io = IO(new Bundle {
    val start = Input(Bool())
    val stkTops = Output((Vec(stackN, new Atom)))
    val stkElms = Output(UInt(log2Ceil(stackN * stackSizeEach + 1).W))
    val done = Output(Bool())
    val progInject = Input(Bool())
    val progInjectIO = Input(new Application)
  })
  object StmState extends ChiselEnum {
    val idle = Value
    val working = Value
  }

  val reductionStk = Module(new XRegStack(stackN, stackSizeEach, new Atom))
  val heap = Module(new Heap)
  val decoder = Module(new Decoder)
  val alu = Module(new TypedALU)

  val stmReg = RegInit(StmState.idle)
  val heapBumper = RegInit(0.U(log2Ceil(heapSize).W))
  val needWrite = RegInit(false.B)
  val pipelineReg = RegInit(0.U.asTypeOf(new Application))

  def atomCount(app: Vec[Atom]): UInt = { // maybe look at Vec.lastIndexWhere?
    app.count(atom => atom.atomType =/= AtomType.NOP)
  }

  def preFetch(addr: UInt): Unit = {
    // pre-fetch to maintain the assumption
    // always pre-fetch at heap port 0
    heap.io.readwritePorts(0).enable := true.B
    heap.io.readwritePorts(0).isWrite := false.B
    heap.io.readwritePorts(0).address := addr
  }

  def heapWrite(port: MemoryReadWritePort[Application], wData: Application, wAddr: UInt): Unit = {
    port.enable := true.B
    port.isWrite := true.B
    port.writeData := wData
    port.address := wAddr
  }

  def pushPipeline(data: Application): Unit = {
    pipelineReg := data
    needWrite := true.B
  }

  // ============= initialization =====================
  io.done := stmReg === StmState.idle
  reductionStk.io.push := 0.U
  reductionStk.io.pop := 0.U
  reductionStk.io.din.foreach(p => p := nopBuilder)
  heap.io.readwritePorts(0).enable := false.B             // FIXME: abstract this long thing as helper functions
  heap.io.readwritePorts(0).address := 0.U
  heap.io.readwritePorts(0).writeData := 0.U.asTypeOf(new Application)
  heap.io.readwritePorts(0).isWrite:= false.B
  heap.io.readwritePorts(1).enable := false.B
  heap.io.readwritePorts(1).address := 0.U
  heap.io.readwritePorts(1).writeData := 0.U.asTypeOf(new Application)
  heap.io.readwritePorts(1).isWrite:= false.B
  decoder.in := DontCare
  alu.io.fn := DontCare
  alu.io.in1 := DontCare
  alu.io.in2 := DontCare

  io.stkTops := reductionStk.io.top
  io.stkElms := reductionStk.io.elms
  // ==================================================

  // ============= program injection ==================
  when(stmReg === StmState.idle && io.progInject) {
    heapWrite(heap.io.readwritePorts(0), io.progInjectIO, heapBumper)
    heapBumper := heapBumper + 1.U
  }

  // ============= startup logic ======================
  when(io.start && reductionStk.io.elms === 0.U) {
    stmReg := StmState.working
    reductionStk.io.push := 1.U
    reductionStk.io.pop := 0.U
    reductionStk.io.din(0) := ptrBuilder(0)
    // read fun0 from heap
    preFetch(0.U)
  }
  // ==================================================
 
  // ============= reduction logic ====================
  when(stmReg === StmState.working) {
    switch(reductionStk.io.top(0).atomType) {
      is(AtomType.PTR) { // assume: heap data is ready for read
        when(!needWrite) {
          val app = heap.io.readwritePorts(0).readData
          reductionStk.io.pop := 1.U
          reductionStk.io.push := atomCount(app.app)
          reductionStk.io.din.zip(app.app).foreach{case(port, a) => port := a}
          preFetch(app.app(0).payload)
        }.otherwise { /* stalled, keep reading to maintain the assumption */ 
          // assumption: in a stalled cycle, heap port 0 is always free for reading
          heap.io.readwritePorts(0).enable := true.B
          heap.io.readwritePorts(0).isWrite := false.B
          heap.io.readwritePorts(0).address := reductionStk.io.top(0).payload
        }
      }
      is(AtomType.COM) {
        val comPayload: ComPayload = reductionStk.io.top(0).payload.asTypeOf(new ComPayload)
        decoder.in := comPayload.pattern
        val spineValid = decoder.spine.count(_.idx =/= 0b111.U)
        val app1Valid = decoder.app1.count(_.idx =/= 0b111.U)
        val app2Valid = decoder.app2.count(_.idx =/= 0b111.U)
        val app3Valid = decoder.app3.count(_.idx =/= 0b111.U)

        def translates(e: mutator.Element): Atom = {
          val wire = Wire(new Atom)
          when(e.typ) { // PTR
            wire.atomType := AtomType.PTR
            wire.payload := e.idx + heapBumper
          }.otherwise { // ARG
            when(e.idx === 0b111.U) {
              wire := 0.U.asTypeOf(new Atom)
            }.otherwise {
              wire := reductionStk.io.top(comPayload.idxs(e.idx) + 1.U)
            } 
          }
          wire
        }

        def translate(es: Vec[mutator.Element]): Application = {
          val wires = Wire(new Application)
          wires := 0.U.asTypeOf(new Application)
          es.zip(wires.app).foreach{ case(e, wire) =>
            wire := translates(e)
          }
          wires
        }

        def stackUpdate(): Unit = {
          reductionStk.io.pop := comPayload.arity + 1.U
          reductionStk.io.push := spineValid
          reductionStk.io.din.zip(decoder.spine).foreach{case(port, e) => port := translates(e)}
        }

        when(app1Valid === 0.U) {
          stackUpdate()
          preFetch(reductionStk.io.din(0).payload)
        }.elsewhen(needWrite) {
          // stalled, don't need maintainance reading
        }.elsewhen(app2Valid === 0.U) {
          // spine + app1
          stackUpdate()
          heapWrite(heap.io.readwritePorts(1), translate(decoder.app1), heapBumper)
          heapBumper := heapBumper + 1.U
          preFetch(reductionStk.io.din(0).payload)
        }.elsewhen(app3Valid === 0.U) {
          // spine + app1 + app2
          stackUpdate()
          heapWrite(heap.io.readwritePorts(1), translate(decoder.app1), heapBumper)
          heapBumper := heapBumper + 1.U
          pushPipeline(translate(decoder.app2))
        }.otherwise {
          // spine + app1 + app2 + app3
          stackUpdate()
          heapWrite(heap.io.readwritePorts(0), translate(decoder.app1), heapBumper)
          heapWrite(heap.io.readwritePorts(1), translate(decoder.app2), heapBumper + 1.U)
          heapBumper := heapBumper + 2.U
          pushPipeline(translate(decoder.app3))
        }
      }
      is(AtomType.INT) {
        val prmPayload: PrmPayload = reductionStk.io.top(1).payload.asTypeOf(new PrmPayload)
        when(reductionStk.io.top(2).atomType === AtomType.INT) {
          when(prmPayload.swap) {
            alu.io.in1 := reductionStk.io.top(2).payload
            alu.io.in2 := reductionStk.io.top(0).payload
          }.otherwise {
            alu.io.in1 := reductionStk.io.top(0).payload
            alu.io.in2 := reductionStk.io.top(2).payload
          }
          alu.io.fn := prmPayload.fun
          reductionStk.io.pop := 3.U
          reductionStk.io.push := 1.U
          reductionStk.io.din(0) := alu.io.out
          // no prefetch needed
        }.otherwise {
          val newPrm = Wire(new PrmPayload)
          newPrm.fun := prmPayload.fun
          newPrm.swap := ~prmPayload.swap
          reductionStk.io.pop := 3.U
          reductionStk.io.push := 3.U
          reductionStk.io.din(0) := reductionStk.io.top(2)
          reductionStk.io.din(1).atomType := AtomType.PRM
          reductionStk.io.din(1).payload := newPrm.asUInt
          reductionStk.io.din(2) := reductionStk.io.top(0)
          preFetch(reductionStk.io.din(0).payload)
        }
      }
      is(AtomType.PRM) {/* PRM won't be showing at stack top -- or maybe it will?*/
        // ad-hoc approach, to fix primitives being created on stack top during runtime (foldl (+) 0 [1..5])
        reductionStk.io.pop := 2.U
        reductionStk.io.push := 2.U
        reductionStk.io.din(0) := reductionStk.io.top(1)
        reductionStk.io.din(1) := reductionStk.io.top(0)
        preFetch(reductionStk.io.top(1).payload)
      }
      is(AtomType.Y) { // TODO: improve this to not create new instances every time.
        when(needWrite) {
          // stalled
        }.otherwise {
          reductionStk.io.pop := 2.U
          reductionStk.io.push := 2.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
          reductionStk.io.din(1).atomType := AtomType.PTR
          reductionStk.io.din(1).payload := heapBumper
          heap.io.readwritePorts(1).enable := true.B
          heap.io.readwritePorts(1).isWrite := true.B
          heap.io.readwritePorts(1).address := heapBumper
          heap.io.readwritePorts(1).writeData.app(0).atomType := AtomType.Y
          heap.io.readwritePorts(1).writeData.app(1) := reductionStk.io.top(1)
          preFetch(reductionStk.io.top(1).payload)
          heapBumper := heapBumper + 1.U
        }
      }
      is(AtomType.NOP) {/* do nothing */
        heapBumper := 0.U
      }
    }
  }
  
  when(needWrite) { // second-stage logic, maintianance reading is not handled here
    heapWrite(heap.io.readwritePorts(1), pipelineReg, heapBumper)
    heapBumper := heapBumper + 1.U
    needWrite := false.B
  }
  // ==================================================

  // ============= termination logic ==================
  def stop(): Unit = {
    stmReg := StmState.idle
    reductionStk.io.push := 0.U
    reductionStk.io.pop := 0.U
    heap.io.readwritePorts(0).enable := false.B
    heap.io.readwritePorts(1).enable := false.B
  }

  when(reductionStk.io.top(0).atomType === AtomType.COM) {
    val comPayload: ComPayload = reductionStk.io.top(0).payload.asTypeOf(new ComPayload)
    when(comPayload.arity + 1.U > reductionStk.io.elms) {
      stop()
    }
  }.elsewhen(reductionStk.io.top(0).atomType === AtomType.INT) {
    when(reductionStk.io.elms === 1.U) {
      stop()
    }
  }
  // ==================================================
}

object DataPath extends App {
  ChiselStage.emitSystemVerilogFile(
    new DataPath,
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}
