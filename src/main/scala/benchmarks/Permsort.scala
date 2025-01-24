package benchmarks
import common.Helper._
 
// Functions in this file: 13
// Apps in this file: 32
// Combinators in this file: 68
object Permsort extends Benchmark {
override def toString() = "Permsort" 
val combinatorCount = 68
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
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(9),
ptrBuilder(11),
ptrBuilder(20),
),
appBuilder( // 11
ptrBuilder(12),
ptrBuilder(15),
),
 // FUN3NanoPrelude.filter
appBuilder( // 12
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(13),
),
appBuilder( // 13
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)),
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)),
ptrBuilder(14),
),
 // FUN4Data.List_Type.:
appBuilder( // 14
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN5Permsort.ord
appBuilder( // 15
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 16
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(19),
prmBuilder("<="),
ptrBuilder(15),
),
appBuilder( // 17
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
ptrBuilder(18),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(16),
ptrBuilder(14),
),
 // FUN6Data.Bool_Type.True
appBuilder( // 18
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN7Data.Bool.&&
appBuilder( // 19
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN8Permsort.perm
appBuilder( // 20
comBuilder(5,12,List(4, 0, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
ptrBuilder(21),
),
appBuilder( // 21
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(22),
ptrBuilder(26),
ptrBuilder(20),
),
 // FUN9Data.List_Type.concatMap
appBuilder( // 22
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(24),
),
 // FUN10Data.List_Type.++
appBuilder( // 24
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(14),
),
 // FUN11Permsort.place
appBuilder( // 26
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)),
yBuilder(),
ptrBuilder(29),
ptrBuilder(28),
ptrBuilder(14),
),
appBuilder( // 27
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,6,List(0, 2, 1, 2)),
comBuilder(4,14,List(0, 1, 2, 1, 3)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(14),
ptrBuilder(14),
),
appBuilder( // 28
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(27),
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(30),
),
appBuilder( // 29
comBuilder(6,60,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(4,54,List(3, 0, 0, 2, 1, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN12NanoPrelude.map
appBuilder( // 30
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(14),
),
)
}