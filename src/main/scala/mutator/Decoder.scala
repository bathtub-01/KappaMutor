package mutator

import chisel3._
import chisel3.util._
import chisel3.util.experimental.decode._
import chisel3.experimental.BundleLiterals._
import chisel3.experimental.VecLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._
import common.Helper._

case class ComPattern(val pat: Pattern, val code: BigInt) extends DecodePattern {
  def bitPat: BitPat = BitPat(code.U(6.W))
}

object ComPatterns {
  import Patterns._
  val allPossibleInputs: Seq[ComPattern] =
    allPatterns.zip(0 until 64).map{ case(pat, i) =>
      ComPattern(pat, BigInt(i))
    }
  def elementBuilder(r: (Boolean, Int)): Element = 
    (new Element).Lit(
      _.typ -> r._1.B,
      _.idx -> r._2.U
    )
  def genTableBuilder(upper: Int, map: Map[BigInt, List[(Boolean, Int)]])(i: ComPattern): BitPat = {
    val res = padWith(map(i.code), upper, (false, 0b111))
    val elements = res.map(elementBuilder(_))
    val vec = Vec.Lit(elements: _*)
    BitPat(vec.asUInt)
  }
}

class Element extends Bundle {
  val typ = Bool() // 0 - argument; 1 - pointer
  val idx = UInt(3.W) // FIXME: parameterize this
}

class SignalField(map: Map[BigInt, List[(Boolean, Int)]], upper: Int, n: String) extends DecodeField[ComPattern, Vec[Element]] {
  def name = n
  def chiselType: Vec[Element] = Vec(upper, new Element)
  def genTable(i: ComPattern): BitPat = ComPatterns.genTableBuilder(upper, map)(i)
}

class Decoder extends Module {
  import Patterns._
  import ComPatterns._

  val allParsed = allPatterns.map(parse(_)._1)
  val spineMap = (0 until 64).map(BigInt(_)).zip(allParsed.map(_.spine)).toMap
  val app1Map = (0 until 64).map(BigInt(_)).zip(allParsed.map(_.app1)).toMap
  val app2Map = (0 until 64).map(BigInt(_)).zip(allParsed.map(_.app2)).toMap
  val app3Map = (0 until 64).map(BigInt(_)).zip(allParsed.map(_.app3)).toMap

  val spineField = new SignalField(spineMap, 6, "derive spine field from pattern code")
  val app1Field = new SignalField(app1Map, 5, "derive app1 field from pattern code")
  val app2Field = new SignalField(app2Map, 4, "derive app2 field from pattern code")
  val app3Field = new SignalField(app3Map, 3, "derive app3 field from pattern code")

  val decodeTable = new DecodeTable(allPossibleInputs, Seq(spineField, app1Field, app2Field, app3Field))

  val in = IO(Input(UInt(6.W)))
  val spine = IO(Output(Vec(6, new Element)))
  val app1 = IO(Output(Vec(5, new Element)))
  val app2 = IO(Output(Vec(4, new Element)))
  val app3 = IO(Output(Vec(3, new Element)))

  val decodeResult = decodeTable.decode(in)

  spine := decodeResult(spineField)
  app1 := decodeResult(app1Field)
  app2 := decodeResult(app2Field)
  app3 := decodeResult(app3Field)
}

object Decoder extends App {
  ChiselStage.emitSystemVerilogFile(
    new Decoder,
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}

