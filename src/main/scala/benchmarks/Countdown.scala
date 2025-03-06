package benchmarks
import common.Helper._
 
// Functions in this file: 33
// Apps in this file: 140
// Combinators in this file: 200
object Countdown extends Benchmark {
override def toString() = "Countdown" 
val combinatorCount = 200
val prog = Seq(
 // FUN0Countdown.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(10),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(4),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)), // XXX
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
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(6),
),
 // FUN2Countdown.solutions
appBuilder( // 8
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(9),
ptrBuilder(15),
ptrBuilder(125),
),
 // FUN3Data.List_Type.concatMap
appBuilder( // 9
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(10),
),
 // FUN4Data.List_Type.++
appBuilder( // 12
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 14
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(13),
),
 // FUN5Countdown.solns
appBuilder( // 15
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(16),
ptrBuilder(22),
),
 // FUN6Countdown.preImage
appBuilder( // 16
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(21),
),
appBuilder( // 17
comBuilder(4,6,List(0, 3, 1, 2)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 18
comBuilder(6,28,List(5, 0, 1, 2, 3, 4)), // XXX(XX)X
prmBuilder("=="),
),
appBuilder( // 19
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(5,42,List(0, 1, 3, 2, 3, 4)), // XXX(XXX)
ptrBuilder(18),
),
appBuilder( // 20
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(5,53,List(3, 0, 2, 1, 2, 4)), // X(XX(XX)X)
ptrBuilder(19),
ptrBuilder(17),
),
appBuilder( // 21
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(20),
),
 // FUN7Countdown.results
appBuilder( // 22
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(27),
),
appBuilder( // 23
comBuilder(3,5,List(2, 0, 1, 1)), // X(XX)X
ptrBuilder(124),
),
appBuilder( // 24
comBuilder(6,13,List(5, 0, 1, 3, 2)), // X(X(XX))X
ptrBuilder(23),
comBuilder(1,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 25
comBuilder(6,49,List(0, 1, 2, 3, 4, 5)), // XX(X(XXX))
ptrBuilder(9),
ptrBuilder(30),
ptrBuilder(111),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 26
comBuilder(5,30,List(0, 4, 1, 2, 4, 3)), // XX(XXX)X
ptrBuilder(28),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(26),
ptrBuilder(24),
),
 // FUN8NanoPrelude.null
appBuilder( // 28
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(29),
),
appBuilder( // 29
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN9Countdown.combinedResults
appBuilder( // 30
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(5,39,List(0, 1, 2, 3, 2, 4)), // XX(XX)(XX)
ptrBuilder(32),
ptrBuilder(36),
ptrBuilder(22),
),
 // FUN10Countdown.concatProdWith
appBuilder( // 32
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(35),
),
appBuilder( // 33
comBuilder(5,19,List(0, 1, 2, 4, 3)), // X(X(XX)X)
ptrBuilder(12),
ptrBuilder(9),
),
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(5,42,List(0, 2, 3, 1, 4, 2)), // XXX(XXX)
ptrBuilder(33),
),
appBuilder( // 35
comBuilder(6,46,List(4, 0, 1, 2, 3, 5)), // XX(XXXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(34),
),
 // FUN11Countdown.combine
appBuilder( // 36
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(43),
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(110),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(109),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(108),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(107),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
ptrBuilder(9),
ptrBuilder(44),
),
appBuilder( // 42
comBuilder(6,23,List(0, 2, 3, 4, 5, 1)), // XXXXXX
ptrBuilder(41),
ptrBuilder(40),
),
appBuilder( // 43
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
ptrBuilder(42),
),
 // FUN12Countdown.combi
appBuilder( // 44
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(50),
ptrBuilder(48),
),
appBuilder( // 45
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(81),
),
appBuilder( // 46
comBuilder(6,32,List(5, 0, 4, 1, 2, 3)), // X(XXXX)X
ptrBuilder(80),
),
appBuilder( // 47
comBuilder(6,29,List(0, 1, 4, 2, 5, 3)), // X(XX)(XX)X
comBuilder(6,33,List(5, 0, 1, 3, 3, 2)), // X(X(XX)X)X
),
appBuilder( // 48
comBuilder(6,29,List(0, 1, 4, 2, 5, 3)), // X(XX)(XX)X
ptrBuilder(47),
ptrBuilder(46),
ptrBuilder(45),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 49
comBuilder(5,9,List(0, 4, 2, 3, 1)), // XXXXX
ptrBuilder(51),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 50
comBuilder(5,44,List(0, 1, 3, 2, 3, 4)), // X(XX)(XXX)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(49),
),
 // FUN13Countdown.valid
appBuilder( // 51
comBuilder(5,18,List(2, 0, 3, 1, 4)), // X(XXXX)
ptrBuilder(63),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 52
comBuilder(6,51,List(5, 0, 3, 4, 1, 2)), // X(XXXXX)
ptrBuilder(65),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 53
comBuilder(6,42,List(4, 0, 1, 2, 3, 5)), // XXX(XXX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 54
comBuilder(5,21,List(4, 0, 2, 1, 3)), // X(X(XXX))
ptrBuilder(64),
prmBuilder("<="),
),
appBuilder( // 55
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)), // XXXX(XX)
prmBuilder("=="),
intBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 56
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(55),
ptrBuilder(54),
),
appBuilder( // 57
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 58
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(57),
ptrBuilder(56),
),
appBuilder( // 59
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 60
comBuilder(6,52,List(0, 1, 2, 4, 3, 5)), // X(X(XX)XX)
ptrBuilder(59),
comBuilder(5,37,List(0, 2, 3, 4, 4, 1)), // XXXX(XX)
ptrBuilder(58),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 61
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,48,List(0, 3, 1, 3, 3, 2)), // XX(XX(XX))
),
appBuilder( // 62
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
ptrBuilder(61),
),
appBuilder( // 63
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(62),
ptrBuilder(60),
ptrBuilder(53),
ptrBuilder(52),
),
 // FUN14Data.Bool.not
