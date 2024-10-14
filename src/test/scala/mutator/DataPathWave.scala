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
      dut.clock.step(3)
      dut.io.start #= true.B
      dut.clock.step()
      dut.io.start #= false.B
      dut.clock.step(50)
    }
  }
}
