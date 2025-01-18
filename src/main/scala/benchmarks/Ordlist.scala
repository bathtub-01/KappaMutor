package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 38
// Combinators in this file: 66
object Ordlist extends Benchmark {
override def toString() = "Ordlist" 
val combinatorCount = 66
val prog = Seq(
 // FUN0Ordlist.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
intBuilder(0),
intBuilder(1),
),
appBuilder( // 1
comBuilder(3,1,List(1, 0)),
comBuilder(2,0,List(1)),
),
appBuilder( // 2
comBuilder(1,0,List(0)),
comBuilder(3,1,List(1, 0)),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(1,0,List(0)),
comBuilder(3,1,List(1, 0)),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(1,0,List(0)),
comBuilder(3,1,List(1, 0)),
ptrBuilder(3),
),
 // FUN1Ordlist.top
appBuilder( // 5
comBuilder(5,48,List(0, 1, 2, 4, 3, 4)),
comBuilder(1,0,List(0)),
ptrBuilder(8),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,15,List(0, 1, 2, 3, 4)),
ptrBuilder(13),
ptrBuilder(16),
comBuilder(2,0,List(0)),
ptrBuilder(32),
),
appBuilder( // 7
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(10),
ptrBuilder(13),
ptrBuilder(16),
comBuilder(2,0,List(1)),
ptrBuilder(32),
),
 // FUN2NanoPrelude.and
appBuilder( // 8
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(9),
),
appBuilder( // 9
comBuilder(4,6,List(2, 0, 1, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(8),
),
 // FUN3Data.List_Type.++
appBuilder( // 10
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 12
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(11),
),
 // FUN4NanoPrelude.map
appBuilder( // 13
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(15),
),
appBuilder( // 14
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 15
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(14),
),
 // FUN5Ordlist.prop
appBuilder( // 16
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(18),
ptrBuilder(19),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(19),
ptrBuilder(25),
),
 // FUN6Ordlist.implies
appBuilder( // 18
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(1)),
),
 // FUN7Ordlist.ord
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(23),
),
appBuilder( // 20
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(19),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 21
comBuilder(6,40,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(24),
ptrBuilder(18),
),
appBuilder( // 22
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(21),
ptrBuilder(20),
),
appBuilder( // 23
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(1)),
ptrBuilder(22),
),
 // FUN8Data.Bool.&&
appBuilder( // 24
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN9Ordlist.ins
appBuilder( // 25
comBuilder(4,20,List(0, 1, 3, 2, 3)),
yBuilder(),
ptrBuilder(31),
ptrBuilder(26),
),
appBuilder( // 26
comBuilder(5,16,List(0, 2, 1, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 27
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 28
comBuilder(5,42,List(0, 1, 3, 2, 3, 4)),
ptrBuilder(18),
),
appBuilder( // 29
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(28),
ptrBuilder(27),
),
appBuilder( // 30
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 31
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(6,47,List(5, 0, 1, 2, 4, 3)),
ptrBuilder(30),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(29),
),
 // FUN10Ordlist.boolList
appBuilder( // 32
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(37),
ptrBuilder(33),
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 34
comBuilder(5,15,List(0, 1, 2, 3, 4)),
ptrBuilder(13),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(32),
),
appBuilder( // 35
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(10),
ptrBuilder(13),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(32),
),
appBuilder( // 36
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(10),
ptrBuilder(32),
ptrBuilder(36),
),
)
}