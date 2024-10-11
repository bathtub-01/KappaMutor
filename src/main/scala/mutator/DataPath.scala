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
  val programMem = Module(new ProgramMem(ExampleBins.prog1))

  val stmReg = RegInit(StmState.idle)
  val heapBumper = RegInit(0.U(log2Ceil(heapSize).W))

  def atomCount(app: Vec[Atom]): UInt = { // maybe look at Vec.lastIndexWhere?
    app.map(atom => 
      if(atom.atomType == AtomType.NOP) 0.U else 1.U).reduce(_ +& _)
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
  io.done := false.B
  reductionStk.io.push := 0.U
  reductionStk.io.pop := 0.U
  reductionStk.io.din := DontCare
  heap.io.readwritePorts := DontCare
  heap.io.readwritePorts(0).enable := false.B
  heap.io.readwritePorts(1).enable := false.B
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
        val newSpineApps = ptrRedirect(spine.app)
        reductionStk.io.pop := 1.U
        reductionStk.io.push := atomCount(spine.app)
        reductionStk.io.din.zip(newSpineApps).foreach{case(port, a) => port := a}
        // write apps to the heap (remember to increase heapBumper)
        // route: no heap write -> add single heap write -> add pipelined heap write
        preFetch(newSpineApps(0).payload)
      }
      is(AtomType.PTR) { // assume: heap data is ready for read
        val app = heap.io.readwritePorts(0).readData
        reductionStk.io.pop := 1.U
        reductionStk.io.push := atomCount(app.app)
        reductionStk.io.din.zip(app.app).foreach{case(port, a) => port := a}
        preFetch(app.app(0).payload)
      }
      is(AtomType.COM) {

      }
      is(AtomType.NOP) {/* do nothing */}
    }
  }
}

object DataPath extends App {
  ChiselStage.emitSystemVerilogFile(
    new DataPath,
    Array("--target-dir", "generated"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}