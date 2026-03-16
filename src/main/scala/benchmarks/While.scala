package benchmarks
import common.Helper._
 
// Functions in this file: 31
// Apps in this file: 136
// Combinators in this file: 199
object While extends Benchmark {
override def toString() = "While" 
val combinatorCount = 199
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
ptrBuilder(132),
intBuilder(1),
),
appBuilder( // 14
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 15
ptrBuilder(134),
ptrBuilder(14),
ptrBuilder(13),
),
appBuilder( // 16
ptrBuilder(128),
intBuilder(4),
ptrBuilder(15),
),
appBuilder( // 17
ptrBuilder(132),
intBuilder(1),
),
appBuilder( // 18
comBuilder(5,1,List(4, 0)), // XX
intBuilder(5),
),
appBuilder( // 19
ptrBuilder(135),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
ptrBuilder(128),
intBuilder(5),
ptrBuilder(19),
),
appBuilder( // 21
ptrBuilder(132),
intBuilder(0),
),
appBuilder( // 22
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 23
ptrBuilder(131),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 24
ptrBuilder(127),
ptrBuilder(23),
ptrBuilder(20),
comBuilder(5,0,List(3)), // X
),
appBuilder( // 25
ptrBuilder(132),
intBuilder(1),
),
appBuilder( // 26
comBuilder(5,1,List(4, 0)), // XX
intBuilder(2),
),
appBuilder( // 27
ptrBuilder(135),
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 28
ptrBuilder(128),
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
ptrBuilder(134),
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
ptrBuilder(128),
intBuilder(0),
ptrBuilder(31),
),
appBuilder( // 33
ptrBuilder(93),
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
ptrBuilder(133),
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
ptrBuilder(128),
intBuilder(1),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(5,1,List(4, 0)), // XX
intBuilder(3),
),
appBuilder( // 41
ptrBuilder(128),
intBuilder(0),
ptrBuilder(40),
),
appBuilder( // 42
ptrBuilder(93),
ptrBuilder(41),
ptrBuilder(39),
),
appBuilder( // 43
ptrBuilder(93),
ptrBuilder(42),
ptrBuilder(37),
),
appBuilder( // 44
ptrBuilder(93),
ptrBuilder(43),
ptrBuilder(24),
),
appBuilder( // 45
ptrBuilder(93),
ptrBuilder(44),
ptrBuilder(16),
),
appBuilder( // 46
ptrBuilder(132),
intBuilder(0),
),
appBuilder( // 47
comBuilder(5,1,List(4, 0)), // XX
intBuilder(4),
),
appBuilder( // 48
ptrBuilder(131),
ptrBuilder(47),
ptrBuilder(46),
),
appBuilder( // 49
ptrBuilder(130),
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
ptrBuilder(128),
intBuilder(4),
ptrBuilder(51),
),
appBuilder( // 53
ptrBuilder(93),
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
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
errorBuilder(42),
ptrBuilder(57),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 56
comBuilder(6,32,List(0, 5, 1, 2, 3, 4)), // X(XXXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
),
appBuilder( // 57
comBuilder(5,52,List(0, 1, 2, 4, 3, 4)), // X(X(XX)XX)
comBuilder(5,19,List(3, 0, 1, 2, 4)), // X(X(XX)X)
comBuilder(5,32,List(0, 1, 4, 2, 3, 3)), // X(XXXX)X
ptrBuilder(56),
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
ptrBuilder(92),
ptrBuilder(63),
),
appBuilder( // 62
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
ptrBuilder(127),
ptrBuilder(93),
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
comBuilder(6,30,List(0, 1, 2, 5, 4, 3)), // XX(XXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
),
appBuilder( // 65
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(93),
),
appBuilder( // 66
comBuilder(6,26,List(0, 1, 5, 4, 2, 3)), // X(XXX)XX
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(61),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(65),
),
appBuilder( // 67
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(70),
ptrBuilder(82),
),
appBuilder( // 68
comBuilder(5,40,List(3, 0, 4, 1, 2, 4)), // X(XXX)(XX)
ptrBuilder(67),
ptrBuilder(92),
ptrBuilder(66),
),
appBuilder( // 69
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,47,List(0, 3, 1, 2, 3, 3)), // XX(X(XX)X)
ptrBuilder(68),
ptrBuilder(64),
ptrBuilder(125),
),
 // FUN5While.aval