appBuilder( // 64
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN15NanoPrelude.mod
appBuilder( // 65
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(66),
comBuilder(2,0,List(1)), // X
),
 // FUN16NanoPrelude.divMod
appBuilder( // 66
comBuilder(5,19,List(0, 1, 2, 4, 3)), // X(X(XX)X)
yBuilder(),
comBuilder(4,42,List(0, 2, 3, 3, 1, 3)), // XXX(XXX)
ptrBuilder(79),
prmBuilder("+"),
),
appBuilder( // 67
comBuilder(2,2,List(1, 0, 1)), // XXX
prmBuilder("+"),
),
appBuilder( // 68
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("-"),
),
appBuilder( // 69
comBuilder(6,40,List(5, 4, 0, 1, 2, 3)), // X(XXX)(XX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 70
comBuilder(5,42,List(2, 0, 3, 1, 3, 4)), // XXX(XXX)
prmBuilder("<="),
comBuilder(3,2,List(2, 1, 0)), // XXX
),
appBuilder( // 71
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(4,42,List(0, 3, 2, 1, 3, 2)), // XXX(XXX)
ptrBuilder(70),
ptrBuilder(69),
ptrBuilder(68),
),
appBuilder( // 72
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(71),
ptrBuilder(67),
),
appBuilder( // 73
comBuilder(4,6,List(1, 3, 0, 2)), // XX(XX)
ptrBuilder(72),
),
appBuilder( // 74
comBuilder(5,16,List(4, 0, 2, 1, 3)), // XX(XXX)
intBuilder(1),
prmBuilder("-"),
),
appBuilder( // 75
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 76
comBuilder(5,37,List(4, 0, 3, 1, 2, 4)), // XXXX(XX)
prmBuilder("<="),
),
appBuilder( // 77
comBuilder(4,29,List(0, 1, 3, 2, 3, 3)), // X(XX)(XX)X
ptrBuilder(76),
ptrBuilder(75),
ptrBuilder(74),
),
appBuilder( // 78
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)), // XXXX(XX)
prmBuilder("<="),
),
appBuilder( // 79
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)), // X(XX)(XXX)
ptrBuilder(78),
ptrBuilder(77),
ptrBuilder(73),
),
 // FUN17Countdown.App
appBuilder( // 80
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
intBuilder(5),
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
),
 // FUN18Countdown.apply
appBuilder( // 81
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(98),
ptrBuilder(97),
ptrBuilder(87),
),
appBuilder( // 82
comBuilder(4,7,List(3, 0, 1, 2)), // X(XXX)
ptrBuilder(106),
),
appBuilder( // 83
comBuilder(6,42,List(4, 0, 1, 2, 3, 5)), // XXX(XXX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 84
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(83),
ptrBuilder(82),
),
appBuilder( // 85
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)), // XX(X(XXX))
),
appBuilder( // 86
comBuilder(5,24,List(0, 1, 4, 3, 2, 4)), // X(XX)XXX
ptrBuilder(85),
),
appBuilder( // 87
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(86),
ptrBuilder(84),
prmBuilder("+"),
),
appBuilder( // 88
comBuilder(4,7,List(3, 1, 0, 2)), // X(XXX)
prmBuilder("-"),
),
appBuilder( // 89
comBuilder(6,37,List(4, 0, 1, 2, 3, 5)), // XXXX(XX)
prmBuilder("=="),
intBuilder(3),
intBuilder(0),
),
appBuilder( // 90
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(89),
ptrBuilder(88),
),
appBuilder( // 91
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 92
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(91),
ptrBuilder(90),
),
appBuilder( // 93
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)), // XX(X(XXX))
),
appBuilder( // 94
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)), // X(XX)XXX
ptrBuilder(93),
),
appBuilder( // 95
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(94),
ptrBuilder(92),
ptrBuilder(99),
),
appBuilder( // 96
comBuilder(5,42,List(3, 0, 1, 2, 3, 4)), // XXX(XXX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 97
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(96),
ptrBuilder(95),
),
appBuilder( // 98
comBuilder(5,57,List(1, 0, 2, 4, 3, 4)), // X(X(XX)(XX))
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
),
 // FUN19Countdown.mul
