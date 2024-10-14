package maker

import chisel3._
import circt.stage.ChiselStage

import gcd._

object VerilogMain extends App {
  ChiselStage.emitSystemVerilogFile(new GCD, Array("--target-dir", "sv-ven"))
}
