package benchmarks
import common.Helper._
 
// Functions in this file: 6
// Apps in this file: 28
// Combinators in this file: 29
object ProgramBin extends Benchmark {
override def toString() = "ProgramBin" 
val combinatorCount = 29
val prog = Seq(
 // FUN0IntSpec.main
appBuilder( // 0
ptrBuilder(22),
ptrBuilder(21),
prmBuilder("+"),
ptrBuilder(11),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(20),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(19),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(18),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
intBuilder(17),
ptrBuilder(3),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)),
intBuilder(16),
ptrBuilder(4),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
intBuilder(15),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)),
intBuilder(14),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)),
intBuilder(13),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(4,2,List(3, 0, 1)),
intBuilder(12),
ptrBuilder(8),
),
appBuilder( // 10
comBuilder(4,2,List(3, 0, 1)),
intBuilder(11),
ptrBuilder(9),
),
appBuilder( // 11
ptrBuilder(22),
ptrBuilder(10),
),
appBuilder( // 12
comBuilder(4,2,List(3, 0, 1)),
intBuilder(10),
comBuilder(2,0,List(0)),
),
appBuilder( // 13
comBuilder(4,2,List(3, 0, 1)),
intBuilder(9),
ptrBuilder(12),
),
appBuilder( // 14
comBuilder(4,2,List(3, 0, 1)),
intBuilder(8),
ptrBuilder(13),
),
appBuilder( // 15
comBuilder(4,2,List(3, 0, 1)),
intBuilder(7),
ptrBuilder(14),
),
appBuilder( // 16
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
ptrBuilder(15),
),
appBuilder( // 17
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(16),
),
appBuilder( // 18
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(17),
),
appBuilder( // 19
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(18),
),
appBuilder( // 20
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(20),
),
 // FUN1IntSpec.sumInt
appBuilder( // 22
ptrBuilder(23),
ptrBuilder(27),
intBuilder(0),
),
 // FUN2IntSpec.sumPoly
appBuilder( // 23
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(24),
ptrBuilder(26),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 24
comBuilder(4,7,List(0, 1, 2, 3)),
yBuilder(),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(5,16,List(4, 2, 0, 1, 3)),
comBuilder(4,6,List(0, 2, 1, 3)),
),
 // FUN4NanoPrelude.fst
appBuilder( // 26
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN5IntSpec.intInst
appBuilder( // 27
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("+"),
prmBuilder("*"),
),
)
}