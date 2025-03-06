package benchmarks
import common.Helper._
 
// Functions in this file: 25
// Apps in this file: 149
// Combinators in this file: 184
object While extends Benchmark {
override def toString() = "While" 
val combinatorCount = 184
val prog = Seq(
 // FUN0While.main
appBuilder( // 0
ptrBuilder(55),
ptrBuilder(54),
intBuilder(5),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 1
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(5),
intBuilder(0),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(4),
intBuilder(0),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 5
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(3),
intBuilder(17),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(5),
ptrBuilder(4),
),
appBuilder( // 7
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(2),
intBuilder(0),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
intBuilder(0),
),
appBuilder( // 10
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(0),
),
appBuilder( // 12
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 13
comBuilder(5,1,List(2, 0)), // XX
intBuilder(1),
),
appBuilder( // 14
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 15
comBuilder(6,2,List(4, 0, 1)), // XXX
ptrBuilder(14),
ptrBuilder(13),
),
appBuilder( // 16
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(15),
),
appBuilder( // 17
comBuilder(5,1,List(2, 0)), // XX
intBuilder(1),
),
appBuilder( // 18
comBuilder(5,1,List(4, 0)), // XX
intBuilder(5),
),
appBuilder( // 19
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(5),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(5,1,List(2, 0)), // XX
intBuilder(0),
),
appBuilder( // 22
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 23
ptrBuilder(147),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 24
ptrBuilder(145),
ptrBuilder(23),
ptrBuilder(20),
comBuilder(5,0,List(3)), // X
),
appBuilder( // 25
comBuilder(5,1,List(2, 0)), // XX
intBuilder(1),
),
appBuilder( // 26
comBuilder(5,1,List(4, 0)), // XX
intBuilder(2),
),
appBuilder( // 27
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 28
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(27),
),
appBuilder( // 29
comBuilder(5,1,List(4, 0)), // XX
intBuilder(1),
),
appBuilder( // 30
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 31
comBuilder(6,2,List(4, 0, 1)), // XXX
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(32),
ptrBuilder(28),
),
appBuilder( // 34
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 35
comBuilder(5,1,List(4, 0)), // XX
intBuilder(1),
),
appBuilder( // 36
ptrBuilder(148),
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
comBuilder(7,2,List(6, 0, 1)), // XXX
ptrBuilder(36),
ptrBuilder(33),
),
appBuilder( // 38
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 39
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(5,1,List(4, 0)), // XX
intBuilder(3),
),
appBuilder( // 41
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(41),
ptrBuilder(39),
),
appBuilder( // 43
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(42),
ptrBuilder(37),
),
appBuilder( // 44
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(43),
ptrBuilder(24),
),
appBuilder( // 45
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(44),
ptrBuilder(16),
),
appBuilder( // 46
comBuilder(5,1,List(2, 0)), // XX
intBuilder(0),
),
appBuilder( // 47
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 48
ptrBuilder(147),
ptrBuilder(47),
ptrBuilder(46),
),
appBuilder( // 49
ptrBuilder(146),
ptrBuilder(48),
),
appBuilder( // 50
comBuilder(7,2,List(6, 0, 1)), // XXX
ptrBuilder(49),
ptrBuilder(45),
),
appBuilder( // 51
comBuilder(5,1,List(4, 0)), // XX
intBuilder(3),
),
appBuilder( // 52
comBuilder(7,2,List(2, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(7,2,List(3, 0, 1)), // XXX
ptrBuilder(52),
ptrBuilder(50),
),
appBuilder( // 54
ptrBuilder(59),
ptrBuilder(53),
ptrBuilder(12),
),
 // FUN1While.value
appBuilder( // 55
comBuilder(5,16,List(2, 0, 1, 3, 4)), // XX(XXX)
errorBuilder(42),
ptrBuilder(58),
),
appBuilder( // 56
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(55),
),
appBuilder( // 57
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)), // XXXX(XX)
prmBuilder("=="),
),
appBuilder( // 58
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,54,List(3, 0, 1, 2, 4, 2)), // X(X(XXX)X)
ptrBuilder(57),
ptrBuilder(56),
),
 // FUN2While.ssos
appBuilder( // 59
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(60),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN3While.run
appBuilder( // 60
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(1,0,List(0)), // X
ptrBuilder(61),
),
appBuilder( // 61
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(60),
ptrBuilder(62),
),
 // FUN4While.sosstm
appBuilder( // 62
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(74),
comBuilder(3,1,List(1, 0)), // XX
ptrBuilder(66),
),
appBuilder( // 63
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
comBuilder(7,2,List(3, 0, 1)), // XXX
comBuilder(7,2,List(6, 0, 1)), // XXX
),
appBuilder( // 64
comBuilder(6,53,List(0, 1, 4, 2, 5, 3)), // X(XX(XX)X)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(145),
),
appBuilder( // 65
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(64),
ptrBuilder(63),
comBuilder(5,0,List(3)), // X
),
appBuilder( // 66
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(65),
),
appBuilder( // 67
comBuilder(6,42,List(0, 3, 2, 1, 4, 5)), // XXX(XXX)
ptrBuilder(105),
),
appBuilder( // 68
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(7,2,List(3, 0, 1)), // XXX
),
appBuilder( // 69
comBuilder(5,14,List(0, 3, 2, 1, 4)), // XXX(XX)
ptrBuilder(62),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 70
comBuilder(5,37,List(0, 2, 3, 4, 1, 4)), // XXXX(XX)
ptrBuilder(69),
ptrBuilder(68),
),
appBuilder( // 71
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(91),
comBuilder(3,1,List(1, 0)), // XX
),
appBuilder( // 72
comBuilder(5,42,List(0, 4, 2, 1, 2, 3)), // XXX(XXX)
ptrBuilder(75),
ptrBuilder(71),
),
appBuilder( // 73
comBuilder(4,15,List(2, 0, 3, 1, 3)), // X(XX)(XX)
ptrBuilder(72),
ptrBuilder(70),
),
appBuilder( // 74
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,47,List(0, 3, 1, 2, 3, 3)), // XX(X(XX)X)
ptrBuilder(73),
ptrBuilder(67),
ptrBuilder(142),
),
 // FUN5While.aval
appBuilder( // 75
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(85),
ptrBuilder(76),
),
appBuilder( // 76
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(55),
),
appBuilder( // 77
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(75),
),
appBuilder( // 78
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(75),
),
appBuilder( // 79
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(78),
ptrBuilder(77),
),
appBuilder( // 80
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)), // XXXX(XX)
ptrBuilder(79),
ptrBuilder(90),
),
appBuilder( // 81
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(75),
),
appBuilder( // 82
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(75),
),
appBuilder( // 83
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(82),
ptrBuilder(81),
),
appBuilder( // 84
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)), // XXXX(XX)
ptrBuilder(83),
ptrBuilder(87),
),
appBuilder( // 85
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(4,38,List(0, 1, 3, 3, 2, 3)), // X(XX)X(XX)
ptrBuilder(84),
ptrBuilder(80),
),
 // FUN6While.seqq