appBuilder( // 70
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(77),
ptrBuilder(55),
),
appBuilder( // 71
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(78),
ptrBuilder(70),
),
appBuilder( // 72
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(71),
),
appBuilder( // 73
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(78),
ptrBuilder(70),
),
appBuilder( // 74
comBuilder(5,47,List(0, 3, 1, 2, 4, 4)), // XX(X(XX)X)
comBuilder(4,13,List(0, 1, 2, 3, 3)), // X(X(XX))X
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(73),
),
appBuilder( // 75
comBuilder(5,40,List(0, 1, 4, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
),
appBuilder( // 76
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(75),
ptrBuilder(74),
ptrBuilder(79),
ptrBuilder(72),
),
appBuilder( // 77
comBuilder(6,32,List(0, 1, 4, 5, 2, 3)), // X(XXXX)X
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(76),
ptrBuilder(81),
comBuilder(3,2,List(0, 2, 1)), // XXX
),
 // FUN6While.seqq
appBuilder( // 78
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
 // FUN7While.add
appBuilder( // 79
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(80),
prmBuilder("+"),
),
 // FUN8While.int
appBuilder( // 80
comBuilder(5,26,List(0, 4, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 2, 3, 1)), // X(XX)(XX)
prmBuilder("=="),
intBuilder(0),
intBuilder(0),
),
 // FUN9While.sub
appBuilder( // 81
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(80),
prmBuilder("-"),
),
 // FUN10While.update
appBuilder( // 82
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(90),
ptrBuilder(89),
),
appBuilder( // 83
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(82),
),
appBuilder( // 84
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)), // X(X(XX)X)X
prmBuilder("=="),
),
appBuilder( // 85
comBuilder(6,35,List(0, 1, 2, 5, 3, 4)), // X(X(XXX))X
comBuilder(5,25,List(0, 4, 1, 4, 2, 3)), // XX(XX)XX
),
appBuilder( // 86
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(85),
ptrBuilder(84),
ptrBuilder(82),
),
appBuilder( // 87
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(5,47,List(0, 1, 2, 3, 4, 4)), // XX(X(XX)X)
comBuilder(5,56,List(3, 0, 4, 2, 1, 4)), // X(XXX(XX))
),
appBuilder( // 88
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
ptrBuilder(87),
ptrBuilder(86),
ptrBuilder(91),
ptrBuilder(83),
),
appBuilder( // 89
comBuilder(4,42,List(0, 2, 3, 1, 3, 2)), // XXX(XXX)
ptrBuilder(88),
ptrBuilder(91),
),
appBuilder( // 90
comBuilder(5,41,List(0, 2, 4, 1, 3, 4)), // X(X(XX))(XX)
comBuilder(3,7,List(0, 1, 2, 2)), // X(XXX)
comBuilder(2,0,List(0)), // X
),
 // FUN11While.upd
appBuilder( // 91
comBuilder(6,54,List(2, 0, 1, 3, 4, 5)), // X(X(XXX)X)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN12While.Final
appBuilder( // 92
comBuilder(3,3,List(0, 2, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
 // FUN13While.Comp
appBuilder( // 93
comBuilder(6,58,List(0, 1, 0, 5, 2, 3)), // X(XX(XXX))
comBuilder(2,0,List(0)), // X
comBuilder(3,1,List(0, 1)), // XX
),
 // FUN14While.bval
appBuilder( // 94
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,59,List(0, 1, 4, 2, 3, 4)), // X(XX(X(XX)))
ptrBuilder(117),
ptrBuilder(96),
ptrBuilder(123),
),
appBuilder( // 95
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(78),
ptrBuilder(94),
),
appBuilder( // 96
comBuilder(4,9,List(0, 1, 3, 1, 2)), // XXXXX
ptrBuilder(95),
),
appBuilder( // 97
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(78),
ptrBuilder(70),
),
appBuilder( // 98
comBuilder(4,9,List(0, 1, 3, 1, 2)), // XXXXX
ptrBuilder(97),
),
appBuilder( // 99
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(98),
ptrBuilder(122),
),
appBuilder( // 100
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 101
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,57,List(0, 1, 4, 2, 4, 3)), // X(X(XX)(XX))
prmBuilder("<"),
intBuilder(1),
ptrBuilder(100),
),
appBuilder( // 102
comBuilder(5,39,List(0, 1, 4, 2, 3, 4)), // XX(XX)(XX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(101),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 103
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(102),
ptrBuilder(99),
),
appBuilder( // 104
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
ptrBuilder(78),
ptrBuilder(70),
),
appBuilder( // 105
comBuilder(4,9,List(0, 1, 3, 1, 2)), // XXXXX
ptrBuilder(104),
),
appBuilder( // 106
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(94),
),
appBuilder( // 107
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(106),
ptrBuilder(118),
),
appBuilder( // 108
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<"),
intBuilder(5),
),
appBuilder( // 109
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,57,List(0, 1, 4, 2, 4, 3)), // X(X(XX)(XX))
prmBuilder("<"),
intBuilder(4),
ptrBuilder(108),
),
appBuilder( // 110
comBuilder(5,39,List(0, 1, 4, 2, 3, 4)), // XX(XX)(XX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(109),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 111
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(110),
ptrBuilder(107),
),
appBuilder( // 112
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,20,List(0, 1, 3, 3, 2)), // X(XX(XX))
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 113
comBuilder(6,49,List(0, 1, 2, 3, 4, 5)), // XX(X(XXX))
comBuilder(5,40,List(0, 1, 4, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,48,List(0, 3, 1, 3, 3, 2)), // XX(XX(XX))
ptrBuilder(112),
ptrBuilder(111),
),
appBuilder( // 114
comBuilder(5,43,List(0, 1, 4, 2, 3, 4)), // XXX(X(XX))
ptrBuilder(113),
),
appBuilder( // 115
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(114),
ptrBuilder(105),
ptrBuilder(121),
),
appBuilder( // 116
comBuilder(5,56,List(0, 1, 2, 4, 3, 4)), // X(XXX(XX))
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(115),
),
appBuilder( // 117
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(116),
ptrBuilder(103),
),
 // FUN15While.notk
appBuilder( // 118
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(119),
ptrBuilder(120),
),
 // FUN16While.bool
appBuilder( // 119
comBuilder(4,15,List(2, 3, 0, 3, 1)), // X(XX)(XX)
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN17Data.Bool.not
appBuilder( // 120
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN18While.leq
appBuilder( // 121
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(119),
prmBuilder("<="),
),
 // FUN19While.eq
appBuilder( // 122
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(119),
prmBuilder("=="),
),
 // FUN20While.andk
appBuilder( // 123
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(119),
ptrBuilder(124),
),
 // FUN21Data.Bool.&&
appBuilder( // 124
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN22While.cond
appBuilder( // 125
comBuilder(4,16,List(0, 2, 1, 3, 2)), // XX(XXX)
ptrBuilder(126),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 126
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN23While.If
appBuilder( // 127
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)), // XXXXXX
comBuilder(7,46,List(0, 1, 6, 2, 3, 4)), // XX(XXXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN24While.Ass
appBuilder( // 128
comBuilder(6,46,List(0, 1, 2, 3, 4, 5)), // XX(XXXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
ptrBuilder(129),
),
appBuilder( // 129
comBuilder(5,16,List(0, 1, 4, 2, 3)), // XX(XXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN25While.Neg
appBuilder( // 130
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN26While.Eq
appBuilder( // 131
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(1),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN27While.N
appBuilder( // 132
comBuilder(5,6,List(0, 1, 4, 2)), // XX(XX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN28While.Le
appBuilder( // 133
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
intBuilder(3),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN29While.Sub
appBuilder( // 134
comBuilder(6,7,List(0, 5, 1, 2)), // X(XXX)
comBuilder(2,0,List(0)), // X
),
 // FUN30While.Add
appBuilder( // 135
comBuilder(5,58,List(0, 1, 0, 4, 2, 3)), // X(XX(XXX))
comBuilder(2,0,List(0)), // X
comBuilder(3,1,List(0, 1)), // XX
),
)
}