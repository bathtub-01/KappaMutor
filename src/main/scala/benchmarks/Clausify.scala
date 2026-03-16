package benchmarks
import common.Helper._
 
// Functions in this file: 37
// Apps in this file: 127
// Combinators in this file: 204
object Clausify extends Benchmark {
override def toString() = "Clausify" 
val combinatorCount = 204
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
ptrBuilder(124),
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 4
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 5
ptrBuilder(124),
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
ptrBuilder(124),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 10
ptrBuilder(124),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
ptrBuilder(124),
ptrBuilder(10),
ptrBuilder(5),
),
appBuilder( // 12
ptrBuilder(121),
intBuilder(2),
ptrBuilder(11),
),
appBuilder( // 13
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 14
ptrBuilder(21),
ptrBuilder(99),
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 15
ptrBuilder(24),
ptrBuilder(14),
),
 // FUN1Clausify.display
appBuilder( // 16
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
comBuilder(4,12,List(0, 1, 3, 2, 1)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
ptrBuilder(23),
),
appBuilder( // 22
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 23
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
ptrBuilder(22),
),
 // FUN5Clausify.clausify
appBuilder( // 24
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(26),
ptrBuilder(58),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(5,22,List(0, 1, 2, 3, 4)), // X(X(X(XX)))
ptrBuilder(65),
ptrBuilder(86),
ptrBuilder(96),
ptrBuilder(112),
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
ptrBuilder(57),
),
 // FUN7Clausify.union
appBuilder( // 29
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(32),
ptrBuilder(31),
ptrBuilder(40),
),
appBuilder( // 30
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(39),
),
appBuilder( // 31
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(36),
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(33),
),
 // FUN8Data.List_Type.++
appBuilder( // 33
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(35),
),
appBuilder( // 34
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 35
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(34),
),
 // FUN9NanoPrelude.filter
appBuilder( // 36
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(38),
),
appBuilder( // 37
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)), // X(XX)X(XX)
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 38
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(37),
),
 // FUN10Data.Bool.not
