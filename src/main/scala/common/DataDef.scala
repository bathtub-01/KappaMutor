package common

import chisel3._
import chisel3.util._

import SystemConfig._

/*  
  FUN: function pointer
  PTR: heap pointer
  COM: structured combinator
*/
object AtomType extends ChiselEnum {
  val NOP = Value
  val FUN = Value
  val PTR = Value
  val COM = Value
}

abstract class AtomPayload extends Bundle

/*  
  Payload for FUN and PTR, which only contains a pointer
*/
class AddrPayload extends AtomPayload {
  val pointer = UInt(atomPayloadSize.W)
}

/*  
  Payload for COM, with arity, pattern and an index vector
*/
class ComPayload extends AtomPayload {
  val arity = UInt(log2Ceil(comArity + 1).W)
  val pattern = UInt(log2Ceil(comPattern).W)
  val idxs = Vec(comIdxs, UInt(log2Ceil(comArity + 1).W))
}

class Atom extends Bundle {
  val atomType = AtomType()
  val payload = Bits(atomPayloadSize.W)
}

class Application extends Bundle {
  val app = Vec(maxAppLen, new Atom)
}

class Template extends Bundle {
  val spine = new Application
  val appsNum = UInt(log2Ceil(maxAppsPerBody - 1).W) // number of let-bindings
  val apps = Vec(maxAppsPerBody - 1, new Application) // let-bindings
}