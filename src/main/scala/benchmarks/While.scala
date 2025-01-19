package benchmarks
import common.Helper._
 
// Functions in this file: 26
// Apps in this file: 154
// Combinators in this file: 182
object While extends Benchmark {
override def toString() = "While" 
val combinatorCount = 182
val prog = Seq(
 // FUN0While.main
appBuilder( // 0
ptrBuilder(59),
ptrBuilder(58),
intBuilder(5),
comBuilder(1,0,List(0)),
),
appBuilder( // 1
comBuilder(3,2,List(2, 0, 1)),
intBuilder(5),
intBuilder(0),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)),
intBuilder(4),
intBuilder(0),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 5
comBuilder(3,2,List(2, 0, 1)),
intBuilder(3),
intBuilder(17),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(5),
ptrBuilder(4),
),
appBuilder( // 7
comBuilder(3,2,List(2, 0, 1)),
intBuilder(2),
intBuilder(0),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(3,2,List(2, 0, 1)),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 10
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
intBuilder(0),
),
appBuilder( // 12
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 13
comBuilder(5,1,List(2, 0)),
intBuilder(1),
),
appBuilder( // 14
comBuilder(5,1,List(4, 0)),
intBuilder(4),
),
appBuilder( // 15
comBuilder(6,2,List(4, 0, 1)),
ptrBuilder(14),
ptrBuilder(13),
),
appBuilder( // 16
ptrBuilder(150),
intBuilder(4),
ptrBuilder(15),
),
appBuilder( // 17
comBuilder(5,1,List(2, 0)),
intBuilder(1),
),
appBuilder( // 18
comBuilder(5,1,List(4, 0)),
intBuilder(5),
),
appBuilder( // 19
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
ptrBuilder(150),
intBuilder(5),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(5,1,List(2, 0)),
intBuilder(0),
),
appBuilder( // 22
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 23
ptrBuilder(152),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 24
ptrBuilder(149),
ptrBuilder(23),
ptrBuilder(20),
comBuilder(5,0,List(3)),
),
appBuilder( // 25
comBuilder(5,1,List(2, 0)),
intBuilder(1),
),
appBuilder( // 26
comBuilder(5,1,List(4, 0)),
intBuilder(2),
),
appBuilder( // 27
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 28
ptrBuilder(150),
intBuilder(2),
ptrBuilder(27),
),
appBuilder( // 29
comBuilder(5,1,List(4, 0)),
intBuilder(1),
),
appBuilder( // 30
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 31
comBuilder(6,2,List(4, 0, 1)),
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
ptrBuilder(150),
intBuilder(0),
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(32),
ptrBuilder(28),
),
appBuilder( // 34
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 35
comBuilder(5,1,List(4, 0)),
intBuilder(1),
),
appBuilder( // 36
ptrBuilder(153),
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
comBuilder(7,2,List(6, 0, 1)),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(1,0,List(0)),
ptrBuilder(37),
ptrBuilder(33),
),
appBuilder( // 39
comBuilder(5,1,List(4, 0)),
intBuilder(4),
),
appBuilder( // 40
ptrBuilder(150),
intBuilder(1),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(5,1,List(4, 0)),
intBuilder(3),
),
appBuilder( // 42
ptrBuilder(150),
intBuilder(0),
ptrBuilder(41),
),
appBuilder( // 43
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(42),
ptrBuilder(40),
),
appBuilder( // 44
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(43),
ptrBuilder(38),
),
appBuilder( // 45
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(44),
),
appBuilder( // 46
comBuilder(1,0,List(0)),
ptrBuilder(45),
ptrBuilder(24),
),
appBuilder( // 47
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(46),
ptrBuilder(16),
),
appBuilder( // 48
comBuilder(5,1,List(2, 0)),
intBuilder(0),
),
appBuilder( // 49
comBuilder(5,1,List(4, 0)),
intBuilder(4),
),
appBuilder( // 50
ptrBuilder(152),
ptrBuilder(49),
ptrBuilder(48),
),
appBuilder( // 51
ptrBuilder(151),
ptrBuilder(50),
),
appBuilder( // 52
comBuilder(7,2,List(6, 0, 1)),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(1,0,List(0)),
ptrBuilder(52),
ptrBuilder(47),
),
appBuilder( // 54
comBuilder(5,1,List(4, 0)),
intBuilder(3),
),
appBuilder( // 55
ptrBuilder(150),
intBuilder(4),
ptrBuilder(54),
),
appBuilder( // 56
comBuilder(7,2,List(3, 0, 1)),
ptrBuilder(55),
),
appBuilder( // 57
comBuilder(1,0,List(0)),
ptrBuilder(56),
ptrBuilder(53),
),
appBuilder( // 58
ptrBuilder(63),
ptrBuilder(57),
ptrBuilder(12),
),
 // FUN1While.value
