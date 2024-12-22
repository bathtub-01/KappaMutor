package mutator

import chisel3._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import tester._

// import scala.collection.mutable.ArraySeq

import common._

class DataPathWave extends AnyFlatSpec with Matchers with VerilatorTestRunner{
  val compiled = TestRunnerConfig(withWaveform = true, ephemeral = false).compile(new DataPath)
  "DataPath" should "behave" in {
    compiled.runSim { dut =>
      import TestRunnerUtils._
      import svsim._
      dut.clock.step(3)
      var cycleCounter: Int = 0
      var programSize: Int = 0
      var redStkDepthPeak: Int = 0
      var updStkDepthPeak: Int = 0
      var ptrReduc: Int = 0
      var combReduc: Int = 0
      var intAppReduc: Int = 0
      var intSwapReduc: Int = 0
      var prmReduc: Int = 0
      var yReduc: Int = 0
      var heapUpdates: Int = 0
      var heapUpdatesImp: Int = 0
      var pipelineImp: Int = 0
      def peekPort(port: Bool, record: Int): Int = {
        if(port.getValue().asBigInt == 1) {
          record + 1
        } else {
          record
        }
      }

      // ====== program injection =======
      dut.io.progInject #= true.B
      for(app <- ProgramBin.prog) {
        app.app.zip(dut.io.progInjectIO.app).foreach {
          case (v, p) =>
            p.atomType #= v.atomType
            p.payload #= v.payload
        }
        programSize = programSize + 1
        dut.clock.step()
      }
      dut.io.progInject #= false.B
      // ================================

      // =========== startup ============
      dut.io.start #= true.B
      dut.clock.step()
      dut.io.start #= false.B
      // ================================
  
      while(dut.io.done.getValue().asBigInt == 0) {
        ptrReduc = peekPort(dut.io.ptrRed, ptrReduc)
        combReduc = peekPort(dut.io.combRed, combReduc)
        intAppReduc = peekPort(dut.io.intRedApp, intAppReduc)
        intSwapReduc = peekPort(dut.io.intRedSwap, intSwapReduc)
        prmReduc = peekPort(dut.io.prmRed, prmReduc)
        yReduc = peekPort(dut.io.yRed, yReduc)
        heapUpdates = peekPort(dut.io.heapUpd, heapUpdates)
        heapUpdatesImp = peekPort(dut.io.heapUpdImp, heapUpdatesImp)
        pipelineImp = peekPort(dut.io.pipeImp, pipelineImp)
        if(dut.io.stkElms.getValue().asBigInt > redStkDepthPeak) {
          redStkDepthPeak = dut.io.stkElms.getValue().asBigInt.toInt
        }
        if(dut.io.updStkElms.getValue().asBigInt > updStkDepthPeak) {
          updStkDepthPeak = dut.io.updStkElms.getValue().asBigInt.toInt
        }
        dut.clock.step()
        cycleCounter = cycleCounter + 1
      }
      // dut.clock.step(1000000)
      println("=========== SIMULATION DONE ===========")
      println(s"answer: ${dut.io.stkTops(0).payload.getValue().asBigInt}")
      println(s"cycle consumed: ${cycleCounter}")
      println(s"program size: ${programSize}")
      println(s"heap consumed: ${dut.io.heapCsm.getValue().asBigInt}")
      println(s"heap consumed in runtime: ${dut.io.heapCsm.getValue().asBigInt - programSize}")
      println(s"peak reduction stack depth: ${redStkDepthPeak}")
      println(s"peak update stack depth: ${updStkDepthPeak}")
      println("=======================================")
      println(s"+ PTR reductions: ${ptrReduc}")
      println(s"+ COMB reductions: ${combReduc}")
      println(s"+ INT applied reductions: ${intAppReduc}")
      println(s"+ INT swap reductions: ${intSwapReduc}")
      println(s"+ PRM reductions: ${prmReduc}")
      println(s"+ Y reductions: ${yReduc}")
      println(s"+ heap updates in total: ${heapUpdates}")
      println(s"- heap updates hidden: ${heapUpdatesImp}")
      println(s"- pipeline hidden: ${pipelineImp}")
      println("=======================================")
      dut.clock.step(3)
    }
  }
}
