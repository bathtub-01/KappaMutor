package benchmarks
import common.Helper._
 
// Functions in this file: 31
// Apps in this file: 138
// Combinators in this file: 215
object While extends Benchmark {
override def toString() = "While" 
val combinatorCount = 215
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
ptrBuilder(134),
intBuilder(1),
),
appBuilder( // 14
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 15
ptrBuilder(136),
ptrBuilder(14),
ptrBuilder(13),
),
appBuilder( // 16
ptrBuilder(130),
intBuilder(4),
ptrBuilder(15),
),
appBuilder( // 17
ptrBuilder(134),
intBuilder(1),
),
appBuilder( // 18
comBuilder(5,1,List(4, 0)), // XX
intBuilder(5),
),
appBuilder( // 19
ptrBuilder(137),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
ptrBuilder(130),
intBuilder(5),
ptrBuilder(19),
),
appBuilder( // 21
ptrBuilder(134),
intBuilder(0),
),
appBuilder( // 22
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 23
ptrBuilder(133),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 24
ptrBuilder(129),
ptrBuilder(23),
ptrBuilder(20),
comBuilder(5,0,List(3)), // X
),
appBuilder( // 25
ptrBuilder(134),
intBuilder(1),
),
appBuilder( // 26
comBuilder(5,1,List(4, 0)), // XX
intBuilder(2),
),
appBuilder( // 27
ptrBuilder(137),
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 28
ptrBuilder(130),
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
ptrBuilder(136),
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
ptrBuilder(130),
intBuilder(0),
ptrBuilder(31),
),
appBuilder( // 33
ptrBuilder(94),
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
ptrBuilder(135),
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
ptrBuilder(130),
intBuilder(1),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(5,1,List(4, 0)), // XX
intBuilder(3),
),
appBuilder( // 41
ptrBuilder(130),
intBuilder(0),
ptrBuilder(40),
),
appBuilder( // 42
ptrBuilder(94),
ptrBuilder(41),
ptrBuilder(39),
),
appBuilder( // 43
ptrBuilder(94),
ptrBuilder(42),
ptrBuilder(37),
),
appBuilder( // 44
ptrBuilder(94),
ptrBuilder(43),
ptrBuilder(24),
),
appBuilder( // 45
ptrBuilder(94),
ptrBuilder(44),
ptrBuilder(16),
),
appBuilder( // 46
ptrBuilder(134),
intBuilder(0),
),
appBuilder( // 47
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 48
ptrBuilder(133),
ptrBuilder(47),
ptrBuilder(46),
),
appBuilder( // 49
ptrBuilder(132),
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
ptrBuilder(130),
intBuilder(4),
ptrBuilder(51),
),
appBuilder( // 53
ptrBuilder(94),
ptrBuilder(52),
ptrBuilder(50),
),
appBuilder( // 54
ptrBuilder(58),
ptrBuilder(53),
ptrBuilder(12),
),
 // FUN1While.value
appBuilder( // 55
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
errorBuilder(42),
ptrBuilder(57),
),
appBuilder( // 56
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(5,52,List(3, 0, 1, 2, 4, 2)), // X(X(XX)XX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,32,List(0, 5, 1, 2, 3, 4)), // X(XXXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
),
appBuilder( // 57
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(56),
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(55),
),
 // FUN2While.ssos
appBuilder( // 58
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(59),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN3While.run
appBuilder( // 59
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(1,0,List(0)), // X
ptrBuilder(60),
),
appBuilder( // 60
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(59),
ptrBuilder(61),
),
 // FUN4While.sosstm
appBuilder( // 61
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(69),
ptrBuilder(93),
ptrBuilder(63),
),
appBuilder( // 62
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
ptrBuilder(129),
ptrBuilder(94),
comBuilder(7,2,List(6, 0, 1)), // XXX
),
appBuilder( // 63
comBuilder(6,30,List(0, 1, 2, 5, 3, 4)), // XX(XXX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(62),
comBuilder(5,0,List(3)), // X
),
appBuilder( // 64
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,30,List(0, 1, 2, 5, 4, 3)), // XX(XXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(95),
ptrBuilder(126),
),
appBuilder( // 65
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(94),
),
appBuilder( // 66
comBuilder(6,26,List(0, 1, 5, 4, 2, 3)), // X(XXX)XX
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(61),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(65),
),
appBuilder( // 67
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,42,List(0, 1, 4, 2, 5, 3)), // XXX(XXX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(70),
ptrBuilder(81),
ptrBuilder(93),
),
appBuilder( // 68
comBuilder(4,40,List(2, 0, 3, 3, 1, 3)), // X(XXX)(XX)
ptrBuilder(67),
ptrBuilder(66),
),
appBuilder( // 69
comBuilder(4,42,List(0, 2, 3, 1, 3, 3)), // XXX(XXX)
ptrBuilder(68),
ptrBuilder(64),
),
 // FUN5While.aval
