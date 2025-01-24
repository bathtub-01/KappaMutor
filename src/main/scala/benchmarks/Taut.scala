package benchmarks
import common.Helper._
 
// Functions in this file: 27
// Apps in this file: 72
// Combinators in this file: 139
object Taut extends Benchmark {
override def toString() = "Taut" 
val combinatorCount = 139
val prog = Seq(
 // FUN0Taut.main
appBuilder( // 0
ptrBuilder(1),
ptrBuilder(49),
intBuilder(0),
intBuilder(1),
),
 // FUN1Taut.isTaut
appBuilder( // 1
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(3),
ptrBuilder(5),
ptrBuilder(2),
ptrBuilder(20),
),
appBuilder( // 2
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(8),
),
 // FUN2NanoPrelude.and
appBuilder( // 3
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(4),
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(3),
),
 // FUN3Data.Bool_Type.True
appBuilder( // 4
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN4NanoPrelude.map
appBuilder( // 5
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(7),
),
 // FUN5Data.List_Type.:
appBuilder( // 7
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN6Taut.eval
appBuilder( // 8
comBuilder(4,7,List(0, 1, 2, 3)),
yBuilder(),
ptrBuilder(13),
ptrBuilder(14),
),
appBuilder( // 9
comBuilder(6,32,List(5, 0, 1, 4, 2, 3)),
comBuilder(4,12,List(0, 1, 3, 2, 1)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
appBuilder( // 10
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(6,46,List(0, 5, 1, 2, 4, 3)),
ptrBuilder(9),
comBuilder(4,12,List(0, 1, 3, 2, 1)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(4),
),
appBuilder( // 11
comBuilder(5,26,List(0, 1, 4, 4, 2, 3)),
comBuilder(6,46,List(0, 5, 1, 4, 2, 3)),
ptrBuilder(10),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(4),
),
appBuilder( // 12
comBuilder(5,32,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,16,List(0, 4, 1, 2, 3)),
ptrBuilder(11),
comBuilder(2,0,List(0)),
comBuilder(3,2,List(0, 2, 1)),
),
appBuilder( // 13
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(12),
),
 // FUN7Taut.find
appBuilder( // 14
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(15),
ptrBuilder(16),
),
 // FUN8NanoPrelude.fromJust
appBuilder( // 15
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(4),
comBuilder(1,0,List(0)),
),
 // FUN9NanoPrelude.lookup
appBuilder( // 16
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(18),
),
appBuilder( // 17
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,28,List(0, 1, 2, 4, 5, 3)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
prmBuilder("=="),
ptrBuilder(19),
),
appBuilder( // 18
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(3,3,List(1, 0, 2)),
ptrBuilder(17),
),
 // FUN10NanoPrelude.Just
appBuilder( // 19
comBuilder(3,1,List(0, 1)),
comBuilder(2,1,List(1, 0)),
),
 // FUN11Taut.substs
appBuilder( // 20
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(21),
ptrBuilder(39),
ptrBuilder(45),
),
appBuilder( // 21
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(5),
ptrBuilder(22),
ptrBuilder(25),
ptrBuilder(36),
),
 // FUN12NanoPrelude.zip
appBuilder( // 22
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(24),
),
appBuilder( // 23
comBuilder(6,35,List(0, 1, 2, 3, 5, 4)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(7),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 24
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(23),
ptrBuilder(22),
),
 // FUN13Taut.bools
appBuilder( // 25
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(0),
ptrBuilder(33),
ptrBuilder(26),
),
appBuilder( // 26
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 27
ptrBuilder(7),
ptrBuilder(4),
),
appBuilder( // 28
ptrBuilder(5),
ptrBuilder(27),
),
appBuilder( // 29
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(28),
ptrBuilder(25),
),
appBuilder( // 30
ptrBuilder(7),
comBuilder(2,0,List(0)),
),
appBuilder( // 31
ptrBuilder(5),
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(34),
ptrBuilder(31),
ptrBuilder(25),
ptrBuilder(29),
),
appBuilder( // 33
comBuilder(4,7,List(0, 3, 1, 2)),
ptrBuilder(32),
prmBuilder("-"),
intBuilder(1),
),
 // FUN14Data.List_Type.++
appBuilder( // 34
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(35),
),
appBuilder( // 35
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(7),
),
 // FUN15NanoPrelude.length
appBuilder( // 36
yBuilder(),
ptrBuilder(38),
intBuilder(0),
),
appBuilder( // 37
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)),
comBuilder(4,6,List(3, 2, 0, 1)),
comBuilder(2,0,List(0)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 38
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(37),
),
 // FUN16Taut.rmdups
appBuilder( // 39
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(41),
),
appBuilder( // 40
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(42),
ptrBuilder(44),
),
appBuilder( // 41
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(7),
ptrBuilder(39),
ptrBuilder(40),
),
 // FUN17NanoPrelude.filter
appBuilder( // 42
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(43),
),
appBuilder( // 43
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)),
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)),
ptrBuilder(7),
),
 // FUN18Taut.neq
appBuilder( // 44
comBuilder(2,1,List(1, 0)),
prmBuilder("/="),
),
 // FUN19Taut.vars
appBuilder( // 45
comBuilder(6,42,List(0, 5, 1, 2, 3, 4)),
ptrBuilder(48),
ptrBuilder(45),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
appBuilder( // 46
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 47
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)),
comBuilder(4,13,List(0, 1, 2, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(34),
ptrBuilder(45),
ptrBuilder(46),
),
appBuilder( // 48
comBuilder(6,46,List(0, 5, 1, 2, 3, 4)),
ptrBuilder(47),
comBuilder(4,13,List(0, 1, 2, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(34),
ptrBuilder(45),
),
 // FUN20Taut.testProp
appBuilder( // 49
ptrBuilder(56),
ptrBuilder(55),
ptrBuilder(53),
),
appBuilder( // 50
ptrBuilder(5),
ptrBuilder(65),
ptrBuilder(66),
),
appBuilder( // 51
ptrBuilder(57),
ptrBuilder(60),
ptrBuilder(50),
),
appBuilder( // 52
ptrBuilder(65),
intBuilder(42),
),
appBuilder( // 53
ptrBuilder(56),
ptrBuilder(52),
ptrBuilder(51),
),
appBuilder( // 54
ptrBuilder(5),
ptrBuilder(62),
ptrBuilder(66),
),
appBuilder( // 55
ptrBuilder(57),
ptrBuilder(60),
ptrBuilder(54),
),
 // FUN21Taut.Implies
appBuilder( // 56
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,9,List(0, 1, 2, 3, 4)),
comBuilder(5,16,List(0, 1, 4, 2, 3)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN22NanoPrelude.foldr1
appBuilder( // 57
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(59),
),
appBuilder( // 58
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,16,List(4, 0, 1, 2, 3)),
errorBuilder(0),
comBuilder(3,5,List(0, 1, 2, 2)),
comBuilder(3,6,List(2, 1, 0, 2)),
),
appBuilder( // 59
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(58),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,17,List(0, 1, 2, 3, 4)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN23Taut.And
appBuilder( // 60
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(61),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 61
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN24Taut.imp
appBuilder( // 62
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(64),
ptrBuilder(65),
),
appBuilder( // 63
ptrBuilder(65),
intBuilder(42),
),
appBuilder( // 64
ptrBuilder(56),
ptrBuilder(63),
),
 // FUN25Taut.Var
appBuilder( // 65
comBuilder(6,9,List(0, 1, 2, 3, 4)),
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,1,List(1, 0)),
),
 // FUN26Taut.names
appBuilder( // 66
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(71),
),
appBuilder( // 67
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
comBuilder(2,0,List(0)),
),
appBuilder( // 68
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(67),
),
appBuilder( // 69
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(68),
),
appBuilder( // 70
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(69),
),
appBuilder( // 71
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(70),
),
)
}