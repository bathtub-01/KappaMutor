package mutator

import chisel3._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec

import scala.util.Random
import scala.math._
import chisel3.simulator.Simulator

class XRegStackSimulator(n: Int, depthEach: Int) {
  type Push = Int
  type Pop = Int
  val maxSize = n * depthEach

  def step(stack: List[BigInt], push: Push, pop: Pop, din: List[BigInt]): List[BigInt] = {
    assert(push == din.length, "length must match")
    din ++ stack.drop(pop)
  }

  def opGen(stack: List[BigInt]): (Push, Pop) = {
    val pop = Random.nextInt(min(n, stack.length + 1))
    val push = Random.nextInt(min(n, maxSize - stack.length - pop + 1))
    (push, pop)
  }

  def topElms(stack: List[BigInt]): List[BigInt] = stack.take(n)
}

class XRegStackSpec extends AnyFreeSpec {
  "XRegStack should behave" in {
    simulate(new XRegStack(8, 32, UInt(32.W))) { dut =>
      val simulator = new XRegStackSimulator(8, 32)  

      def run(n: Int, stack: List[BigInt], ops: List[(simulator.Push, simulator.Pop)]): Unit = {
        val (newPush, newPop) = if (ops.isEmpty) simulator.opGen(stack) else ops.head
        def dinBuilder(length: Int, acc: List[BigInt] = Nil): List[BigInt] =
          if(length == 0) acc
            else dinBuilder(length - 1, BigInt(Random.nextInt(Int.MaxValue)) :: acc)
        val din = dinBuilder(newPush)
        println(s"push: $newPush, pop: $newPop din: $din")
        val newStack = simulator.step(stack, newPush, newPop, din)
        val newTops = simulator.topElms(newStack)
        dut.io.push.poke(newPush)
        dut.io.pop.poke(newPop)
        dut.io.din.zip(din).foreach{case(port, value) => port.poke(value)}
        dut.clock.step()
        dut.io.top.zip(newTops).foreach{case(port, value) => port.expect(value)}
        println(s"simulator | tops: $newTops | depth: ${newStack.length}")
        println(s"hardware  | tops: ${dut.io.top.map(_.peek().litValue)} | depth: ${dut.io.elms.peekValue()}")
        println("pass.")
        println("======================================================")
        if(n > 1) {
          run(n - 1, newStack, if(ops.isEmpty) Nil else ops.tail)
        }
      }

      dut.clock.step(3)
      run(200, Nil, Nil)
    }
  }
}