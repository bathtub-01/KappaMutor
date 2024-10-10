package mutator

import chisel3._
import chisel3.util._
import chisel3.experimental.BundleLiterals._
import chisel3.experimental.VecLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._

class ProgramMem(bin: Seq[Template]) extends Module {
  val io = IO(new RomIO(programMemSize, new Template))

  val rom = Module(new BlockMemRom(programMemSize, new Template)(bin))
  io :<>= rom.io
}

object ExampleBins {
  type Bin = Seq[Template]
  def padWith[T](l: List[T], expectedLen: Int, default: T): List[T] = {
    if(l.length == expectedLen)
      l
    else 
      l ++ List.fill(expectedLen - l.length)(default)
  }
  def nopBuilder: Atom = 
    (new Atom).Lit(
      _.atomType -> AtomType.NOP,
      _.payload -> 0.U
    )
  def funBuilder(pointer: Int): Atom = 
    (new Atom).Lit(
      _.atomType -> AtomType.FUN,
      _.payload -> pointer.U
    )
  def ptrBuilder(pointer: Int): Atom =
    (new Atom).Lit(
      _.atomType -> AtomType.PTR,
      _.payload -> pointer.U
    )
  def comBuilder(arity: Int, pattern: Int, idxs: List[Int]): Atom = 
    (new Atom).Lit(
      _.atomType -> AtomType.COM,
      _.payload -> (new ComPayload).Lit(
        _.arity -> arity.U,
        _.pattern -> pattern.U,
        _.idxs -> Vec.Lit(padWith(idxs.map(_.U(log2Ceil(comArity + 1).W)), comIdxs, 
                                  0.U(log2Ceil(comArity + 1).W)): _*)
      ).asUInt
    )
  val I: Atom = comBuilder(1, 0, List(0)) // X
  val K: Atom = comBuilder(2, 0, List(0)) // X
  val B: Atom = comBuilder(3, 1, List(0, 1, 2)) // X(XX)
  val S: Atom = comBuilder(3, 2, List(0, 2, 1, 2)) // (XX)(XX)

  def appBuilder(atoms: Atom*): Application = 
    (new Application).Lit(
      _.app -> Vec.Lit(padWith(atoms.toList, maxAppLen, nopBuilder): _*)
    )

  val emptyApp: Application = appBuilder()

  def templateBuilder(spine: Application, appsNum: Int, apps: Application*): Template =
    (new Template).Lit(
      _.spine -> spine,
      _.appsNum -> appsNum.U,
      _.apps -> Vec.Lit(padWith(apps.toList, maxAppsPerBody - 1, emptyApp): _*)
    )

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