appBuilder( // 99
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(105),
ptrBuilder(104),
),
appBuilder( // 100
comBuilder(4,26,List(0, 2, 1, 2, 3, 1)), // X(XXX)XX
ptrBuilder(99),
prmBuilder("+"),
),
appBuilder( // 101
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(100),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 102
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,51,List(0, 4, 1, 2, 3, 2)), // X(XXXXX)
),
appBuilder( // 103
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)), // X(XX)XXX
ptrBuilder(102),
ptrBuilder(101),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 104
comBuilder(5,14,List(0, 4, 1, 2, 3)), // XXX(XX)
ptrBuilder(66),
intBuilder(2),
ptrBuilder(103),
),
appBuilder( // 105
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(1),
),
 // FUN20NanoPrelude.div
appBuilder( // 106
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(66),
comBuilder(2,0,List(0)), // X
),
 // FUN21Countdown.Add
appBuilder( // 107
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(1,0,List(0)), // X
),
 // FUN22Countdown.Sub
appBuilder( // 108
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(3),
comBuilder(1,0,List(0)), // X
),
 // FUN23Countdown.Mul
appBuilder( // 109
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(2),
comBuilder(1,0,List(0)), // X
),
 // FUN24Countdown.Div
appBuilder( // 110
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
comBuilder(1,0,List(0)), // X
),
 // FUN25Countdown.split
appBuilder( // 111
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(118),
),
appBuilder( // 112
comBuilder(4,5,List(3, 0, 2, 1)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(1,0,List(0)), // X
),
appBuilder( // 113
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)), // X(X(XX))(XX)
ptrBuilder(119),
ptrBuilder(122),
ptrBuilder(112),
ptrBuilder(111),
),
appBuilder( // 114
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 115
comBuilder(4,5,List(3, 0, 1, 2)), // X(XX)X
ptrBuilder(114),
),
appBuilder( // 116
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(115),
),
appBuilder( // 117
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(116),
ptrBuilder(113),
),
appBuilder( // 118
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(28),
ptrBuilder(117),
comBuilder(2,0,List(0)), // X
),
 // FUN26NanoPrelude.map
appBuilder( // 119
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(121),
),
appBuilder( // 120
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 121
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(120),
),
 // FUN27Countdown.cross
appBuilder( // 122
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(123),
),
appBuilder( // 123
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
comBuilder(5,15,List(4, 0, 2, 1, 3)), // X(XX)(XX)
),
 // FUN28Countdown.Val
appBuilder( // 124
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN29Countdown.choices
appBuilder( // 125
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
ptrBuilder(9),
ptrBuilder(126),
ptrBuilder(136),
),
 // FUN30Countdown.perms
appBuilder( // 126
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(128),
ptrBuilder(127),
),
appBuilder( // 127
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(9),
ptrBuilder(129),
ptrBuilder(126),
),
appBuilder( // 128
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN31Countdown.interleave
appBuilder( // 129
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)), // X(XX(XX)X)
yBuilder(),
ptrBuilder(135),
ptrBuilder(132),
ptrBuilder(130),
),
appBuilder( // 130
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(119),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 131
comBuilder(4,58,List(0, 0, 1, 0, 2, 3)), // X(XX(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 132
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(131),
),
appBuilder( // 133
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 134
comBuilder(5,5,List(4, 0, 2, 1)), // X(XX)X
ptrBuilder(133),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 135
comBuilder(6,45,List(5, 0, 1, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(134),
),
 // FUN32Countdown.subs
appBuilder( // 136
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(139),
ptrBuilder(138),
),
appBuilder( // 137
comBuilder(5,47,List(0, 4, 1, 2, 3, 4)), // XX(X(XX)X)
ptrBuilder(12),
ptrBuilder(119),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 138
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(137),
ptrBuilder(136),
),
appBuilder( // 139
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
)
}