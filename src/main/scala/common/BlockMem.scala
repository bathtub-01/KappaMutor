package common

import chisel3._
import chisel3.util._
import chisel3.util.experimental.loadMemoryFromFileInline
import chisel3.experimental.hierarchy.Instantiate
import chisel3.util.experimental.CIRCTSRAMParameter
import _root_.circt.stage.ChiselStage

/*  Implement basic memory as an independant module. This helps
    Vivado to infer memory as BRAM instead of LUT RAM.
 */

// TODO: unify memory port difinition for different types of memories

class MemIOBundle[T <: Data](depth: Int, t: T) extends Bundle {
  val rdAddr = Input(UInt(log2Ceil(depth).W))
  val rdData = Output(t)
  val wrEna = Input(Bool())
  val wrData = Input(t)
  val wrAddr = Input(UInt(log2Ceil(depth).W))
}

class BlockMem[T <: Data](depth: Int, t: T) extends Module {
  val io = IO(new MemIOBundle(depth, t))

  val mem = SyncReadMem(depth, t)
  io.rdData := mem.read(io.rdAddr)

  when(io.wrEna) {
    mem.write(io.wrAddr, io.wrData)
  }

  def write(data: T, addr: UInt) = {
    io.wrEna := true.B
    io.wrData := data
    io.wrAddr := addr
  }

  def read(addr: UInt) = {
    io.rdAddr := addr
  }

  def readOut: T = {
    io.rdData
  }

  def init(defaultAddr: UInt) = {
    io := DontCare
    io.rdAddr := defaultAddr
    io.wrEna := false.B
  }
}

class RomIO[T <: Data](depth: Int, t: T) extends Bundle {
  val rdAddr = Input(UInt(log2Ceil(depth).W))
  val rdData = Output(t)
}

/*  We use ROM (Vec) for program memory, this module has the same read/write
    timing as BlockMem.
 */
class BlockMemRom[T <: Data](depth: Int, t: T)(bin: Seq[T]) extends Module {
  val io = IO(new RomIO(depth, t))

  val mem = VecInit(bin)
  io.rdData := RegNext(mem(io.rdAddr))
}

// Multiple port memory, check https://www.chisel-lang.org/docs/explanations/memories#sram
class MultiPortBlockMem[T <: Data](n: Int, depth: Int, t: T) extends Module {
  val io = IO(new SRAMInterface(depth, t, 0, 0, n))
  io :<>= SRAM(depth, t, 0, 0, n)
}

import scala.collection.immutable.SeqMap

class MyReadWritePort(memoryParameter: CIRCTSRAMParameter) extends Record {
  val address = Input(UInt(log2Ceil(memoryParameter.depth).W))
  val writeData = Input(UInt(memoryParameter.width.W))
  val writeMask =
    Option.when(memoryParameter.masked)(
      Input(UInt((memoryParameter.width / memoryParameter.maskGranularity).W))
    )
  val writeEnable = Input(Bool())
  val readData = Output(UInt(memoryParameter.width.W))
  val enable = Input(Bool())

  // Records store elements in reverse order
  val elements: SeqMap[String, Data] = (SeqMap(
    "addr" -> address,
    "en" -> enable,
    "wmode" -> writeEnable,
    "wdata" -> writeData,
    "rdata" -> readData
  )).toSeq.reverse.to(SeqMap)
}

class MyInterface(memoryParameter: CIRCTSRAMParameter) extends Record {
  val clock = Input(Clock())
  def RW(idx: Int) =
    elements
      .getOrElse(s"RW$idx", throw new Exception(s"Cannot get port RW$idx"))
      .asInstanceOf[MyReadWritePort]

  // Records store elements in reverse order
  val elements: SeqMap[String, Data] =
    (Seq
      .tabulate(memoryParameter.readwrite)(i =>
        s"RW$i" -> new MyReadWritePort(memoryParameter)
      ) ++
      Seq("clock" -> clock)).reverse
      .to(SeqMap)
}

