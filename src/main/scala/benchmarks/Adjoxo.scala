package benchmarks
import common.Helper._
 
// Functions in this file: 23
// Apps in this file: 103
// Combinators in this file: 181
object Adjoxo extends Benchmark {
override def toString() = "Adjoxo" 
val combinatorCount = 181
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
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(13),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
ptrBuilder(69),
ptrBuilder(72),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 7
ptrBuilder(69),
comBuilder(3,0,List(2)), // X
comBuilder(2,0,List(1)), // X
),
appBuilder( // 8
ptrBuilder(69),
comBuilder(3,0,List(2)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 9
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(6,54,List(0, 1, 2, 5, 4, 3)), // X(X(XXX)X)
ptrBuilder(19),
ptrBuilder(69),
ptrBuilder(72),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 10
comBuilder(5,30,List(0, 1, 2, 4, 4, 3)), // XX(XXX)X
comBuilder(5,30,List(0, 4, 1, 4, 2, 3)), // XX(XXX)X
ptrBuilder(19),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(14),
ptrBuilder(16),
ptrBuilder(16),
),
appBuilder( // 12
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)), // X(XX(XXX))
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(11),
ptrBuilder(10),
ptrBuilder(7),
),
appBuilder( // 13
comBuilder(5,28,List(0, 4, 1, 2, 4, 3)), // XXX(XX)X
ptrBuilder(12),
ptrBuilder(69),
ptrBuilder(72),
comBuilder(2,0,List(0)), // X
),
 // FUN2Adjoxo.cmp
appBuilder( // 14
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(15),
comBuilder(3,0,List(1)), // X
comBuilder(3,0,List(0)), // X
),
appBuilder( // 15
comBuilder(5,29,List(0, 4, 1, 4, 2, 3)), // X(XX)(XX)X
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)), // XX(XXXX)
prmBuilder("=="),
prmBuilder("<="),
comBuilder(3,0,List(2)), // X
),
 // FUN3NanoPrelude.length
appBuilder( // 16
yBuilder(),
ptrBuilder(18),
intBuilder(0),
),
appBuilder( // 17
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 18
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(17),
),
 // FUN4Adjoxo.hasLine
appBuilder( // 19
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(57),
ptrBuilder(53),
),
appBuilder( // 20
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 21
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(20),
),
appBuilder( // 22
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(21),
),
appBuilder( // 23
ptrBuilder(59),
ptrBuilder(22),
),
appBuilder( // 24
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 25
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(24),
),
appBuilder( // 26
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(25),
),
appBuilder( // 27
ptrBuilder(59),
ptrBuilder(26),
),
appBuilder( // 28
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(27),
ptrBuilder(23),
),
appBuilder( // 29
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 30
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
ptrBuilder(29),
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
ptrBuilder(30),
),
appBuilder( // 32
ptrBuilder(59),
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(32),
ptrBuilder(28),
),
appBuilder( // 34
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(8),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(34),
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(35),
),
appBuilder( // 37
ptrBuilder(59),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(37),
ptrBuilder(33),
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
ptrBuilder(59),
ptrBuilder(41),
),
appBuilder( // 43
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(42),
ptrBuilder(38),
),
appBuilder( // 44
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 45
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(8),
ptrBuilder(44),
),
appBuilder( // 46
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
ptrBuilder(45),
),
appBuilder( // 47
ptrBuilder(59),
ptrBuilder(46),
),
appBuilder( // 48
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(47),
ptrBuilder(43),
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 50
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(49),
),
appBuilder( // 51
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(50),
),
appBuilder( // 52
ptrBuilder(59),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(58),
ptrBuilder(52),
ptrBuilder(48),
),
appBuilder( // 54
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 55
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(54),
),
appBuilder( // 56
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(55),
),
appBuilder( // 57
ptrBuilder(59),
ptrBuilder(56),
),
 // FUN5Data.Bool.||
appBuilder( // 58
comBuilder(3,2,List(1, 2, 0)), // XXX
comBuilder(2,0,List(1)), // X
),
 // FUN6Adjoxo.subset
appBuilder( // 59
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(60),
ptrBuilder(62),
),
 // FUN7NanoPrelude.null
