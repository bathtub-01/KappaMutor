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
    val stkElms = Output(UInt(log2Ceil(stackTotalSize + 1).W))
    val updStkElms = Output(UInt(log2Ceil(updateStackSize + 1).W))
    val done = Output(Bool())
    val progInject = Input(Bool())
    val progInjectIO = Input(new Application)
    // =========== profiling ports =============
    val heapCsm = Output(UInt(log2Ceil(heapSize + 1).W))
    val ptrRed = Output(Bool())
    val combRed = Output(Bool())
    val combRed_ = Output(Bool()) // second stage comb reduce
    val intRedApp = Output(Bool())
    val intRedSwap = Output(Bool())
    val prmRed = Output(Bool())
    val yRed = Output(Bool())
    val heapUpd = Output(Bool())
    val heapUpdImp = Output(Bool())
    val pipeImp = Output(Bool())
    val combHole1 = Output(Bool())
    val combHole2 = Output(Bool())
    val combHole3 = Output(Bool())
    val combHole4 = Output(Bool())
    val combHole5 = Output(Bool())
    val combHole6 = Output(Bool())
    val combApp0 = Output(Bool())
    val combApp1 = Output(Bool())
    val combApp2 = Output(Bool())
    val combApp3 = Output(Bool())
    val combArity = Output(UInt(comArity.W))
  })
  object StmState extends ChiselEnum {
    val idle = Value
    val working = Value
  }

  val reductionStk = Module(new XRegStack(stackN, stackSizeEach, new Atom))
  val heap = Module(new Heap)
  val decoder = Module(new Decoder)
  val alu = Module(new TypedALU)
  val updateStk = Module(new RegStack(updateStackSize, new UpdateRecord))

  val stmReg = RegInit(StmState.idle)
  val heapBumper = RegInit(0.U(log2Ceil(heapSize + 1).W))
  val needWrite = RegInit(false.B)
  val pipelineReg = RegInit(0.U.asTypeOf(new Application))

  val needUpdate = Wire(Bool())
  val stuckAll = Wire(Bool())

  def atomCount(app: Vec[Atom]): UInt = { // maybe look at Vec.lastIndexWhere?
    app.count(atom => atom.atomType =/= AtomType.NOP)
  }

  /*
   If an arity is wrongly too big, update will happen too early, causing duplicated computation.
   If an arity is wrongly too small, necessary update won't happen, causing wrong results.
  */
  def arity(atom: Atom): UInt = {
    val res = Wire(UInt(3.W))
    when(atom.atomType === AtomType.NOP || atom.atomType === AtomType.PTR) {
      res := 0.U
    }.elsewhen(atom.atomType === AtomType.COM) {
      res := atom.payload.asTypeOf(new ComPayload).arity
    }.elsewhen(atom.atomType === AtomType.INT) {
      res := 2.U
    }.otherwise { // PRM Y
      res := 1.U
    }
    res
  }

  def isReducible(app: Vec[Atom]): Bool = {
    arity(app(0)) < atomCount(app)
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
  updateStk.init
  needUpdate := false.B
  stuckAll := false.B

  io.stkTops := reductionStk.io.top
  io.stkElms := reductionStk.io.elms
  io.updStkElms := updateStk.io.elms
  // =========== profiling ports =============
  io.heapCsm := heapBumper
  io.ptrRed := false.B
  io.combRed := false.B
  io.combRed_ := false.B
  io.intRedApp := false.B
  io.intRedSwap := false.B
  io.prmRed := false.B
  io.yRed := false.B
  io.heapUpd := false.B
  io.heapUpdImp := false.B
  io.pipeImp := false.B
  io.combHole1 := false.B
  io.combHole2 := false.B
  io.combHole3 := false.B
  io.combHole4 := false.B
  io.combHole5 := false.B
  io.combHole6 := false.B
  io.combApp0 := false.B
  io.combApp1 := false.B
  io.combApp2 := false.B
  io.combApp3 := false.B
  io.combArity := 0.U

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
    // use the `needUpdate` signal to shadow all the rules
    when(updateStk.io.elms > 0.U && arity(reductionStk.io.top(0)) > reductionStk.io.elms - updateStk.io.top.stackDepth) {  
      needUpdate := true.B
      stuckAll := needWrite || (arity(reductionStk.io.top(0)) > reductionStk.io.elms - updateStk.io.top.previousStackDepth)
      when(needWrite) {
        // stall and stuck all the reductions
      }.otherwise {
        val toWrite = Wire(new Application)
        toWrite.app.zipWithIndex.foreach { case(atom, idx) =>
          when(idx.U <= reductionStk.io.elms - updateStk.io.top.stackDepth) { 
            atom := reductionStk.io.top(idx)
          }.otherwise {
            atom := nopBuilder
          }
        }
        heapWrite(heap.io.readwritePorts(1), toWrite, updateStk.io.top.heapAddr)
        updateStk.pop
        // other rules might use heap port 0 for prefetching
        // =========== profiling ports =============
        io.heapUpd := true.B
      }
    }
    switch(reductionStk.io.top(0).atomType) {
      is(AtomType.PTR) { // assume: heap data is ready for read
        when(!needWrite) { // heap update never happens here
          val app = heap.io.readwritePorts(0).readData
          reductionStk.io.pop := 1.U
          reductionStk.io.push := atomCount(app.app)
          reductionStk.io.din.zip(app.app).foreach{case(port, a) => port := a}
          preFetch(reductionStk.io.din(0).payload)
          // push to update stack when the app is reducible
          when(isReducible(app.app)) {
            val toPush = Wire(new UpdateRecord)
            toPush.stackDepth := reductionStk.io.elms
            toPush.heapAddr := reductionStk.io.top(0).payload
            toPush.previousStackDepth := updateStk.io.top.stackDepth
            updateStk.push(toPush)
          }
          // =========== profiling ports =============
          io.ptrRed := true.B
        }.otherwise { /* stalled, keep reading to maintain the assumption */ 
          // assumption: in a stalled cycle, heap port 0 is always free for reading
          preFetch(reductionStk.io.top(0).payload)
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
              wire := nopBuilder
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
          reductionStk.io.pop := comPayload.arity +& 1.U // need to express 8
          reductionStk.io.push := spineValid
          reductionStk.io.din.zip(decoder.spine).foreach{case(port, e) => port := translates(e)}
        }

        def countHoles(): Unit = {
          io.combHole1 := comPayload.pattern === 0.U
          io.combHole2 := comPayload.pattern === 1.U
          io.combHole3 := comPayload.pattern >= 2.U && comPayload.pattern <= 3.U
          io.combHole4 := comPayload.pattern >= 4.U && comPayload.pattern <= 8.U
          io.combHole5 := comPayload.pattern >= 9.U && comPayload.pattern <= 22.U
          io.combHole6 := comPayload.pattern >= 23.U

          io.combArity := comPayload.arity
        }

        when(/*!needUpdate*/!stuckAll) {
          when(app1Valid === 0.U) {
            // only spine
            stackUpdate()
            preFetch(reductionStk.io.din(0).payload)
            // =========== profiling ports =============
            io.combRed := true.B
            io.combApp0 := true.B
            countHoles()
            io.heapUpdImp := needUpdate
            io.pipeImp := needWrite
          }.elsewhen(needWrite || needUpdate) {
            // stalled, don't need maintainance reading
          }.elsewhen(app2Valid === 0.U) {
            // spine + app1
            stackUpdate()
            heapWrite(heap.io.readwritePorts(1), translate(decoder.app1), heapBumper)
            heapBumper := heapBumper + 1.U
            preFetch(reductionStk.io.din(0).payload)
            // =========== profiling ports =============
            io.combRed := true.B
            io.combApp1 := true.B
            countHoles()
          }.elsewhen(app3Valid === 0.U) {
            // spine + app1 + app2
            stackUpdate()
            heapWrite(heap.io.readwritePorts(1), translate(decoder.app1), heapBumper)
            heapBumper := heapBumper + 1.U
            pushPipeline(translate(decoder.app2))
            // =========== profiling ports =============
            io.combRed := true.B
            io.combApp2 := true.B
            countHoles()
          }.otherwise {
            // spine + app1 + app2 + app3
            stackUpdate()
            heapWrite(heap.io.readwritePorts(0), translate(decoder.app1), heapBumper)
            heapWrite(heap.io.readwritePorts(1), translate(decoder.app2), heapBumper + 1.U)
            heapBumper := heapBumper + 2.U
            pushPipeline(translate(decoder.app3))
            // =========== profiling ports =============
            io.combRed := true.B
            io.combApp3 := true.B
            countHoles()
          }
        }
        
      }
      is(AtomType.INT) {
        val prmPayload: PrmPayload = reductionStk.io.top(1).payload.asTypeOf(new PrmPayload)
        when(/*!needUpdate*/!stuckAll) {
          when(reductionStk.io.top(1).atomType === AtomType.PTR) {
            reductionStk.io.pop := 2.U
            reductionStk.io.push := 2.U
            reductionStk.io.din(0) := reductionStk.io.top(1)
            reductionStk.io.din(1) := reductionStk.io.top(0)
            preFetch(reductionStk.io.din(0).payload)
            // =========== profiling ports =============
            io.intRedSwap := true.B
          }.elsewhen(reductionStk.io.top(2).atomType === AtomType.INT) {
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
            // =========== profiling ports =============
            io.intRedApp := true.B
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
            // =========== profiling ports =============
            io.intRedSwap := true.B
          }
          // =========== profiling ports =============
          io.heapUpdImp := needUpdate
          io.pipeImp := needWrite
        }
      }
      is(AtomType.PRM) {/* PRM won't be showing at stack top -- or maybe it will?*/
        // ad-hoc approach, to fix primitives being created on stack top during runtime (foldl (+) 0 [1..5])
        when(/*!needUpdate*/!stuckAll) {
          reductionStk.io.pop := 2.U
          reductionStk.io.push := 2.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
          reductionStk.io.din(1) := reductionStk.io.top(0)
          preFetch(reductionStk.io.din(0).payload)
          // =========== profiling ports =============
          io.prmRed := true.B
          io.heapUpdImp := needUpdate
          io.pipeImp := needWrite
        }
      }
      is(AtomType.Y) { 
        when(needWrite || needUpdate) {
          // stalled, don't need maintainance reading
        }.otherwise {
          reductionStk.io.pop := 2.U
          reductionStk.io.push := 2.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
          reductionStk.io.din(1).atomType := AtomType.PTR
          reductionStk.io.din(1).payload := heapBumper
          heap.io.readwritePorts(1).enable := true.B
          heap.io.readwritePorts(1).isWrite := true.B
          heap.io.readwritePorts(1).address := heapBumper
          heap.io.readwritePorts(1).writeData.app(0) := reductionStk.io.top(1)
          heap.io.readwritePorts(1).writeData.app(1).atomType := AtomType.PTR
          heap.io.readwritePorts(1).writeData.app(1).payload := heapBumper
          preFetch(reductionStk.io.din(0).payload)
          heapBumper := heapBumper + 1.U
          // =========== profiling ports =============
          io.yRed := true.B
        }
      }
      is(AtomType.ERROR) {
        stop()
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
    // =========== profiling ports =============
    io.combRed_ := true.B
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
