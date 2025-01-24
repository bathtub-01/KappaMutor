package benchmarks
import common.Helper._
 
// Functions in this file: 37
// Apps in this file: 135
// Combinators in this file: 228
object While extends Benchmark {
override def toString() = "While" 
val combinatorCount = 228
val prog = Seq(
 // FUN0While.main
appBuilder( // 0
ptrBuilder(55),
ptrBuilder(54),
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
ptrBuilder(131),
intBuilder(1),
),
appBuilder( // 14
ptrBuilder(128),
intBuilder(4),
),
appBuilder( // 15
ptrBuilder(133),
ptrBuilder(14),
ptrBuilder(13),
),
appBuilder( // 16
ptrBuilder(126),
intBuilder(4),
ptrBuilder(15),
),
appBuilder( // 17
ptrBuilder(131),
intBuilder(1),
),
appBuilder( // 18
ptrBuilder(128),
intBuilder(5),
),
appBuilder( // 19
ptrBuilder(134),
ptrBuilder(18),
ptrBuilder(17),
),
appBuilder( // 20
ptrBuilder(126),
intBuilder(5),
ptrBuilder(19),
),
appBuilder( // 21
ptrBuilder(131),
intBuilder(0),
),
appBuilder( // 22
ptrBuilder(128),
intBuilder(0),
),
appBuilder( // 23
ptrBuilder(130),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 24
ptrBuilder(122),
ptrBuilder(23),
ptrBuilder(20),
ptrBuilder(125),
),
appBuilder( // 25
ptrBuilder(131),
intBuilder(1),
),
appBuilder( // 26
ptrBuilder(128),
intBuilder(2),
),
appBuilder( // 27
ptrBuilder(134),
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 28
ptrBuilder(126),
intBuilder(2),
ptrBuilder(27),
),
appBuilder( // 29
ptrBuilder(128),
intBuilder(1),
),
appBuilder( // 30
ptrBuilder(128),
intBuilder(0),
),
appBuilder( // 31
ptrBuilder(133),
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
ptrBuilder(126),
intBuilder(0),
ptrBuilder(31),
),
appBuilder( // 33
ptrBuilder(91),
ptrBuilder(32),
ptrBuilder(28),
),
appBuilder( // 34
ptrBuilder(128),
intBuilder(0),
),
appBuilder( // 35
ptrBuilder(128),
intBuilder(1),
),
appBuilder( // 36
ptrBuilder(132),
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
ptrBuilder(124),
ptrBuilder(36),
ptrBuilder(33),
),
appBuilder( // 38
ptrBuilder(128),
intBuilder(4),
),
appBuilder( // 39
ptrBuilder(126),
intBuilder(1),
ptrBuilder(38),
),
appBuilder( // 40
ptrBuilder(128),
intBuilder(3),
),
appBuilder( // 41
ptrBuilder(126),
intBuilder(0),
ptrBuilder(40),
),
appBuilder( // 42
ptrBuilder(91),
ptrBuilder(41),
ptrBuilder(39),
),
appBuilder( // 43
ptrBuilder(91),
ptrBuilder(42),
ptrBuilder(37),
),
appBuilder( // 44
ptrBuilder(91),
ptrBuilder(43),
ptrBuilder(24),
),
appBuilder( // 45
ptrBuilder(91),
ptrBuilder(44),
ptrBuilder(16),
),
appBuilder( // 46
ptrBuilder(131),
intBuilder(0),
),
appBuilder( // 47
ptrBuilder(128),
intBuilder(4),
),
appBuilder( // 48
ptrBuilder(130),
ptrBuilder(47),
ptrBuilder(46),
),
appBuilder( // 49
ptrBuilder(129),
ptrBuilder(48),
),
appBuilder( // 50
ptrBuilder(124),
ptrBuilder(49),
ptrBuilder(45),
),
appBuilder( // 51
ptrBuilder(128),
intBuilder(3),
),
appBuilder( // 52
ptrBuilder(126),
intBuilder(4),
ptrBuilder(51),
),
appBuilder( // 53
ptrBuilder(91),
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
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(4,16,List(0, 1, 2, 3, 3)),
comBuilder(3,7,List(0, 1, 2, 2)),
errorBuilder(42),
ptrBuilder(57),
),
appBuilder( // 56
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,32,List(0, 5, 1, 2, 3, 4)),
comBuilder(3,3,List(0, 1, 2)),
prmBuilder("=="),
),
appBuilder( // 57
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,60,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,7,List(2, 0, 3, 1)),
ptrBuilder(56),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(55),
),
 // FUN2While.ssos
appBuilder( // 58
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(59),
ptrBuilder(90),
),
 // FUN3While.run
appBuilder( // 59
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
comBuilder(1,0,List(0)),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(59),
ptrBuilder(60),
),
 // FUN4While.sosstm
