package benchmarks
import common.Helper._
 
// Functions in this file: 38
// Apps in this file: 133
// Combinators in this file: 186
object Sumpuz extends Benchmark {
override def toString() = "Sumpuz" 
val combinatorCount = 186
val prog = Seq(
 // FUN0Sumpuz.main
appBuilder( // 0
comBuilder(2,4,List(0, 1, 1, 1)),
ptrBuilder(10),
ptrBuilder(9),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(3),
comBuilder(2,0,List(0)),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(8),
ptrBuilder(4),
),
 // FUN1Sumpuz.count
appBuilder( // 10
comBuilder(5,12,List(0, 1, 3, 4, 2)),
ptrBuilder(11),
ptrBuilder(15),
),
 // FUN2Sumpuz.sumMap
appBuilder( // 11
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(12),
intBuilder(0),
),
 // FUN3Sumpuz.sumMapAcc
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(6,46,List(2, 5, 1, 4, 0, 3)),
prmBuilder("+"),
),
appBuilder( // 14
comBuilder(5,46,List(3, 4, 0, 1, 2, 4)),
ptrBuilder(13),
),
 // FUN4Sumpuz.fx
appBuilder( // 15
comBuilder(5,12,List(0, 1, 4, 3, 2)),
ptrBuilder(11),
ptrBuilder(16),
),
 // FUN5Sumpuz.fy
appBuilder( // 16
comBuilder(5,12,List(0, 1, 2, 4, 3)),
ptrBuilder(11),
ptrBuilder(17),
),
 // FUN6Sumpuz.fz
appBuilder( // 17
comBuilder(6,23,List(0, 3, 4, 5, 1, 2)),
ptrBuilder(18),
intBuilder(0),
intBuilder(1),
),
 // FUN7Sumpuz.valid
appBuilder( // 18
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(25),
ptrBuilder(24),
ptrBuilder(23),
),
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
comBuilder(2,0,List(0)),
),
appBuilder( // 20
comBuilder(5,9,List(0, 2, 3, 4, 1)),
ptrBuilder(33),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(6,56,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(26),
ptrBuilder(27),
prmBuilder("=="),
ptrBuilder(27),
),
appBuilder( // 22
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)),
ptrBuilder(21),
comBuilder(1,0,List(0)),
ptrBuilder(30),
),
appBuilder( // 23
comBuilder(4,16,List(0, 2, 1, 2, 3)),
ptrBuilder(22),
ptrBuilder(20),
),
appBuilder( // 24
comBuilder(5,14,List(0, 3, 1, 2, 4)),
ptrBuilder(27),
prmBuilder("=="),
ptrBuilder(27),
),
appBuilder( // 25
comBuilder(5,44,List(0, 1, 3, 2, 3, 4)),
ptrBuilder(26),
),
 // FUN8Data.Bool.&&
appBuilder( // 26
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN9NanoPrelude.length
appBuilder( // 27
yBuilder(),
ptrBuilder(29),
intBuilder(0),
),
appBuilder( // 28
comBuilder(5,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 29
comBuilder(4,16,List(3, 2, 0, 1, 2)),
ptrBuilder(28),
),
 // FUN10Sumpuz.isSingleton
appBuilder( // 30
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(32),
),
appBuilder( // 31
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(31),
),
 // FUN11Sumpuz.solutions
appBuilder( // 33
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
ptrBuilder(58),
ptrBuilder(47),
ptrBuilder(39),
),
appBuilder( // 34
comBuilder(5,18,List(0, 1, 4, 2, 3)),
ptrBuilder(125),
ptrBuilder(132),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 35
comBuilder(6,30,List(0, 4, 1, 5, 2, 3)),
ptrBuilder(61),
ptrBuilder(34),
intBuilder(9),
),
appBuilder( // 36
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)),
ptrBuilder(125),
ptrBuilder(132),
ptrBuilder(124),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 37
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)),
ptrBuilder(61),
ptrBuilder(123),
ptrBuilder(36),
intBuilder(9),
),
appBuilder( // 38
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(97),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(6,52,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(38),
ptrBuilder(35),
ptrBuilder(60),
),
appBuilder( // 40
comBuilder(4,6,List(0, 3, 1, 2)),
ptrBuilder(33),
ptrBuilder(124),
),
appBuilder( // 41
comBuilder(6,38,List(0, 1, 4, 5, 2, 3)),
ptrBuilder(103),
ptrBuilder(59),
ptrBuilder(123),
),
appBuilder( // 42
comBuilder(6,62,List(0, 1, 2, 4, 3, 5)),
comBuilder(1,0,List(0)),
ptrBuilder(97),
),
appBuilder( // 43
comBuilder(5,18,List(0, 1, 2, 3, 4)),
ptrBuilder(42),
ptrBuilder(41),
),
appBuilder( // 44
comBuilder(6,32,List(0, 1, 2, 4, 5, 3)),
comBuilder(6,24,List(0, 1, 2, 4, 5, 3)),
ptrBuilder(43),
),
appBuilder( // 45
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(44),
ptrBuilder(40),
),
appBuilder( // 46
comBuilder(5,48,List(1, 0, 2, 4, 3, 4)),
comBuilder(2,0,List(0)),
),
appBuilder( // 47
comBuilder(5,15,List(0, 1, 4, 2, 3)),
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(46),
ptrBuilder(45),
),
appBuilder( // 48
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 50
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(59),
prmBuilder("=="),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 51
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(6,56,List(0, 1, 5, 2, 3, 4)),
ptrBuilder(50),
ptrBuilder(61),
ptrBuilder(49),
ptrBuilder(60),
),
appBuilder( // 52
comBuilder(5,32,List(4, 0, 2, 2, 3, 1)),
ptrBuilder(51),
ptrBuilder(48),
),
appBuilder( // 53
comBuilder(5,5,List(4, 0, 2, 1)),
ptrBuilder(60),
comBuilder(2,0,List(0)),
),
appBuilder( // 54
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(59),
prmBuilder("=="),
intBuilder(0),
comBuilder(2,0,List(0)),
),
appBuilder( // 55
comBuilder(4,20,List(2, 0, 3, 1, 3)),
ptrBuilder(54),
ptrBuilder(53),
),
appBuilder( // 56
comBuilder(5,56,List(2, 0, 3, 4, 1, 4)),
ptrBuilder(55),
ptrBuilder(52),
),
appBuilder( // 57
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,48,List(0, 3, 1, 3, 2, 3)),
),
appBuilder( // 58
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(57),
ptrBuilder(56),
),
 // FUN12NanoPrelude.fst
