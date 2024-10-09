package mutator

import chisel3._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

class XRegStackWave extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false).compile(new XRegStack(8, 32, UInt(16.W)))
  "XRegStack" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      dut.clock.step(5)
      dut.io.push #= 1.U
      dut.io.din(0) #= 1.U
      dut.clock.step()
      dut.io.push #= 3.U
      dut.io.din(0) #= 4.U
      dut.io.din(1) #= 3.U
      dut.io.din(2) #= 2.U
      dut.clock.step()
      dut.io.push #= 1.U
      dut.io.pop #= 2.U
      dut.io.din(0) #= 5.U
      dut.clock.step()
      dut.io.push #= 2.U
      dut.io.pop #= 1.U
      dut.io.din(0) #= 6.U
      dut.io.din(1) #= 7.U
      dut.clock.step()
      dut.io.push #= 8.U
      dut.io.pop #= 0.U
      dut.io.din(0) #= 100.U
      dut.io.din(1) #= 200.U
      dut.io.din(2) #= 300.U
      dut.io.din(3) #= 400.U
      dut.io.din(4) #= 500.U
      dut.io.din(5) #= 600.U
      dut.io.din(6) #= 700.U
      dut.io.din(7) #= 800.U
      dut.clock.step()
      dut.io.push #= 8.U
      dut.io.pop #= 0.U
      dut.io.din(0) #= 110.U
      dut.io.din(1) #= 210.U
      dut.io.din(2) #= 310.U
      dut.io.din(3) #= 410.U
      dut.io.din(4) #= 510.U
      dut.io.din(5) #= 610.U
      dut.io.din(6) #= 710.U
      dut.io.din(7) #= 810.U
      dut.clock.step()
      dut.io.push #= 8.U
      dut.io.pop #= 0.U
      dut.io.din(0) #= 101.U
      dut.io.din(1) #= 202.U
      dut.io.din(2) #= 303.U
      dut.io.din(3) #= 404.U
      dut.io.din(4) #= 505.U
      dut.io.din(5) #= 606.U
      dut.io.din(6) #= 707.U
      dut.io.din(7) #= 808.U
      dut.clock.step()
      dut.io.push #= 0.U
      dut.io.pop #= 8.U
      dut.clock.step()
      dut.io.push #= 0.U
      dut.io.pop #= 8.U
      dut.clock.step()
      dut.io.push #= 0.U
      dut.io.pop #= 8.U
      dut.clock.step()
      dut.io.pop #= 3.U
      dut.clock.step()
      dut.io.pop #= 1.U
      dut.clock.step()
      dut.io.push #= 0.U
      dut.io.pop #= 0.U
      dut.clock.step(5)        
    }
  }
}