package benchmarks
import common.Helper._
 
// Functions in this file: 22
// Apps in this file: 74
// Combinators in this file: 112
object Taut extends Benchmark {
override def toString() = "Taut" 
val combinatorCount = 112
val prog = Seq(
 // FUN0Taut.main
appBuilder( // 0
ptrBuilder(1),
ptrBuilder(58),
intBuilder(0),
intBuilder(1),
),
 // FUN1Taut.isTaut
appBuilder( // 1
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 2
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(5),
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(8),
ptrBuilder(24),
),
 // FUN2NanoPrelude.and
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(4),
),
appBuilder( // 4
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
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
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
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
comBuilder(4,14,List(1, 2, 0, 1, 3)), // XXX(XX)
comBuilder(2,0,List(1)), // X
),
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(11),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 13
comBuilder(4,14,List(1, 2, 0, 1, 3)), // XXX(XX)
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
comBuilder(5,16,List(0, 1, 2, 3, 4)), // XX(XXX)
comBuilder(1,0,List(0)), // X
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
ptrBuilder(23),
),
appBuilder( // 20
comBuilder(5,14,List(1, 0, 4, 2, 3)), // XXX(XX)
prmBuilder("=="),
),
appBuilder( // 21
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(6,37,List(0, 2, 3, 4, 1, 5)), // XXXX(XX)
ptrBuilder(20),
comBuilder(3,1,List(2, 0)), // XX
),
appBuilder( // 22
comBuilder(5,18,List(3, 0, 1, 2, 4)), // X(XXXX)
ptrBuilder(21),
),
appBuilder( // 23
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(22),
),
 // FUN8Taut.substs
appBuilder( // 24
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(45),
ptrBuilder(53),
),
appBuilder( // 26
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(5),
ptrBuilder(27),
ptrBuilder(31),
ptrBuilder(42),
),
 // FUN9NanoPrelude.zip
appBuilder( // 27
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(30),
),
appBuilder( // 28
comBuilder(6,44,List(0, 1, 4, 2, 3, 5)), // X(XX)(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 29
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(28),
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(27),
),
appBuilder( // 30
comBuilder(5,16,List(2, 0, 1, 3, 4)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(29),
),
 // FUN10Taut.bools
appBuilder( // 31
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(37),
ptrBuilder(32),
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 33
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 34
comBuilder(5,15,List(0, 1, 2, 3, 4)), // X(XX)(XX)
ptrBuilder(5),
ptrBuilder(41),
comBuilder(2,0,List(1)), // X
ptrBuilder(31),
),
appBuilder( // 35
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)), // X(X(XX)(XX))
ptrBuilder(38),
ptrBuilder(5),
ptrBuilder(41),
comBuilder(2,0,List(0)), // X
ptrBuilder(31),
),
appBuilder( // 36
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
comBuilder(5,43,List(4, 0, 1, 2, 3, 4)), // XXX(X(XX))
prmBuilder("=="),
intBuilder(0),
ptrBuilder(36),
ptrBuilder(33),
),
 // FUN11Data.List_Type.++
appBuilder( // 38
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(40),
),
appBuilder( // 39
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 40
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(39),
),
 // FUN12Data.List_Type.:
appBuilder( // 41
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN13NanoPrelude.length
appBuilder( // 42
yBuilder(),
ptrBuilder(44),
intBuilder(0),
),
appBuilder( // 43
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 44
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(43),
),
 // FUN14Taut.rmdups
appBuilder( // 45
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(47),
),
appBuilder( // 46
comBuilder(5,19,List(0, 1, 2, 3, 4)), // X(X(XX)X)
ptrBuilder(45),
ptrBuilder(48),
ptrBuilder(52),
),
appBuilder( // 47
comBuilder(4,16,List(0, 2, 1, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(46),
),
 // FUN15NanoPrelude.filter
appBuilder( // 48
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(51),
),
appBuilder( // 49
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 50
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,30,List(0, 2, 1, 2, 3, 3)), // XX(XXX)X
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(49),
),
appBuilder( // 51
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(50),
),
 // FUN16Taut.neq
appBuilder( // 52
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("/="),
),
 // FUN17Taut.vars
appBuilder( // 53
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)), // XXXXXX
ptrBuilder(57),
ptrBuilder(56),
ptrBuilder(55),
ptrBuilder(53),
ptrBuilder(54),
),
appBuilder( // 54
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 55
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
ptrBuilder(38),
ptrBuilder(53),
),
appBuilder( // 56
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 57
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
ptrBuilder(38),
ptrBuilder(53),
),
 // FUN18Taut.testProp
appBuilder( // 58
comBuilder(7,2,List(4, 0, 1)), // XXX
ptrBuilder(64),
ptrBuilder(62),
),
appBuilder( // 59
ptrBuilder(5),
comBuilder(6,1,List(5, 0)), // XX
ptrBuilder(68),
),
appBuilder( // 60
ptrBuilder(65),
comBuilder(7,2,List(2, 0, 1)), // XXX
ptrBuilder(59),
),
appBuilder( // 61
comBuilder(6,1,List(5, 0)), // XX
intBuilder(42),
),
appBuilder( // 62
comBuilder(7,2,List(4, 0, 1)), // XXX
ptrBuilder(61),
ptrBuilder(60),
),
appBuilder( // 63
ptrBuilder(5),
ptrBuilder(67),
ptrBuilder(68),
),
appBuilder( // 64
ptrBuilder(65),
comBuilder(7,2,List(2, 0, 1)), // XXX
ptrBuilder(63),
),
 // FUN19NanoPrelude.foldr1
appBuilder( // 65
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(66),
),
appBuilder( // 66
comBuilder(6,47,List(5, 0, 1, 2, 3, 4)), // XX(X(XX)X)
errorBuilder(0),
comBuilder(4,46,List(3, 2, 0, 1, 2, 3)), // XX(XXXX)
comBuilder(6,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN20Taut.imp
appBuilder( // 67
comBuilder(5,15,List(0, 1, 2, 3, 4)), // X(XX)(XX)
comBuilder(7,2,List(4, 0, 1)), // XXX
comBuilder(6,1,List(5, 0)), // XX
intBuilder(42),
comBuilder(6,1,List(5, 0)), // XX
),
 // FUN21Taut.names
appBuilder( // 68
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(73),
),
appBuilder( // 69
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 70
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(69),
),
appBuilder( // 71
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(70),
),
appBuilder( // 72
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(71),
),
appBuilder( // 73
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(72),
),
)
}