package mutator

import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage

/*  The implementation of ALU in this file is highly inspired by the rocket-chip project:
    https://github.com/chipsalliance/rocket-chip/blob/master/src/main/scala/rocket/ALU.scala
*/

object ALUOpCode extends ChiselEnum {
  val eq = Value
  val le = Value
  val lt = Value
  val and = Value
  val or = Value
  val xor = Value
  val shl = Value
  val shr = Value
  val add_sub = Value
  val mult = Value
}

/*  
    is_sub: specify add/sub for adder. Must assert for both substraction and comparison.
    is_cond_inv: inverse the result of conditional test (eq -> neq, le -> gt, lt -> ge). 
                 Must be cleared for instructions other than comparison.
*/
class ALUFunction extends Bundle {
  val opcode = ALUOpCode()
  val is_sub = Bool() 
  val is_cond_inv = Bool() // must clear for instructions other than comparison
}

/*  ALU only contains conbinational logics. */
class ALU(width: Int) extends Module {
  val io = IO(new Bundle {
    val in1 = Input(Bits(width.W))
    val in2 = Input(Bits(width.W))
    val fn = Input(new ALUFunction)
    val out = Output(Bits(width.W))
  })
  // add/sub
  val in2_inv = Mux(io.fn.is_sub, ~io.in2, io.in2)
  // val in1_xor_in2 = io.in1 ^ in2_inv
  val adder_out = io.in1 + in2_inv + io.fn.is_sub

  // conditions
  val cmp2 = io.in2
  val eq = io.in1 === cmp2
  val lt = Mux(io.in1(width - 1) === io.in2(width - 1),
               adder_out(width - 1), io.in1(width - 1))
  val cond_out_default = Mux(io.fn.opcode <= ALUOpCode.le, eq, 0.U) |
                         Mux(io.fn.opcode === ALUOpCode.le || io.fn.opcode === ALUOpCode.lt, lt, 0.U)
  val cond_out = io.fn.is_cond_inv ^ cond_out_default

  // and/or/xor
  val logic_out = Mux(io.fn.opcode === ALUOpCode.xor || io.fn.opcode === ALUOpCode.or, io.in1 ^ io.in2, 0.U) |
                  Mux(io.fn.opcode === ALUOpCode.or || io.fn.opcode === ALUOpCode.and, io.in1 & io.in2, 0.U)
  
  // shifter
  val shamt = io.in2(4, 0)
  val sh_in = Mux(io.fn.opcode === ALUOpCode.shr, io.in1, Reverse(io.in1))
  val sh_out_r = (Cat(sh_in(width - 1), sh_in).asSInt >> shamt)(width - 1, 0)
  val sh_out_l = Reverse(sh_out_r)
  val sh_out = Mux(io.fn.opcode === ALUOpCode.shr, sh_out_r, 0.U) |
               Mux(io.fn.opcode === ALUOpCode.shl, sh_out_l, 0.U)
  
  val cond_logic_sh_out = cond_out | logic_out | sh_out
  io.out := Mux(io.fn.opcode === ALUOpCode.add_sub, adder_out, cond_logic_sh_out)
  when(io.fn.opcode === ALUOpCode.mult) {
    io.out := (io.in1.asSInt * io.in2.asSInt).asUInt(width - 1, 0)
  }
}

object ALU extends App {
  ChiselStage.emitSystemVerilogFile(
    new ALU(32),
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
  )
}
