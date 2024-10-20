package mutator

import chisel3._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec

import Patterns._
import common.Helper._

class DecoderSpec extends AnyFreeSpec {
  "Decoder should decode" in {
    simulate(new Decoder) { dut =>
      val allParsed = allPatterns.map(parse(_)._1)
      def checkResult(code: Int): Unit = {
        // compare List[(Boolean, Int)] to Vec[Element]
        val spine = padWith(allParsed(code).spine, 6, (false, 0b111))
        val app1 = padWith(allParsed(code).app1, 5, (false, 0b111))
        val app2 = padWith(allParsed(code).app2, 4, (false, 0b111))
        val app3 = padWith(allParsed(code).app3, 3, (false, 0b111))
        def checkElement(p: mutator.Element, v: (Boolean, Int)): Unit ={
          p.typ.expect(v._1.B)
          p.idx.expect(v._2.U)
        }
        spine.zip(dut.spine).foreach{ case(v, port) => checkElement(port, v)}
        app1.zip(dut.app1).foreach{ case(v, port) => checkElement(port, v)}
        app2.zip(dut.app2).foreach{ case(v, port) => checkElement(port, v)}
        app3.zip(dut.app3).foreach{ case(v, port) => checkElement(port, v)}
      }
      for(i <- 0 until 64) {
        dut.in.poke(i)
        checkResult(i)
        dut.clock.step()
      }
    }
  }
}
