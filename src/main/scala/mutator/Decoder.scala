package mutator

import chisel3._
import chisel3.util._
import chisel3.util.experimental.decode._
import chisel3.experimental.BundleLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._
import common.Helper._
/*
 The DecodePattern is for DecodeTable inputs.
 Should hard-code all SC patterns' DecodePattern into a Seq,
 and send it to the Decode Table.
 The decode fields should be four: spine, app1, app2, app3, each
 contains descriptors for each atom. Good News: Decode field can
 simply be a bundle (?)
 From an abstract definition of the SC pattern, should be able
 to derive the decode fields for each SC pattern. The abstract
 definition can also be used for generating "ROM builders" for
 testing and future compiling ;)
 */

case class ComPattern(val pat: Pattern, val code: BigInt) extends DecodePattern {
  def bitPat: BitPat = BitPat("b" + code.toString(2))
}

object ComPatterns {
  import Patterns._
  val allPossibleInputs: Seq[ComPattern] =
    allPatterns.zip(0 until 64).map{ case(pat, i) =>
      ComPattern(pat, BigInt(i))
    }
}

class Element extends Bundle {
  val typ = Bool() // 0 - argument; 1 - pointer
  val idx = UInt(3.W) // FIXME: parameterize this
}

class Spine(spine: List[(Bool, Int)]) extends DecodeField[ComPattern, Vec[Element]] {
  def name = "" 
  def chiselType: Vec[Element] = Vec(6, new Element)
  def genTable(i: ComPattern): BitPat = BitPat((new Element).asUInt)
}

// case class Pattern(val name: String, val code: BigInt/* my pattern abstraction might be here */) extends DecodePattern {
//   def bitPat: BitPat = BitPat("b" + code.toString(2))
// }

// object NameContainsAdd extends BoolDecodeField[Pattern] {
//   def name = "name contains 'add'"
//   def genTable(i: Pattern) = if (i.name.contains("add")) y else n // this will be equivalent to my parser :) 
// }

// object BypassCode extends BoolDecodeField[Pattern] {

//   def genTable(i: Pattern) = y
// }

// class SimpleDecodeTable extends Module {
//   val allPossibleInputs = Seq(Pattern("addi", BigInt("0x2")) /* can be generated */)
//   val decodeTable = new DecodeTable(allPossibleInputs, Seq(NameContainsAdd, BypassCode))
  
//   val input = IO(Input(UInt(4.W)))
//   val isAddType = IO(Output(Bool()))
//   val code = IO(Output(UInt(4.W)))
//   val decodeResult = decodeTable.decode(input)
//   isAddType := decodeResult(NameContainsAdd)
// }

