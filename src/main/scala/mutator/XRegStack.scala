package mutator

import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage

import common._

/*  
  XRegStack allows:
    - reading its top `n` elements asynchronously
    - pushing `n` elements onto the stack in one cycle
    - poping `n` elements from the stack in one cycle
    - poping `a` alements and then pushing back `b` elements in
      one cycle (`a` < `n`, `b` < `n`)
  The total depth of an XRegStack is `n` * `depthEach`
  This design borrows idea from Reduceron's memo 27: Design of 
    the Octostack (https://mn416.github.io/reduceron-project/)
*/

/*  
  din: port for stack pushing, up to `n` elements are supported
  top: port for reading top elements of the stack
  pop: states how many elements are being poped in this cycle
  push: states how many elements are being pushed in this cycle

  If pop > 0 and push > 0, the pop will happen before push.
*/
class XRegStackPort[T <: Data](n: Int, depthEach: Int, t: T) extends Bundle {
  val din = Input(Vec(n, t))
  val top = Output(Vec(n,t))
  val pop = Input(UInt(log2Ceil(n + 1).W))
  val push = Input(UInt(log2Ceil(n + 1).W))
  val elms = Output(UInt(log2Ceil(n * depthEach + 1).W))
}


class XRegStack[T <: Data](n: Int, depthEach: Int, t: T) extends Module {
  require(n > 0 && (n & (n - 1)) == 0) // n must be the power of 2
  val io = IO(new XRegStackPort(n, depthEach, t))  
  val elms = Wire(UInt(log2Ceil(n * depthEach + 1).W))
  val subStks = Seq.fill(n)(Module(new RegStack(depthEach, t)))
  val subStkPorts = Wire(Vec(n, new StackPort(depthEach, t)))

  subStkPorts.zip(subStks).foreach{case (port, stk) => port <> stk.io}
  elms := subStkPorts.map(_.elms).reduce(_ +& _)
  io.elms := elms

  // don't need this, Chisel compiler knows what to do when n is power of 2
  def modN(i: UInt): UInt = {
    val offset = log2Ceil(n) - 1
    Cat(0.U(1.W), i(offset, 0))
  }
  
  def rotate(i: UInt, elms: UInt): UInt = (elms % n.U - i - 1.U) % n.U

  subStkPorts.foreach{port => port.din := 0.U.asTypeOf(t)}
  io.top.zip(0 until n).foreach{case (top, i) => top := subStkPorts(rotate(i.U, elms)).top}
  io.din.zip(0 until n).foreach{case (din, i) => subStkPorts(rotate(i.U, elms + (io.push - io.pop))).din := din}

  for (i <- 0 until n) {
    when(io.push >= io.pop) {
      when(((elms % n.U) - i.U - 1.U) % n.U + 1.U <= io.pop) {
        subStkPorts(i).opcode := StackOpCode.modify
      }.elsewhen((i.U - (elms % n.U)) % n.U + 1.U <= io.push - io.pop) {
        subStkPorts(i).opcode := StackOpCode.push
      }.otherwise {
        subStkPorts(i).opcode := StackOpCode.idle
      }
    }.otherwise /* elsewhen(io.push < io.pop) */ {
      when((i.U - (elms % n.U - io.pop)) % n.U + 1.U <= io.push) {
        subStkPorts(i).opcode := StackOpCode.modify
      }.elsewhen(((elms % n.U) - i.U - 1.U) % n.U + 1.U <= io.pop) {
        subStkPorts(i).opcode := StackOpCode.pop
      }.otherwise {
        subStkPorts(i).opcode := StackOpCode.idle
      }
    }
  }
}

object XRegStack extends App {
  ChiselStage.emitSystemVerilogFile(
    new XRegStack(8, 32, UInt(16.W)),
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}
