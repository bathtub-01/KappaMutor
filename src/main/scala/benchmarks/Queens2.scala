package benchmarks
import common.Helper._
 
// Functions in this file: 19
// Apps in this file: 56
// Combinators in this file: 73
object Queens2 extends Benchmark {
override def toString() = "Queens2" 
val combinatorCount = 73
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
ptrBuilder(52),
comBuilder(2,0,List(0)),
),
 // FUN2NanoPrelude.length
appBuilder( // 2
yBuilder(),
ptrBuilder(4),
intBuilder(0),
),
appBuilder( // 3
comBuilder(5,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 4
comBuilder(4,16,List(3, 2, 0, 1, 2)),
ptrBuilder(3),
),
 // FUN3Queens2.solve
appBuilder( // 5
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(9),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 7
comBuilder(5,21,List(0, 1, 4, 2, 3)),
ptrBuilder(10),
ptrBuilder(16),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 8
comBuilder(6,43,List(2, 0, 1, 3, 4, 5)),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 9
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(8),
ptrBuilder(7),
ptrBuilder(42),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 10
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(11),
),
 // FUN5Data.List_Type.++
appBuilder( // 13
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(15),
),
appBuilder( // 14
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 15
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(14),
),
 // FUN6Queens2.sol
appBuilder( // 16
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(18),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(5),
ptrBuilder(21),
),
 // FUN7NanoPrelude.map
appBuilder( // 18
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(20),
),
appBuilder( // 19
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 20
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(19),
),
 // FUN8Queens2.next
appBuilder( // 21
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(22),
ptrBuilder(38),
),
appBuilder( // 22
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(23),
ptrBuilder(23),
ptrBuilder(28),
ptrBuilder(36),
),
 // FUN9Queens2.merge
appBuilder( // 23
comBuilder(4,6,List(2, 0, 1, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(27),
),
appBuilder( // 24
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(13),
),
appBuilder( // 25
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(24),
ptrBuilder(23),
),
appBuilder( // 26
comBuilder(5,40,List(1, 0, 2, 4, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 27
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(26),
ptrBuilder(25),
),
 // FUN10Queens2.down
appBuilder( // 28
ptrBuilder(18),
ptrBuilder(30),
),
appBuilder( // 29
ptrBuilder(35),
intBuilder(2),
),
appBuilder( // 30
ptrBuilder(31),
ptrBuilder(29),
),
 // FUN11Queens2.one
appBuilder( // 31
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(34),
),
appBuilder( // 32
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 33
comBuilder(5,39,List(1, 3, 2, 4, 0, 3)),
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(33),
),
 // FUN12Queens2.eq
appBuilder( // 35
comBuilder(2,1,List(1, 0)),
prmBuilder("=="),
),
 // FUN13Queens2.left
appBuilder( // 36
comBuilder(6,41,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(18),
ptrBuilder(31),
ptrBuilder(35),
intBuilder(0),
ptrBuilder(37),
),
 // FUN14NanoPrelude.tail
appBuilder( // 37
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(1)),
),
 // FUN15Queens2.right
appBuilder( // 38
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(41),
),
appBuilder( // 39
ptrBuilder(35),
intBuilder(1),
),
appBuilder( // 40
ptrBuilder(31),
ptrBuilder(39),
),
appBuilder( // 41
ptrBuilder(18),
ptrBuilder(40),
),
 // FUN16Queens2.fill
appBuilder( // 42
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(45),
),
appBuilder( // 43
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(18),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(42),
),
appBuilder( // 44
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(13),
ptrBuilder(46),
),
appBuilder( // 45
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(44),
ptrBuilder(43),
),
 // FUN17Queens2.lrd
appBuilder( // 46
comBuilder(4,5,List(2, 0, 3, 1)),
ptrBuilder(51),
ptrBuilder(47),
),
appBuilder( // 47
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 48
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
comBuilder(2,0,List(0)),
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(48),
),
appBuilder( // 50
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(49),
),
appBuilder( // 51
comBuilder(6,12,List(5, 0, 1, 3, 2)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(50),
comBuilder(2,0,List(0)),
),
 // FUN18NanoPrelude.replicate
appBuilder( // 52
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(55),
ptrBuilder(54),
comBuilder(2,0,List(0)),
),
appBuilder( // 53
comBuilder(4,7,List(0, 3, 1, 2)),
ptrBuilder(52),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 54
comBuilder(4,16,List(0, 3, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(53),
),
appBuilder( // 55
comBuilder(6,28,List(2, 0, 1, 3, 5, 4)),
prmBuilder("<="),
intBuilder(0),
),
)
}