appBuilder( // 59
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN13NanoPrelude.snd
appBuilder( // 60
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(1)),
),
 // FUN14Sumpuz.bindings
appBuilder( // 61
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(69),
ptrBuilder(63),
),
appBuilder( // 62
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 63
comBuilder(6,37,List(0, 5, 3, 1, 2, 4)),
ptrBuilder(94),
comBuilder(2,0,List(0)),
ptrBuilder(62),
),
appBuilder( // 64
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(84),
ptrBuilder(93),
),
appBuilder( // 65
comBuilder(6,44,List(0, 1, 3, 2, 4, 5)),
ptrBuilder(79),
ptrBuilder(83),
ptrBuilder(64),
),
appBuilder( // 66
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(75),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(78),
),
appBuilder( // 67
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(66),
ptrBuilder(65),
),
appBuilder( // 68
comBuilder(5,42,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(70),
),
appBuilder( // 69
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(68),
ptrBuilder(67),
),
 // FUN15NanoPrelude.lookup
appBuilder( // 70
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(74),
),
appBuilder( // 71
comBuilder(5,14,List(1, 0, 4, 2, 3)),
prmBuilder("=="),
),
appBuilder( // 72
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(6,37,List(0, 2, 3, 4, 1, 5)),
ptrBuilder(71),
comBuilder(3,1,List(2, 0)),
),
appBuilder( // 73
comBuilder(5,18,List(3, 0, 1, 2, 4)),
ptrBuilder(72),
),
appBuilder( // 74
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(73),
),
 // FUN16NanoPrelude.map
appBuilder( // 75
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(77),
),
appBuilder( // 76
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 77
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(76),
),
 // FUN17Data.List_Type.:
appBuilder( // 78
comBuilder(4,2,List(3, 0, 1)),
),
 // FUN18NanoPrelude.zip
appBuilder( // 79
comBuilder(4,6,List(2, 0, 1, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(82),
),
appBuilder( // 80
comBuilder(6,44,List(0, 1, 4, 2, 3, 5)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 81
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(80),
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(79),
),
appBuilder( // 82
comBuilder(5,16,List(2, 0, 1, 3, 4)),
comBuilder(2,0,List(0)),
ptrBuilder(81),
),
 // FUN19NanoPrelude.repeat
appBuilder( // 83
comBuilder(3,6,List(0, 2, 1, 2)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(83),
),
 // FUN20Sumpuz.diff
appBuilder( // 84
ptrBuilder(86),
ptrBuilder(85),
),
appBuilder( // 85
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(88),
),
 // FUN21NanoPrelude.foldl
appBuilder( // 86
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(87),
),
appBuilder( // 87
comBuilder(5,46,List(4, 3, 0, 1, 2, 3)),
comBuilder(4,7,List(1, 0, 2, 3)),
),
 // FUN22Sumpuz.del
appBuilder( // 88
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(92),
),
appBuilder( // 89
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 90
comBuilder(5,28,List(1, 0, 2, 3, 4, 4)),
prmBuilder("=="),
),
appBuilder( // 91
comBuilder(5,42,List(0, 2, 4, 1, 3, 4)),
ptrBuilder(90),
ptrBuilder(89),
),
appBuilder( // 92
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(91),
),
 // FUN23Sumpuz.rng
appBuilder( // 93
ptrBuilder(75),
ptrBuilder(60),
),
 // FUN24NanoPrelude.elem
appBuilder( // 94
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(96),
),
appBuilder( // 95
comBuilder(6,28,List(2, 0, 4, 3, 5, 1)),
prmBuilder("=="),
comBuilder(2,0,List(1)),
),
appBuilder( // 96
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(95),
),
 // FUN25Sumpuz.ofAll
appBuilder( // 97
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(99),
),
appBuilder( // 98
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(100),
),
appBuilder( // 99
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(98),
),
 // FUN26Data.List_Type.++
appBuilder( // 100
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(102),
),
appBuilder( // 101
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 102
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(101),
),
 // FUN27Sumpuz.solns
appBuilder( // 103
comBuilder(5,18,List(0, 1, 2, 3, 4)),
ptrBuilder(114),
ptrBuilder(108),
),
appBuilder( // 104
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(121),
),
appBuilder( // 105
comBuilder(5,37,List(0, 4, 2, 1, 3, 4)),
ptrBuilder(121),
prmBuilder("+"),
),
appBuilder( // 106
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(105),
ptrBuilder(104),
),
appBuilder( // 107
comBuilder(6,51,List(0, 1, 4, 5, 2, 3)),
ptrBuilder(116),
),
appBuilder( // 108
comBuilder(5,10,List(0, 1, 4, 2, 3)),
ptrBuilder(107),
ptrBuilder(106),
prmBuilder("+"),
),
appBuilder( // 109
comBuilder(5,5,List(4, 0, 2, 1)),
ptrBuilder(60),
comBuilder(2,0,List(0)),
),
appBuilder( // 110
comBuilder(5,11,List(0, 2, 1, 4, 3)),
ptrBuilder(61),
ptrBuilder(109),
),
appBuilder( // 111
comBuilder(5,20,List(0, 1, 3, 2, 4)),
ptrBuilder(97),
ptrBuilder(115),
ptrBuilder(59),
),
appBuilder( // 112
comBuilder(5,42,List(0, 2, 4, 1, 3, 4)),
ptrBuilder(111),
),
appBuilder( // 113
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(112),
ptrBuilder(110),
),
appBuilder( // 114
comBuilder(5,37,List(0, 2, 3, 4, 1, 4)),
ptrBuilder(113),
),
 // FUN28NanoPrelude.curry
appBuilder( // 115
comBuilder(4,7,List(1, 0, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN29Sumpuz.divMod10
appBuilder( // 116
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(120),
ptrBuilder(117),
),
appBuilder( // 117
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
),
appBuilder( // 118
comBuilder(5,12,List(4, 2, 0, 1, 3)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 119
comBuilder(5,12,List(0, 4, 1, 2, 3)),
ptrBuilder(116),
prmBuilder("-"),
intBuilder(10),
ptrBuilder(118),
),
appBuilder( // 120
comBuilder(4,14,List(3, 0, 1, 2, 3)),
prmBuilder("<="),
intBuilder(9),
ptrBuilder(119),
),
 // FUN30Sumpuz.img
appBuilder( // 121
comBuilder(4,7,List(0, 1, 3, 2)),
ptrBuilder(122),
ptrBuilder(70),
),
 // FUN31NanoPrelude.fromJust
appBuilder( // 122
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(4),
comBuilder(1,0,List(0)),
),
 // FUN32NanoPrelude.head
appBuilder( // 123
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(3),
comBuilder(2,0,List(0)),
),
 // FUN33NanoPrelude.tail
appBuilder( // 124
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(1)),
),
 // FUN34NanoPrelude.enumFromTo
appBuilder( // 125
comBuilder(5,15,List(0, 1, 4, 2, 3)),
ptrBuilder(127),
ptrBuilder(126),
ptrBuilder(131),
),
appBuilder( // 126
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
),
 // FUN35NanoPrelude.takeWhile
appBuilder( // 127
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(130),
),
appBuilder( // 128
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 129
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)),
comBuilder(2,0,List(0)),
),
appBuilder( // 130
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)),
comBuilder(2,0,List(0)),
ptrBuilder(129),
ptrBuilder(128),
),
 // FUN36NanoPrelude.enumFrom
appBuilder( // 131
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(131),
prmBuilder("+"),
intBuilder(1),
),
 // FUN37Sumpuz.ifNull
appBuilder( // 132
comBuilder(4,6,List(1, 2, 0, 3)),
comBuilder(3,0,List(0)),
),
)
}