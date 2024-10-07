package common

import chisel3._
import chisel3.util._

/*  Implement basic memory as an independant module. This helps 
    Vivado to infer memory as BRAM instead of LUT RAM.
*/

class MemIOBundle[T <: Data](depth: Int, t: T) extends Bundle {
  val rdAddr = Input(UInt(log2Ceil(depth).W))
  val rdData = Output(t)
  val wrEna = Input(Bool())
  val wrData = Input(t)
  val wrAddr = Input(UInt(log2Ceil(depth).W))
}

class BlockMem[T <: Data](depth: Int, t: T) extends Module {
  val io = IO(new MemIOBundle(depth, t))

  val mem = SyncReadMem(depth, t)
  io.rdData := mem.read(io.rdAddr)

  when(io.wrEna) {
    mem.write(io.wrAddr, io.wrData)
  }

  def write(data: T, addr: UInt) = {
    io.wrEna := true.B
    io.wrData := data
    io.wrAddr := addr
  }

  def read(addr: UInt) = {
    io.rdAddr := addr
  }

  def readOut: T = {
    io.rdData
  }

  def init(defaultAddr: UInt) = {
    io := DontCare
    io.rdAddr := defaultAddr
    io.wrEna := false.B
  }
}

/*  We use ROM (Vec) for program memory, this module has the same read/write
    timing as BlockMem.
*/
class BlockMemROM[T <: Data](depth: Int, t: T) extends Module {
  val io = IO(new MemIOBundle(depth, t))
  ???
}

// TODO: to implement a dual-readwrite port memory, check https://www.chisel-lang.org/docs/explanations/memories#sram