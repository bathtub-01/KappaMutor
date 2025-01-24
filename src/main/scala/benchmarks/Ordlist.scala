package benchmarks
import common.Helper._
 
// Functions in this file: 15
// Apps in this file: 40
// Combinators in this file: 62
object Ordlist extends Benchmark {
override def toString() = "Ordlist" 
val combinatorCount = 62
val prog = Seq(
 // FUN0Ordlist.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
intBuilder(0),
intBuilder(1),
),
appBuilder( // 1
ptrBuilder(38),
ptrBuilder(39),
),
appBuilder( // 2
ptrBuilder(38),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(38),
ptrBuilder(2),
),
appBuilder( // 4
ptrBuilder(38),
ptrBuilder(3),
),
 // FUN1Ordlist.top
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(12),
ptrBuilder(11),
),
appBuilder( // 6
ptrBuilder(19),
comBuilder(2,0,List(0)),
),
appBuilder( // 7
ptrBuilder(17),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(7),
ptrBuilder(30),
),
appBuilder( // 9
ptrBuilder(19),
ptrBuilder(13),
),
appBuilder( // 10
ptrBuilder(17),
ptrBuilder(9),
),
appBuilder( // 11
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(14),
ptrBuilder(10),
ptrBuilder(30),
ptrBuilder(8),
),
 // FUN2NanoPrelude.and
appBuilder( // 12
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(13),
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(12),
),
 // FUN3Data.Bool_Type.True
appBuilder( // 13
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN4Data.List_Type.++
appBuilder( // 14
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(15),
),
appBuilder( // 15
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(16),
),
 // FUN5Data.List_Type.:
appBuilder( // 16
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN6NanoPrelude.map
appBuilder( // 17
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(18),
),
appBuilder( // 18
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(16),
),
 // FUN7Ordlist.prop
appBuilder( // 19
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,45,List(0, 1, 3, 1, 2, 3)),
ptrBuilder(20),
ptrBuilder(21),
ptrBuilder(25),
),
 // FUN8Ordlist.implies
appBuilder( // 20
comBuilder(2,1,List(1, 0)),
ptrBuilder(13),
),
 // FUN9Ordlist.ord
appBuilder( // 21
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(13),
ptrBuilder(23),
),
appBuilder( // 22
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(24),
ptrBuilder(20),
ptrBuilder(21),
),
appBuilder( // 23
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
ptrBuilder(13),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(22),
ptrBuilder(16),
),
 // FUN10Data.Bool.&&
appBuilder( // 24
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN11Ordlist.ins
appBuilder( // 25
comBuilder(3,7,List(0, 1, 2, 2)),
yBuilder(),
ptrBuilder(29),
),
appBuilder( // 26
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(20),
),
appBuilder( // 27
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(26),
ptrBuilder(16),
comBuilder(3,3,List(0, 1, 2)),
),
appBuilder( // 28
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(27),
ptrBuilder(16),
ptrBuilder(16),
),
appBuilder( // 29
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 4, 2, 3, 5)),
comBuilder(5,12,List(4, 0, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(28),
),
 // FUN12Ordlist.boolList
appBuilder( // 30
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(14),
ptrBuilder(30),
ptrBuilder(37),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 32
ptrBuilder(16),
ptrBuilder(13),
),
appBuilder( // 33
ptrBuilder(17),
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(33),
ptrBuilder(30),
),
appBuilder( // 35
ptrBuilder(16),
comBuilder(2,0,List(0)),
),
appBuilder( // 36
ptrBuilder(17),
ptrBuilder(35),
),
appBuilder( // 37
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(14),
ptrBuilder(36),
ptrBuilder(30),
ptrBuilder(34),
),
 // FUN13Ordlist.S
appBuilder( // 38
comBuilder(3,3,List(0, 2, 1)),
comBuilder(2,0,List(0)),
),
 // FUN14Ordlist.Z
appBuilder( // 39
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
)
}