package common

import chisel3._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

import java.nio.file.Paths


class RegStackSpec extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false).compile(new RegStack(32, UInt(8.W)))
  "RegStack" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      def idle: Unit = {
        dut.io.opcode #= StackOpCode.idle
        dut.clock.step()
      }

      def push(data: Int): Unit = {
        dut.io.opcode #= StackOpCode.push
        dut.io.din #= data
        dut.clock.step()
      }

      def pop: Unit = {
        dut.io.opcode #= StackOpCode.pop
        dut.clock.step()
      }

      def modify(data: Int): Unit = {
        dut.io.opcode  #= StackOpCode.modify
        dut.io.din  #= data
        dut.clock.step()
      }

      dut.clock.step(5)
      push(16)
      push(4)
      idle
      push(8)
      pop
      pop
      modify(3)
      idle
      push(9)
      pop
      pop
      idle
      dut.clock.step(5)        
    }
  }
  // "RegStack should behave" in {
  //   simulate(new RegStack(32, UInt(8.W))) { dut =>
      
  //     def idle: Unit = {
  //       dut.io.opcode.poke(StackOpCode.idle)
  //       dut.clock.step()
  //     }

  //     def push(data: Int): Unit = {
  //       dut.io.opcode.poke(StackOpCode.push)
  //       dut.io.din.poke(data)
  //       dut.clock.step()
  //     }

  //     def pop: Unit = {
  //       dut.io.opcode.poke(StackOpCode.pop)
  //       dut.clock.step()
  //     }

  //     def modify(data: Int): Unit = {
  //       dut.io.opcode.poke(StackOpCode.modify)
  //       dut.io.din.poke(data)
  //       dut.clock.step()
  //     }

  //     dut.clock.step(5)
  //     push(16)
  //     push(4)
  //     idle
  //     push(8)
  //     pop
  //     pop
  //     modify(3)
  //     idle
  //     push(9)
  //     pop
  //     pop
  //     idle
  //     dut.clock.step(5)
  //   }
  // }
}