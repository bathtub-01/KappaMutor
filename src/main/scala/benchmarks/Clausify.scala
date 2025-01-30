package benchmarks
import common.Helper._
 
// Functions in this file: 37
// Apps in this file: 124
// Combinators in this file: 212
object Clausify extends Benchmark {
override def toString() = "Clausify" 
val combinatorCount = 212
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
ptrBuilder(122),
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 4
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 5
ptrBuilder(122),
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
ptrBuilder(122),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 9
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 10
ptrBuilder(122),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
ptrBuilder(122),
ptrBuilder(10),
ptrBuilder(5),
),
appBuilder( // 12
ptrBuilder(119),
intBuilder(2),
ptrBuilder(11),
),
appBuilder( // 13
comBuilder(5,1,List(4, 0)), // XX
intBuilder(0),
),
appBuilder( // 14
ptrBuilder(21),
ptrBuilder(97),
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
ptrBuilder(57),
ptrBuilder(25),
),
appBuilder( // 25
comBuilder(5,22,List(0, 1, 2, 3, 4)), // X(X(X(XX)))
ptrBuilder(63),
ptrBuilder(84),
ptrBuilder(94),
ptrBuilder(110),
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
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(32),
ptrBuilder(31),
),
appBuilder( // 30
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(38),
),
appBuilder( // 31
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(35),
ptrBuilder(30),
ptrBuilder(39),
),
 // FUN8Data.List_Type.++
appBuilder( // 32
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(34),
),
appBuilder( // 33
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 34
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(33),
),
 // FUN9NanoPrelude.filter
appBuilder( // 35
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(37),
),
appBuilder( // 36
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)), // X(XX)X(XX)
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
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
comBuilder(6,35,List(0, 1, 2, 5, 4, 3)), // X(X(XXX))X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(43),
),
appBuilder( // 41
comBuilder(5,23,List(0, 1, 2, 3, 4, 3)), // XXXXXX
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(6,44,List(0, 5, 1, 2, 3, 4)), // X(XX)(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(41),
),
 // FUN12Data.Bool.||
appBuilder( // 43
comBuilder(3,2,List(1, 2, 0)), // XXX
comBuilder(2,0,List(1)), // X
),
 // FUN13Clausify.eqClause