appBuilder( // 86
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
 // FUN7While.add
appBuilder( // 87
comBuilder(5,12,List(0, 3, 1, 4, 2)), // X(XXX)X
ptrBuilder(88),
prmBuilder("+"),
),
 // FUN8While.int
appBuilder( // 88
comBuilder(5,38,List(0, 1, 3, 4, 4, 2)), // X(XX)X(XX)
ptrBuilder(89),
comBuilder(1,0,List(0)), // X
intBuilder(0),
),
appBuilder( // 89
comBuilder(4,14,List(2, 0, 1, 3, 2)), // XXX(XX)
prmBuilder("=="),
intBuilder(0),
),
 // FUN9While.sub
appBuilder( // 90
comBuilder(5,12,List(0, 3, 1, 4, 2)), // X(XXX)X
ptrBuilder(88),
prmBuilder("-"),
),
 // FUN10While.update
appBuilder( // 91
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(103),
ptrBuilder(102),
),
appBuilder( // 92
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(104),
),
appBuilder( // 93
comBuilder(5,28,List(0, 4, 1, 2, 3, 3)), // XXX(XX)X
ptrBuilder(91),
),
appBuilder( // 94
comBuilder(4,16,List(0, 2, 1, 2, 3)), // XX(XXX)
ptrBuilder(93),
ptrBuilder(92),
),
appBuilder( // 95
comBuilder(6,28,List(0, 2, 1, 3, 5, 4)), // XXX(XX)X
ptrBuilder(91),
),
appBuilder( // 96
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(6,30,List(0, 4, 1, 2, 5, 3)), // XX(XXX)X
ptrBuilder(95),
ptrBuilder(104),
),
appBuilder( // 97
comBuilder(6,28,List(4, 0, 1, 2, 5, 3)), // XXX(XX)X
prmBuilder("=="),
),
appBuilder( // 98
comBuilder(6,44,List(0, 1, 2, 3, 4, 5)), // X(XX)(XXX)
comBuilder(5,26,List(0, 1, 2, 4, 3, 4)), // X(XXX)XX
ptrBuilder(97),
),
appBuilder( // 99
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(98),
ptrBuilder(96),
),
appBuilder( // 100
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)), // X(XX)X(XX)
comBuilder(5,56,List(3, 0, 1, 4, 2, 4)), // X(XXX(XX))
),
appBuilder( // 101
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)), // X(XX)X(XX)
ptrBuilder(100),
ptrBuilder(99),
),
appBuilder( // 102
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(101),
ptrBuilder(94),
),
appBuilder( // 103
comBuilder(5,44,List(1, 3, 0, 2, 3, 4)), // X(XX)(XXX)
comBuilder(2,0,List(0)), // X
),
 // FUN11While.upd
