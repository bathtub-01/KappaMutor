package mutator

import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage

import common._

class Heap(depth: Int) extends Module {
  val io = IO(new SRAMInterface(depth, new Apps, 0, 0, 2))
  io :<>= SRAM(depth, new Apps, 0, 0, 2)
}

object Heap extends App {
  ChiselStage.emitSystemVerilogFile(
    new Heap(1024),
    Array("--target-dir", "generated"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}