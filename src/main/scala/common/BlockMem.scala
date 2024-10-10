package common

import chisel3._
import chisel3.util._

/*  Implement basic memory as an independant module. This helps 
    Vivado to infer memory as BRAM instead of LUT RAM.
*/

// TODO: unify memory port difinition for different types of memories

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

class RomIO[T <: Data](depth: Int, t: T) extends Bundle {
  val rdAddr = Input(UInt(log2Ceil(depth).W))
  val rdData = Output(t)
}

/*  We use ROM (Vec) for program memory, this module has the same read/write
    timing as BlockMem.
*/
class BlockMemRom[T <: Data](depth: Int, t: T)(bin: Seq[T]) extends Module {
  val io = IO(new RomIO(depth, t))

  val mem = VecInit(bin)
  io.rdData := RegNext(mem(io.rdAddr))
}

// Multiple port memory, check https://www.chisel-lang.org/docs/explanations/memories#sram
class MultiPortBlockMem[T <: Data](n: Int, depth: Int, t: T) extends Module {
  val io = IO(new SRAMInterface(depth, t, 0, 0, n))
  io :<>= SRAM(depth, t, 0, 0 ,n)
}