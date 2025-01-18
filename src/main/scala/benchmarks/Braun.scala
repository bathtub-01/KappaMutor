package benchmarks
import common.Helper._
 
// Functions in this file: 14
// Apps in this file: 38
// Combinators in this file: 57
object Braun extends Benchmark {
override def toString() = "Braun" 
val combinatorCount = 57
val prog = Seq(
 // FUN0Braun.main
appBuilder( // 0
ptrBuilder(4),
ptrBuilder(3),
),
appBuilder( // 1
ptrBuilder(31),
intBuilder(0),
intBuilder(255),
),
appBuilder( // 2
ptrBuilder(27),
intBuilder(2),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(5),
ptrBuilder(9),
ptrBuilder(2),
),
 // FUN1Braun.int
appBuilder( // 4
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
intBuilder(1),
),
 // FUN2NanoPrelude.all
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(8),
),
appBuilder( // 7
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(1)),
ptrBuilder(6),
),
 // FUN3Data.Bool.&&
appBuilder( // 8
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN4Braun.prop
appBuilder( // 9
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(10),
ptrBuilder(14),
ptrBuilder(22),
),
 // FUN5Braun.equal
appBuilder( // 10
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)),
comBuilder(2,0,List(1)),
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(6,37,List(2, 0, 4, 1, 3, 5)),
prmBuilder("=="),
comBuilder(2,0,List(0)),
),
appBuilder( // 12
comBuilder(6,48,List(3, 0, 1, 4, 2, 5)),
comBuilder(2,0,List(0)),
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 13
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN6Braun.toList
appBuilder( // 14
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(16),
comBuilder(2,0,List(0)),
),
appBuilder( // 15
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(17),
ptrBuilder(14),
ptrBuilder(14),
),
appBuilder( // 16
comBuilder(5,16,List(0, 2, 1, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(15),
),
 // FUN7Braun.ilv
appBuilder( // 17
comBuilder(3,6,List(1, 2, 0, 2)),
ptrBuilder(21),
),
appBuilder( // 18
comBuilder(5,16,List(0, 3, 1, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(17),
),
appBuilder( // 19
comBuilder(6,46,List(0, 2, 1, 3, 4, 5)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(18),
),
appBuilder( // 20
comBuilder(5,40,List(1, 0, 2, 4, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 21
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(20),
ptrBuilder(19),
),
 // FUN8Braun.fromList
appBuilder( // 22
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(24),
ptrBuilder(22),
),
 // FUN9Braun.insertTree
appBuilder( // 24
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(26),
comBuilder(2,0,List(1)),
),
appBuilder( // 25
comBuilder(6,30,List(0, 2, 1, 3, 5, 4)),
comBuilder(5,4,List(3, 0, 1, 2)),
ptrBuilder(24),
),
appBuilder( // 26
comBuilder(5,24,List(0, 1, 4, 2, 4, 3)),
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(25),
comBuilder(5,4,List(3, 0, 1, 2)),
comBuilder(2,0,List(1)),
),
 // FUN10NanoPrelude.replicate
appBuilder( // 27
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(30),
ptrBuilder(29),
comBuilder(2,0,List(0)),
),
appBuilder( // 28
comBuilder(4,7,List(0, 3, 1, 2)),
ptrBuilder(27),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 29
comBuilder(4,16,List(0, 3, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(28),
),
appBuilder( // 30
comBuilder(6,28,List(2, 0, 1, 3, 5, 4)),
prmBuilder("<="),
intBuilder(0),
),
 // FUN11NanoPrelude.enumFromTo
appBuilder( // 31
comBuilder(5,15,List(0, 1, 4, 2, 3)),
ptrBuilder(33),
ptrBuilder(32),
ptrBuilder(37),
),
appBuilder( // 32
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
),
 // FUN12NanoPrelude.takeWhile
appBuilder( // 33
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(36),
),
appBuilder( // 34
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 35
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)),
comBuilder(2,0,List(0)),
),
appBuilder( // 36
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)),
comBuilder(2,0,List(0)),
ptrBuilder(35),
ptrBuilder(34),
),
 // FUN13NanoPrelude.enumFrom
appBuilder( // 37
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(37),
prmBuilder("+"),
intBuilder(1),
),
)
}