package benchmarks
import common.Helper._
 
// Functions in this file: 13
// Apps in this file: 29
// Combinators in this file: 64
object Queens extends Benchmark {
override def toString() = "Queens" 
val combinatorCount = 64
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
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)),
comBuilder(4,6,List(3, 2, 0, 1)),
comBuilder(2,0,List(0)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 4
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(3),
),
 // FUN3Queens.gen
appBuilder( // 5
comBuilder(6,58,List(0, 1, 5, 2, 3, 4)),
yBuilder(),
ptrBuilder(7),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 6
comBuilder(6,27,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,21,List(0, 3, 4, 1, 2)),
ptrBuilder(8),
ptrBuilder(13),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(0),
ptrBuilder(6),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 8
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(9),
),
appBuilder( // 9
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(10),
),
 // FUN5Data.List_Type.++
appBuilder( // 10
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(11),
),
appBuilder( // 11
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(12),
),
 // FUN6Data.List_Type.:
appBuilder( // 12
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN7Queens.gen1
appBuilder( // 13
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(8),
ptrBuilder(14),
ptrBuilder(26),
),
 // FUN8Queens.gen2
appBuilder( // 14
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(16),
ptrBuilder(15),
),
appBuilder( // 15
comBuilder(5,12,List(0, 1, 4, 3, 2)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(12),
comBuilder(2,0,List(0)),
),
appBuilder( // 16
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,6,List(0, 2, 1, 2)),
comBuilder(5,9,List(0, 4, 1, 3, 2)),
ptrBuilder(17),
intBuilder(1),
comBuilder(2,0,List(0)),
),
 // FUN9Queens.safe
appBuilder( // 17
comBuilder(6,58,List(0, 1, 5, 2, 3, 4)),
yBuilder(),
ptrBuilder(23),
comBuilder(4,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 18
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(5,21,List(0, 1, 4, 2, 3)),
ptrBuilder(25),
prmBuilder("/="),
prmBuilder("-"),
),
appBuilder( // 19
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(5,21,List(0, 1, 4, 2, 3)),
ptrBuilder(25),
prmBuilder("/="),
prmBuilder("+"),
),
appBuilder( // 20
comBuilder(6,37,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,22,List(0, 1, 2, 3, 4)),
ptrBuilder(25),
prmBuilder("/="),
),
appBuilder( // 21
comBuilder(5,48,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(20),
ptrBuilder(19),
),
appBuilder( // 22
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(21),
ptrBuilder(18),
),
appBuilder( // 23
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
ptrBuilder(24),
ptrBuilder(22),
),
 // FUN10Data.Bool_Type.True
appBuilder( // 24
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN11Data.Bool.&&
appBuilder( // 25
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN12Queens.toOne
appBuilder( // 26
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(1),
ptrBuilder(28),
ptrBuilder(27),
),
appBuilder( // 27
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 28
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(12),
ptrBuilder(26),
prmBuilder("-"),
intBuilder(1),
),
)
}