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

  // SIII(BKK)(II)I(III) - example without let-bindings
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

  // B(SIII)(K(II)S)((BKK)(II)I(III)) - example with multiple let-bindings (pipeline needed)
  val prog2: Bin = Seq(
    templateBuilder(
      appBuilder(B, funBuilder(1), funBuilder(2), funBuilder(3)),
      0
    ),
    templateBuilder(
      appBuilder(S, I, I, I),
      0
    ),
    templateBuilder(
      appBuilder(K, ptrBuilder(0), S),
      1,
      appBuilder(I, I)
    ),
    templateBuilder(
      appBuilder(ptrBuilder(0), ptrBuilder(1), I, ptrBuilder(2)),
      3,
      appBuilder(B, K, K),
      appBuilder(I, I),
      appBuilder(I, I, I)
    )
  )

  // SII((BKK)III) - example of re-computation (need heap update)
  val prog3: Bin = Seq(
    templateBuilder(
      appBuilder(S, I, I, ptrBuilder(0)),
      1,
      appBuilder(funBuilder(1), I, I, I)
    ),
    templateBuilder(
      appBuilder(B, K, K),
      0
    )
  )
}

object ProgramMem extends App {
  ChiselStage.emitSystemVerilogFile(
    new ProgramMem(ExampleBins.prog1),
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}