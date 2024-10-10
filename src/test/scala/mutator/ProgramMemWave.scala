package mutator

import chisel3._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

class ProgramMemWave extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false).compile(new ProgramMem(ExampleBins.prog1))
  "XRegStack" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      dut.clock.step(3)
      dut.io.rdAddr #= 1.U
      dut.clock.step()
      dut.io.rdAddr #= 2.U
      dut.clock.step()
      dut.io.rdAddr #= 3.U
      dut.clock.step()
      dut.io.rdAddr #= 4.U
      dut.clock.step(3)
    }
  }
}
