package common

import chisel3._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec

import scala.util.Random

class RegStackSimulator(depth: Int) {
  object opCode extends Enumeration {
    val idle, push, pop, modify = Value
  }

  def step(stack: List[BigInt], op: opCode.Value, din: BigInt): List[BigInt] = {
    (op, stack) match {
      case (opCode.idle, s) => s
      case (opCode.push, s) => din :: s
      case (opCode.pop, top :: s) => s
      case (opCode.modify, top :: s) => din :: s
      case _ => throw new RuntimeException("! ILLEGAL OPERATION !")
    }
  }

  def opCodeGen(stack: List[BigInt]): opCode.Value = {
    import opCode._
    if(stack.length == 0) {
      if (Random.nextInt(10) < 7) push else idle
    } else if (stack.length < depth / 2) {
      if (Random.nextInt(10) < 7) push else 
        Seq(idle, pop, modify)(Random.nextInt(3))
    } else if (stack.length < depth) {
      Seq(idle, push, pop, modify)(Random.nextInt(4))
    } else {
      Seq(idle, pop, modify)(Random.nextInt(3))
    }
  }

  def top(stack: List[BigInt]): BigInt = 
    stack match {
      case head :: next => head
      case Nil => 0
    }
}

class RegStackSpec extends AnyFreeSpec {
  "Stack should behave" in {
    simulate(new RegStack(64, UInt(32.W))) { dut =>
      val simulator = new RegStackSimulator(64)  

      def run(n: Int, stack: List[BigInt], ops: List[simulator.opCode.Value] = Nil): Unit = {
        val din = BigInt(Random.nextInt(Int.MaxValue))
        val newOp = if (ops.isEmpty) simulator.opCodeGen(stack) else ops.head
        println(s"op: $newOp, din: $din")
        val newStack = simulator.step(stack, newOp, din)
        val newTop = simulator.top(newStack)
        dut.io.opcode.poke(
          newOp match {
            case simulator.opCode.idle => StackOpCode.idle
            case simulator.opCode.push => StackOpCode.push
            case simulator.opCode.pop => StackOpCode.pop
            case simulator.opCode.modify => StackOpCode.modify
          }
        )
        dut.io.din.poke(din)
        dut.clock.step()
        dut.io.top.expect(newTop)
        println(s"simulator | top: $newTop | depth: ${newStack.length}")
        println(s"hardware  | top: ${dut.io.top.peekValue()} | depth: ${dut.io.elms.peekValue()}")
        println("pass.")
        println("======================================================")
        if(n > 1) {
          run(n - 1, newStack, if(ops.isEmpty) Nil else ops.tail)
        }
      }

      dut.clock.step(3)
      import simulator.opCode._
      run(200, Nil, Nil)
    }
  }
}