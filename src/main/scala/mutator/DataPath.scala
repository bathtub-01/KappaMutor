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
  })
  object StmState extends ChiselEnum {
    val idle = Value
    val working = Value
  }

  val reductionStk = Module(new XRegStack(stackN, stackSizeEach, new Atom))
  val heap = Module(new Heap)
  val programMem = Module(new ProgramMem(ExampleBins.prog3))

  val stmReg = RegInit(StmState.idle)
  val heapBumper = RegInit(0.U(log2Ceil(heapSize).W))

  def atomCount(app: Vec[Atom]): UInt = { // maybe look at Vec.lastIndexWhere?
    // app.map(atom => 
    //   if(atom.atomType == AtomType.NOP) 0.U else 1.U).reduce(_ +& _)
    app.count(atom => atom.atomType =/= AtomType.NOP)
  }

  def preFetch(addr: UInt): Unit = {
      // pre-fetch to maintain the assumption
      heap.io.readwritePorts(0).enable := true.B
      heap.io.readwritePorts(0).isWrite := false.B
      heap.io.readwritePorts(0).address := addr
      programMem.io.rdAddr := addr
  }

  def ptrRedirect(app: Vec[Atom]): Vec[Atom] = {
    def red(atom: Atom): Atom = {
      if(atom.atomType == AtomType.PTR)
        atom.Lit(_.payload -> (atom.payload + heapBumper))
      else
        atom
    }
    VecInit(app.map(red))
  }

  // ============= initialization =====================
  io.done := stmReg === StmState.idle
  reductionStk.io.push := 0.U
  reductionStk.io.pop := 0.U
  reductionStk.io.din.foreach(p => p := nopBuilder)
  heap.io.readwritePorts(0).enable := false.B
  heap.io.readwritePorts(0).address := 0.U
  heap.io.readwritePorts(0).writeData := DontCare
  heap.io.readwritePorts(0).isWrite:= false.B
  heap.io.readwritePorts(1).enable := false.B
  heap.io.readwritePorts(1).address := 0.U
  heap.io.readwritePorts(1).writeData := DontCare
  heap.io.readwritePorts(1).isWrite:= false.B
  programMem.io.rdAddr := 0.U
  // ==================================================

  io.stkTops := reductionStk.io.top
  io.stkElms := reductionStk.io.elms
  
  when(io.start && reductionStk.io.elms === 0.U) {
    stmReg := StmState.working
    reductionStk.io.push := 1.U
    reductionStk.io.pop := 0.U
    reductionStk.io.din(0) := funBuilder(0)
    programMem.io.rdAddr := 0.U
  }

  when(stmReg === StmState.working) {
    switch(reductionStk.io.top(0).atomType) {
      is(AtomType.FUN) { // assume: program mem data is ready for read
        val template = programMem.io.rdData
        val spine = template.spine
        val newSpine = ptrRedirect(spine.app)
        reductionStk.io.pop := 1.U
        reductionStk.io.push := atomCount(spine.app)
        reductionStk.io.din.zip(newSpine).foreach{case(port, a) => port := a}
        // FIXME: for now we only have 0~1 let bindings, add pipeline for more let bindings
        // route: no heap write -> add single heap write -> add pipelined heap write
        when(template.appsNum =/= 0.U) {
          heap.io.readwritePorts(1).enable := true.B
          heap.io.readwritePorts(1).isWrite := true.B
          heap.io.readwritePorts(1).writeData := template.apps(0)
          heap.io.readwritePorts(1).address := heapBumper
          heapBumper := heapBumper + 1.U
        }
        preFetch(newSpine(0).payload)
      }
      is(AtomType.PTR) { // assume: heap data is ready for read
        val app = heap.io.readwritePorts(0).readData
        reductionStk.io.pop := 1.U
        reductionStk.io.push := atomCount(app.app)
        reductionStk.io.din.zip(app.app).foreach{case(port, a) => port := a}
        preFetch(app.app(0).payload)
      }
      is(AtomType.COM) {
        // TODO: support REAL structured combinator
        val comPayload: ComPayload = reductionStk.io.top(0).payload.asTypeOf(new ComPayload)
        when(comPayload.arity === 1.U) { // I
          reductionStk.io.pop := 2.U
          reductionStk.io.push := 1.U
          reductionStk.io.din(0) := reductionStk.io.top(1) 
        }.elsewhen(comPayload.arity === 2.U) { // K
          reductionStk.io.pop := 3.U
          reductionStk.io.push := 1.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
        }.elsewhen(comPayload.arity === 3.U && comPayload.pattern === 1.U) { // B
          reductionStk.io.pop := 4.U
          reductionStk.io.push := 2.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
          reductionStk.io.din(1).atomType := AtomType.PTR
          reductionStk.io.din(1).payload := heapBumper
          heap.io.readwritePorts(1).enable := true.B
          heap.io.readwritePorts(1).isWrite := true.B
          heap.io.readwritePorts(1).writeData.app(0) := reductionStk.io.top(2)
          heap.io.readwritePorts(1).writeData.app(1) := reductionStk.io.top(3)
          heap.io.readwritePorts(1).address := heapBumper
          heapBumper := heapBumper + 1.U          
        }.elsewhen(comPayload.arity === 3.U && comPayload.pattern === 2.U) { // S
          reductionStk.io.pop := 4.U
          reductionStk.io.push := 3.U
          reductionStk.io.din(0) := reductionStk.io.top(1)
          reductionStk.io.din(1) := reductionStk.io.top(3)
          reductionStk.io.din(2).atomType := AtomType.PTR
          reductionStk.io.din(2).payload := heapBumper
          heap.io.readwritePorts(1).enable := true.B
          heap.io.readwritePorts(1).isWrite := true.B
          heap.io.readwritePorts(1).writeData.app(0) := reductionStk.io.top(2)
          heap.io.readwritePorts(1).writeData.app(1) := reductionStk.io.top(3)
          heap.io.readwritePorts(1).address := heapBumper
          heapBumper := heapBumper + 1.U    
        }.otherwise { }
        preFetch(reductionStk.io.top(1).payload) // this should be combinator specific...
      }
      is(AtomType.NOP) {/* do nothing */}
    }
  }

  when(reductionStk.io.top(0).atomType === AtomType.COM) {
    val comPayload: ComPayload = reductionStk.io.top(0).payload.asTypeOf(new ComPayload)
    when(comPayload.arity + 1.U > reductionStk.io.elms) {
      stmReg := StmState.idle
      reductionStk.io.push := 0.U
      reductionStk.io.pop := 0.U
      heap.io.readwritePorts(0).enable := false.B
      heap.io.readwritePorts(1).enable := false.B
      programMem.io.rdAddr := 0.U
    }
  }
}

object DataPath extends App {
  ChiselStage.emitSystemVerilogFile(
    new DataPath,
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}