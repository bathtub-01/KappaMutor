package benchmarks
import common.Helper._
 
// Functions in this file: 33
// Apps in this file: 140
// Combinators in this file: 199
object Countdown extends Benchmark {
override def toString() = "Countdown" 
val combinatorCount = 199
val prog = Seq(
 // FUN0Countdown.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(10),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(2),
),
appBuilder( // 4
ptrBuilder(8),
ptrBuilder(3),
intBuilder(70),
),
 // FUN1NanoPrelude.length
appBuilder( // 5
yBuilder(),
ptrBuilder(7),
intBuilder(0),
),
appBuilder( // 6
comBuilder(5,7,List(2, 3, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(4,16,List(3, 2, 0, 1, 2)),
ptrBuilder(6),
),
 // FUN2Countdown.solutions
appBuilder( // 8
comBuilder(5,15,List(0, 1, 4, 2, 3)),
ptrBuilder(9),
ptrBuilder(15),
ptrBuilder(125),
),
 // FUN3Data.List_Type.concatMap
appBuilder( // 9
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(10),
),
 // FUN4Data.List_Type.++
appBuilder( // 12
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 14
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(13),
),
 // FUN5Countdown.solns
appBuilder( // 15
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(16),
ptrBuilder(22),
),
 // FUN6Countdown.preImage
appBuilder( // 16
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(21),
),
appBuilder( // 17
comBuilder(4,6,List(0, 3, 1, 2)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 18
comBuilder(6,28,List(5, 0, 1, 2, 3, 4)),
prmBuilder("=="),
),
appBuilder( // 19
comBuilder(3,3,List(0, 1, 2)),
comBuilder(5,42,List(0, 1, 3, 2, 3, 4)),
ptrBuilder(18),
),
appBuilder( // 20
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(5,53,List(3, 0, 2, 1, 2, 4)),
ptrBuilder(19),
ptrBuilder(17),
),
appBuilder( // 21
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(20),
),
 // FUN7Countdown.results
appBuilder( // 22
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(27),
),
appBuilder( // 23
comBuilder(3,5,List(2, 0, 1, 1)),
ptrBuilder(124),
),
appBuilder( // 24
comBuilder(5,5,List(4, 0, 2, 1)),
ptrBuilder(23),
comBuilder(2,0,List(0)),
),
appBuilder( // 25
comBuilder(6,49,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(9),
ptrBuilder(30),
ptrBuilder(111),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 26
comBuilder(5,30,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(28),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(26),
ptrBuilder(24),
),
 // FUN8NanoPrelude.null
appBuilder( // 28
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(29),
),
appBuilder( // 29
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN9Countdown.combinedResults
appBuilder( // 30
comBuilder(2,1,List(1, 0)),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(6,39,List(0, 1, 2, 4, 3, 5)),
ptrBuilder(32),
ptrBuilder(36),
ptrBuilder(22),
ptrBuilder(22),
),
 // FUN10Countdown.concatProdWith
appBuilder( // 32
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(35),
),
appBuilder( // 33
comBuilder(5,19,List(0, 1, 2, 4, 3)),
ptrBuilder(12),
ptrBuilder(9),
),
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)),
comBuilder(5,42,List(0, 2, 3, 1, 4, 2)),
ptrBuilder(33),
),
appBuilder( // 35
comBuilder(6,46,List(4, 0, 1, 2, 3, 5)),
comBuilder(2,0,List(0)),
ptrBuilder(34),
),
 // FUN11Countdown.combine
appBuilder( // 36
comBuilder(3,3,List(1, 0, 2)),
ptrBuilder(43),
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(110),
comBuilder(2,0,List(0)),
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(109),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(108),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(107),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(9),
ptrBuilder(44),
),
appBuilder( // 42
comBuilder(6,23,List(0, 2, 3, 4, 5, 1)),
ptrBuilder(41),
ptrBuilder(40),
),
appBuilder( // 43
comBuilder(4,7,List(1, 0, 2, 3)),
ptrBuilder(42),
),
 // FUN12Countdown.combi
appBuilder( // 44
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(50),
ptrBuilder(48),
),
appBuilder( // 45
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(81),
),
appBuilder( // 46
comBuilder(6,32,List(5, 0, 3, 1, 2, 4)),
ptrBuilder(80),
),
appBuilder( // 47
comBuilder(6,29,List(0, 1, 4, 2, 5, 3)),
comBuilder(6,34,List(5, 0, 3, 1, 3, 2)),
),
appBuilder( // 48
comBuilder(6,29,List(0, 1, 4, 2, 5, 3)),
ptrBuilder(47),
ptrBuilder(46),
ptrBuilder(45),
comBuilder(2,0,List(0)),
),
appBuilder( // 49
comBuilder(5,9,List(0, 4, 2, 3, 1)),
ptrBuilder(51),
comBuilder(2,0,List(0)),
),
appBuilder( // 50
comBuilder(5,44,List(0, 1, 3, 2, 3, 4)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(49),
),
 // FUN13Countdown.valid
appBuilder( // 51
comBuilder(5,18,List(2, 0, 3, 1, 4)),
ptrBuilder(63),
comBuilder(2,0,List(1)),
),
appBuilder( // 52
comBuilder(6,51,List(5, 0, 3, 4, 1, 2)),
ptrBuilder(65),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 53
comBuilder(6,42,List(4, 0, 1, 2, 3, 5)),
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 54
comBuilder(5,21,List(4, 0, 2, 1, 3)),
ptrBuilder(64),
prmBuilder("<="),
),
appBuilder( // 55
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)),
prmBuilder("=="),
intBuilder(3),
comBuilder(2,0,List(0)),
),
appBuilder( // 56
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(55),
ptrBuilder(54),
),
appBuilder( // 57
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 58
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(57),
ptrBuilder(56),
),
appBuilder( // 59
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 60
comBuilder(6,52,List(0, 1, 2, 4, 3, 5)),
ptrBuilder(59),
comBuilder(5,37,List(0, 2, 3, 4, 4, 1)),
ptrBuilder(58),
comBuilder(2,0,List(1)),
),
appBuilder( // 61
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,48,List(0, 3, 1, 3, 3, 2)),
),
appBuilder( // 62
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
ptrBuilder(61),
),
appBuilder( // 63
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(62),
ptrBuilder(60),
ptrBuilder(53),
ptrBuilder(52),
),
 // FUN14Data.Bool.not
appBuilder( // 64
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
comBuilder(2,0,List(0)),
),
 // FUN15NanoPrelude.mod
appBuilder( // 65
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(66),
comBuilder(2,0,List(1)),
),
 // FUN16NanoPrelude.divMod
appBuilder( // 66
comBuilder(5,19,List(0, 1, 2, 4, 3)),
yBuilder(),
comBuilder(4,42,List(0, 2, 3, 3, 1, 3)),
ptrBuilder(79),
prmBuilder("+"),
),
appBuilder( // 67
comBuilder(2,2,List(1, 0, 1)),
prmBuilder("+"),
),
appBuilder( // 68
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("-"),
),
appBuilder( // 69
comBuilder(6,40,List(5, 4, 0, 1, 2, 3)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 70
comBuilder(5,42,List(2, 0, 3, 1, 3, 4)),
prmBuilder("<="),
comBuilder(3,2,List(2, 1, 0)),
),
appBuilder( // 71
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
comBuilder(4,42,List(0, 3, 2, 1, 3, 2)),
ptrBuilder(70),
ptrBuilder(69),
ptrBuilder(68),
),
appBuilder( // 72
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(71),
ptrBuilder(67),
),
appBuilder( // 73
comBuilder(4,6,List(1, 3, 0, 2)),
ptrBuilder(72),
),
appBuilder( // 74
comBuilder(5,16,List(4, 0, 2, 1, 3)),
intBuilder(1),
prmBuilder("-"),
),
appBuilder( // 75
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
),
appBuilder( // 76
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)),
prmBuilder("<="),
),
appBuilder( // 77
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(76),
ptrBuilder(75),
ptrBuilder(74),
),
appBuilder( // 78
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)),
prmBuilder("<="),
),
appBuilder( // 79
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(78),
ptrBuilder(77),
ptrBuilder(73),
),
 // FUN17Countdown.App
