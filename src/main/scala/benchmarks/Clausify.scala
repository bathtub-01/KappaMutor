package benchmarks
import common.Helper._
 
// Functions in this file: 34
// Apps in this file: 128
// Combinators in this file: 197
object Clausify extends Benchmark {
override def toString() = "Clausify" 
val combinatorCount = 197
val prog = Seq(
 // FUN0Clausify.main
appBuilder( // 0
ptrBuilder(16),
ptrBuilder(15),
),
appBuilder( // 1
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 2
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 3
ptrBuilder(126),
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 4
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 5
ptrBuilder(126),
ptrBuilder(4),
ptrBuilder(3),
),
appBuilder( // 6
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 7
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 8
ptrBuilder(126),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 10
ptrBuilder(126),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
ptrBuilder(126),
ptrBuilder(10),
ptrBuilder(5),
),
appBuilder( // 12
ptrBuilder(122),
intBuilder(2),
ptrBuilder(11),
),
appBuilder( // 13
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 14
ptrBuilder(21),
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 15
ptrBuilder(23),
ptrBuilder(14),
),
 // FUN1Clausify.display
appBuilder( // 16
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(5,14,List(0, 3, 1, 2, 4)), // XXX(XX)
ptrBuilder(18),
prmBuilder("+"),
ptrBuilder(16),
),
 // FUN2Clausify.emitClause
appBuilder( // 18
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(19),
),
appBuilder( // 19
comBuilder(4,14,List(0, 2, 1, 0, 3)), // XXX(XX)
ptrBuilder(20),
prmBuilder("+"),
),
 // FUN3NanoPrelude.sum
appBuilder( // 20
ptrBuilder(21),
prmBuilder("+"),
intBuilder(0),
),
 // FUN4NanoPrelude.foldr
appBuilder( // 21
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(22),
),
appBuilder( // 22
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN5Clausify.clausify
appBuilder( // 23
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(1,0,List(0)), // X
ptrBuilder(26),
ptrBuilder(25),
),
appBuilder( // 24
comBuilder(6,48,List(0, 1, 2, 3, 4, 5)), // XX(XX(XX))
comBuilder(1,0,List(0)), // X
ptrBuilder(86),
comBuilder(1,0,List(0)), // X
ptrBuilder(94),
ptrBuilder(113),
),
appBuilder( // 25
comBuilder(6,48,List(0, 1, 2, 3, 4, 5)), // XX(XX(XX))
comBuilder(1,0,List(0)), // X
ptrBuilder(57),
comBuilder(1,0,List(0)), // X
ptrBuilder(63),
ptrBuilder(24),
),
 // FUN6Clausify.uniq
appBuilder( // 26
ptrBuilder(21),
ptrBuilder(28),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 27
ptrBuilder(29),
ptrBuilder(44),
),
appBuilder( // 28
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(27),
ptrBuilder(56),
),
 // FUN7Clausify.union
appBuilder( // 29
comBuilder(5,46,List(0, 3, 1, 2, 3, 4)), // XX(XXXX)
ptrBuilder(31),
ptrBuilder(30),
),
appBuilder( // 30
comBuilder(6,58,List(0, 1, 2, 3, 4, 5)), // X(XX(XXX))
ptrBuilder(34),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(38),
ptrBuilder(39),
),
 // FUN8Data.List_Type.++
appBuilder( // 31
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(33),
),
appBuilder( // 32
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 33
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(32),
),
 // FUN9NanoPrelude.filter
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(37),
),
appBuilder( // 35
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 36
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,30,List(0, 2, 1, 2, 3, 3)), // XX(XXX)X
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(35),
),
appBuilder( // 37
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(36),
),
 // FUN10Data.Bool.not
appBuilder( // 38
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN11Clausify.contains
appBuilder( // 39
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(42),
),
appBuilder( // 40
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
ptrBuilder(43),
),
appBuilder( // 41
comBuilder(5,47,List(3, 0, 1, 2, 4, 4)), // XX(X(XX)X)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 42
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(41),
ptrBuilder(40),
comBuilder(3,2,List(0, 2, 1)), // XXX
),
 // FUN12Data.Bool.||
appBuilder( // 43
comBuilder(3,2,List(1, 2, 0)), // XXX
comBuilder(2,0,List(1)), // X
),
 // FUN13Clausify.eqClause
appBuilder( // 44
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(47),
),
appBuilder( // 45
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(48),
ptrBuilder(49),
ptrBuilder(55),
),
appBuilder( // 46
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(6,46,List(0, 4, 1, 2, 3, 5)), // XX(XXXX)
ptrBuilder(45),
ptrBuilder(49),
ptrBuilder(55),
),
appBuilder( // 47
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
ptrBuilder(46),
),
 // FUN14Data.Bool.&&
appBuilder( // 48
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN15Clausify.eqList
appBuilder( // 49
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(54),
),
appBuilder( // 50
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)), // X(XXX)(XX)
ptrBuilder(48),
),
appBuilder( // 51
comBuilder(6,48,List(3, 0, 1, 4, 2, 5)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
),
appBuilder( // 52
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 53
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)), // X(XXX)(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(52),
),
appBuilder( // 54
comBuilder(5,19,List(0, 1, 2, 3, 4)), // X(X(XX)X)
ptrBuilder(53),
ptrBuilder(51),
ptrBuilder(50),
),
 // FUN16Clausify.eq