appBuilder( // 59
comBuilder(5,16,List(2, 0, 1, 3, 4)),
errorBuilder(42),
ptrBuilder(62),
),
appBuilder( // 60
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(59),
),
appBuilder( // 61
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)),
prmBuilder("=="),
),
appBuilder( // 62
comBuilder(4,15,List(0, 1, 3, 2, 3)),
comBuilder(5,54,List(3, 0, 1, 2, 4, 2)),
ptrBuilder(61),
ptrBuilder(60),
),
 // FUN2While.ssos
appBuilder( // 63
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(64),
comBuilder(4,2,List(3, 0, 1)),
),
 // FUN3While.run
appBuilder( // 64
comBuilder(3,2,List(2, 0, 1)),
comBuilder(1,0,List(0)),
ptrBuilder(65),
),
appBuilder( // 65
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(64),
ptrBuilder(66),
),
 // FUN4While.sosstm
appBuilder( // 66
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(78),
comBuilder(3,1,List(1, 0)),
ptrBuilder(70),
),
appBuilder( // 67
comBuilder(4,16,List(0, 3, 1, 2, 3)),
comBuilder(7,2,List(3, 0, 1)),
comBuilder(7,2,List(6, 0, 1)),
),
appBuilder( // 68
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(149),
),
appBuilder( // 69
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(68),
ptrBuilder(67),
comBuilder(5,0,List(3)),
),
appBuilder( // 70
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(69),
),
appBuilder( // 71
comBuilder(6,42,List(0, 3, 1, 2, 4, 5)),
ptrBuilder(109),
),
appBuilder( // 72
comBuilder(4,7,List(0, 1, 3, 2)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(7,2,List(3, 0, 1)),
),
appBuilder( // 73
comBuilder(5,14,List(0, 3, 2, 1, 4)),
ptrBuilder(66),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 74
comBuilder(5,37,List(0, 2, 3, 4, 1, 4)),
ptrBuilder(73),
ptrBuilder(72),
),
appBuilder( // 75
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(95),
comBuilder(3,1,List(1, 0)),
),
appBuilder( // 76
comBuilder(5,42,List(0, 4, 2, 1, 2, 3)),
ptrBuilder(79),
ptrBuilder(75),
),
appBuilder( // 77
comBuilder(4,15,List(2, 0, 3, 1, 3)),
ptrBuilder(76),
ptrBuilder(74),
),
appBuilder( // 78
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(4,48,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(77),
ptrBuilder(71),
ptrBuilder(146),
),
 // FUN5While.aval
appBuilder( // 79
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(89),
ptrBuilder(80),
),
appBuilder( // 80
comBuilder(4,4,List(0, 1, 3, 2)),
ptrBuilder(59),
),
appBuilder( // 81
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(79),
),
appBuilder( // 82
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(90),
ptrBuilder(79),
),
appBuilder( // 83
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(82),
ptrBuilder(81),
),
appBuilder( // 84
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)),
ptrBuilder(83),
ptrBuilder(94),
),
appBuilder( // 85
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(79),
),
appBuilder( // 86
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(90),
ptrBuilder(79),
),
appBuilder( // 87
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(86),
ptrBuilder(85),
),
appBuilder( // 88
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)),
ptrBuilder(87),
ptrBuilder(91),
),
appBuilder( // 89
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
comBuilder(4,38,List(0, 1, 3, 3, 2, 3)),
ptrBuilder(88),
ptrBuilder(84),
),
 // FUN6While.seqq
