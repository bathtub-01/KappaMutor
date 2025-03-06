package benchmarks
import common.Helper._
 
// Functions in this file: 23
// Apps in this file: 105
// Combinators in this file: 155
object Adjoxo extends Benchmark {
override def toString() = "Adjoxo" 
val combinatorCount = 155
val prog = Seq(
 // FUN0Adjoxo.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
ptrBuilder(2),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(3),
),
 // FUN1Adjoxo.adjudicate
appBuilder( // 5
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(15),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
ptrBuilder(69),
ptrBuilder(73),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 7
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(69),
ptrBuilder(73),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 8
ptrBuilder(69),
comBuilder(3,0,List(2)), // X
comBuilder(2,0,List(1)), // X
),
appBuilder( // 9
ptrBuilder(69),
comBuilder(3,0,List(2)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 10
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
ptrBuilder(69),
ptrBuilder(73),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 11
comBuilder(5,30,List(0, 3, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(22),
ptrBuilder(10),
ptrBuilder(9),
),
appBuilder( // 12
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(22),
ptrBuilder(11),
ptrBuilder(8),
),
appBuilder( // 13
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
ptrBuilder(16),
ptrBuilder(19),
),
appBuilder( // 14
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 15
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(14),
ptrBuilder(7),
),
 // FUN2Adjoxo.cmp
appBuilder( // 16
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(18),
ptrBuilder(17),
comBuilder(3,0,List(0)), // X
),
appBuilder( // 17
comBuilder(5,9,List(3, 0, 4, 1, 2)), // XXXXX
prmBuilder("<="),
comBuilder(3,0,List(2)), // X
comBuilder(3,0,List(1)), // X
),
appBuilder( // 18
comBuilder(5,28,List(3, 0, 4, 1, 4, 2)), // XXX(XX)X
prmBuilder("=="),
),
 // FUN3NanoPrelude.length
appBuilder( // 19
yBuilder(),
ptrBuilder(21),
intBuilder(0),
),
appBuilder( // 20
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 21
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(20),
),
 // FUN4Adjoxo.hasLine
appBuilder( // 22
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(53),
ptrBuilder(50),
),
appBuilder( // 23
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 24
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(23),
),
appBuilder( // 25
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(24),
),
appBuilder( // 26
ptrBuilder(55),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 28
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(27),
),
appBuilder( // 29
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(28),
),
appBuilder( // 30
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(29),
ptrBuilder(26),
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(33),
ptrBuilder(30),
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(8),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(35),
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(37),
ptrBuilder(34),
),
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 40
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(41),
ptrBuilder(38),
),
appBuilder( // 43
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 44
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(8),
ptrBuilder(43),
),
appBuilder( // 45
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
ptrBuilder(44),
),
appBuilder( // 46
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(45),
ptrBuilder(42),
),
appBuilder( // 47
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 48
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(47),
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(48),
),
appBuilder( // 50
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(54),
ptrBuilder(55),
ptrBuilder(49),
ptrBuilder(46),
),
appBuilder( // 51
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 52
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(52),
),
 // FUN5Data.Bool.||
appBuilder( // 54
comBuilder(3,2,List(1, 2, 0)), // XXX
comBuilder(2,0,List(1)), // X
),
 // FUN6Adjoxo.subset
appBuilder( // 55
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(56),
ptrBuilder(58),
),
 // FUN7NanoPrelude.null
appBuilder( // 56
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(57),
),
appBuilder( // 57
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN8Adjoxo.diff
appBuilder( // 58
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(68),
),
appBuilder( // 59
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(58),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 60
comBuilder(5,16,List(0, 2, 1, 3, 4)), // XX(XXX)
ptrBuilder(58),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 61
comBuilder(6,42,List(0, 2, 4, 1, 3, 5)), // XXX(XXX)
ptrBuilder(16),
ptrBuilder(58),
),
appBuilder( // 62
comBuilder(6,26,List(0, 1, 4, 5, 2, 3)), // X(XXX)XX
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
),
appBuilder( // 63
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(62),
ptrBuilder(61),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 64
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(63),
ptrBuilder(60),
),
appBuilder( // 65
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)), // X(XX)X(XX)
comBuilder(5,37,List(0, 1, 3, 4, 2, 4)), // XXXX(XX)
ptrBuilder(64),
),
appBuilder( // 66
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(65),
ptrBuilder(59),
),
appBuilder( // 67
comBuilder(5,40,List(1, 0, 3, 4, 2, 4)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 68
comBuilder(4,11,List(0, 2, 1, 3, 3)), // XX(XX)X
ptrBuilder(67),
ptrBuilder(66),
),
 // FUN9Adjoxo.report
appBuilder( // 69
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(70),
ptrBuilder(71),
),
appBuilder( // 70
comBuilder(5,17,List(3, 0, 1, 2, 4)), // XX(X(XX))
intBuilder(3),
ptrBuilder(71),
ptrBuilder(72),
),
 // FUN10Adjoxo.side
appBuilder( // 71
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(88),
),
 // FUN11Adjoxo.opp
appBuilder( // 72
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN12Adjoxo.analysis
appBuilder( // 73
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(22),
ptrBuilder(79),
comBuilder(3,0,List(1)), // X
),
appBuilder( // 74
comBuilder(6,54,List(0, 1, 2, 3, 4, 5)), // X(X(XXX)X)
ptrBuilder(58),
ptrBuilder(58),
ptrBuilder(98),
intBuilder(1),
intBuilder(9),
),
appBuilder( // 75
comBuilder(5,40,List(0, 1, 3, 4, 2, 4)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(89),
),
appBuilder( // 76
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(75),
ptrBuilder(74),
),
appBuilder( // 77
comBuilder(5,16,List(0, 1, 2, 3, 4)), // XX(XXX)
ptrBuilder(82),
ptrBuilder(84),
ptrBuilder(76),
),
appBuilder( // 78
comBuilder(5,28,List(0, 3, 4, 1, 4, 2)), // XXX(XX)X
ptrBuilder(80),
),
appBuilder( // 79
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(78),
ptrBuilder(77),
comBuilder(3,0,List(0)), // X
),
 // FUN13Adjoxo.gridFull
appBuilder( // 80
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(81),
intBuilder(9),
),
appBuilder( // 81
comBuilder(5,28,List(0, 3, 1, 0, 4, 2)), // XXX(XX)X
ptrBuilder(19),
prmBuilder("+"),
prmBuilder("=="),
),
 // FUN14NanoPrelude.foldr1
appBuilder( // 82
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(83),
),
appBuilder( // 83
comBuilder(6,47,List(5, 0, 1, 2, 3, 4)), // XX(X(XX)X)
errorBuilder(0),
comBuilder(4,46,List(3, 2, 0, 1, 2, 3)), // XX(XXXX)
comBuilder(6,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN15Adjoxo.bestOf
appBuilder( // 84
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(85),
comBuilder(3,0,List(2)), // X
),
appBuilder( // 85
comBuilder(4,32,List(2, 3, 0, 0, 1, 3)), // X(XXXX)X
comBuilder(3,0,List(0)), // X
comBuilder(3,0,List(2)), // X
),
 // FUN16NanoPrelude.map
appBuilder( // 86
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(88),
),
appBuilder( // 87
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 88
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(87),
),
 // FUN17Adjoxo.moveval
appBuilder( // 89
comBuilder(6,58,List(0, 1, 4, 2, 5, 3)), // X(XX(XXX))
ptrBuilder(90),
ptrBuilder(73),
ptrBuilder(91),
),
 // FUN18Adjoxo.inverse
appBuilder( // 90
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
comBuilder(3,0,List(0)), // X
comBuilder(3,0,List(2)), // X
comBuilder(3,0,List(1)), // X
),
 // FUN19Adjoxo.insert
appBuilder( // 91
comBuilder(4,19,List(0, 1, 2, 3, 3)), // X(X(XX)X)
yBuilder(),
ptrBuilder(97),
ptrBuilder(96),
),
appBuilder( // 92
comBuilder(4,16,List(0, 1, 0, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 93
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 94
comBuilder(5,42,List(1, 0, 3, 2, 3, 4)), // XXX(XXX)
prmBuilder("<="),
),
appBuilder( // 95
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(94),
ptrBuilder(93),
),
appBuilder( // 96
comBuilder(5,40,List(0, 1, 3, 4, 2, 3)), // X(XXX)(XX)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(95),
ptrBuilder(92),
),
appBuilder( // 97
comBuilder(6,40,List(5, 0, 3, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN20NanoPrelude.enumFromTo
appBuilder( // 98
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(100),
ptrBuilder(99),
ptrBuilder(104),
),
appBuilder( // 99
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
 // FUN21NanoPrelude.takeWhile
appBuilder( // 100
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(103),
),
appBuilder( // 101
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 102
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)), // XXX(XXX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 103
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(102),
ptrBuilder(101),
),
 // FUN22NanoPrelude.enumFrom
appBuilder( // 104
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(104),
prmBuilder("+"),
intBuilder(1),
),
)
}