appBuilder( // 60
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(67),
ptrBuilder(89),
ptrBuilder(62),
),
appBuilder( // 61
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)),
ptrBuilder(122),
ptrBuilder(91),
ptrBuilder(124),
),
appBuilder( // 62
comBuilder(6,30,List(0, 1, 2, 5, 3, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(90),
ptrBuilder(61),
ptrBuilder(125),
),
appBuilder( // 63
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,30,List(0, 1, 2, 5, 4, 3)),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(92),
ptrBuilder(119),
),
appBuilder( // 64
comBuilder(4,7,List(0, 1, 3, 2)),
ptrBuilder(90),
ptrBuilder(91),
),
appBuilder( // 65
comBuilder(6,26,List(0, 1, 5, 4, 2, 3)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(60),
ptrBuilder(90),
ptrBuilder(64),
),
appBuilder( // 66
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,42,List(0, 1, 4, 2, 5, 3)),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(68),
ptrBuilder(78),
ptrBuilder(89),
),
appBuilder( // 67
comBuilder(6,32,List(0, 1, 2, 3, 5, 4)),
comBuilder(3,16,List(0, 2, 1, 2, 2)),
comBuilder(4,40,List(2, 0, 3, 3, 1, 3)),
ptrBuilder(66),
ptrBuilder(65),
ptrBuilder(63),
),
 // FUN5While.aval
appBuilder( // 68
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(73),
ptrBuilder(55),
),
appBuilder( // 69
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
ptrBuilder(74),
ptrBuilder(68),
),
appBuilder( // 70
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
ptrBuilder(74),
ptrBuilder(68),
),
appBuilder( // 71
comBuilder(5,25,List(0, 3, 1, 4, 2, 4)),
comBuilder(5,34,List(0, 1, 3, 2, 4, 4)),
ptrBuilder(70),
ptrBuilder(75),
),
appBuilder( // 72
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,48,List(0, 4, 1, 3, 2, 4)),
ptrBuilder(71),
ptrBuilder(69),
ptrBuilder(77),
),
appBuilder( // 73
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)),
comBuilder(3,6,List(0, 2, 1, 2)),
comBuilder(4,12,List(0, 1, 3, 3, 2)),
comBuilder(4,16,List(0, 3, 1, 2, 3)),
ptrBuilder(72),
comBuilder(3,2,List(0, 2, 1)),
),
 // FUN6While.seqq
appBuilder( // 74
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
),
 // FUN7While.add
appBuilder( // 75
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(76),
prmBuilder("+"),
),
 // FUN8While.int
appBuilder( // 76
comBuilder(5,26,List(0, 4, 1, 2, 3, 4)),
comBuilder(4,15,List(0, 3, 2, 3, 1)),
prmBuilder("=="),
intBuilder(0),
intBuilder(0),
),
 // FUN9While.sub
appBuilder( // 77
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(76),
prmBuilder("-"),
),
 // FUN10While.update
