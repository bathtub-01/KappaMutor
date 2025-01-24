package benchmarks
import common.Helper._
 
// Functions in this file: 7
// Apps in this file: 24
// Combinators in this file: 34
object ProgramBin extends Benchmark {
override def toString() = "ProgramBin" 
val combinatorCount = 34
val prog = Seq(
 // FUN0Lazy.main
appBuilder( // 0
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(3),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(4),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<"),
intBuilder(5),
),
appBuilder( // 8
ptrBuilder(20),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(12),
prmBuilder("*"),
intBuilder(2),
prmBuilder("=="),
),
appBuilder( // 10
comBuilder(4,49,List(0, 3, 1, 2, 3, 3)),
ptrBuilder(9),
ptrBuilder(12),
ptrBuilder(16),
ptrBuilder(8),
),
 // FUN1Lazy.boolToInt
appBuilder( // 11
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
intBuilder(42),
),
 // FUN2NanoPrelude.sum
appBuilder( // 12
ptrBuilder(13),
prmBuilder("+"),
intBuilder(0),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 13
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(15),
ptrBuilder(14),
),
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
),
appBuilder( // 15
comBuilder(5,19,List(0, 1, 2, 4, 3)),
yBuilder(),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN4Data.List_Type.++
appBuilder( // 16
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)),
yBuilder(),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(18),
),
 // FUN5Data.List_Type.:
appBuilder( // 18
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(19),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 19
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
),
 // FUN6NanoPrelude.takeWhile
appBuilder( // 20
comBuilder(5,22,List(0, 1, 2, 3, 4)),
yBuilder(),
ptrBuilder(23),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(21),
),
appBuilder( // 21
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(18),
),
appBuilder( // 22
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
),
appBuilder( // 23
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(22),
),
)
}