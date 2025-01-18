package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 38
// Combinators in this file: 49
object Queens extends Benchmark {
override def toString() = "Queens" 
val combinatorCount = 49
val prog = Seq(
 // FUN0Queens.main
appBuilder( // 0
ptrBuilder(1),
intBuilder(6),
),
 // FUN1Queens.nsoln
appBuilder( // 1
comBuilder(3,7,List(0, 1, 2, 2)),
ptrBuilder(2),
ptrBuilder(5),
),
 // FUN2NanoPrelude.length
appBuilder( // 2
yBuilder(),
ptrBuilder(4),
intBuilder(0),
),
appBuilder( // 3
comBuilder(5,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 4
comBuilder(4,16,List(3, 2, 0, 1, 2)),
ptrBuilder(3),
),
 // FUN3Queens.gen
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 7
comBuilder(4,7,List(2, 3, 0, 1)),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 8
comBuilder(6,44,List(0, 1, 3, 2, 4, 5)),
ptrBuilder(11),
ptrBuilder(17),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 10
comBuilder(5,12,List(0, 1, 3, 4, 2)),
ptrBuilder(9),
ptrBuilder(8),
ptrBuilder(6),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 11
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(12),
),
 // FUN5Data.List_Type.++
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 15
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 16
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(15),
),
 // FUN6Queens.gen1
appBuilder( // 17
comBuilder(5,15,List(0, 1, 4, 2, 3)),
ptrBuilder(11),
ptrBuilder(18),
ptrBuilder(35),
),
 // FUN7Queens.gen2
appBuilder( // 18
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(20),
ptrBuilder(19),
),
appBuilder( // 19
comBuilder(6,12,List(5, 0, 3, 2, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
appBuilder( // 20
comBuilder(5,9,List(0, 4, 1, 3, 2)),
ptrBuilder(21),
intBuilder(1),
comBuilder(2,0,List(0)),
),
 // FUN8Queens.safe
appBuilder( // 21
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(33),
),
appBuilder( // 22
comBuilder(5,16,List(2, 0, 4, 1, 3)),
prmBuilder("/="),
prmBuilder("-"),
),
appBuilder( // 23
comBuilder(5,16,List(2, 0, 4, 1, 3)),
prmBuilder("/="),
prmBuilder("+"),
),
appBuilder( // 24
comBuilder(6,48,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(34),
),
appBuilder( // 25
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(24),
),
appBuilder( // 26
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(26),
ptrBuilder(23),
ptrBuilder(34),
ptrBuilder(22),
),
appBuilder( // 28
comBuilder(5,24,List(0, 1, 4, 3, 4, 2)),
comBuilder(6,49,List(0, 5, 1, 2, 3, 4)),
),
appBuilder( // 29
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(28),
ptrBuilder(27),
prmBuilder("+"),
),
appBuilder( // 30
comBuilder(6,40,List(0, 2, 1, 3, 4, 5)),
ptrBuilder(34),
prmBuilder("/="),
),
appBuilder( // 31
comBuilder(6,29,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,46,List(0, 4, 1, 3, 2, 4)),
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(31),
ptrBuilder(29),
intBuilder(1),
),
appBuilder( // 33
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
comBuilder(2,0,List(1)),
ptrBuilder(32),
),
 // FUN9Data.Bool.&&
appBuilder( // 34
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN10Queens.toOne
appBuilder( // 35
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(1),
ptrBuilder(37),
ptrBuilder(36),
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 37
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(35),
prmBuilder("-"),
intBuilder(1),
),
)
}