appBuilder( // 104
comBuilder(6,54,List(2, 0, 1, 3, 4, 5)), // X(X(XXX)X)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN12While.bval
appBuilder( // 105
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(134),
ptrBuilder(109),
),
appBuilder( // 106
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(105),
),
appBuilder( // 107
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(105),
),
appBuilder( // 108
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(107),
ptrBuilder(106),
),
appBuilder( // 109
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)), // XXXX(XX)
ptrBuilder(108),
ptrBuilder(140),
),
appBuilder( // 110
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(75),
),
appBuilder( // 111
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(75),
),
appBuilder( // 112
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(111),
ptrBuilder(110),
),
appBuilder( // 113
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)), // XXXX(XX)
ptrBuilder(112),
ptrBuilder(139),
),
appBuilder( // 114
comBuilder(6,43,List(4, 0, 1, 5, 3, 2)), // XXX(X(XX))
prmBuilder("<"),
intBuilder(2),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 115
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)), // XXXX(XX)
ptrBuilder(114),
),
appBuilder( // 116
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(115),
ptrBuilder(113),
),
appBuilder( // 117
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 118
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(75),
),
appBuilder( // 119
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(86),
ptrBuilder(75),
),
appBuilder( // 120
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(119),
ptrBuilder(118),
),
appBuilder( // 121
comBuilder(6,37,List(0, 2, 4, 5, 1, 3)), // XXXX(XX)
ptrBuilder(120),
ptrBuilder(138),
),
appBuilder( // 122
comBuilder(5,14,List(0, 4, 2, 1, 3)), // XXX(XX)
ptrBuilder(105),
ptrBuilder(135),
),
appBuilder( // 123
comBuilder(6,43,List(4, 0, 1, 5, 3, 2)), // XXX(X(XX))
prmBuilder("<"),
intBuilder(5),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 124
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)), // XXXX(XX)
ptrBuilder(123),
),
appBuilder( // 125
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(124),
ptrBuilder(122),
),
appBuilder( // 126
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(4),
),
appBuilder( // 127
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(126),
ptrBuilder(125),
),
appBuilder( // 128
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)), // X(XX)X(XX)
comBuilder(5,37,List(0, 1, 3, 4, 4, 2)), // XXXX(XX)
ptrBuilder(127),
),
appBuilder( // 129
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 130
comBuilder(5,53,List(0, 1, 3, 2, 3, 4)), // X(XX(XX)X)
ptrBuilder(129),
ptrBuilder(128),
ptrBuilder(121),
),
appBuilder( // 131
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,48,List(0, 3, 1, 3, 3, 2)), // XX(XX(XX))
),
appBuilder( // 132
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(131),
),
appBuilder( // 133
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
ptrBuilder(132),
ptrBuilder(130),
ptrBuilder(117),
ptrBuilder(116),
),
appBuilder( // 134
comBuilder(5,56,List(1, 0, 2, 4, 3, 4)), // X(XXX(XX))
ptrBuilder(133),
),
 // FUN13While.notk
appBuilder( // 135
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(136),
ptrBuilder(137),
),
 // FUN14While.bool
appBuilder( // 136
comBuilder(4,15,List(2, 3, 0, 3, 1)), // X(XX)(XX)
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN15Data.Bool.not
appBuilder( // 137
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN16While.leq
appBuilder( // 138
comBuilder(5,12,List(0, 3, 1, 4, 2)), // X(XXX)X
ptrBuilder(136),
prmBuilder("<="),
),
 // FUN17While.eq
appBuilder( // 139
comBuilder(5,12,List(0, 3, 1, 4, 2)), // X(XXX)X
ptrBuilder(136),
prmBuilder("=="),
),
 // FUN18While.andk
appBuilder( // 140
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(136),
ptrBuilder(141),
),
 // FUN19Data.Bool.&&
appBuilder( // 141
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN20While.cond
appBuilder( // 142
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(144),
ptrBuilder(143),
),
appBuilder( // 143
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 144
comBuilder(6,40,List(5, 0, 4, 2, 1, 3)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN21While.If
appBuilder( // 145
comBuilder(5,4,List(0, 1, 2, 3)), // XXXX
comBuilder(7,4,List(4, 0, 1, 2)), // XXXX
),
 // FUN22While.Neg
appBuilder( // 146
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN23While.Eq
appBuilder( // 147
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(1),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN24While.Le
appBuilder( // 148
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(3),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
)
}