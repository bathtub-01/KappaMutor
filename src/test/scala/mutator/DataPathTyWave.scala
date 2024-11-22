// package mutator

// import chisel3._
// import chisel3.util._
// import chisel3.experimental.BundleLiterals._
// import tywaves.simulator.simulatorSettings._
// import tywaves.simulator.TywavesSimulator._
// import org.scalatest.funspec.AnyFunSpec
// import org.scalatest.matchers.should.Matchers

// import common._
// import common.SystemConfig._
// import common.Helper._

// class Dumb[T <: Data](depth: Int, t: T) extends Module {
//   val rdAddr = IO(Input(UInt(log2Ceil(depth).W)))
//   val rdData = IO(Output(t))
//   val wrEna = IO(Input(Bool()))
//   val wrData = IO(Input(t))
//   val wrAddr = IO(Input(UInt(log2Ceil(depth).W)))

//   val mem = SyncReadMem(depth, t)
//   rdData := mem.read(rdAddr)

//   when(wrEna) {
//     mem.write(wrAddr, wrData)
//   }
// }

// class Dumb_ extends Module {
//   val io = IO(new Bundle{
//     val a = Input(UInt(8.W))
//     val b = Input(UInt(8.W))
//     val c = Output(UInt(8.W))
//   })
//   io.c := io.a + io.b
// }

// class DataPathTest extends AnyFunSpec with Matchers {
//   describe("DataPath") {
//     it("executes the program") {
//       simulate(new DataPath, Seq(VcdTrace, WithTywavesWaveforms(true)), simName = "prog2") { dut =>
//         dut.clock.step(3)
//         dut.io.start.poke(true)
//         dut.clock.step()
//         dut.io.start.poke(false)
//         dut.clock.step(80)
//       }
//     }
//   }

// }

