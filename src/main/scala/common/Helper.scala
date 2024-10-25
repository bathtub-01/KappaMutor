package common

import chisel3._
import chisel3.util._
import chisel3.experimental.BundleLiterals._
import chisel3.experimental.VecLiterals._

import common._
import common.SystemConfig._

object Helper {
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

  def intBuilder(value: Int): Atom =
    (new Atom).Lit(
      _.atomType -> AtomType.INT,
      _.payload -> (new IntPayload).Lit(
        _.value -> value.S
      ).asUInt
    )

  def prmBuilder(op: String): Atom = {
    import mutator._
    val (opCode, isSub, isCondInv) = op match {
      case "+" => (ALUOpCode.add_sub, false.B, false.B)
      case "-" => (ALUOpCode.add_sub, true.B, false.B)
      case "*" => (ALUOpCode.mult, false.B, false.B)
      // more to be added...
      case _ => throw new IllegalArgumentException(s"Unknown operation: $op")
    }

    (new Atom).Lit(
      _.atomType -> AtomType.PRM,
      _.payload -> (new PrmPayload).Lit(
        _.fun -> (new ALUFunction).Lit(
          _.opcode -> opCode,
          _.is_sub -> isSub,
          _.is_cond_inv -> isCondInv
        ),
        _.swap -> false.B
      ).asUInt
    )
  }
  
  def appBuilder(atoms: Atom*): Application = 
    (new Application).Lit(
      _.app -> Vec.Lit(padWith(atoms.toList, maxAppLen, nopBuilder): _*)
    )

  def emptyApp: Application = appBuilder()

  def templateBuilder(spine: Application, appsNum: Int, apps: Application*): Template =
    (new Template).Lit(
      _.spine -> spine,
      _.appsNum -> appsNum.U,
      _.apps -> Vec.Lit(padWith(apps.toList, maxAppsPerBody - 1, emptyApp): _*)
    )
}
