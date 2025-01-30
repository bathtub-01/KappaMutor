package benchmarks
import common.Helper._
 
// Functions in this file: 24
// Apps in this file: 79
// Combinators in this file: 133
object Taut extends Benchmark {
override def toString() = "Taut" 
val combinatorCount = 133
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
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
ptrBuilder(3),
ptrBuilder(5),
ptrBuilder(2),
ptrBuilder(22),
),
appBuilder( // 2
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(8),
),
 // FUN2NanoPrelude.and
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(4),
),
appBuilder( // 4
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(3),
),
 // FUN3NanoPrelude.map
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 7
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(6),
),
 // FUN4Taut.eval
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 9
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(17),
),
appBuilder( // 10
comBuilder(4,4,List(2, 3, 0, 1)), // XXXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 11
comBuilder(4,12,List(0, 2, 3, 1, 2)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(1)), // X
),
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(11),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 13
comBuilder(4,12,List(0, 2, 3, 1, 2)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 14
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(13),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 15
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)), // XXXXXX
ptrBuilder(14),
comBuilder(1,0,List(0)), // X
ptrBuilder(12),
),
appBuilder( // 16
comBuilder(5,39,List(0, 4, 1, 4, 2, 3)), // XX(XX)(XX)
ptrBuilder(15),
ptrBuilder(10),
ptrBuilder(9),
),
 // FUN5Taut.find
appBuilder( // 17
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(18),
ptrBuilder(19),
),
 // FUN6NanoPrelude.fromJust
appBuilder( // 18
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(4),
comBuilder(1,0,List(0)), // X
),
 // FUN7NanoPrelude.lookup
appBuilder( // 19
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(21),
),
appBuilder( // 20
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)), // XXX(XX)X
comBuilder(6,28,List(0, 1, 2, 4, 5, 3)), // XXX(XX)X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
comBuilder(3,1,List(2, 0)), // XX
),
appBuilder( // 21
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(0)), // X
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(20),
),
 // FUN8Taut.substs
appBuilder( // 22
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(24),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(44),
ptrBuilder(51),
),
appBuilder( // 24
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(5),
ptrBuilder(25),
ptrBuilder(28),
ptrBuilder(41),
),
 // FUN9NanoPrelude.zip
appBuilder( // 25
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(6,30,List(0, 1, 2, 3, 5, 4)), // XX(XXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 27
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(26),
ptrBuilder(25),
),
 // FUN10Taut.bools
appBuilder( // 28
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(0),
ptrBuilder(36),
ptrBuilder(29),
),
appBuilder( // 29
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 30
ptrBuilder(40),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 31
ptrBuilder(5),
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(31),
ptrBuilder(28),
),
appBuilder( // 33
ptrBuilder(40),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 34
ptrBuilder(5),
ptrBuilder(33),
),
appBuilder( // 35
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(37),
ptrBuilder(34),
ptrBuilder(28),
ptrBuilder(32),
),
appBuilder( // 36
comBuilder(4,7,List(0, 3, 1, 2)), // X(XXX)
ptrBuilder(35),
prmBuilder("-"),
intBuilder(1),
),
 // FUN11Data.List_Type.++
appBuilder( // 37
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(39),
),
appBuilder( // 38
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 39
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(38),
),
 // FUN12Data.List_Type.:
appBuilder( // 40
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN13NanoPrelude.length
appBuilder( // 41
yBuilder(),
ptrBuilder(43),
intBuilder(0),
),
appBuilder( // 42
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 43
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(42),
),
 // FUN14Taut.rmdups
appBuilder( // 44
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(46),
),
appBuilder( // 45
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(47),
ptrBuilder(50),
),
appBuilder( // 46
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(44),
ptrBuilder(45),
),
 // FUN15NanoPrelude.filter
appBuilder( // 47
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(49),
),
appBuilder( // 48
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)), // X(XX)X(XX)
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 49
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(48),
),
 // FUN16Taut.neq
appBuilder( // 50
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("/="),
),
 // FUN17Taut.vars
appBuilder( // 51
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)), // XXXXXX
ptrBuilder(55),
ptrBuilder(54),
ptrBuilder(53),
ptrBuilder(51),
ptrBuilder(52),
),
appBuilder( // 52
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 53
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(37),
ptrBuilder(51),
),
appBuilder( // 54
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 55
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(37),
ptrBuilder(51),
),
 // FUN18Taut.testProp
appBuilder( // 56
ptrBuilder(63),
ptrBuilder(62),
ptrBuilder(60),
),
appBuilder( // 57
ptrBuilder(5),
comBuilder(6,1,List(5, 0)), // XX
ptrBuilder(73),
),
appBuilder( // 58
ptrBuilder(64),
ptrBuilder(68),
ptrBuilder(57),
),
appBuilder( // 59
comBuilder(6,1,List(5, 0)), // XX
intBuilder(42),
),
appBuilder( // 60
ptrBuilder(63),
ptrBuilder(59),
ptrBuilder(58),
),
appBuilder( // 61
ptrBuilder(5),
ptrBuilder(70),
ptrBuilder(73),
),
appBuilder( // 62
ptrBuilder(64),
ptrBuilder(68),
ptrBuilder(61),
),
 // FUN19Taut.Implies
appBuilder( // 63
comBuilder(7,16,List(0, 1, 6, 2, 3)), // XX(XXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN20NanoPrelude.foldr1
appBuilder( // 64
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(67),
),
appBuilder( // 65
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 66
comBuilder(5,32,List(0, 1, 2, 3, 4, 4)), // X(XXXX)X
comBuilder(3,6,List(2, 1, 0, 2)), // XX(XX)
ptrBuilder(65),
),
appBuilder( // 67
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
errorBuilder(0),
ptrBuilder(66),
),
 // FUN21Taut.And
appBuilder( // 68
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(69),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 69
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,4,List(0, 1, 2, 3)), // XXXX
comBuilder(4,2,List(0, 1, 2)), // XXX
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN22Taut.imp
appBuilder( // 70
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(72),
comBuilder(6,1,List(5, 0)), // XX
),
appBuilder( // 71
comBuilder(6,1,List(5, 0)), // XX
intBuilder(42),
),
appBuilder( // 72
ptrBuilder(63),
ptrBuilder(71),
),
 // FUN23Taut.names
appBuilder( // 73
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(78),
),
appBuilder( // 74
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 75
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(74),
),
appBuilder( // 76
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(75),
),
appBuilder( // 77
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(76),
),
appBuilder( // 78
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(77),
),
)
}