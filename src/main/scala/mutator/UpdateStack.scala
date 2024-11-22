package mutator

import chisel3._
import chisel3.util._

import common._
import common.SystemConfig._

class UpdateRecord extends Bundle {
  val stackDepth = UInt(log2Ceil(stackTotalSize).W)
  val heapAddr = UInt(log2Ceil(heapSize).W)
  val chaining = Bool()
}
