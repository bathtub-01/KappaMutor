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

  val comArity = 7
  val comPattern = 64
  val comIdxs = 6

  val maxSpineLen = 7
  val maxAppLen = 6
  val maxAppsPerBody = 4 // spine included

  val heapSize = 128 * 1024 // should be 256*1024 for SKI+ scheme...
  val stackSizeEach = 512 
  def stackTotalSize = stackN * stackSizeEach

  val updateStackSize = 1024

  def atomPayloadSize = atomSize - AtomType.getWidth
}
