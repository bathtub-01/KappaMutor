package benchmarks
import common.Helper._
 
// Functions in this file: 34
// Apps in this file: 134
// Combinators in this file: 212
object Clausify extends Benchmark {
override def toString() = "Clausify" 
val combinatorCount = 212
val prog = Seq(
 // FUN0Clausify.main
appBuilder( // 0
comBuilder(1,0,List(0)),
ptrBuilder(19),
ptrBuilder(18),
),
appBuilder( // 1
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 2
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 3
ptrBuilder(132),
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 4
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 5
ptrBuilder(132),
ptrBuilder(4),
),
appBuilder( // 6
comBuilder(1,0,List(0)),
ptrBuilder(5),
ptrBuilder(3),
),
appBuilder( // 7
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 8
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 9
ptrBuilder(132),
ptrBuilder(8),
ptrBuilder(7),
),
appBuilder( // 10
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 11
ptrBuilder(132),
ptrBuilder(10),
),
appBuilder( // 12
comBuilder(1,0,List(0)),
ptrBuilder(11),
ptrBuilder(9),
),
appBuilder( // 13
ptrBuilder(132),
ptrBuilder(12),
ptrBuilder(6),
),
appBuilder( // 14
ptrBuilder(128),
intBuilder(2),
ptrBuilder(13),
),
appBuilder( // 15
comBuilder(5,1,List(4, 0)),
intBuilder(0),
),
appBuilder( // 16
ptrBuilder(24),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(15),
),
appBuilder( // 17
comBuilder(1,0,List(0)),
ptrBuilder(16),
ptrBuilder(14),
),
appBuilder( // 18
comBuilder(1,0,List(0)),
ptrBuilder(26),
ptrBuilder(17),
),
 // FUN1Clausify.display
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
ptrBuilder(20),
),
appBuilder( // 20
comBuilder(5,14,List(0, 3, 1, 2, 4)),
ptrBuilder(21),
prmBuilder("+"),
ptrBuilder(19),
),
 // FUN2Clausify.emitClause
appBuilder( // 21
comBuilder(2,1,List(1, 0)),
ptrBuilder(22),
),
appBuilder( // 22
comBuilder(5,14,List(0, 3, 1, 2, 4)),
ptrBuilder(23),
prmBuilder("+"),
ptrBuilder(23),
),
 // FUN3NanoPrelude.sum
appBuilder( // 23
ptrBuilder(24),
prmBuilder("+"),
intBuilder(0),
),
 // FUN4NanoPrelude.foldr
appBuilder( // 24
comBuilder(4,7,List(0, 1, 2, 3)),
yBuilder(),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(5,16,List(4, 2, 0, 1, 3)),
comBuilder(4,6,List(0, 2, 1, 3)),
),
 // FUN5Clausify.clausify
appBuilder( // 26
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(1,0,List(0)),
ptrBuilder(29),
ptrBuilder(28),
),
appBuilder( // 27
comBuilder(6,48,List(0, 1, 2, 3, 4, 5)),
comBuilder(1,0,List(0)),
ptrBuilder(92),
comBuilder(1,0,List(0)),
ptrBuilder(100),
ptrBuilder(119),
),
appBuilder( // 28
comBuilder(6,48,List(0, 1, 2, 3, 4, 5)),
comBuilder(1,0,List(0)),
ptrBuilder(62),
comBuilder(1,0,List(0)),
ptrBuilder(68),
ptrBuilder(27),
),
 // FUN6Clausify.uniq
appBuilder( // 29
comBuilder(1,0,List(0)),
ptrBuilder(32),
comBuilder(2,0,List(0)),
),
appBuilder( // 30
ptrBuilder(33),
ptrBuilder(49),
),
appBuilder( // 31
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(30),
ptrBuilder(61),
),
appBuilder( // 32
ptrBuilder(24),
ptrBuilder(31),
),
 // FUN7Clausify.union
appBuilder( // 33
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 34
comBuilder(5,16,List(0, 1, 2, 3, 4)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(43),
ptrBuilder(44),
),
appBuilder( // 35
comBuilder(5,47,List(0, 3, 1, 2, 3, 4)),
ptrBuilder(36),
ptrBuilder(39),
),
 // FUN8Data.List_Type.++
appBuilder( // 36
comBuilder(4,5,List(0, 1, 3, 2)),
yBuilder(),
ptrBuilder(38),
),
appBuilder( // 37
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 38
comBuilder(4,6,List(3, 1, 0, 2)),
ptrBuilder(37),
),
 // FUN9NanoPrelude.filter
appBuilder( // 39
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(42),
),
appBuilder( // 40
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 41
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
comBuilder(5,39,List(0, 2, 1, 4, 3, 4)),
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(41),
),
 // FUN10Data.Bool.not
appBuilder( // 43
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
comBuilder(2,0,List(0)),
),
 // FUN11Clausify.contains
appBuilder( // 44
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(47),
),
appBuilder( // 45
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
ptrBuilder(48),
),
appBuilder( // 46
comBuilder(5,48,List(3, 0, 1, 4, 2, 4)),
comBuilder(2,0,List(0)),
),
appBuilder( // 47
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(46),
ptrBuilder(45),
comBuilder(3,2,List(0, 2, 1)),
),
 // FUN12Data.Bool.||
appBuilder( // 48
comBuilder(3,2,List(1, 2, 0)),
comBuilder(2,0,List(1)),
),
 // FUN13Clausify.eqClause
appBuilder( // 49
comBuilder(3,3,List(1, 0, 2)),
ptrBuilder(52),
),
appBuilder( // 50
comBuilder(5,18,List(0, 1, 2, 3, 4)),
ptrBuilder(53),
ptrBuilder(54),
ptrBuilder(60),
),
appBuilder( // 51
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(6,46,List(0, 4, 1, 2, 3, 5)),
ptrBuilder(50),
ptrBuilder(54),
ptrBuilder(60),
),
appBuilder( // 52
comBuilder(4,7,List(1, 0, 2, 3)),
ptrBuilder(51),
),
 // FUN14Data.Bool.&&
appBuilder( // 53
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN15Clausify.eqList
appBuilder( // 54
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(59),
),
appBuilder( // 55
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)),
ptrBuilder(53),
),
appBuilder( // 56
comBuilder(6,48,List(3, 0, 1, 4, 2, 5)),
comBuilder(2,0,List(0)),
),
appBuilder( // 57
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 58
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)),
comBuilder(2,0,List(1)),
ptrBuilder(57),
),
appBuilder( // 59
comBuilder(5,19,List(0, 1, 2, 3, 4)),
ptrBuilder(58),
ptrBuilder(56),
ptrBuilder(55),
),
 // FUN16Clausify.eq
