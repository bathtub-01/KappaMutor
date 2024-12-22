package mutator

import chisel3._
import chisel3.util._

import common._
import common.SystemConfig._

class UpdateRecord extends Bundle {
  val stackDepth = UInt(log2Ceil(stackTotalSize + 1).W) // 13
  val heapAddr = UInt(log2Ceil(heapSize).W) // 16
  // val chaining = Bool()
  val previousStackDepth = UInt(log2Ceil(stackTotalSize + 1).W) //13
}
