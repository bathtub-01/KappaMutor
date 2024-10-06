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


class StackPort[T <: Data](t: T) extends Bundle {
  val opcode = Input(StackOpCode())
  val din = Input(t)
  val top = Output(t)
}

class RegStack[T <: Data](depth: Int, t: T) extends Module {
  val io = IO(new StackPort(t))
  val stkPtr = RegInit(0.U(log2Ceil(depth).W))
  val stkMem = Module(new BlockMem(depth, t))
  val top_elm = RegInit(0.U.asTypeOf((t)))

  stkMem.init(stkPtr - 1.U)
 
  switch(io.opcode) {
    is(idle) { /* do nothing */ }
    is(push) {
      top_elm := io.din
      stkMem.write(top_elm, stkPtr)
      stkPtr := stkPtr + 1.U
    }
    is(pop) {
      stkMem.readOut(top_elm)
      stkPtr := stkPtr - 1.U
    }
    is(modify) {
      top_elm := io.din
    }
  }

  io.top := top_elm
}

object RegStack extends App {
  ChiselStage.emitSystemVerilogFile(
    new RegStack(32, UInt(16.W)),
    Array("--target-dir", "generated"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}