appBuilder( // 90
comBuilder(4,7,List(1, 0, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
),
 // FUN7While.add
appBuilder( // 91
comBuilder(5,12,List(0, 3, 1, 4, 2)),
ptrBuilder(92),
prmBuilder("+"),
),
 // FUN8While.int
appBuilder( // 92
comBuilder(4,14,List(0, 2, 3, 3, 1)),
ptrBuilder(93),
intBuilder(0),
),
appBuilder( // 93
comBuilder(4,14,List(2, 0, 1, 3, 2)),
prmBuilder("=="),
intBuilder(0),
),
 // FUN9While.sub
appBuilder( // 94
comBuilder(5,12,List(0, 3, 1, 4, 2)),
ptrBuilder(92),
prmBuilder("-"),
),
 // FUN10While.update
appBuilder( // 95
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(107),
ptrBuilder(106),
),
appBuilder( // 96
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(108),
),
appBuilder( // 97
comBuilder(5,28,List(0, 4, 1, 2, 3, 3)),
ptrBuilder(95),
),
appBuilder( // 98
comBuilder(4,16,List(0, 2, 1, 2, 3)),
ptrBuilder(97),
ptrBuilder(96),
),
appBuilder( // 99
comBuilder(6,28,List(0, 2, 1, 3, 5, 4)),
ptrBuilder(95),
),
appBuilder( // 100
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(6,30,List(0, 4, 1, 2, 5, 3)),
ptrBuilder(99),
ptrBuilder(108),
),
appBuilder( // 101
comBuilder(6,28,List(2, 0, 1, 3, 5, 4)),
prmBuilder("=="),
),
appBuilder( // 102
comBuilder(6,44,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,30,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(101),
),
appBuilder( // 103
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(102),
ptrBuilder(100),
),
appBuilder( // 104
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,56,List(3, 0, 1, 4, 2, 4)),
),
appBuilder( // 105
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(104),
ptrBuilder(103),
),
appBuilder( // 106
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(105),
ptrBuilder(98),
),
appBuilder( // 107
comBuilder(5,44,List(1, 3, 0, 2, 3, 4)),
comBuilder(2,0,List(0)),
),
 // FUN11While.upd
appBuilder( // 108
comBuilder(6,54,List(2, 0, 1, 3, 4, 5)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN12While.bval
appBuilder( // 109
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(138),
ptrBuilder(113),
),
appBuilder( // 110
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(109),
),
appBuilder( // 111
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(90),
ptrBuilder(109),
),
appBuilder( // 112
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(111),
ptrBuilder(110),
),
appBuilder( // 113
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)),
ptrBuilder(112),
ptrBuilder(144),
),
appBuilder( // 114
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(79),
),
appBuilder( // 115
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(90),
ptrBuilder(79),
),
appBuilder( // 116
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(115),
ptrBuilder(114),
),
appBuilder( // 117
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)),
ptrBuilder(116),
ptrBuilder(143),
),
appBuilder( // 118
comBuilder(6,43,List(4, 0, 1, 5, 3, 2)),
prmBuilder("<"),
intBuilder(2),
comBuilder(2,0,List(0)),
),
appBuilder( // 119
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)),
ptrBuilder(118),
),
appBuilder( // 120
comBuilder(4,16,List(0, 3, 1, 2, 3)),
ptrBuilder(119),
ptrBuilder(117),
),
appBuilder( // 121
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 122
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(79),
),
appBuilder( // 123
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(90),
ptrBuilder(79),
),
appBuilder( // 124
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(123),
ptrBuilder(122),
),
appBuilder( // 125
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)),
ptrBuilder(124),
ptrBuilder(142),
),
appBuilder( // 126
comBuilder(5,14,List(0, 4, 2, 1, 3)),
ptrBuilder(109),
ptrBuilder(139),
),
appBuilder( // 127
comBuilder(6,43,List(4, 0, 1, 5, 3, 2)),
prmBuilder("<"),
intBuilder(5),
comBuilder(2,0,List(1)),
),
appBuilder( // 128
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)),
ptrBuilder(127),
),
appBuilder( // 129
comBuilder(4,16,List(0, 3, 1, 2, 3)),
ptrBuilder(128),
ptrBuilder(126),
),
appBuilder( // 130
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(4),
),
appBuilder( // 131
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(130),
ptrBuilder(129),
),
appBuilder( // 132
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)),
ptrBuilder(131),
),
appBuilder( // 133
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)),
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 134
comBuilder(5,53,List(0, 1, 3, 2, 3, 4)),
ptrBuilder(133),
ptrBuilder(132),
ptrBuilder(125),
),
appBuilder( // 135
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,48,List(0, 3, 1, 3, 3, 2)),
),
appBuilder( // 136
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(135),
),
appBuilder( // 137
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
ptrBuilder(136),
ptrBuilder(134),
ptrBuilder(121),
ptrBuilder(120),
),
appBuilder( // 138
comBuilder(5,56,List(1, 0, 2, 4, 3, 4)),
ptrBuilder(137),
),
 // FUN13While.notk
appBuilder( // 139
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(140),
ptrBuilder(141),
),
 // FUN14While.bool
appBuilder( // 140
comBuilder(4,15,List(2, 3, 0, 3, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(1)),
),
 // FUN15Data.Bool.not
appBuilder( // 141
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
comBuilder(2,0,List(0)),
),
 // FUN16While.leq
appBuilder( // 142
comBuilder(5,12,List(0, 3, 1, 4, 2)),
ptrBuilder(140),
prmBuilder("<="),
),
 // FUN17While.eq
appBuilder( // 143
comBuilder(5,12,List(0, 3, 1, 4, 2)),
ptrBuilder(140),
prmBuilder("=="),
),
 // FUN18While.andk
appBuilder( // 144
comBuilder(5,12,List(0, 1, 3, 4, 2)),
ptrBuilder(140),
ptrBuilder(145),
),
 // FUN19Data.Bool.&&
appBuilder( // 145
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN20While.cond
appBuilder( // 146
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(148),
ptrBuilder(147),
),
appBuilder( // 147
comBuilder(3,2,List(0, 2, 1)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 148
comBuilder(6,40,List(5, 0, 4, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
 // FUN21While.If
appBuilder( // 149
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(7,4,List(4, 0, 1, 2)),
),
 // FUN22While.Ass
appBuilder( // 150
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(7,2,List(0, 1, 2)),
),
 // FUN23While.Neg
appBuilder( // 151
comBuilder(4,6,List(3, 0, 1, 2)),
intBuilder(4),
comBuilder(2,1,List(1, 0)),
),
 // FUN24While.Eq
appBuilder( // 152
comBuilder(5,16,List(4, 0, 1, 2, 3)),
intBuilder(1),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN25While.Le
appBuilder( // 153
comBuilder(5,16,List(4, 0, 1, 2, 3)),
intBuilder(3),
comBuilder(3,2,List(2, 0, 1)),
),
)
}