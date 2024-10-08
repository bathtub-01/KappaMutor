package common

import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage

/* 
  This is a basic stack implementation, with a register holding the top 
  element of the stack, allowing asynchronous-read for its top element.
  --------------------------------------------------------------------
*/

/* 
  Op code for the stack.
  Each operation takes one clock cycle to conduct.
*/
object StackOpCode extends ChiselEnum {
  val idle = Value
  val push = Value
  val pop = Value
  val modify = Value
}
import StackOpCode._


class StackPort[T <: Data](depth: Int, t: T) extends Bundle {
  val opcode = Input(StackOpCode())
  val din = Input(t)
  val top = Output(t)
  val elms = Output(UInt(log2Ceil(depth).W))
}

class RegStack[T <: Data](depth: Int, t: T) extends Module {
  val io = IO(new StackPort(depth, t))
  val stkPtr = RegInit(0.U(log2Ceil(depth - 1).W))
  val stkMem = Module(new BlockMem(depth - 1, t))
  val topElm = RegInit(0.U.asTypeOf(t))
  val elmCount = RegInit(0.U(log2Ceil(depth).W))
  val lastPushed = RegInit(0.U.asTypeOf(t)) // avoid read-after-write
  val justPushed = RegInit(false.B)

  stkMem.init(stkPtr - 1.U)
 
  switch(io.opcode) {
    is(StackOpCode.idle) { 
      justPushed := false.B
    }
    is(StackOpCode.push) {
      topElm := io.din
      when(elmCount =/= 0.U) {
        stkMem.write(topElm, stkPtr)
        stkPtr := stkPtr + 1.U
        lastPushed := topElm
        justPushed := true.B
      }
      elmCount := elmCount + 1.U
    }
    is(StackOpCode.pop) {
      when(elmCount > 1.U) {
        // topElm := stkMem.readOut
        when(justPushed) {
          topElm := lastPushed
        }.otherwise {
          topElm := stkMem.readOut
        }
        stkMem.read(stkPtr - 2.U)
        stkPtr := stkPtr - 1.U
        elmCount := elmCount - 1.U
      }.elsewhen(elmCount === 1.U) {
        topElm := 0.U.asTypeOf(t)
        elmCount := 0.U
      }
      justPushed := false.B
    }
    is(StackOpCode.modify) {
      topElm := io.din
      justPushed := false.B
    }
  }

  io.top := topElm
  io.elms := elmCount

  def init: Unit = {
    io := DontCare
    io.opcode := StackOpCode.idle
  }

  def idle = init

  def push(data: T) = {
    io.opcode := StackOpCode.push
    io.din := data
  }

  def pop: T = {
    io.opcode := StackOpCode.pop
    io.top
  }

  def modify(data: T) = {
    io.opcode := StackOpCode.modify
    io.din := data
  }

  def elms: UInt = io.elms
}

object RegStack extends App {
  ChiselStage.emitSystemVerilogFile(
    new RegStack(32, UInt(16.W)),
    Array("--target-dir", "generated"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}