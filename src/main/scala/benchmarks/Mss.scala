package benchmarks
import common.Helper._
 
// Functions in this file: 16
// Apps in this file: 29
// Combinators in this file: 60
object Mss extends Benchmark {
override def toString() = "Mss" 
val combinatorCount = 60
val prog = Seq(
 // FUN0Mss.main
appBuilder( // 0
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 1
intBuilder(0),
prmBuilder("-"),
intBuilder(20),
),
appBuilder( // 2
ptrBuilder(25),
ptrBuilder(1),
intBuilder(20),
),
 // FUN1Mss.mss
appBuilder( // 3
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(5),
ptrBuilder(4),
ptrBuilder(13),
),
appBuilder( // 4
ptrBuilder(9),
ptrBuilder(12),
),
 // FUN2NanoPrelude.maximum
appBuilder( // 5
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(3,5,List(0, 2, 1, 2)),
comBuilder(3,4,List(0, 2, 2, 1)),
prmBuilder(">"),
),
appBuilder( // 7
ptrBuilder(8),
ptrBuilder(6),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 8
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
),
 // FUN4NanoPrelude.map
appBuilder( // 9
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(10),
),
appBuilder( // 10
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(11),
),
 // FUN5Data.List_Type.:
appBuilder( // 11
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN6NanoPrelude.sum
appBuilder( // 12
ptrBuilder(8),
prmBuilder("+"),
intBuilder(0),
),
 // FUN7Mss.segments
appBuilder( // 13
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(14),
ptrBuilder(20),
),
appBuilder( // 14
ptrBuilder(15),
ptrBuilder(19),
),
 // FUN8Data.List_Type.concatMap
appBuilder( // 15
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(16),
),
appBuilder( // 16
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(17),
),
 // FUN9Data.List_Type.++
appBuilder( // 17
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(18),
),
appBuilder( // 18
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(11),
),
 // FUN10Mss.tails
appBuilder( // 19
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
comBuilder(2,0,List(0)),
comBuilder(4,11,List(0, 1, 1, 3, 2)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(11),
ptrBuilder(19),
),
 // FUN11Mss.inits
appBuilder( // 20
comBuilder(5,40,List(4, 0, 1, 2, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
ptrBuilder(22),
),
appBuilder( // 21
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(11),
ptrBuilder(20),
ptrBuilder(23),
),
appBuilder( // 22
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(21),
),
 // FUN12NanoPrelude.init
appBuilder( // 23
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
errorBuilder(1),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,6,List(2, 0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(24),
),
appBuilder( // 24
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,17,List(0, 1, 2, 3, 4)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(11),
ptrBuilder(23),
),
 // FUN13NanoPrelude.enumFromTo
appBuilder( // 25
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,12,List(0, 1, 2, 4, 3)),
ptrBuilder(26),
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
ptrBuilder(28),
),
 // FUN14NanoPrelude.takeWhile
appBuilder( // 26
comBuilder(5,20,List(0, 1, 2, 3, 4)),
yBuilder(),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(27),
),
appBuilder( // 27
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(11),
),
 // FUN15NanoPrelude.enumFrom
appBuilder( // 28
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(11),
ptrBuilder(28),
prmBuilder("+"),
intBuilder(1),
),
)
}