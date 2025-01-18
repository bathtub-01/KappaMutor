package benchmarks
import common.Helper._
 
// Functions in this file: 15
// Apps in this file: 35
// Combinators in this file: 49
object Mss extends Benchmark {
override def toString() = "Mss" 
val combinatorCount = 49
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
ptrBuilder(28),
ptrBuilder(1),
intBuilder(20),
),
 // FUN1Mss.mss
appBuilder( // 3
comBuilder(5,20,List(0, 1, 2, 3, 4)),
ptrBuilder(4),
ptrBuilder(9),
ptrBuilder(12),
ptrBuilder(13),
),
 // FUN2NanoPrelude.maximum
appBuilder( // 4
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
ptrBuilder(6),
),
appBuilder( // 5
comBuilder(3,9,List(1, 0, 2, 2, 1)),
prmBuilder(">"),
),
appBuilder( // 6
comBuilder(1,0,List(0)),
ptrBuilder(7),
ptrBuilder(5),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 7
comBuilder(4,7,List(0, 1, 2, 3)),
yBuilder(),
ptrBuilder(8),
),
appBuilder( // 8
comBuilder(5,16,List(4, 2, 0, 1, 3)),
comBuilder(4,6,List(0, 2, 1, 3)),
),
 // FUN4NanoPrelude.map
appBuilder( // 9
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 11
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(10),
),
 // FUN5NanoPrelude.sum
appBuilder( // 12
ptrBuilder(7),
prmBuilder("+"),
intBuilder(0),
),
 // FUN6Mss.segments
appBuilder( // 13
comBuilder(4,6,List(0, 1, 2, 3)),
ptrBuilder(14),
ptrBuilder(20),
ptrBuilder(22),
),
 // FUN7Data.List_Type.concatMap
appBuilder( // 14
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 15
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(17),
),
appBuilder( // 16
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(15),
),
 // FUN8Data.List_Type.++
appBuilder( // 17
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(19),
),
appBuilder( // 18
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 19
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(18),
),
 // FUN9Mss.tails
appBuilder( // 20
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(21),
),
appBuilder( // 21
comBuilder(5,40,List(0, 1, 3, 4, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(20),
),
 // FUN10Mss.inits
appBuilder( // 22
comBuilder(3,6,List(2, 0, 1, 2)),
ptrBuilder(24),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(5,23,List(0, 1, 4, 2, 3, 4)),
comBuilder(7,17,List(0, 1, 2, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(22),
ptrBuilder(25),
),
appBuilder( // 24
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN11NanoPrelude.init
appBuilder( // 25
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(1),
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(6,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(4,16,List(3, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(26),
),
 // FUN12NanoPrelude.enumFromTo
appBuilder( // 28
comBuilder(5,15,List(0, 1, 4, 2, 3)),
ptrBuilder(30),
ptrBuilder(29),
ptrBuilder(34),
),
appBuilder( // 29
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
),
 // FUN13NanoPrelude.takeWhile
appBuilder( // 30
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(33),
),
appBuilder( // 31
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 32
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)),
comBuilder(2,0,List(0)),
),
appBuilder( // 33
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)),
comBuilder(2,0,List(0)),
ptrBuilder(32),
ptrBuilder(31),
),
 // FUN14NanoPrelude.enumFrom
appBuilder( // 34
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(34),
prmBuilder("+"),
intBuilder(1),
),
)
}