appBuilder( // 80
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
intBuilder(5),
comBuilder(4,4,List(3, 0, 1, 2)),
),
 // FUN18Countdown.apply
appBuilder( // 81
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
ptrBuilder(98),
ptrBuilder(97),
ptrBuilder(87),
),
appBuilder( // 82
comBuilder(4,7,List(3, 0, 1, 2)),
ptrBuilder(106),
),
appBuilder( // 83
comBuilder(6,42,List(4, 0, 1, 2, 3, 5)),
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 84
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(83),
ptrBuilder(82),
),
appBuilder( // 85
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)),
),
appBuilder( // 86
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(85),
),
appBuilder( // 87
comBuilder(4,10,List(0, 1, 3, 3, 2)),
ptrBuilder(86),
ptrBuilder(84),
prmBuilder("+"),
),
appBuilder( // 88
comBuilder(4,7,List(3, 1, 0, 2)),
prmBuilder("-"),
),
appBuilder( // 89
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)),
prmBuilder("=="),
intBuilder(3),
intBuilder(0),
),
appBuilder( // 90
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(89),
ptrBuilder(88),
),
appBuilder( // 91
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 92
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(91),
ptrBuilder(90),
),
appBuilder( // 93
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)),
),
appBuilder( // 94
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(93),
),
appBuilder( // 95
comBuilder(4,10,List(0, 1, 3, 2, 3)),
ptrBuilder(94),
ptrBuilder(92),
ptrBuilder(99),
),
appBuilder( // 96
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 97
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(96),
ptrBuilder(95),
),
appBuilder( // 98
comBuilder(5,57,List(1, 0, 2, 4, 3, 4)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
),
 // FUN19Countdown.mul
appBuilder( // 99
comBuilder(3,5,List(0, 1, 2, 2)),
ptrBuilder(105),
ptrBuilder(104),
),
appBuilder( // 100
comBuilder(5,9,List(4, 0, 1, 3, 2)),
prmBuilder("=="),
intBuilder(0),
intBuilder(0),
),
appBuilder( // 101
comBuilder(3,7,List(0, 2, 1, 2)),
ptrBuilder(99),
prmBuilder("+"),
),
appBuilder( // 102
comBuilder(6,37,List(0, 2, 4, 1, 3, 5)),
ptrBuilder(101),
prmBuilder("+"),
),
appBuilder( // 103
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(102),
ptrBuilder(100),
),
appBuilder( // 104
comBuilder(5,14,List(0, 4, 1, 2, 3)),
ptrBuilder(66),
intBuilder(2),
ptrBuilder(103),
),
appBuilder( // 105
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)),
prmBuilder("=="),
intBuilder(1),
),
 // FUN20NanoPrelude.div
