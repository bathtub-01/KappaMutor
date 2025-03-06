package benchmarks
import common.Helper._
 
// Functions in this file: 38
// Apps in this file: 132
// Combinators in this file: 185
object Sumpuz extends Benchmark {
override def toString() = "Sumpuz" 
val combinatorCount = 185
val prog = Seq(
 // FUN0Sumpuz.main
appBuilder( // 0
comBuilder(2,4,List(0, 1, 1, 1)), // XXXX
ptrBuilder(10),
ptrBuilder(9),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(8),
ptrBuilder(4),
),
 // FUN1Sumpuz.count
appBuilder( // 10
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(11),
ptrBuilder(15),
),
 // FUN2Sumpuz.sumMap
appBuilder( // 11
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(12),
intBuilder(0),
),
 // FUN3Sumpuz.sumMapAcc
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(6,46,List(2, 5, 1, 4, 0, 3)), // XX(XXXX)
prmBuilder("+"),
),
appBuilder( // 14
comBuilder(5,46,List(3, 4, 0, 1, 2, 4)), // XX(XXXX)
ptrBuilder(13),
),
 // FUN4Sumpuz.fx
appBuilder( // 15
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
ptrBuilder(11),
ptrBuilder(16),
),
 // FUN5Sumpuz.fy
appBuilder( // 16
comBuilder(5,12,List(0, 1, 2, 4, 3)), // X(XXX)X
ptrBuilder(11),
ptrBuilder(17),
),
 // FUN6Sumpuz.fz
appBuilder( // 17
comBuilder(6,23,List(0, 3, 4, 5, 1, 2)), // XXXXXX
ptrBuilder(18),
intBuilder(0),
intBuilder(1),
),
 // FUN7Sumpuz.valid
appBuilder( // 18
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(24),
ptrBuilder(20),
),
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 20
comBuilder(5,9,List(0, 2, 3, 4, 1)), // XXXXX
ptrBuilder(32),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(5,56,List(0, 1, 3, 2, 1, 4)), // X(XXX(XX))
ptrBuilder(25),
ptrBuilder(26),
prmBuilder("=="),
),
appBuilder( // 22
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
ptrBuilder(21),
comBuilder(1,0,List(0)), // X
ptrBuilder(29),
),
appBuilder( // 23
comBuilder(5,56,List(0, 1, 3, 2, 1, 4)), // X(XXX(XX))
ptrBuilder(25),
ptrBuilder(26),
prmBuilder("=="),
),
appBuilder( // 24
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,47,List(0, 3, 1, 2, 3, 4)), // XX(X(XX)X)
ptrBuilder(23),
ptrBuilder(22),
),
 // FUN8Data.Bool.&&