appBuilder( // 55
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("=="),
),
 // FUN17Clausify.singleton
appBuilder( // 56
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN18Clausify.nonTaut
appBuilder( // 57
ptrBuilder(34),
ptrBuilder(58),
),
 // FUN19Clausify.notTaut
appBuilder( // 58
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(59),
),
appBuilder( // 59
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(60),
ptrBuilder(62),
ptrBuilder(55),
),
 // FUN20NanoPrelude.null
appBuilder( // 60
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(61),
),
appBuilder( // 61
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN21Clausify.inter
appBuilder( // 62
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(34),
ptrBuilder(39),
),
 // FUN22Clausify.clauses
appBuilder( // 63
ptrBuilder(66),
ptrBuilder(65),
),
appBuilder( // 64
comBuilder(2,2,List(1, 0, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 65
ptrBuilder(69),
ptrBuilder(64),
),
 // FUN23NanoPrelude.map
appBuilder( // 66
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(68),
),
appBuilder( // 67
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 68
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(67),
),
 // FUN24Clausify.clause
appBuilder( // 69
comBuilder(6,54,List(4, 0, 1, 5, 3, 2)), // X(X(XXX)X)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(78),
ptrBuilder(71),
ptrBuilder(70),
),
appBuilder( // 70
comBuilder(2,2,List(1, 0, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 71
comBuilder(5,12,List(4, 0, 3, 1, 2)), // X(XXX)X
ptrBuilder(79),
),
appBuilder( // 72
comBuilder(5,16,List(4, 1, 0, 3, 2)), // XX(XXX)
ptrBuilder(79),
),
appBuilder( // 73
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,37,List(4, 0, 0, 1, 2, 3)), // XXXX(XX)
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 74
comBuilder(5,54,List(0, 0, 1, 2, 3, 4)), // X(X(XXX)X)
ptrBuilder(69),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 75
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(3,0,List(0)), // X
),
appBuilder( // 76
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
),
appBuilder( // 77
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(76),
ptrBuilder(75),
ptrBuilder(74),
ptrBuilder(73),
),
appBuilder( // 78
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(77),
ptrBuilder(72),
),
 // FUN25Clausify.insert
appBuilder( // 79
comBuilder(4,19,List(0, 1, 2, 3, 3)), // X(X(XX)X)
yBuilder(),
ptrBuilder(85),
ptrBuilder(84),
),
appBuilder( // 80
comBuilder(4,16,List(0, 1, 0, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 81
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 82
comBuilder(5,42,List(1, 0, 3, 2, 3, 4)), // XXX(XXX)
prmBuilder("<="),
),
appBuilder( // 83
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(82),
ptrBuilder(81),
),
appBuilder( // 84
comBuilder(5,40,List(0, 1, 3, 4, 2, 3)), // X(XXX)(XX)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(83),
ptrBuilder(80),
),
appBuilder( // 85
comBuilder(6,40,List(5, 0, 3, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN26Clausify.split
appBuilder( // 86
ptrBuilder(87),
comBuilder(2,0,List(0)), // X
),
 // FUN27Clausify.spl
appBuilder( // 87
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(93),
ptrBuilder(88),
),
appBuilder( // 88
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 89
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 90
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(6,2,List(3, 0, 1)), // XXX
),
appBuilder( // 91
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(87),
),
appBuilder( // 92
comBuilder(6,24,List(5, 0, 4, 1, 2, 3)), // X(XX)XXX
ptrBuilder(91),
),
appBuilder( // 93
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(92),
ptrBuilder(90),
ptrBuilder(89),
),
 // FUN28Clausify.disin
appBuilder( // 94
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(96),
ptrBuilder(95),
comBuilder(5,1,List(3, 0)), // XX
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 95
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
ptrBuilder(97),
ptrBuilder(94),
),
appBuilder( // 96
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(94),
),
 // FUN29Clausify.din
appBuilder( // 97
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(104),
ptrBuilder(98),
),
appBuilder( // 98
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(105),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 99
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(105),
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 100
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(105),
comBuilder(6,2,List(3, 0, 1)), // XXX
),
appBuilder( // 101
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(97),
),
appBuilder( // 102
comBuilder(6,40,List(0, 1, 4, 3, 2, 5)), // X(XXX)(XX)
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(97),
),
appBuilder( // 103
comBuilder(4,19,List(2, 0, 1, 3, 3)), // X(X(XX)X)
ptrBuilder(102),
ptrBuilder(101),
),
appBuilder( // 104
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(103),
ptrBuilder(100),
ptrBuilder(99),
),
 // FUN30Clausify.din2
appBuilder( // 105
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(112),
ptrBuilder(106),
),
appBuilder( // 106
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(6,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 107
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(6,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 108
comBuilder(4,16,List(0, 1, 0, 2, 3)), // XX(XXX)
comBuilder(6,2,List(3, 0, 1)), // XXX
),
appBuilder( // 109
comBuilder(6,40,List(0, 1, 3, 4, 2, 5)), // X(XXX)(XX)
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(97),
),
appBuilder( // 110
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(109),
ptrBuilder(97),
),
appBuilder( // 111
comBuilder(6,24,List(5, 0, 1, 2, 3, 4)), // X(XX)XXX
ptrBuilder(110),
),
appBuilder( // 112
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(111),
ptrBuilder(108),
ptrBuilder(107),
),
 // FUN31Clausify.negin
appBuilder( // 113
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(121),
ptrBuilder(120),
ptrBuilder(119),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 114
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(5,1,List(3, 0)), // XX
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 115
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(113),
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 116
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)), // X(X(XX))(XX)
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(113),
comBuilder(5,1,List(3, 0)), // XX
ptrBuilder(115),
),
appBuilder( // 117
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(113),
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 118
comBuilder(6,41,List(0, 1, 2, 4, 3, 5)), // X(X(XX))(XX)
comBuilder(6,2,List(3, 0, 1)), // XXX
ptrBuilder(113),
comBuilder(5,1,List(3, 0)), // XX
ptrBuilder(117),
),
appBuilder( // 119
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(118),
ptrBuilder(116),
ptrBuilder(113),
ptrBuilder(114),
),
appBuilder( // 120
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
comBuilder(6,2,List(3, 0, 1)), // XXX
ptrBuilder(113),
),
appBuilder( // 121
comBuilder(4,15,List(0, 1, 2, 1, 3)), // X(XX)(XX)
comBuilder(6,2,List(2, 0, 1)), // XXX
ptrBuilder(113),
),
 // FUN32NanoPrelude.replicate
appBuilder( // 122
comBuilder(4,10,List(0, 1, 3, 2, 3)), // X(XX)XX
ptrBuilder(125),
ptrBuilder(124),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 123
comBuilder(4,7,List(0, 3, 1, 2)), // X(XXX)
ptrBuilder(122),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 124
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(123),
),
appBuilder( // 125
comBuilder(6,28,List(4, 0, 1, 2, 5, 3)), // XXX(XX)X
prmBuilder("<="),
intBuilder(0),
),
 // FUN33Clausify.eqv
appBuilder( // 126
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)), // X(XX)XXX
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(127),
comBuilder(6,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(3, 0)), // XX
),
appBuilder( // 127
comBuilder(5,19,List(0, 1, 2, 3, 4)), // X(X(XX)X)
comBuilder(6,2,List(2, 0, 1)), // XXX
comBuilder(6,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(3, 0)), // XX
),
)
}