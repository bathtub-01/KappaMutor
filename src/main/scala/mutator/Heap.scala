package mutator

import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._

class Heap extends Module {
  val io = IO(new SRAMInterface(heapSize, new Application, 0, 0, 2))
  io :<>= SRAM(heapSize, new Application, 0, 0, 2)
}

object Heap extends App {
  ChiselStage.emitSystemVerilogFile(
    new Heap,
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}