appBuilder( // 60
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(61),
),
appBuilder( // 61
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN8Adjoxo.diff
appBuilder( // 62
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(68),
),
appBuilder( // 63
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(62),
),
appBuilder( // 64
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(14),
ptrBuilder(62),
),
appBuilder( // 65
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(5,48,List(0, 1, 2, 4, 3, 4)), // XX(XX(XX))
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(64),
),
appBuilder( // 66
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)), // X(XX(XXX))
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
ptrBuilder(65),
ptrBuilder(63),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 67
comBuilder(4,14,List(0, 3, 1, 2, 3)), // XXX(XX)
ptrBuilder(66),
ptrBuilder(62),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 68
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(67),
),
 // FUN9Adjoxo.report
appBuilder( // 69
comBuilder(5,10,List(0, 4, 1, 2, 3)), // X(XX)XX
comBuilder(4,41,List(0, 1, 2, 3, 1, 3)), // X(X(XX))(XX)
intBuilder(3),
ptrBuilder(70),
ptrBuilder(71),
),
 // FUN10Adjoxo.side
appBuilder( // 70
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(88),
),
 // FUN11Adjoxo.opp
appBuilder( // 71
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN12Adjoxo.analysis
appBuilder( // 72
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(19),
ptrBuilder(78),
comBuilder(3,0,List(1)), // X
),
appBuilder( // 73
ptrBuilder(97),
intBuilder(1),
intBuilder(9),
),
appBuilder( // 74
ptrBuilder(62),
ptrBuilder(73),
),
appBuilder( // 75
ptrBuilder(81),
ptrBuilder(85),
),
appBuilder( // 76
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
ptrBuilder(75),
ptrBuilder(87),
ptrBuilder(90),
),
appBuilder( // 77
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
ptrBuilder(76),
ptrBuilder(62),
ptrBuilder(74),
),
appBuilder( // 78
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(79),
ptrBuilder(77),
comBuilder(3,0,List(0)), // X
),
 // FUN13Adjoxo.gridFull
appBuilder( // 79
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(80),
intBuilder(9),
),
appBuilder( // 80
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)), // X(XXX)XX
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(16),
prmBuilder("+"),
ptrBuilder(16),
prmBuilder("=="),
),
 // FUN14NanoPrelude.foldr1
appBuilder( // 81
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(84),
),
appBuilder( // 82
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 83
comBuilder(5,32,List(0, 1, 2, 3, 4, 4)), // X(XXXX)X
comBuilder(3,6,List(2, 1, 0, 2)), // XX(XX)
ptrBuilder(82),
),
appBuilder( // 84
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
errorBuilder(0),
ptrBuilder(83),
),
 // FUN15Adjoxo.bestOf
appBuilder( // 85
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(86),
comBuilder(3,0,List(2)), // X
),
appBuilder( // 86
comBuilder(4,32,List(2, 3, 0, 0, 1, 3)), // X(XXXX)X
comBuilder(3,0,List(0)), // X
comBuilder(3,0,List(2)), // X
),
 // FUN16NanoPrelude.map
appBuilder( // 87
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(89),
),
appBuilder( // 88
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 89
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(88),
),
 // FUN17Adjoxo.moveval
appBuilder( // 90
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,21,List(0, 1, 2, 4, 3)), // X(X(XXX))
ptrBuilder(91),
ptrBuilder(72),
ptrBuilder(92),
),
 // FUN18Adjoxo.inverse
appBuilder( // 91
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
comBuilder(3,0,List(0)), // X
comBuilder(3,0,List(2)), // X
comBuilder(3,0,List(1)), // X
),
 // FUN19Adjoxo.insert
appBuilder( // 92
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(96),
),
appBuilder( // 93
comBuilder(6,37,List(0, 1, 2, 3, 5, 4)), // XXXX(XX)
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
prmBuilder("<="),
),
appBuilder( // 94
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 95
comBuilder(5,30,List(0, 4, 1, 4, 2, 3)), // XX(XXX)X
ptrBuilder(94),
ptrBuilder(93),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 96
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(95),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN20NanoPrelude.enumFromTo
appBuilder( // 97
comBuilder(6,39,List(0, 1, 2, 3, 4, 5)), // XX(XX)(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(98),
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
ptrBuilder(102),
),
 // FUN21NanoPrelude.takeWhile
appBuilder( // 98
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(101),
),
appBuilder( // 99
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 100
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(99),
),
appBuilder( // 101
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(100),
),
 // FUN22NanoPrelude.enumFrom
appBuilder( // 102
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(102),
prmBuilder("+"),
intBuilder(1),
),
)
}