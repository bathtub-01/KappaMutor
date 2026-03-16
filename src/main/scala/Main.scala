import chisel3._
import chisel3.simulator.ChiselSim

import scala.jdk.CollectionConverters._
import me.tongfei.progressbar.ProgressBar

import benchmarks._
import mutator.DataPath

object Main extends App with ChiselSim {
  def runBenchmark(benchmark: Benchmark, dut: DataPath): Int = {
    var cycles: Int = -2 // allign with the simulator
    dut.clock.step(3)
    // ====== program injection =======
    dut.io.progInject.poke(true.B)

    for (app <- benchmark.prog) {
      dut.io.progInjectIO.app.zip(app.app).foreach { case (p, a) => p.poke(a) }
      dut.clock.step()
    }
    dut.io.progInject.poke(false.B)
    // =========== startup ============
    dut.io.start.poke(true.B)
    dut.clock.step()
    dut.io.start.poke(false.B)
    // ============ run ===============
    while (!dut.io.done.peekBoolean() && cycles <= 1_000_000) {
      dut.clock.step()
      cycles = cycles + 1
    }
    cycles
  }

  def runBench(bs: List[Benchmark]) = ProgressBar
    .wrap(bs.asJava, "Processing")
    .asScala
    .map { b =>
      var cycles: Int = 0
      simulate(
        new DataPath,
        firtoolOpts = Array("-disable-all-randomization"),
        chiselOpts = Array("--warn-conf", "any:s")
      ) { dut =>
        cycles = runBenchmark(b, dut)
      }
      (b.toString, cycles)
    }
    .foreach { case (name, cycles) => println(s"${name}: ${cycles} consumed") }

  runBench(
    List(
      Adjoxo
      // Braun,
      // Clausify,
      // Countdown,
      // Fib,
      // Mss,
      // Ordlist,
      // Permsort,
      // Queens,
      // Queens2,
      // SumEuler,
      // Sumpuz,
      // Taut,
      // While
    )
  )
}
