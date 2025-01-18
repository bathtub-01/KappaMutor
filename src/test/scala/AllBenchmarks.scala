package benchmarks

import chisel3._
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.BeforeAndAfterAll
import tester._
import java.io._
import os.copy

import common._
import mutator._

class AllBenchmarks extends AnyFlatSpec
    with Matchers with VerilatorTestRunner with BeforeAndAfterAll {
  val compiled = TestRunnerConfig(withWaveform = false, ephemeral = false).compile(new DataPath)
  val benchmarks: List[Benchmark] = List(Adjoxo, Braun)
  val runningCycle = new PrintWriter("simu-out/running-cycle.csv")
  val heapAlloc = new PrintWriter("simu-out/heap-alloc.csv")
  val combCount = new PrintWriter("simu-out/comb-count.csv")
  val appCount = new PrintWriter("simu-out/app-count.csv")

  runningCycle.println("benchmark,running-cycle")
  heapAlloc.println("benchmark,heap-alloc")
  combCount.println("benchmark,comb-count")
  appCount.println("benchmark,app-count")

  def countStuffs(benchmark: Benchmark): Unit = {
    combCount.println(benchmark.toString() ++ "," ++ benchmark.combinatorCount.toString())
    appCount.println(benchmark.toString() ++ "," ++ benchmark.prog.length.toString())
  }

  def runBenchmark(benchmark: Benchmark, dut: DataPath): Unit = {
    import TestRunnerUtils._
    import svsim._
    dut.clock.step(3)
    var cycleCounter: Int = 0
    var programSize: Int = 0
    var redStkDepthPeak: Int = 0
    var updStkDepthPeak: Int = 0
    var ptrReduc: Int = 0
    var combReduc: Int = 0
    var combReduc_ : Int = 0
    var intAppReduc: Int = 0
    var intSwapReduc: Int = 0
    var prmReduc: Int = 0
    var yReduc: Int = 0
    var heapUpdates: Int = 0
    var heapUpdatesImp: Int = 0
    var pipelineImp: Int = 0
    var combHole1: Int = 0
    var combHole2: Int = 0
    var combHole3: Int = 0
    var combHole4: Int = 0
    var combHole5: Int = 0
    var combHole6: Int = 0
    var combApp0: Int = 0
    var combApp1: Int = 0
    var combApp2: Int = 0
    var combApp3: Int = 0

    val simuLog = new PrintWriter("simu-out/" ++ benchmark.toString() ++ ".txt")

    def peekPort(port: Bool, record: Int): Int = {
      if(port.getValue().asBigInt == 1) {
        record + 1
      } else {
        record
      }
    }

    // ====== program injection =======
    dut.io.progInject #= true.B
    for(app <- benchmark.prog) {
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
      combReduc_ = peekPort(dut.io.combRed_, combReduc_)
      intAppReduc = peekPort(dut.io.intRedApp, intAppReduc)
      intSwapReduc = peekPort(dut.io.intRedSwap, intSwapReduc)
      prmReduc = peekPort(dut.io.prmRed, prmReduc)
      yReduc = peekPort(dut.io.yRed, yReduc)
      heapUpdates = peekPort(dut.io.heapUpd, heapUpdates)
      heapUpdatesImp = peekPort(dut.io.heapUpdImp, heapUpdatesImp)
      pipelineImp = peekPort(dut.io.pipeImp, pipelineImp)
      combHole1 = peekPort(dut.io.combHole1, combHole1)
      combHole2 = peekPort(dut.io.combHole2, combHole2)
      combHole3 = peekPort(dut.io.combHole3, combHole3)
      combHole4 = peekPort(dut.io.combHole4, combHole4)
      combHole5 = peekPort(dut.io.combHole5, combHole5)
      combHole6 = peekPort(dut.io.combHole6, combHole6)
      combApp0 = peekPort(dut.io.combApp0, combApp0)
      combApp1 = peekPort(dut.io.combApp1, combApp1)
      combApp2 = peekPort(dut.io.combApp2, combApp2)
      combApp3 = peekPort(dut.io.combApp3, combApp3)

      if(dut.io.stkElms.getValue().asBigInt > redStkDepthPeak) {
        redStkDepthPeak = dut.io.stkElms.getValue().asBigInt.toInt
      }
      if(dut.io.updStkElms.getValue().asBigInt > updStkDepthPeak) {
        updStkDepthPeak = dut.io.updStkElms.getValue().asBigInt.toInt
      }
      dut.clock.step()
      cycleCounter = cycleCounter + 1
    }
    val allCombs = combApp0 + combApp1 + combApp2 + combApp3
    assert(allCombs == combHole1 + combHole2 + combHole3 + combHole4 + combHole5 + combHole6)

    simuLog.println("=========== SIMULATION DONE ===========")
    simuLog.println(s"answer: ${dut.io.stkTops(0).payload.getValue().asBigInt}")
    simuLog.println(s"cycle consumed: ${cycleCounter}")
    simuLog.println(s"program size: ${programSize}")
    simuLog.println(s"heap consumed: ${dut.io.heapCsm.getValue().asBigInt}")
    simuLog.println(s"heap consumed in runtime: ${dut.io.heapCsm.getValue().asBigInt - programSize}")
    simuLog.println(s"peak reduction stack depth: ${redStkDepthPeak}")
    simuLog.println(s"peak update stack depth: ${updStkDepthPeak}")
    simuLog.println("======== REDUCTION DISTRIBUTE =========")
    simuLog.println(s"+ PTR reductions: ${ptrReduc}")
    simuLog.println(s"+ COMB reductions: ${combReduc + combReduc_}")
    simuLog.println(s"+ INT applied reductions: ${intAppReduc}")
    simuLog.println(s"+ INT swap reductions: ${intSwapReduc}")
    simuLog.println(s"+ PRM reductions: ${prmReduc}")
    simuLog.println(s"+ Y reductions: ${yReduc}")
    simuLog.println(s"+ heap updates in total: ${heapUpdates}")
    simuLog.println(s"- heap updates hidden: ${heapUpdatesImp}")
    simuLog.println(s"- pipeline hidden: ${pipelineImp}")
    simuLog.println("============ OPT GAINS ================")
    simuLog.println(f"heap updates hidden rate: ${heapUpdatesImp}/${heapUpdates} (${heapUpdatesImp.toDouble / heapUpdates.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"pipeline hidden rate: ${pipelineImp}/${combReduc_} (${pipelineImp.toDouble / combReduc_.toDouble * 100.0}%.2f%%)")
    simuLog.println("======== COMBINATOR DISTRIBUTE ========")
    // holes, apps
    simuLog.println(f"combinator with 1-hole: ${combHole1} (${combHole1.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 2-hole: ${combHole2} (${combHole2.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 3-hole: ${combHole3} (${combHole3.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 4-hole: ${combHole4} (${combHole4.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 5-hole: ${combHole5} (${combHole5.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 6-hole: ${combHole6} (${combHole6.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println("--------------------------------------")
    simuLog.println(f"combinator with 0-app: ${combApp0} (${combApp0.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 1-app: ${combApp1} (${combApp1.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 2-app: ${combApp2} (${combApp2.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println(f"combinator with 3-app: ${combApp3} (${combApp3.toDouble / allCombs.toDouble * 100.0}%.2f%%)")
    simuLog.println("=======================================")
    dut.clock.step(3)
    simuLog.close()

    runningCycle.println(benchmark.toString() ++ "," ++ cycleCounter.toString())
    heapAlloc.println(benchmark.toString() ++ "," ++ (dut.io.heapCsm.getValue().asBigInt - programSize).toString())
  }

  var bCounter: Int = 0
  val total: Int = benchmarks.length
  benchmarks.foreach { b =>
    s"${b.toString()}" should "pass" in {
      compiled.runSim { dut =>
        countStuffs(b)
        runBenchmark(b, dut)
        bCounter = bCounter + 1
        println(b.toString() ++ " done " ++ s"(${bCounter}/${total})")
      }
    }
  }

  override def afterAll(): Unit = {
    runningCycle.close()
    heapAlloc.close()
    combCount.close()
    appCount.close()
  }

}