appBuilder( // 106
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(66),
comBuilder(2,0,List(0)),
),
 // FUN21Countdown.Add
appBuilder( // 107
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
comBuilder(1,0,List(0)),
),
 // FUN22Countdown.Sub
appBuilder( // 108
comBuilder(3,2,List(2, 0, 1)),
intBuilder(3),
comBuilder(1,0,List(0)),
),
 // FUN23Countdown.Mul
appBuilder( // 109
comBuilder(3,2,List(2, 0, 1)),
intBuilder(2),
comBuilder(1,0,List(0)),
),
 // FUN24Countdown.Div
appBuilder( // 110
comBuilder(3,2,List(2, 0, 1)),
intBuilder(1),
comBuilder(1,0,List(0)),
),
 // FUN25Countdown.split
appBuilder( // 111
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(118),
),
appBuilder( // 112
comBuilder(4,5,List(3, 0, 2, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(1,0,List(0)),
),
appBuilder( // 113
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)),
ptrBuilder(119),
ptrBuilder(122),
ptrBuilder(112),
ptrBuilder(111),
),
appBuilder( // 114
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 115
comBuilder(4,5,List(3, 0, 1, 2)),
ptrBuilder(114),
),
appBuilder( // 116
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(115),
),
appBuilder( // 117
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(116),
ptrBuilder(113),
),
appBuilder( // 118
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)),
ptrBuilder(28),
ptrBuilder(117),
comBuilder(2,0,List(0)),
),
 // FUN26NanoPrelude.map
appBuilder( // 119
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(121),
),
appBuilder( // 120
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 121
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(120),
),
 // FUN27Countdown.cross
appBuilder( // 122
comBuilder(3,3,List(1, 0, 2)),
ptrBuilder(123),
),
appBuilder( // 123
comBuilder(4,7,List(1, 0, 2, 3)),
comBuilder(5,15,List(4, 0, 2, 1, 3)),
),
 // FUN28Countdown.Val
appBuilder( // 124
comBuilder(4,6,List(3, 0, 1, 2)),
intBuilder(4),
comBuilder(2,1,List(1, 0)),
),
 // FUN29Countdown.choices
appBuilder( // 125
comBuilder(4,6,List(0, 1, 2, 3)),
ptrBuilder(9),
ptrBuilder(126),
ptrBuilder(136),
),
 // FUN30Countdown.perms
appBuilder( // 126
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(128),
ptrBuilder(127),
),
appBuilder( // 127
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(9),
ptrBuilder(129),
ptrBuilder(126),
),
appBuilder( // 128
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN31Countdown.interleave
appBuilder( // 129
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)),
yBuilder(),
ptrBuilder(135),
ptrBuilder(132),
ptrBuilder(130),
),
appBuilder( // 130
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(119),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 131
comBuilder(6,58,List(0, 1, 3, 2, 4, 5)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 132
comBuilder(3,3,List(0, 1, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(131),
),
appBuilder( // 133
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 134
comBuilder(5,5,List(4, 0, 2, 1)),
ptrBuilder(133),
comBuilder(2,0,List(0)),
),
appBuilder( // 135
comBuilder(6,45,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(134),
),
 // FUN32Countdown.subs
appBuilder( // 136
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(139),
ptrBuilder(138),
),
appBuilder( // 137
comBuilder(5,47,List(0, 4, 1, 2, 3, 4)),
ptrBuilder(12),
ptrBuilder(119),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 138
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(137),
ptrBuilder(136),
),
appBuilder( // 139
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
)
}