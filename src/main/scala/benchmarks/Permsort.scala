package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 40
// Combinators in this file: 61
object Permsort extends Benchmark {
override def toString() = "Permsort" 
val combinatorCount = 61
val prog = Seq(
 // FUN0Permsort.main
appBuilder( // 0
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(12),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(12),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
intBuilder(9),
ptrBuilder(3),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)),
intBuilder(7),
ptrBuilder(4),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)),
intBuilder(10),
ptrBuilder(6),
),
appBuilder( // 8
ptrBuilder(10),
ptrBuilder(7),
),
 // FUN1NanoPrelude.head
appBuilder( // 9
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(3),
comBuilder(2,0,List(0)),
),
 // FUN2Permsort.permSort
appBuilder( // 10
comBuilder(5,20,List(0, 1, 2, 3, 4)),
ptrBuilder(9),
ptrBuilder(11),
ptrBuilder(15),
ptrBuilder(21),
),
 // FUN3NanoPrelude.filter
appBuilder( // 11
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 12
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 13
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
comBuilder(5,39,List(0, 2, 1, 4, 3, 4)),
ptrBuilder(12),
),
appBuilder( // 14
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(13),
),
 // FUN4Permsort.ord
appBuilder( // 15
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(19),
),
appBuilder( // 16
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(15),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 17
comBuilder(6,40,List(0, 2, 1, 3, 4, 5)),
ptrBuilder(20),
prmBuilder("<="),
),
appBuilder( // 18
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(17),
ptrBuilder(16),
),
appBuilder( // 19
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(1)),
ptrBuilder(18),
),
 // FUN5Data.Bool.&&
appBuilder( // 20
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN6Permsort.perm
appBuilder( // 21
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(23),
ptrBuilder(22),
),
appBuilder( // 22
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(24),
ptrBuilder(30),
ptrBuilder(21),
),
appBuilder( // 23
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN7Data.List_Type.concatMap
appBuilder( // 24
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(26),
),
appBuilder( // 25
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(25),
),
 // FUN8Data.List_Type.++
appBuilder( // 27
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(29),
),
appBuilder( // 28
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 29
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(28),
),
 // FUN9Permsort.place
appBuilder( // 30
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)),
yBuilder(),
ptrBuilder(36),
ptrBuilder(33),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(37),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 32
comBuilder(6,58,List(0, 1, 3, 2, 4, 5)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 33
comBuilder(3,3,List(0, 1, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 35
comBuilder(5,5,List(4, 0, 2, 1)),
ptrBuilder(34),
comBuilder(2,0,List(0)),
),
appBuilder( // 36
comBuilder(6,45,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(35),
),
 // FUN10NanoPrelude.map
appBuilder( // 37
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(39),
),
appBuilder( // 38
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 39
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(38),
),
)
}