package benchmarks
import common.Helper._
 
// Functions in this file: 8
// Apps in this file: 18
// Combinators in this file: 17
object ProgramBin extends Benchmark {
override def toString() = "ProgramBin" 
val combinatorCount = 17
val prog = Seq(
 // FUN0PolySum.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(6),
ptrBuilder(4),
ptrBuilder(2),
),
appBuilder( // 1
ptrBuilder(11),
intBuilder(51),
intBuilder(100),
),
appBuilder( // 2
ptrBuilder(7),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(11),
intBuilder(0),
intBuilder(50),
),
appBuilder( // 4
ptrBuilder(7),
ptrBuilder(3),
),
 // FUN1PolySum.+
appBuilder( // 5
comBuilder(2,1,List(1, 0)), // XX
comBuilder(3,0,List(0)), // X
),
 // FUN2PolySum.inst$(PolySum.Num@Primitives.Int)
appBuilder( // 6
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
prmBuilder("+"),
prmBuilder("-"),
prmBuilder("*"),
),
 // FUN3PolySum.sum
appBuilder( // 7
ptrBuilder(9),
ptrBuilder(8),
intBuilder(0),
),
appBuilder( // 8
ptrBuilder(5),
ptrBuilder(6),
),
 // FUN4PolySum.foldr
appBuilder( // 9
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 10
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN5NanoPrelude.enumFromTo
appBuilder( // 11
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(13),
ptrBuilder(12),
ptrBuilder(17),
),
appBuilder( // 12
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
 // FUN6NanoPrelude.takeWhile
appBuilder( // 13
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 14
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 15
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)), // XXX(XXX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 16
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(15),
ptrBuilder(14),
),
 // FUN7NanoPrelude.enumFrom
appBuilder( // 17
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(17),
prmBuilder("+"),
intBuilder(1),
),
)
}