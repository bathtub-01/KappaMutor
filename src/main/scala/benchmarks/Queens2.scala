package benchmarks
import common.Helper._
 
// Functions in this file: 20
// Apps in this file: 52
// Combinators in this file: 86
object Queens2 extends Benchmark {
override def toString() = "Queens2" 
val combinatorCount = 86
val prog = Seq(
 // FUN0Queens2.main
appBuilder( // 0
ptrBuilder(1),
intBuilder(5),
),
 // FUN1Queens2.nqueens
appBuilder( // 1
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)),
ptrBuilder(2),
ptrBuilder(5),
ptrBuilder(49),
comBuilder(2,0,List(0)),
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
 // FUN3Queens2.solve
appBuilder( // 5
comBuilder(6,42,List(0, 5, 1, 2, 3, 4)),
ptrBuilder(7),
ptrBuilder(39),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 6
comBuilder(5,21,List(0, 1, 4, 2, 3)),
ptrBuilder(8),
ptrBuilder(13),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)),
comBuilder(5,13,List(0, 1, 2, 4, 3)),
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
 // FUN7Queens2.sol
appBuilder( // 13
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(14),
ptrBuilder(12),
ptrBuilder(5),
ptrBuilder(16),
),
 // FUN8NanoPrelude.map
appBuilder( // 14
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(15),
),
appBuilder( // 15
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(12),
),
 // FUN9Queens2.next
appBuilder( // 16
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(17),
ptrBuilder(34),
),
appBuilder( // 17
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(18),
ptrBuilder(18),
ptrBuilder(22),
ptrBuilder(29),
),
 // FUN10Queens2.merge
appBuilder( // 18
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(21),
),
appBuilder( // 19
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(12),
ptrBuilder(10),
),
appBuilder( // 20
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(19),
ptrBuilder(18),
),
appBuilder( // 21
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(12),
ptrBuilder(20),
),
 // FUN11Queens2.down
appBuilder( // 22
ptrBuilder(14),
ptrBuilder(24),
),
appBuilder( // 23
ptrBuilder(28),
intBuilder(2),
),
appBuilder( // 24
ptrBuilder(25),
ptrBuilder(23),
),
 // FUN12Queens2.one
appBuilder( // 25
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(6,24,List(0, 3, 5, 4, 1, 2)),
comBuilder(6,44,List(0, 1, 5, 2, 4, 3)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
appBuilder( // 27
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(26),
),
 // FUN13Queens2.eq
appBuilder( // 28
comBuilder(2,1,List(1, 0)),
prmBuilder("=="),
),
 // FUN14Queens2.left
appBuilder( // 29
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(32),
ptrBuilder(33),
),
appBuilder( // 30
ptrBuilder(28),
intBuilder(0),
),
appBuilder( // 31
ptrBuilder(25),
ptrBuilder(30),
),
appBuilder( // 32
ptrBuilder(14),
ptrBuilder(31),
),
 // FUN15NanoPrelude.tail
appBuilder( // 33
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN16Queens2.right
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(38),
ptrBuilder(37),
),
appBuilder( // 35
ptrBuilder(28),
intBuilder(1),
),
appBuilder( // 36
ptrBuilder(25),
ptrBuilder(35),
),
appBuilder( // 37
ptrBuilder(14),
ptrBuilder(36),
),
appBuilder( // 38
ptrBuilder(12),
comBuilder(2,0,List(0)),
),
 // FUN17Queens2.fill
appBuilder( // 39
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(42),
ptrBuilder(39),
),
appBuilder( // 40
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(14),
ptrBuilder(12),
),
appBuilder( // 41
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(10),
ptrBuilder(43),
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(41),
),
 // FUN18Queens2.lrd
appBuilder( // 43
comBuilder(6,33,List(4, 0, 1, 5, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(48),
comBuilder(2,0,List(0)),
ptrBuilder(44),
),
appBuilder( // 44
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 45
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
comBuilder(2,0,List(0)),
),
appBuilder( // 46
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(45),
),
appBuilder( // 47
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(46),
),
appBuilder( // 48
ptrBuilder(12),
ptrBuilder(47),
),
 // FUN19NanoPrelude.replicate
appBuilder( // 49
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(51),
comBuilder(2,0,List(0)),
),
appBuilder( // 50
comBuilder(5,12,List(0, 4, 1, 2, 3)),
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)),
prmBuilder("<="),
intBuilder(0),
ptrBuilder(12),
),
appBuilder( // 51
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(50),
ptrBuilder(49),
prmBuilder("-"),
intBuilder(1),
),
)
}