appBuilder( // 70
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(76),
ptrBuilder(55),
),
appBuilder( // 71
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(77),
ptrBuilder(70),
),
appBuilder( // 72
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(77),
ptrBuilder(70),
),
appBuilder( // 73
comBuilder(5,25,List(0, 3, 1, 4, 2, 4)), // XX(XX)XX
comBuilder(5,34,List(0, 1, 3, 2, 4, 4)), // X(XX(XX))X
ptrBuilder(72),
ptrBuilder(78),
),
appBuilder( // 74
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,48,List(0, 4, 1, 3, 2, 4)), // XX(XX(XX))
),
appBuilder( // 75
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(74),
ptrBuilder(73),
ptrBuilder(71),
ptrBuilder(80),
),
appBuilder( // 76
comBuilder(5,32,List(0, 1, 3, 4, 4, 2)), // X(XXXX)X
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(75),
comBuilder(3,2,List(0, 2, 1)), // XXX
),
 // FUN6While.seqq
appBuilder( // 77
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
 // FUN7While.add
appBuilder( // 78
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(79),
prmBuilder("+"),
),
 // FUN8While.int
appBuilder( // 79
comBuilder(5,26,List(0, 4, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 2, 3, 1)), // X(XX)(XX)
prmBuilder("=="),
intBuilder(0),
intBuilder(0),
),
 // FUN9While.sub
appBuilder( // 80
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(79),
prmBuilder("-"),
),
 // FUN10While.update
appBuilder( // 81
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(91),
ptrBuilder(84),
),
appBuilder( // 82
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(92),
),
appBuilder( // 83
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)), // XXXX(XX)
comBuilder(5,28,List(0, 1, 2, 3, 4, 4)), // XXX(XX)X
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(81),
),
appBuilder( // 84
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(83),
ptrBuilder(82),
),
appBuilder( // 85
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(81),
),
appBuilder( // 86
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)), // XXXX(XX)
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)), // X(X(XX)X)X
prmBuilder("=="),
),
appBuilder( // 87
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(86),
ptrBuilder(85),
),
appBuilder( // 88
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(4,20,List(2, 0, 3, 1, 3)), // X(XX(XX))
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(5,25,List(0, 4, 1, 4, 2, 3)), // XX(XX)XX
),
appBuilder( // 89
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(88),
ptrBuilder(87),
ptrBuilder(92),
),
appBuilder( // 90
comBuilder(5,41,List(0, 2, 4, 1, 3, 4)), // X(X(XX))(XX)
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
comBuilder(2,0,List(0)), // X
),
appBuilder( // 91
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(5,38,List(0, 1, 2, 4, 3, 4)), // X(XX)X(XX)
ptrBuilder(90),
ptrBuilder(89),
),
 // FUN11While.upd
