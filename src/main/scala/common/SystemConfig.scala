package common

import chisel3._
import chisel3.util._

/* 
  atomSize: size of an Atom
  stackN: XRegStack
  comArity: maximum arity for structured combinator
  comPatter: patterns supported by structured combinator
  comIdxs: maximum de Brujin indexies in structured combinator
*/
object SystemConfig {
  val atomSize = 32
  val stackN = 8

  val comArity = 6
  val comPattern = 64
  val comIdxs = 6

  val maxAppLength = 6

  def atomPayloadSize = atomSize - AtomType.getWidth
}