class SRAMReadFirstBlackbox(
    parameter: CIRCTSRAMParameter
) extends FixedIOExtModule(new MyInterface(parameter)) { self =>

  private val verilogInterface: String =
    (Seq("input clock") +: Seq
      .tabulate(parameter.readwrite)(idx =>
        Seq(
          s"// ReadWrite Port $idx",
          s"input [${log2Ceil(parameter.depth) - 1}:0] RW${idx}_addr",
          s"input RW${idx}_en",
          s"input RW${idx}_wmode",
          s"input [${parameter.width - 1}:0] RW${idx}_wdata",
          s"output reg [${parameter.width - 1}:0] RW${idx}_rdata"
        )
      )).flatten
      .mkString(",\n")

  def flip(i: Int) =
    if (i == 0) { 1 }
    else { 0 }

  private val rwLogic = Seq
    .tabulate(parameter.readwrite) { idx =>
      val prefix = s"RW${idx}"
      val flips = s"RW${flip(idx)}"
      Seq(s"always @(posedge clock) begin // ${prefix}") ++
        Seq(s"if (${prefix}_en) begin") ++
        Seq(
          s"${prefix}_rdata <= Memory[${prefix}_addr];",
          s"if (${prefix}_wmode)",
          s"  Memory[${prefix}_addr] <= ${prefix}_wdata;"
        ) ++
        Seq(s"end") ++
        Seq(s"end // ${prefix}")
    }
    .flatten

  private val init_logic =
    Seq(
      s"""(* ram_style = "block" *) reg [${parameter.width - 1}:0] Memory[0:${parameter.depth - 1}];""",
      "initial begin",
      "integer i;",
      s"  for (i = 0; i < ${parameter.depth}; i = i + 1) begin",
      s"    Memory[i] = ${parameter.width}'(i+1);",
      "  end",
      "end"
    )

  private val logic = (init_logic ++ rwLogic).mkString("\n")

  override def desiredName = parameter.moduleName ++ "rf"

  setInline(
    desiredName + ".sv",
    s"""module ${parameter.moduleName}rf(
       |${verilogInterface}
       |);
       |${logic}
       |endmodule
       |""".stripMargin
  )
}

/** This is stolen from chisel3.util
  */
class SRAMBlackbox(
    parameter: CIRCTSRAMParameter,
    use_bram: Boolean = true
) extends FixedIOExtModule(new MyInterface(parameter)) { self =>

  private val verilogInterface: String =
    (Seq("input clock") +: Seq
      .tabulate(parameter.readwrite)(idx =>
        Seq(
          s"// ReadWrite Port $idx",
          s"input [${log2Ceil(parameter.depth) - 1}:0] RW${idx}_addr",
          s"input RW${idx}_en",
          s"input RW${idx}_wmode",
          s"input [${parameter.width - 1}:0] RW${idx}_wdata",
          s"output reg [${parameter.width - 1}:0] RW${idx}_rdata"
        )
      )).flatten
      .mkString(",\n")

  private val rwLogic = Seq
    .tabulate(parameter.readwrite) { idx =>
      val prefix = s"RW${idx}"
      Seq(s"always @(posedge clock) begin // ${prefix}") ++
        Seq(s"if (${prefix}_en) begin") ++
        Seq(
          s"if (${prefix}_wmode)",
          s"  Memory[${prefix}_addr] <= ${prefix}_wdata;",
          "else",
          s"  ${prefix}_rdata <= Memory[${prefix}_addr];"
        ) ++
        Seq(s"end") ++
        Seq(s"end // ${prefix}")
    }
    .flatten

  private val init_logic =
    if (use_bram) {
      Seq(
        s"""(* ram_style = "block" *) reg [${parameter.width - 1}:0] Memory[0:${parameter.depth - 1}];"""
      )
    } else {
      Seq(
        s"""(* ram_style = "ultra" *) reg [${parameter.width - 1}:0] Memory[0:${parameter.depth - 1}];"""
      )
    }

  private val logic = (init_logic ++ rwLogic).mkString("\n")

  override def desiredName = parameter.moduleName

  setInline(
    desiredName + ".sv",
    s"""module ${parameter.moduleName}(
       |${verilogInterface}
       |);
       |${logic}
       |endmodule
       |""".stripMargin
  )
}

