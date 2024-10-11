package mutator

import chisel3._
import chisel3.util._
import chisel3.experimental.BundleLiterals._
import chisel3.experimental.VecLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._
import common.Helper._

class ProgramMem(bin: Seq[Template]) extends Module {
  val io = IO(new RomIO(programMemSize, new Template))

  val rom = Module(new BlockMemRom(programMemSize, new Template)(bin))
  io :<>= rom.io
}

object ExampleBins {
  type Bin = Seq[Template]

  val I: Atom = comBuilder(1, 0, List(0)) // X
  val K: Atom = comBuilder(2, 0, List(0)) // X
  val B: Atom = comBuilder(3, 1, List(0, 1, 2)) // X(XX)
  val S: Atom = comBuilder(3, 2, List(0, 2, 1, 2)) // (XX)(XX)

  // SIII(BKK)(II)I(III)
  val prog1: Bin = Seq(
    templateBuilder(
      appBuilder(funBuilder(1), funBuilder(2), funBuilder(3), I, funBuilder(4)),
      0
    ),
    templateBuilder(
      appBuilder(S, I, I, I),
      0
    ),
    templateBuilder(
      appBuilder(B, K, K),
      0
    ),
    templateBuilder(
      appBuilder(I, I),
      0
    ),
    templateBuilder(
      appBuilder(I, I, I),
      0
    )
  )
}

object ProgramMem extends App {
  ChiselStage.emitSystemVerilogFile(
    new ProgramMem(ExampleBins.prog1),
    Array("--target-dir", "generated"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}