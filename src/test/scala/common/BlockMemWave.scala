package common

import chisel3._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

class MultiPortBlockMemWave extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false)
                  .compile(new MultiPortBlockMem(2, 16, new Application))
  "MultiPortBlockMem" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      dut.clock.step(3)
      

      dut.io.readwritePorts(1).enable #= true.B
      dut.io.readwritePorts(1).isWrite #= false.B
      dut.io.readwritePorts(1).address #= 0.U
      dut.clock.step()
      dut.io.readwritePorts(0).address #= 0.U
      dut.io.readwritePorts(0).enable #= true.B
      dut.io.readwritePorts(0).isWrite #= true.B
      dut.io.readwritePorts(0).writeData.app(0).atomType #= 2.U
      dut.io.readwritePorts(0).writeData.app(0).payload #= 22.U
      dut.io.readwritePorts(0).writeData.app(1).atomType #= 3.U
      dut.io.readwritePorts(0).writeData.app(1).payload #= 33.U

      dut.io.readwritePorts(1).enable #= true.B
      dut.io.readwritePorts(1).isWrite #= false.B
      dut.io.readwritePorts(1).address #= 0.U
      dut.clock.step()
      // dut.io.readwritePorts(0).address #= 0.U
      // dut.io.readwritePorts(0).enable #= true.B
      // dut.io.readwritePorts(0).isWrite #= true.B
      // dut.io.readwritePorts(0).writeData #= 6.U

      dut.io.readwritePorts(1).enable #= true.B
      dut.io.readwritePorts(1).isWrite #= false.B
      dut.io.readwritePorts(1).address #= 0.U
      dut.clock.step()
      dut.io.readwritePorts(0).enable #= false.B
      dut.io.readwritePorts(1).enable #= true.B
      dut.io.readwritePorts(1).isWrite #= false.B
      dut.io.readwritePorts(1).address #= 0.U
      
      dut.clock.step()
      dut.io.readwritePorts(1).enable #= false.B
      dut.clock.step(3)
    }
  }
}