appBuilder( // 78
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,44,List(0, 1, 3, 2, 3, 3)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(86),
ptrBuilder(80),
),
appBuilder( // 79
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(87),
),
appBuilder( // 80
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)),
comBuilder(5,28,List(0, 1, 2, 3, 4, 4)),
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(78),
ptrBuilder(79),
),
appBuilder( // 81
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(78),
),
appBuilder( // 82
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)),
comBuilder(5,12,List(0, 4, 1, 2, 3)),
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)),
prmBuilder("=="),
ptrBuilder(81),
),
appBuilder( // 83
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(82),
),
appBuilder( // 84
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,20,List(2, 0, 3, 1, 3)),
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(5,25,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(83),
),
appBuilder( // 85
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(84),
ptrBuilder(87),
),
appBuilder( // 86
comBuilder(6,37,List(0, 1, 4, 2, 3, 5)),
comBuilder(5,41,List(0, 1, 4, 2, 3, 4)),
comBuilder(4,20,List(0, 1, 3, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(85),
),
 // FUN11While.upd
appBuilder( // 87
comBuilder(6,49,List(0, 3, 1, 2, 4, 5)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(88),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN12Data.List_Type.:
appBuilder( // 88
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN13While.Final
appBuilder( // 89
comBuilder(3,3,List(0, 2, 1)),
comBuilder(2,0,List(0)),
),
 // FUN14While.Inter
appBuilder( // 90
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN15While.Comp
appBuilder( // 91
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,42,List(0, 1, 2, 5, 3, 4)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN16While.bval
appBuilder( // 92
comBuilder(5,11,List(0, 3, 1, 4, 2)),
comBuilder(4,20,List(0, 1, 3, 2, 3)),
ptrBuilder(110),
ptrBuilder(117),
),
appBuilder( // 93
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
ptrBuilder(74),
ptrBuilder(92),
),
appBuilder( // 94
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
ptrBuilder(74),
ptrBuilder(68),
),
appBuilder( // 95
comBuilder(5,25,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,14,List(0, 1, 3, 2, 4)),
comBuilder(4,7,List(3, 0, 1, 2)),
ptrBuilder(94),
ptrBuilder(116),
),
appBuilder( // 96
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 97
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)),
comBuilder(5,57,List(0, 1, 4, 2, 3, 4)),
prmBuilder("<"),
intBuilder(1),
ptrBuilder(96),
),
appBuilder( // 98
comBuilder(5,14,List(0, 1, 2, 4, 3)),
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)),
ptrBuilder(97),
comBuilder(2,0,List(0)),
),
appBuilder( // 99
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(98),
),
appBuilder( // 100
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(99),
ptrBuilder(95),
ptrBuilder(93),
),
appBuilder( // 101
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(4,4,List(0, 3, 1, 2)),
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
ptrBuilder(74),
ptrBuilder(68),
),
appBuilder( // 102
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)),
comBuilder(5,18,List(4, 0, 1, 2, 3)),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(92),
ptrBuilder(112),
),
appBuilder( // 103
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<"),
intBuilder(5),
),
appBuilder( // 104
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)),
comBuilder(5,57,List(0, 1, 4, 2, 3, 4)),
prmBuilder("<"),
intBuilder(4),
ptrBuilder(103),
),
appBuilder( // 105
comBuilder(5,14,List(0, 1, 2, 4, 3)),
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,49,List(0, 4, 4, 1, 2, 3)),
ptrBuilder(104),
ptrBuilder(111),
),
appBuilder( // 106
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(105),
ptrBuilder(102),
),
appBuilder( // 107
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,14,List(0, 3, 2, 1, 3)),
ptrBuilder(106),
ptrBuilder(101),
ptrBuilder(115),
),
appBuilder( // 108
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
prmBuilder("<"),
intBuilder(3),
),
appBuilder( // 109
comBuilder(5,49,List(0, 1, 2, 3, 4, 4)),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(108),
ptrBuilder(107),
),
appBuilder( // 110
comBuilder(3,11,List(0, 2, 1, 2, 2)),
ptrBuilder(109),
ptrBuilder(100),
),
 // FUN17Data.Bool_Type.True
appBuilder( // 111
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN18While.notk
appBuilder( // 112
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(113),
ptrBuilder(114),
),
 // FUN19While.bool
appBuilder( // 113
comBuilder(4,15,List(2, 3, 0, 3, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(111),
),
 // FUN20Data.Bool.not
appBuilder( // 114
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(111),
comBuilder(2,0,List(0)),
),
 // FUN21While.leq
appBuilder( // 115
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(113),
prmBuilder("<="),
),
 // FUN22While.eq
appBuilder( // 116
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(113),
prmBuilder("=="),
),
 // FUN23While.andk
appBuilder( // 117
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(113),
ptrBuilder(118),
),
 // FUN24Data.Bool.&&
appBuilder( // 118
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN25While.cond
appBuilder( // 119
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(121),
),
appBuilder( // 120
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(90),
),
appBuilder( // 121
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(90),
ptrBuilder(120),
),
 // FUN26While.If
appBuilder( // 122
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
ptrBuilder(123),
),
appBuilder( // 123
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,46,List(0, 1, 5, 2, 3, 4)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN27While.While
appBuilder( // 124
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,9,List(0, 1, 2, 3, 4)),
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN28While.Skip
appBuilder( // 125
comBuilder(3,1,List(0, 1)),
comBuilder(2,1,List(0, 0)),
comBuilder(2,0,List(0)),
),
 // FUN29While.Ass
appBuilder( // 126
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(127),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 127
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN30While.V
appBuilder( // 128
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,1,List(1, 0)),
),
 // FUN31While.Neg
appBuilder( // 129
comBuilder(4,6,List(3, 0, 1, 2)),
intBuilder(4),
comBuilder(2,1,List(1, 0)),
),
 // FUN32While.Eq
appBuilder( // 130
comBuilder(5,16,List(4, 0, 1, 2, 3)),
intBuilder(1),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN33While.N
appBuilder( // 131
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,6,List(0, 1, 3, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN34While.Le
appBuilder( // 132
comBuilder(5,16,List(4, 0, 1, 2, 3)),
intBuilder(3),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN35While.Sub
appBuilder( // 133
comBuilder(6,9,List(0, 1, 2, 3, 4)),
comBuilder(5,4,List(0, 1, 2, 3)),
comBuilder(4,7,List(0, 3, 1, 2)),
comBuilder(2,0,List(0)),
),
 // FUN36While.Add
appBuilder( // 134
comBuilder(6,42,List(0, 1, 2, 5, 3, 4)),
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
)
}