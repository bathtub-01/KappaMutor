package benchmarks
import common.Helper._
 
// Functions in this file: 23
// Apps in this file: 73
// Combinators in this file: 108
object Taut extends Benchmark {
override def toString() = "Taut" 
val combinatorCount = 108
val prog = Seq(
 // FUN0Taut.main
appBuilder( // 0
ptrBuilder(1),
ptrBuilder(56),
intBuilder(0),
intBuilder(1),
),
 // FUN1Taut.isTaut
appBuilder( // 1
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 2
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(5),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(8),
ptrBuilder(22),
),
 // FUN2NanoPrelude.and
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(4),
),
appBuilder( // 4
comBuilder(4,6,List(2, 0, 1, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(3),
),
 // FUN3NanoPrelude.map
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 7
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(6),
),
 // FUN4Taut.eval
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 9
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(15),
),
appBuilder( // 10
comBuilder(4,4,List(2, 3, 0, 1)),
comBuilder(2,0,List(1)),
comBuilder(2,0,List(0)),
),
appBuilder( // 11
comBuilder(4,14,List(1, 2, 0, 1, 3)),
comBuilder(2,0,List(1)),
),
appBuilder( // 12
comBuilder(4,14,List(1, 2, 0, 1, 3)),
comBuilder(2,0,List(0)),
),
appBuilder( // 13
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(12),
comBuilder(1,0,List(0)),
ptrBuilder(11),
),
appBuilder( // 14
comBuilder(5,39,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(13),
ptrBuilder(10),
ptrBuilder(9),
),
 // FUN5Taut.find
appBuilder( // 15
comBuilder(5,16,List(0, 1, 2, 3, 4)),
comBuilder(1,0,List(0)),
ptrBuilder(16),
ptrBuilder(17),
),
 // FUN6NanoPrelude.fromJust
appBuilder( // 16
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(4),
comBuilder(1,0,List(0)),
),
 // FUN7NanoPrelude.lookup
appBuilder( // 17
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(21),
),
appBuilder( // 18
comBuilder(5,14,List(1, 0, 4, 2, 3)),
prmBuilder("=="),
),
appBuilder( // 19
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(6,37,List(0, 2, 3, 4, 1, 5)),
ptrBuilder(18),
comBuilder(3,1,List(2, 0)),
),
appBuilder( // 20
comBuilder(5,18,List(3, 0, 1, 2, 4)),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(20),
),
 // FUN8Taut.substs
appBuilder( // 22
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(24),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(43),
ptrBuilder(51),
),
appBuilder( // 24
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(5),
ptrBuilder(25),
ptrBuilder(29),
ptrBuilder(40),
),
 // FUN9NanoPrelude.zip
appBuilder( // 25
comBuilder(4,6,List(2, 0, 1, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(28),
),
appBuilder( // 26
comBuilder(6,44,List(0, 1, 4, 2, 3, 5)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 27
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(26),
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(25),
),
appBuilder( // 28
comBuilder(5,16,List(2, 0, 1, 3, 4)),
comBuilder(2,0,List(0)),
ptrBuilder(27),
),
 // FUN10Taut.bools
appBuilder( // 29
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(35),
ptrBuilder(30),
),
appBuilder( // 30
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 31
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 32
comBuilder(5,15,List(0, 1, 2, 3, 4)),
ptrBuilder(5),
ptrBuilder(39),
comBuilder(2,0,List(1)),
ptrBuilder(29),
),
appBuilder( // 33
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(36),
ptrBuilder(5),
ptrBuilder(39),
comBuilder(2,0,List(0)),
ptrBuilder(29),
),
appBuilder( // 34
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(33),
ptrBuilder(32),
),
appBuilder( // 35
comBuilder(5,43,List(4, 0, 1, 2, 3, 4)),
prmBuilder("=="),
intBuilder(0),
ptrBuilder(34),
ptrBuilder(31),
),
 // FUN11Data.List_Type.++
appBuilder( // 36
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(38),
),
appBuilder( // 37
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 38
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(37),
),
 // FUN12Data.List_Type.:
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)),
),
 // FUN13NanoPrelude.length
appBuilder( // 40
yBuilder(),
ptrBuilder(42),
intBuilder(0),
),
appBuilder( // 41
comBuilder(5,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 42
comBuilder(4,16,List(3, 2, 0, 1, 2)),
ptrBuilder(41),
),
 // FUN14Taut.rmdups
appBuilder( // 43
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(45),
),
appBuilder( // 44
comBuilder(5,19,List(0, 1, 2, 3, 4)),
ptrBuilder(43),
ptrBuilder(46),
ptrBuilder(50),
),
appBuilder( // 45
comBuilder(4,16,List(0, 2, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(44),
),
 // FUN15NanoPrelude.filter
appBuilder( // 46
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(49),
),
appBuilder( // 47
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 48
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
comBuilder(5,39,List(0, 2, 1, 4, 3, 4)),
ptrBuilder(47),
),
appBuilder( // 49
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(48),
),
 // FUN16Taut.neq
appBuilder( // 50
comBuilder(2,1,List(1, 0)),
prmBuilder("/="),
),
 // FUN17Taut.vars
appBuilder( // 51
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(55),
ptrBuilder(54),
ptrBuilder(53),
ptrBuilder(51),
ptrBuilder(52),
),
appBuilder( // 52
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 53
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(36),
ptrBuilder(51),
ptrBuilder(51),
),
appBuilder( // 54
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 55
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(36),
ptrBuilder(51),
ptrBuilder(51),
),
 // FUN18Taut.testProp
appBuilder( // 56
comBuilder(7,2,List(4, 0, 1)),
ptrBuilder(62),
ptrBuilder(60),
),
appBuilder( // 57
ptrBuilder(5),
comBuilder(6,1,List(5, 0)),
ptrBuilder(67),
),
appBuilder( // 58
ptrBuilder(63),
ptrBuilder(65),
ptrBuilder(57),
),
appBuilder( // 59
comBuilder(6,1,List(5, 0)),
intBuilder(42),
),
appBuilder( // 60
comBuilder(7,2,List(4, 0, 1)),
ptrBuilder(59),
ptrBuilder(58),
),
appBuilder( // 61
ptrBuilder(5),
ptrBuilder(66),
ptrBuilder(67),
),
appBuilder( // 62
ptrBuilder(63),
ptrBuilder(65),
ptrBuilder(61),
),
 // FUN19NanoPrelude.foldr1
appBuilder( // 63
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(64),
),
appBuilder( // 64
comBuilder(6,47,List(5, 0, 1, 2, 3, 4)),
errorBuilder(0),
comBuilder(4,46,List(3, 2, 0, 1, 2, 3)),
comBuilder(6,6,List(0, 2, 1, 3)),
),
 // FUN20Taut.And
appBuilder( // 65
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(7,2,List(0, 1, 2)),
),
 // FUN21Taut.imp
appBuilder( // 66
comBuilder(5,15,List(0, 1, 2, 3, 4)),
comBuilder(7,2,List(4, 0, 1)),
comBuilder(6,1,List(5, 0)),
intBuilder(42),
comBuilder(6,1,List(5, 0)),
),
 // FUN22Taut.names
appBuilder( // 67
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(72),
),
appBuilder( // 68
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
comBuilder(2,0,List(0)),
),
appBuilder( // 69
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(68),
),
appBuilder( // 70
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(69),
),
appBuilder( // 71
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(70),
),
appBuilder( // 72
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(71),
),
)
}