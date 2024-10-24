package mutator

import chisel3._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

class DataPathWave extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false).compile(new DataPath)
  "DataPath" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      import svsim._
      dut.clock.step(3)
      var cycleCounter: Int = 0
      dut.io.start #= true.B
      dut.clock.step(1)
      dut.io.start #= false.B
      while(dut.io.done.getValue() == Simulation.Value(1, 0)) {
        dut.clock.step()
        cycleCounter = cycleCounter + 1
      }
      println(s"cycle consumed: ${cycleCounter}")
      dut.clock.step(3)
    }
  }
}
