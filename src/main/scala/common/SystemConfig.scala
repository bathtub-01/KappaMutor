package common

import chisel3._
import chisel3.util._

/* 
  atomSize: size of an Atom
  stackN: the number of top elements that can be accessed in parallel in the XRegStack

  comArity: maximum arity for structured combinator
  comPatter: patterns supported by structured combinator
  comIdxs: maximum de Brujin indexies in structured combinator

  maxAppLen: maximum length of an application
  maxAppsPerBody: maximum number of nested applications in a combinator

*/
object SystemConfig {
  val atomSize = 32
  val stackN = 8

  val comArity = 7
  val comPattern = 64
  val comIdxs = 6

  val maxAppLen = 8 // need to be 7 if we want to support arity 7 (longest WHNF)
  val maxAppsPerBody = 4 // spine included

  val heapSize = 512 * 1024 // should be 256*1024 for SKI+ scheme...
  val stackSizeEach = 1024 
  def stackTotalSize = stackN * stackSizeEach

  val updateStackSize = 2048

  def atomPayloadSize = atomSize - AtomType.getWidth
}
