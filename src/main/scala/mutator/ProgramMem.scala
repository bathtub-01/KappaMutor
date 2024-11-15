package mutator

import chisel3._
import chisel3.util._
import chisel3.experimental.BundleLiterals._
import chisel3.experimental.VecLiterals._
import _root_.circt.stage.ChiselStage

import common._
import common.SystemConfig._
import common.Helper._

object ExampleBins {
  type Bin = Seq[Template]

  // Combinators used in MicroHS, 19 in total
  val I: Atom = comBuilder(1, 0, List(0)) // X
  val K: Atom = comBuilder(2, 0, List(0)) // X
  val B: Atom = comBuilder(3, 3, List(0, 1, 2)) // X(XX)
  val S: Atom = comBuilder(3, 6, List(0, 2, 1, 2)) // XX(XX)
  val C: Atom = comBuilder(3, 2, List(0, 2, 1)) // XXX
  val Sp:Atom = comBuilder(4, 15, List(0, 1, 3, 2, 3)) // X(XX)(XX)
  val Bp:Atom = comBuilder(4, 6, List(0, 1, 2, 3)) // XX(XX)
  val Cp:Atom = comBuilder(4, 5, List(0, 1, 3, 2)) // X(XX)X
  val A: Atom = comBuilder(2, 0, List(1)) // X
  val U: Atom = comBuilder(2, 1, List(1, 0)) // XX
  val Z: Atom = comBuilder(3, 1, List(0, 1)) // XX
  val P: Atom = comBuilder(3, 2, List(2, 0, 1)) // XXX
  val R: Atom = comBuilder(3, 2, List(1, 2, 0)) // XXX
  val O: Atom = comBuilder(4, 2, List(3, 0, 1)) // XXX
  val K2:Atom = comBuilder(3, 0, List(0)) // X
  val K3:Atom = comBuilder(4, 0, List(0)) // X
  val K4:Atom = comBuilder(5, 0, List(0)) // X
  val CpB:Atom = comBuilder(4, 6, List(0, 2, 1, 3)) // XX(XX)
}
//   // hand-written factorial function
//   val fact: Bin = Seq(
//     templateBuilder(
//       appBuilder(funBuilder(1), intBuilder(20)),
//       0
//     ),
//     templateBuilder(
//       appBuilder(
//         comBuilder(4, 14, List(0, 3, 1, 2, 3)),
//         ptrBuilder(0), intBuilder(0), ptrBuilder(1)
//       ),
//       2,
//       appBuilder(comBuilder(3, 2, List(2, 0, 1)), prmBuilder("=="), intBuilder(0)),
//       appBuilder(
//         comBuilder(5, 26, List(0, 4, 2, 3, 1, 4)),
//         funBuilder(1), prmBuilder("+"), prmBuilder("-"),
//         intBuilder(1)
//       )
//     )
//   )

//   val factOpt: Bin = Seq(
//     templateBuilder(
//       appBuilder(funBuilder(1), intBuilder(20)),
//       0
//     ),
//     templateBuilder(
//       appBuilder(
//         comBuilder(4, 14, List(0, 3, 1, 2, 3)),
//         ptrBuilder(0), intBuilder(0), ptrBuilder(1)
//       ),
//       2,
//       appBuilder(comBuilder(3, 2, List(2, 0, 1)), prmBuilder("=="), intBuilder(0)),
//       appBuilder(
//         comBuilder(5, 23, List(4, 2, 3, 0, 1, 4)),
//         funBuilder(1), prmBuilder("+"), prmBuilder("-"),
//         intBuilder(1)
//       )
//     )
//   )

//   // C(CCp(PKA))A - the compiled boolean `and` function
//   // True - K; False - A; `and` True True
//   // Requires 12 or 8 cycles to execute, input dependant
//   val and1: Bin = Seq(
//     templateBuilder(
//       appBuilder(funBuilder(1), K, K),
//       0
//     ),
//     templateBuilder(
//       appBuilder(C, ptrBuilder(0), A),
//       2,
//       appBuilder(C, Cp, ptrBuilder(1)),
//       appBuilder(P, K, A)
//     )
//   )

//   // "optimized" `and` function
//   // require 7 or 5 cycles to execute, input dependant
//   val and2: Bin = Seq(
//     templateBuilder(
//       appBuilder(funBuilder(1), A, K),
//       0
//     ),
//     templateBuilder(
//       appBuilder(comBuilder(5, 12, List(3, 4, 0, 1, 2)), K, A, A),
//       0
//     )
//   )

//   // SIII(BKK)(II)I(III) - example without let-bindings
//   val prog1: Bin = Seq(
//     templateBuilder(
//       appBuilder(funBuilder(1), funBuilder(2), funBuilder(3), I, funBuilder(4)),
//       0
//     ),
//     templateBuilder(
//       appBuilder(S, I, I, I),
//       0
//     ),
//     templateBuilder(
//       appBuilder(B, K, K),
//       0
//     ),
//     templateBuilder(
//       appBuilder(I, I),
//       0
//     ),
//     templateBuilder(
//       appBuilder(I, I, I),
//       0
//     )
//   )

//   // B(SIII)(K(II)S)((BKK)(II)I(III)) - example with multiple let-bindings (pipeline needed)
//   // B a b c = a (bc)
//   val prog2: Bin = Seq(
//     templateBuilder(
//       appBuilder(B, funBuilder(1), funBuilder(2), funBuilder(3)),
//       0
//     ),
//     templateBuilder(
//       appBuilder(S, I, I, I),
//       0
//     ),
//     templateBuilder(
//       appBuilder(K, ptrBuilder(0), S),
//       1,
//       appBuilder(I, I)
//     ),
//     templateBuilder(
//       appBuilder(ptrBuilder(0), ptrBuilder(1), I, ptrBuilder(2)),
//       3,
//       appBuilder(B, K, K),
//       appBuilder(I, I),
//       appBuilder(I, I, I)
//     )
//   )

//   // SII((BKK)III) - example of re-computation (need heap update)
//   val prog3: Bin = Seq(
//     templateBuilder(
//       appBuilder(S, I, I, ptrBuilder(0)),
//       1,
//       appBuilder(funBuilder(1), I, I, I)
//     ),
//     templateBuilder(
//       appBuilder(B, K, K),
//       0
//     )
//   )

//   // KIB((BKK)KII)SI
//   val prog4: Bin = Seq(
//     templateBuilder(
//       appBuilder(K, I, B, ptrBuilder(0), S, I),
//       2,
//       appBuilder(ptrBuilder(1), K, I, I),
//       appBuilder(B, K, K)
//     )
//   )

//   // arithmetic programs
//   val arith1: Bin = Seq(
//     templateBuilder(
//       appBuilder(intBuilder(3), prmBuilder("-"), ptrBuilder(0)),
//       1,
//       appBuilder(intBuilder(2), prmBuilder("*"), intBuilder(4))
//     )
//   )
// }

// object ProgramMem extends App {
//   ChiselStage.emitSystemVerilogFile(
//     new ProgramMem(ExampleBins.prog1),
//     Array("--target-dir", "sv-gen"),
//     firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info"),
//   )
// }