appBuilder( // 39
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN11Clausify.contains
appBuilder( // 40
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
yBuilder(),
ptrBuilder(42),
ptrBuilder(41),
),
appBuilder( // 41
comBuilder(6,35,List(0, 1, 2, 5, 4, 3)), // X(X(XXX))X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(43),
),
appBuilder( // 42
comBuilder(6,45,List(0, 5, 1, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
comBuilder(3,4,List(0, 1, 2, 1)), // XXXX
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
ptrBuilder(49),
ptrBuilder(56),
),
appBuilder( // 46
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(48),
),
appBuilder( // 47
comBuilder(5,31,List(0, 3, 1, 2, 4, 2)), // XX(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(46),
ptrBuilder(45),
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
ptrBuilder(55),
),
appBuilder( // 50
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(48),
),
appBuilder( // 51
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(50),
),
appBuilder( // 52
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 54
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)), // X(XXX)(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(53),
),
appBuilder( // 55
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(54),
ptrBuilder(52),
),
 // FUN16Clausify.eq
appBuilder( // 56
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("=="),
),
 // FUN17Clausify.singleton
appBuilder( // 57
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN18Clausify.nonTaut
appBuilder( // 58
ptrBuilder(36),
ptrBuilder(59),
),
 // FUN19Clausify.notTaut
appBuilder( // 59
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(61),
),
appBuilder( // 60
ptrBuilder(64),
ptrBuilder(56),
),
appBuilder( // 61
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(62),
ptrBuilder(60),
),
 // FUN20NanoPrelude.null
appBuilder( // 62
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(63),
),
appBuilder( // 63
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN21Clausify.inter
appBuilder( // 64
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(36),
ptrBuilder(40),
),
 // FUN22Clausify.clauses
appBuilder( // 65
ptrBuilder(68),
ptrBuilder(67),
),
appBuilder( // 66
comBuilder(2,2,List(1, 0, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 67
ptrBuilder(71),
ptrBuilder(66),
),
 // FUN23NanoPrelude.map
appBuilder( // 68
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(70),
),
appBuilder( // 69
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 70
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(69),
),
 // FUN24Clausify.clause
appBuilder( // 71
comBuilder(6,54,List(4, 0, 1, 5, 3, 2)), // X(X(XXX)X)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(80),
ptrBuilder(73),
ptrBuilder(72),
),
appBuilder( // 72
comBuilder(2,2,List(1, 0, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 73
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(81),
),
appBuilder( // 74
comBuilder(5,16,List(0, 2, 1, 4, 3)), // XX(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(81),
),
appBuilder( // 75
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,37,List(4, 0, 0, 1, 2, 3)), // XXXX(XX)
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 76
comBuilder(5,49,List(0, 1, 1, 2, 3, 4)), // XX(X(XXX))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(71),
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 77
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(3,0,List(0)), // X
),
appBuilder( // 78
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
),
appBuilder( // 79
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(78),
ptrBuilder(77),
ptrBuilder(76),
ptrBuilder(75),
),
appBuilder( // 80
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(79),
ptrBuilder(74),
),
 // FUN25Clausify.insert
appBuilder( // 81
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(85),
ptrBuilder(84),
),
appBuilder( // 82
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
prmBuilder("<="),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 83
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
ptrBuilder(82),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 84
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(83),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 85
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
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
ptrBuilder(95),
),
appBuilder( // 90
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(94),
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
 // FUN28Clausify.Dis
appBuilder( // 94
comBuilder(6,16,List(0, 1, 5, 2, 3)), // XX(XXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN29Clausify.Neg
appBuilder( // 95
comBuilder(5,3,List(0, 4, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
 // FUN30Clausify.disin
appBuilder( // 96
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(98),
ptrBuilder(97),
ptrBuilder(95),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 97
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(100),
ptrBuilder(96),
),
appBuilder( // 98
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(99),
ptrBuilder(96),
),
 // FUN31Clausify.Con
appBuilder( // 99
comBuilder(5,58,List(0, 1, 0, 4, 2, 3)), // X(XX(XXX))
comBuilder(2,0,List(0)), // X
comBuilder(3,1,List(0, 1)), // XX
),
 // FUN32Clausify.din
appBuilder( // 100
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(106),
ptrBuilder(102),
ptrBuilder(101),
),
appBuilder( // 101
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(107),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 102
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(107),
ptrBuilder(95),
),
appBuilder( // 103
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(107),
ptrBuilder(94),
),
appBuilder( // 104
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(99),
ptrBuilder(100),
),
appBuilder( // 105
comBuilder(3,4,List(0, 1, 2, 1)), // XXXX
ptrBuilder(104),
),
appBuilder( // 106
comBuilder(4,15,List(2, 0, 3, 1, 3)), // X(XX)(XX)
ptrBuilder(105),
ptrBuilder(103),
),
 // FUN33Clausify.din2
appBuilder( // 107
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(111),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 108
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
ptrBuilder(94),
),
appBuilder( // 109
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(99),
),
appBuilder( // 110
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(109),
ptrBuilder(100),
ptrBuilder(108),
),
appBuilder( // 111
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(110),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
ptrBuilder(95),
),
 // FUN34Clausify.negin
appBuilder( // 112
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(120),
ptrBuilder(119),
ptrBuilder(118),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 113
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(95),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 114
comBuilder(5,36,List(0, 1, 2, 3, 4, 2)), // X(X(X(XX)))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(99),
ptrBuilder(112),
ptrBuilder(95),
),
appBuilder( // 115
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(114),
ptrBuilder(95),
),
appBuilder( // 116
comBuilder(5,36,List(0, 1, 2, 3, 4, 2)), // X(X(X(XX)))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(94),
ptrBuilder(112),
ptrBuilder(95),
),
appBuilder( // 117
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(116),
ptrBuilder(95),
),
appBuilder( // 118
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(117),
ptrBuilder(115),
ptrBuilder(112),
ptrBuilder(113),
),
appBuilder( // 119
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
ptrBuilder(112),
),
appBuilder( // 120
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(99),
ptrBuilder(112),
),
 // FUN35NanoPrelude.replicate
appBuilder( // 121
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(123),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 122
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
prmBuilder("<="),
intBuilder(0),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 123
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(122),
ptrBuilder(121),
prmBuilder("-"),
intBuilder(1),
),
 // FUN36Clausify.eqv
appBuilder( // 124
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(126),
ptrBuilder(125),
),
appBuilder( // 125
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(94),
ptrBuilder(95),
),
appBuilder( // 126
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(99),
ptrBuilder(94),
ptrBuilder(95),
),
)
}