class BlkBoxMemIO[T <: Data](depth: Int, t: T) extends Bundle {
  val enable = Input(Bool())
  val address = Input(UInt(log2Ceil(depth).W))
  val readData = Output(t)
  val isWrite = Input(Bool())
  val writeData = Input(t)
}

class DualPortBlkBoxMem[T <: Data](
    depth: Int,
    t: T,
    read_first_mode: Boolean = false,
    use_bram: Boolean = false,
    init_hex: String = ""
) extends Module {
  val io = IO(new SRAMInterface(depth, t, 0, 0, 2))
  val mem =
    if (read_first_mode)
      Instantiate(
        new SRAMReadFirstBlackbox(
          new CIRCTSRAMParameter(
            s"sram_2RW_${depth}x${t.getWidth}",
            0,
            0,
            2,
            depth.intValue,
            t.getWidth,
            0
          )
        )
      )
    else
      Instantiate(
        new SRAMBlackbox(
          new CIRCTSRAMParameter(
            s"sram_2RW_${depth}x${t.getWidth}",
            0,
            0,
            2,
            depth.intValue,
            t.getWidth,
            0
          ),
          use_bram
        )
      )

  private def flip(i: Int) =
    if (i == 0) { 1 }
    else { 0 }

  mem.io.clock := this.clock
  val regFwd = Seq.fill(2)(RegInit(false.B))
  val regWritten = Seq.fill(2)(Reg(t))
  for (i <- 0 until 2) {
    regFwd(i) := io.readwritePorts(flip(i)).enable &&
      io.readwritePorts(flip(i)).isWrite &&
      io.readwritePorts(flip(i)).address === io.readwritePorts(i).address
    regWritten(i) := io.readwritePorts(flip(i)).writeData
    mem.io.RW(i).address := io.readwritePorts(i).address
    mem.io.RW(i).enable := io.readwritePorts(i).enable
    io.readwritePorts(i).readData := Mux(
      regFwd(i),
      regWritten(i),
      mem.io.RW(i).readData.asTypeOf(t)
    )
    mem.io.RW(i).writeData := io.readwritePorts(i).writeData.asUInt
    mem.io.RW(i).writeEnable := io.readwritePorts(i).isWrite
  }

  def init() = {
    io.readwritePorts.foreach { p =>
      p := DontCare
      p.enable := false.B
    }
  }

  def readA(addr: UInt) = {
    io.readwritePorts(0).enable := true.B
    io.readwritePorts(0).isWrite := false.B
    io.readwritePorts(0).address := addr
  }

  def readOutA = io.readwritePorts(0).readData

  def writeA(data: T, addr: UInt) = {
    io.readwritePorts(0).enable := true.B
    io.readwritePorts(0).isWrite := true.B
    io.readwritePorts(0).writeData := data
    io.readwritePorts(0).address := addr
  }

  def readB(addr: UInt) = {
    io.readwritePorts(1).enable := true.B
    io.readwritePorts(1).isWrite := false.B
    io.readwritePorts(1).address := addr
  }

  def readOutB = io.readwritePorts(1).readData

  def writeB(data: T, addr: UInt) = {
    io.readwritePorts(1).enable := true.B
    io.readwritePorts(1).isWrite := true.B
    io.readwritePorts(1).writeData := data
    io.readwritePorts(1).address := addr
  }
}

object DualPortBlkBoxMem extends App {
  ChiselStage.emitSystemVerilogFile(
    new DualPortBlkBoxMem(
      1024,
      UInt(8.W),
      true,
      true,
      "/home/bathtuub/workspace/ouros-chisel/mem_init.hex"
    ),
    Array("--target-dir", "sv-gen"),
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}
