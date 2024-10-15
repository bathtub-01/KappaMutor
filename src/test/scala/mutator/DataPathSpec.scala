package mutator

import chisel3._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec

class DataPathSpec extends AnyFreeSpec {
  "Datapath should behave" in {
    simulate(new DataPath) { dut =>
      dut.clock.step(3)
      dut.io.start.poke(true)
      dut.clock.step()
      dut.io.start.poke(false)

      for(i <- 0 until 80) {
        println(s"tops: ${dut.io.stkTops(0).atomType.peekValue()}")
        println(s"depth: ${dut.io.stkElms.peekValue()} | done: ${dut.io.done.peekValue()}")
        println("======================================================")
        dut.clock.step()
      }
    }
  }
}