appBuilder( // 92
comBuilder(6,54,List(2, 0, 1, 3, 4, 5)), // X(X(XXX)X)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN12While.Final
appBuilder( // 93
comBuilder(3,3,List(0, 2, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
 // FUN13While.Comp
appBuilder( // 94
comBuilder(7,42,List(0, 1, 2, 6, 3, 4)), // XXX(XXX)
comBuilder(4,2,List(0, 1, 2)), // XXX
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN14While.bval
appBuilder( // 95
comBuilder(5,56,List(2, 0, 3, 4, 1, 4)), // X(XXX(XX))
ptrBuilder(118),
ptrBuilder(124),
),
appBuilder( // 96
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(77),
ptrBuilder(95),
),
appBuilder( // 97
comBuilder(5,9,List(0, 1, 4, 2, 3)), // XXXXX
ptrBuilder(96),
),
appBuilder( // 98
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(77),
ptrBuilder(70),
),
appBuilder( // 99
comBuilder(5,9,List(0, 1, 4, 2, 3)), // XXXXX
ptrBuilder(98),
),
appBuilder( // 100
comBuilder(5,38,List(0, 1, 3, 3, 2, 4)), // X(XX)X(XX)
comBuilder(4,7,List(3, 0, 1, 2)), // X(XXX)
ptrBuilder(99),
ptrBuilder(123),
),
appBuilder( // 101
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 102
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,57,List(0, 1, 4, 2, 3, 4)), // X(X(XX)(XX))
prmBuilder("<"),
intBuilder(1),
ptrBuilder(101),
),
appBuilder( // 103
comBuilder(5,14,List(0, 1, 2, 4, 3)), // XXX(XX)
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)), // XX(X(XXX))
ptrBuilder(102),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 104
comBuilder(5,30,List(0, 4, 1, 2, 4, 3)), // XX(XXX)X
ptrBuilder(103),
ptrBuilder(100),
),
appBuilder( // 105
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(104),
ptrBuilder(97),
),
appBuilder( // 106
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(77),
ptrBuilder(70),
),
appBuilder( // 107
comBuilder(5,9,List(0, 1, 4, 2, 3)), // XXXXX
ptrBuilder(106),
),
appBuilder( // 108
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)), // XXXX(XX)
comBuilder(5,18,List(4, 0, 1, 2, 3)), // X(XXXX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(95),
ptrBuilder(119),
),
appBuilder( // 109
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<"),
intBuilder(5),
),
appBuilder( // 110
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,57,List(0, 1, 4, 2, 3, 4)), // X(X(XX)(XX))
prmBuilder("<"),
intBuilder(4),
ptrBuilder(109),
),
appBuilder( // 111
comBuilder(5,14,List(0, 1, 2, 4, 3)), // XXX(XX)
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)), // XX(X(XXX))
ptrBuilder(110),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 112
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)), // X(XX(XX)X)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(111),
),
appBuilder( // 113
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(112),
ptrBuilder(108),
ptrBuilder(107),
),
appBuilder( // 114
comBuilder(4,37,List(0, 2, 3, 2, 1, 3)), // XXXX(XX)
ptrBuilder(113),
ptrBuilder(122),
),
appBuilder( // 115
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 116
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(115),
ptrBuilder(114),
),
appBuilder( // 117
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)), // XX(XXXX)
),
appBuilder( // 118
comBuilder(4,29,List(0, 1, 3, 2, 3, 3)), // X(XX)(XX)X
ptrBuilder(117),
ptrBuilder(116),
ptrBuilder(105),
),
 // FUN15While.notk
appBuilder( // 119
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(120),
ptrBuilder(121),
),
 // FUN16While.bool
appBuilder( // 120
comBuilder(4,15,List(2, 3, 0, 3, 1)), // X(XX)(XX)
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN17Data.Bool.not
appBuilder( // 121
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN18While.leq
appBuilder( // 122
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(120),
prmBuilder("<="),
),
 // FUN19While.eq
appBuilder( // 123
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(120),
prmBuilder("=="),
),
 // FUN20While.andk
appBuilder( // 124
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(120),
ptrBuilder(125),
),
 // FUN21Data.Bool.&&
appBuilder( // 125
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN22While.cond
appBuilder( // 126
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(128),
ptrBuilder(127),
),
appBuilder( // 127
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 128
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)), // XXXX(XX)
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN23While.If
appBuilder( // 129
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)), // XXXXXX
comBuilder(7,46,List(0, 1, 6, 2, 3, 4)), // XX(XXXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN24While.Ass
appBuilder( // 130
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(131),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 131
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,4,List(0, 1, 2, 3)), // XXXX
comBuilder(4,2,List(0, 1, 2)), // XXX
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN25While.Neg
appBuilder( // 132
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN26While.Eq
appBuilder( // 133
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(1),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN27While.N
appBuilder( // 134
comBuilder(5,6,List(0, 1, 4, 2)), // XX(XX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN28While.Le
appBuilder( // 135
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(3),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN29While.Sub
appBuilder( // 136
comBuilder(6,7,List(0, 5, 1, 2)), // X(XXX)
comBuilder(2,0,List(0)), // X
),
 // FUN30While.Add
appBuilder( // 137
comBuilder(6,42,List(0, 1, 2, 5, 3, 4)), // XXX(XXX)
comBuilder(4,2,List(0, 1, 2)), // XXX
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
)
}