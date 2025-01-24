package benchmarks
import common.Helper._
 
// Functions in this file: 18
// Apps in this file: 33
// Combinators in this file: 70
object Braun extends Benchmark {
override def toString() = "Braun" 
val combinatorCount = 70
val prog = Seq(
 // FUN0Braun.main
appBuilder( // 0
ptrBuilder(4),
ptrBuilder(3),
),
appBuilder( // 1
ptrBuilder(29),
intBuilder(0),
intBuilder(255),
),
appBuilder( // 2
ptrBuilder(26),
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
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(8),
),
 // FUN3Data.Bool_Type.True
appBuilder( // 7
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN4Data.Bool.&&
appBuilder( // 8
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN5Braun.prop
appBuilder( // 9
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(10),
ptrBuilder(14),
ptrBuilder(21),
),
 // FUN6Braun.equal
appBuilder( // 10
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
prmBuilder("=="),
comBuilder(2,0,List(0)),
),
appBuilder( // 12
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,16,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 13
comBuilder(6,58,List(4, 5, 0, 1, 2, 3)),
ptrBuilder(7),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN7Braun.toList
appBuilder( // 14
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(15),
comBuilder(2,0,List(0)),
),
appBuilder( // 15
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,31,List(0, 1, 2, 3, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(16),
ptrBuilder(17),
ptrBuilder(14),
),
 // FUN8Data.List_Type.:
appBuilder( // 16
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN9Braun.ilv
appBuilder( // 17
comBuilder(3,6,List(1, 2, 0, 2)),
ptrBuilder(20),
),
appBuilder( // 18
comBuilder(5,28,List(0, 1, 2, 3, 4, 3)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(16),
),
appBuilder( // 19
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(16),
ptrBuilder(19),
),
 // FUN10Braun.fromList
appBuilder( // 21
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(22),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(23),
ptrBuilder(21),
),
 // FUN11Braun.Empty
appBuilder( // 22
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN12Braun.insertTree
appBuilder( // 23
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(24),
ptrBuilder(25),
ptrBuilder(22),
ptrBuilder(22),
),
appBuilder( // 24
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(25),
ptrBuilder(23),
),
 // FUN13Braun.Branch
appBuilder( // 25
comBuilder(5,18,List(0, 4, 1, 2, 3)),
comBuilder(2,0,List(0)),
),
 // FUN14NanoPrelude.replicate
appBuilder( // 26
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(28),
comBuilder(2,0,List(0)),
),
appBuilder( // 27
comBuilder(5,12,List(0, 4, 1, 2, 3)),
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)),
prmBuilder("<="),
intBuilder(0),
ptrBuilder(16),
),
appBuilder( // 28
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(27),
ptrBuilder(26),
prmBuilder("-"),
intBuilder(1),
),
 // FUN15NanoPrelude.enumFromTo
appBuilder( // 29
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,12,List(0, 1, 2, 4, 3)),
ptrBuilder(30),
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
ptrBuilder(32),
),
 // FUN16NanoPrelude.takeWhile
appBuilder( // 30
comBuilder(5,20,List(0, 1, 2, 3, 4)),
yBuilder(),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(16),
),
 // FUN17NanoPrelude.enumFrom
appBuilder( // 32
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(16),
ptrBuilder(32),
prmBuilder("+"),
intBuilder(1),
),
)
}