appBuilder( // 60
comBuilder(2,1,List(1, 0)),
prmBuilder("=="),
),
 // FUN17Clausify.singleton
appBuilder( // 61
comBuilder(3,2,List(0, 2, 1)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN18Clausify.nonTaut
appBuilder( // 62
comBuilder(1,0,List(0)),
ptrBuilder(39),
ptrBuilder(63),
),
 // FUN19Clausify.notTaut
appBuilder( // 63
comBuilder(2,1,List(1, 0)),
ptrBuilder(64),
),
appBuilder( // 64
comBuilder(5,18,List(0, 1, 2, 3, 4)),
ptrBuilder(65),
ptrBuilder(67),
ptrBuilder(60),
),
 // FUN20NanoPrelude.null
appBuilder( // 65
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(1)),
ptrBuilder(66),
),
appBuilder( // 66
comBuilder(3,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN21Clausify.inter
appBuilder( // 67
comBuilder(4,7,List(0, 1, 2, 3)),
ptrBuilder(39),
ptrBuilder(44),
),
 // FUN22Clausify.clauses
appBuilder( // 68
ptrBuilder(71),
ptrBuilder(70),
),
appBuilder( // 69
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 70
ptrBuilder(74),
ptrBuilder(69),
),
 // FUN23NanoPrelude.map
appBuilder( // 71
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(73),
),
appBuilder( // 72
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 73
comBuilder(5,16,List(4, 0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(72),
),
 // FUN24Clausify.clause
appBuilder( // 74
comBuilder(6,54,List(4, 0, 1, 5, 3, 2)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(84),
ptrBuilder(76),
ptrBuilder(75),
),
appBuilder( // 75
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 76
comBuilder(5,12,List(4, 0, 3, 1, 2)),
ptrBuilder(85),
),
appBuilder( // 77
comBuilder(5,16,List(4, 1, 0, 3, 2)),
ptrBuilder(85),
),
appBuilder( // 78
comBuilder(4,15,List(0, 1, 3, 2, 3)),
comBuilder(6,37,List(5, 0, 1, 2, 3, 4)),
comBuilder(3,0,List(0)),
comBuilder(3,0,List(0)),
),
appBuilder( // 79
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(78),
comBuilder(2,0,List(0)),
),
appBuilder( // 80
comBuilder(6,54,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(74),
ptrBuilder(74),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 81
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(3,0,List(0)),
),
appBuilder( // 82
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)),
),
appBuilder( // 83
comBuilder(5,10,List(0, 1, 4, 2, 3)),
ptrBuilder(82),
ptrBuilder(81),
ptrBuilder(80),
ptrBuilder(79),
),
appBuilder( // 84
comBuilder(4,4,List(0, 2, 3, 1)),
ptrBuilder(83),
ptrBuilder(77),
),
 // FUN25Clausify.insert
appBuilder( // 85
comBuilder(4,20,List(0, 1, 3, 2, 3)),
yBuilder(),
ptrBuilder(91),
ptrBuilder(90),
),
appBuilder( // 86
comBuilder(5,16,List(0, 2, 1, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 87
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(4,2,List(3, 0, 1)),
),
appBuilder( // 88
comBuilder(5,42,List(1, 0, 3, 2, 3, 4)),
prmBuilder("<="),
),
appBuilder( // 89
comBuilder(4,6,List(0, 2, 1, 3)),
ptrBuilder(88),
ptrBuilder(87),
),
appBuilder( // 90
comBuilder(5,40,List(0, 1, 3, 4, 2, 3)),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)),
ptrBuilder(89),
ptrBuilder(86),
),
appBuilder( // 91
comBuilder(6,40,List(5, 0, 2, 1, 3, 4)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN26Clausify.split
appBuilder( // 92
comBuilder(1,0,List(0)),
ptrBuilder(93),
comBuilder(2,0,List(0)),
),
 // FUN27Clausify.spl
appBuilder( // 93
comBuilder(4,20,List(0, 1, 3, 2, 3)),
yBuilder(),
ptrBuilder(99),
ptrBuilder(94),
),
appBuilder( // 94
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 95
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 96
comBuilder(5,12,List(0, 1, 3, 4, 2)),
comBuilder(4,2,List(3, 0, 1)),
comBuilder(6,2,List(3, 0, 1)),
),
appBuilder( // 97
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(93),
),
appBuilder( // 98
comBuilder(6,24,List(5, 0, 4, 1, 2, 3)),
ptrBuilder(97),
),
appBuilder( // 99
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(98),
ptrBuilder(96),
ptrBuilder(95),
),
 // FUN28Clausify.disin
appBuilder( // 100
comBuilder(5,9,List(4, 0, 1, 2, 3)),
ptrBuilder(102),
ptrBuilder(101),
comBuilder(5,1,List(3, 0)),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 101
comBuilder(5,15,List(0, 1, 3, 2, 4)),
ptrBuilder(103),
ptrBuilder(100),
ptrBuilder(100),
),
appBuilder( // 102
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(100),
ptrBuilder(100),
),
 // FUN29Clausify.din
appBuilder( // 103
comBuilder(4,14,List(0, 2, 3, 1, 3)),
ptrBuilder(110),
ptrBuilder(104),
),
appBuilder( // 104
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(111),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 105
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(111),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 106
comBuilder(5,12,List(0, 1, 3, 4, 2)),
ptrBuilder(111),
comBuilder(6,2,List(3, 0, 1)),
),
appBuilder( // 107
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(103),
),
appBuilder( // 108
comBuilder(6,40,List(0, 1, 4, 2, 3, 5)),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(103),
),
appBuilder( // 109
comBuilder(4,20,List(2, 0, 3, 1, 3)),
ptrBuilder(108),
ptrBuilder(107),
),
appBuilder( // 110
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(109),
ptrBuilder(106),
ptrBuilder(105),
),
 // FUN30Clausify.din2
appBuilder( // 111
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(118),
ptrBuilder(112),
),
appBuilder( // 112
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(6,2,List(3, 0, 1)),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 113
comBuilder(4,6,List(0, 2, 1, 3)),
comBuilder(6,2,List(3, 0, 1)),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 114
comBuilder(5,16,List(0, 2, 1, 3, 4)),
comBuilder(6,2,List(3, 0, 1)),
comBuilder(6,2,List(3, 0, 1)),
),
appBuilder( // 115
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(103),
),
appBuilder( // 116
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(115),
ptrBuilder(103),
),
appBuilder( // 117
comBuilder(6,24,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(116),
),
appBuilder( // 118
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(117),
ptrBuilder(114),
ptrBuilder(113),
),
 // FUN31Clausify.negin
appBuilder( // 119
comBuilder(5,9,List(4, 0, 1, 2, 3)),
ptrBuilder(127),
ptrBuilder(126),
ptrBuilder(125),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 120
comBuilder(3,3,List(0, 1, 2)),
comBuilder(5,1,List(3, 0)),
comBuilder(5,1,List(4, 0)),
),
appBuilder( // 121
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(119),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 122
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(119),
comBuilder(5,1,List(3, 0)),
ptrBuilder(121),
),
appBuilder( // 123
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(119),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 124
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)),
comBuilder(6,2,List(3, 0, 1)),
ptrBuilder(119),
comBuilder(5,1,List(3, 0)),
ptrBuilder(123),
),
appBuilder( // 125
comBuilder(5,9,List(4, 0, 1, 2, 3)),
ptrBuilder(124),
ptrBuilder(122),
ptrBuilder(119),
ptrBuilder(120),
),
appBuilder( // 126
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(6,2,List(3, 0, 1)),
ptrBuilder(119),
ptrBuilder(119),
),
appBuilder( // 127
comBuilder(5,15,List(0, 1, 3, 2, 4)),
comBuilder(6,2,List(2, 0, 1)),
ptrBuilder(119),
ptrBuilder(119),
),
 // FUN32NanoPrelude.replicate
appBuilder( // 128
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(131),
ptrBuilder(130),
comBuilder(2,0,List(0)),
),
appBuilder( // 129
comBuilder(4,7,List(0, 3, 1, 2)),
ptrBuilder(128),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 130
comBuilder(4,16,List(0, 3, 1, 2, 3)),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(129),
),
appBuilder( // 131
comBuilder(6,28,List(2, 0, 1, 3, 5, 4)),
prmBuilder("<="),
intBuilder(0),
),
 // FUN33Clausify.eqv
appBuilder( // 132
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)),
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(133),
comBuilder(6,2,List(3, 0, 1)),
comBuilder(5,1,List(3, 0)),
),
appBuilder( // 133
comBuilder(5,19,List(0, 1, 2, 3, 4)),
comBuilder(6,2,List(2, 0, 1)),
comBuilder(6,2,List(3, 0, 1)),
comBuilder(5,1,List(3, 0)),
),
)
}