appBuilder( // 25
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9NanoPrelude.length
appBuilder( // 26
yBuilder(),
ptrBuilder(28),
intBuilder(0),
),
appBuilder( // 27
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 28
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(27),
),
 // FUN10Sumpuz.isSingleton
appBuilder( // 29
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(31),
),
appBuilder( // 30
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(30),
),
 // FUN11Sumpuz.solutions
appBuilder( // 32
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(57),
ptrBuilder(46),
ptrBuilder(38),
),
appBuilder( // 33
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
ptrBuilder(124),
ptrBuilder(131),
intBuilder(1),
intBuilder(0),
intBuilder(9),
),
appBuilder( // 34
comBuilder(6,39,List(0, 4, 1, 5, 2, 3)), // XX(XX)(XX)
ptrBuilder(60),
ptrBuilder(33),
ptrBuilder(59),
),
appBuilder( // 35
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)), // X(X(XX)XX)
ptrBuilder(124),
ptrBuilder(131),
ptrBuilder(123),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 36
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)), // X(XX)(XXX)
ptrBuilder(60),
ptrBuilder(122),
ptrBuilder(35),
intBuilder(9),
),
appBuilder( // 37
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(96),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(6,46,List(0, 2, 1, 3, 4, 5)), // XX(XXXX)
ptrBuilder(37),
ptrBuilder(34),
),
appBuilder( // 39
comBuilder(4,6,List(0, 3, 1, 2)), // XX(XX)
ptrBuilder(32),
ptrBuilder(123),
),
appBuilder( // 40
comBuilder(6,38,List(0, 1, 4, 5, 2, 3)), // X(XX)X(XX)
ptrBuilder(102),
ptrBuilder(58),
ptrBuilder(122),
),
appBuilder( // 41
comBuilder(6,62,List(0, 1, 2, 4, 3, 5)), // X(X(XX(XX)))
comBuilder(1,0,List(0)), // X
ptrBuilder(96),
),
appBuilder( // 42
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(41),
ptrBuilder(40),
),
appBuilder( // 43
comBuilder(6,32,List(0, 1, 2, 4, 5, 3)), // X(XXXX)X
comBuilder(6,24,List(0, 1, 2, 4, 5, 3)), // X(XX)XXX
ptrBuilder(42),
),
appBuilder( // 44
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(43),
ptrBuilder(39),
),
appBuilder( // 45
comBuilder(5,48,List(1, 0, 2, 4, 3, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
),
appBuilder( // 46
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(45),
ptrBuilder(44),
),
appBuilder( // 47
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 48
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 49
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(58),
prmBuilder("=="),
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 50
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(6,56,List(0, 1, 5, 2, 3, 4)), // X(XXX(XX))
ptrBuilder(49),
ptrBuilder(60),
ptrBuilder(48),
ptrBuilder(59),
),
appBuilder( // 51
comBuilder(5,32,List(4, 0, 2, 2, 3, 1)), // X(XXXX)X
ptrBuilder(50),
ptrBuilder(47),
),
appBuilder( // 52
comBuilder(5,5,List(4, 0, 2, 1)), // X(XX)X
ptrBuilder(59),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 53
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(58),
prmBuilder("=="),
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 54
comBuilder(4,20,List(2, 0, 3, 1, 3)), // X(XX(XX))
ptrBuilder(53),
ptrBuilder(52),
),
appBuilder( // 55
comBuilder(5,56,List(2, 0, 3, 4, 1, 4)), // X(XXX(XX))
ptrBuilder(54),
ptrBuilder(51),
),
appBuilder( // 56
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,48,List(0, 3, 1, 3, 2, 3)), // XX(XX(XX))
),
appBuilder( // 57
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(56),
ptrBuilder(55),
),
 // FUN12NanoPrelude.fst
appBuilder( // 58
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN13NanoPrelude.snd
appBuilder( // 59
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN14Sumpuz.bindings
appBuilder( // 60
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(68),
ptrBuilder(62),
),
appBuilder( // 61
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 62
comBuilder(6,37,List(0, 5, 3, 1, 2, 4)), // XXXX(XX)
ptrBuilder(93),
comBuilder(2,0,List(0)), // X
ptrBuilder(61),
),
appBuilder( // 63
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(83),
ptrBuilder(92),
),
appBuilder( // 64
comBuilder(6,44,List(0, 1, 3, 2, 4, 5)), // X(XX)(XXX)
ptrBuilder(78),
ptrBuilder(82),
ptrBuilder(63),
),
appBuilder( // 65
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
ptrBuilder(74),
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(77),
),
appBuilder( // 66
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(65),
ptrBuilder(64),
),
appBuilder( // 67
comBuilder(5,42,List(0, 2, 4, 1, 3, 4)), // XXX(XXX)
ptrBuilder(69),
),
appBuilder( // 68
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(67),
ptrBuilder(66),
),
 // FUN15NanoPrelude.lookup
appBuilder( // 69
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(73),
),
appBuilder( // 70
comBuilder(5,14,List(1, 0, 4, 2, 3)), // XXX(XX)
prmBuilder("=="),
),
appBuilder( // 71
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(6,37,List(0, 2, 3, 4, 1, 5)), // XXXX(XX)
ptrBuilder(70),
comBuilder(3,1,List(2, 0)), // XX
),
appBuilder( // 72
comBuilder(5,18,List(3, 0, 1, 2, 4)), // X(XXXX)
ptrBuilder(71),
),
appBuilder( // 73
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(72),
),
 // FUN16NanoPrelude.map
appBuilder( // 74
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(76),
),
appBuilder( // 75
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 76
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(75),
),
 // FUN17Data.List_Type.:
appBuilder( // 77
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN18NanoPrelude.zip
appBuilder( // 78
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(81),
),
appBuilder( // 79
comBuilder(6,44,List(0, 1, 4, 2, 3, 5)), // X(XX)(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 80
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(79),
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(78),
),
appBuilder( // 81
comBuilder(5,16,List(2, 0, 1, 3, 4)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(80),
),
 // FUN19NanoPrelude.repeat
appBuilder( // 82
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(82),
),
 // FUN20Sumpuz.diff
appBuilder( // 83
ptrBuilder(85),
ptrBuilder(84),
),
appBuilder( // 84
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(87),
),
 // FUN21NanoPrelude.foldl
appBuilder( // 85
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(86),
),
appBuilder( // 86
comBuilder(5,46,List(4, 3, 0, 1, 2, 3)), // XX(XXXX)
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
),
 // FUN22Sumpuz.del
appBuilder( // 87
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(91),
),
appBuilder( // 88
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 89
comBuilder(5,28,List(1, 0, 3, 2, 4, 4)), // XXX(XX)X
prmBuilder("=="),
),
appBuilder( // 90
comBuilder(5,30,List(0, 2, 1, 3, 4, 4)), // XX(XXX)X
ptrBuilder(89),
ptrBuilder(88),
),
appBuilder( // 91
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(90),
),
 // FUN23Sumpuz.rng
appBuilder( // 92
ptrBuilder(74),
ptrBuilder(59),
),
 // FUN24NanoPrelude.elem
appBuilder( // 93
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(95),
),
appBuilder( // 94
comBuilder(6,28,List(2, 0, 4, 3, 5, 1)), // XXX(XX)X
prmBuilder("=="),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 95
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(94),
),
 // FUN25Sumpuz.ofAll
appBuilder( // 96
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(98),
),
appBuilder( // 97
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(99),
),
appBuilder( // 98
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(97),
),
 // FUN26Data.List_Type.++
appBuilder( // 99
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(101),
),
appBuilder( // 100
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 101
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(100),
),
 // FUN27Sumpuz.solns
appBuilder( // 102
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(113),
ptrBuilder(107),
),
appBuilder( // 103
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(120),
),
appBuilder( // 104
comBuilder(5,37,List(0, 4, 2, 1, 3, 4)), // XXXX(XX)
ptrBuilder(120),
prmBuilder("+"),
),
appBuilder( // 105
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(104),
ptrBuilder(103),
),
appBuilder( // 106
comBuilder(6,51,List(0, 1, 4, 5, 2, 3)), // X(XXXXX)
ptrBuilder(115),
),
appBuilder( // 107
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(106),
ptrBuilder(105),
prmBuilder("+"),
),
appBuilder( // 108
comBuilder(5,5,List(4, 0, 2, 1)), // X(XX)X
ptrBuilder(59),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 109
comBuilder(5,11,List(0, 2, 1, 4, 3)), // XX(XX)X
ptrBuilder(60),
ptrBuilder(108),
),
appBuilder( // 110
comBuilder(5,20,List(0, 1, 3, 2, 4)), // X(XX(XX))
ptrBuilder(96),
ptrBuilder(114),
ptrBuilder(58),
),
appBuilder( // 111
comBuilder(5,42,List(0, 2, 4, 1, 3, 4)), // XXX(XXX)
ptrBuilder(110),
),
appBuilder( // 112
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(111),
ptrBuilder(109),
),
appBuilder( // 113
comBuilder(5,37,List(0, 2, 3, 4, 1, 4)), // XXXX(XX)
ptrBuilder(112),
),
 // FUN28NanoPrelude.curry
appBuilder( // 114
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN29Sumpuz.divMod10
appBuilder( // 115
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(119),
ptrBuilder(116),
),
appBuilder( // 116
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 117
comBuilder(5,12,List(4, 2, 0, 1, 3)), // X(XXX)X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 118
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
ptrBuilder(115),
prmBuilder("-"),
intBuilder(10),
ptrBuilder(117),
),
appBuilder( // 119
comBuilder(4,14,List(3, 0, 1, 2, 3)), // XXX(XX)
prmBuilder("<="),
intBuilder(9),
ptrBuilder(118),
),
 // FUN30Sumpuz.img
appBuilder( // 120
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(121),
ptrBuilder(69),
),
 // FUN31NanoPrelude.fromJust
appBuilder( // 121
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(4),
comBuilder(1,0,List(0)), // X
),
 // FUN32NanoPrelude.head
appBuilder( // 122
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(3),
comBuilder(2,0,List(0)), // X
),
 // FUN33NanoPrelude.tail
appBuilder( // 123
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN34NanoPrelude.enumFromTo
appBuilder( // 124
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(126),
ptrBuilder(125),
ptrBuilder(130),
),
appBuilder( // 125
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
 // FUN35NanoPrelude.takeWhile
appBuilder( // 126
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(129),
),
appBuilder( // 127
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 128
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)), // XXX(XXX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 129
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(128),
ptrBuilder(127),
),
 // FUN36NanoPrelude.enumFrom
appBuilder( // 130
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(130),
prmBuilder("+"),
intBuilder(1),
),
 // FUN37Sumpuz.ifNull
appBuilder( // 131
comBuilder(4,6,List(1, 2, 0, 3)), // XX(XX)
comBuilder(3,0,List(0)), // X
),
)
}