appBuilder( // 44
comBuilder(6,51,List(4, 0, 1, 2, 3, 5)), // X(XXXXX)
comBuilder(5,16,List(0, 3, 1, 4, 2)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(47),
ptrBuilder(45),
),
appBuilder( // 45
ptrBuilder(49),
ptrBuilder(55),
),
appBuilder( // 46
ptrBuilder(49),
ptrBuilder(55),
),
appBuilder( // 47
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(48),
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
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(48),
),
appBuilder( // 51
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
ptrBuilder(35),
ptrBuilder(58),
),
 // FUN19Clausify.notTaut
appBuilder( // 58
comBuilder(5,18,List(4, 0, 1, 2, 3)), // X(XXXX)
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(60),
ptrBuilder(59),
),
appBuilder( // 59
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
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(35),
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
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(79),
),
appBuilder( // 72
comBuilder(5,16,List(0, 2, 1, 4, 3)), // XX(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(79),
),
appBuilder( // 73
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,37,List(4, 0, 0, 1, 2, 3)), // XXXX(XX)
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 74
comBuilder(5,49,List(0, 1, 1, 2, 3, 4)), // XX(X(XXX))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(83),
),
appBuilder( // 80
comBuilder(6,37,List(0, 1, 2, 3, 5, 4)), // XXXX(XX)
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
prmBuilder("<="),
),
appBuilder( // 81
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 82
comBuilder(5,30,List(0, 4, 1, 4, 2, 3)), // XX(XXX)X
ptrBuilder(81),
ptrBuilder(80),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 83
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(82),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN26Clausify.split
appBuilder( // 84
ptrBuilder(85),
comBuilder(2,0,List(0)), // X
),
 // FUN27Clausify.spl
appBuilder( // 85
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(91),
ptrBuilder(86),
),
appBuilder( // 86
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 87
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(93),
),
appBuilder( // 88
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(92),
),
appBuilder( // 89
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(85),
),
appBuilder( // 90
comBuilder(6,24,List(5, 0, 4, 1, 2, 3)), // X(XX)XXX
ptrBuilder(89),
),
appBuilder( // 91
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(90),
ptrBuilder(88),
ptrBuilder(87),
),
 // FUN28Clausify.Dis
appBuilder( // 92
comBuilder(6,16,List(0, 1, 5, 2, 3)), // XX(XXX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN29Clausify.Neg
appBuilder( // 93
comBuilder(5,3,List(0, 4, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
 // FUN30Clausify.disin
appBuilder( // 94
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(96),
ptrBuilder(95),
ptrBuilder(93),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 95
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(98),
ptrBuilder(94),
),
appBuilder( // 96
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(97),
ptrBuilder(94),
),
 // FUN31Clausify.Con
appBuilder( // 97
comBuilder(6,42,List(0, 1, 2, 5, 3, 4)), // XXX(XXX)
comBuilder(4,2,List(0, 1, 2)), // XXX
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN32Clausify.din
appBuilder( // 98
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(104),
ptrBuilder(100),
ptrBuilder(99),
),
appBuilder( // 99
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(105),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 100
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(105),
ptrBuilder(93),
),
appBuilder( // 101
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(105),
ptrBuilder(92),
),
appBuilder( // 102
comBuilder(5,35,List(0, 1, 2, 4, 3, 2)), // X(X(XXX))X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(97),
ptrBuilder(98),
),
appBuilder( // 103
comBuilder(3,4,List(0, 1, 2, 1)), // XXXX
ptrBuilder(102),
),
appBuilder( // 104
comBuilder(4,15,List(2, 0, 3, 1, 3)), // X(XX)(XX)
ptrBuilder(103),
ptrBuilder(101),
),
 // FUN33Clausify.din2
appBuilder( // 105
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(109),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(92),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 106
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(92),
ptrBuilder(92),
),
appBuilder( // 107
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)), // X(XXXX)X
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(97),
ptrBuilder(98),
),
appBuilder( // 108
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
comBuilder(6,30,List(0, 5, 1, 2, 3, 4)), // XX(XXX)X
ptrBuilder(107),
ptrBuilder(106),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 109
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(108),
ptrBuilder(92),
ptrBuilder(93),
),
 // FUN34Clausify.negin
appBuilder( // 110
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(118),
ptrBuilder(117),
ptrBuilder(116),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 111
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(93),
comBuilder(5,1,List(4, 0)), // XX
),
appBuilder( // 112
comBuilder(5,36,List(0, 1, 2, 3, 4, 2)), // X(X(X(XX)))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(97),
ptrBuilder(110),
ptrBuilder(93),
),
appBuilder( // 113
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(112),
ptrBuilder(93),
),
appBuilder( // 114
comBuilder(5,36,List(0, 1, 2, 3, 4, 2)), // X(X(X(XX)))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(92),
ptrBuilder(110),
ptrBuilder(93),
),
appBuilder( // 115
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(114),
ptrBuilder(93),
),
appBuilder( // 116
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
ptrBuilder(115),
ptrBuilder(113),
ptrBuilder(110),
ptrBuilder(111),
),
appBuilder( // 117
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(92),
ptrBuilder(110),
),
appBuilder( // 118
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(97),
ptrBuilder(110),
),
 // FUN35NanoPrelude.replicate
appBuilder( // 119
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(121),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 120
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
prmBuilder("<="),
intBuilder(0),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 121
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(120),
ptrBuilder(119),
prmBuilder("-"),
intBuilder(1),
),
 // FUN36Clausify.eqv
appBuilder( // 122
comBuilder(5,46,List(0, 4, 1, 2, 3, 4)), // XX(XXXX)
ptrBuilder(123),
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(92),
ptrBuilder(93),
),
appBuilder( // 123
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(97),
ptrBuilder(92),
ptrBuilder(93),
),
)
}