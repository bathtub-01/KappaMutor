package benchmarks
import common.Helper._
 
// Functions in this file: 33
// Apps in this file: 119
// Combinators in this file: 228
object Countdown extends Benchmark {
override def toString() = "Countdown" 
val combinatorCount = 228
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
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(6),
),
 // FUN2Countdown.solutions
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(9),
ptrBuilder(105),
),
appBuilder( // 9
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(10),
ptrBuilder(16),
),
 // FUN3Data.List_Type.concatMap
appBuilder( // 10
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(11),
),
 // FUN4Data.List_Type.++
appBuilder( // 13
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(15),
),
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 15
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(14),
),
 // FUN5Countdown.solns
appBuilder( // 16
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(17),
ptrBuilder(21),
),
 // FUN6Countdown.preImage
appBuilder( // 17
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(20),
),
appBuilder( // 18
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
prmBuilder("=="),
),
appBuilder( // 19
comBuilder(6,34,List(0, 1, 3, 4, 5, 2)), // X(XX(XX))X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(18),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 20
comBuilder(6,47,List(5, 0, 1, 2, 3, 4)), // XX(X(XX)X)
comBuilder(2,0,List(0)), // X
comBuilder(4,56,List(2, 0, 1, 3, 1, 3)), // X(XXX(XX))
ptrBuilder(19),
),
 // FUN7Countdown.results
appBuilder( // 21
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(25),
),
appBuilder( // 22
comBuilder(5,33,List(0, 1, 2, 4, 4, 3)), // X(X(XX)X)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(104),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 23
ptrBuilder(10),
ptrBuilder(28),
),
appBuilder( // 24
comBuilder(5,50,List(0, 4, 1, 2, 3, 4)), // XX(X(X(XX)))
ptrBuilder(26),
ptrBuilder(23),
ptrBuilder(93),
),
appBuilder( // 25
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(24),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(22),
),
 // FUN8NanoPrelude.null
appBuilder( // 26
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(27),
),
appBuilder( // 27
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN9Countdown.combinedResults
appBuilder( // 28
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(30),
),
appBuilder( // 29
ptrBuilder(31),
ptrBuilder(35),
),
appBuilder( // 30
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(29),
ptrBuilder(21),
),
 // FUN10Countdown.concatProdWith
appBuilder( // 31
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(34),
),
appBuilder( // 32
comBuilder(6,61,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)X))
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(13),
ptrBuilder(10),
),
appBuilder( // 33
comBuilder(5,23,List(0, 1, 3, 4, 2, 3)), // XXXXXX
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(6,44,List(0, 5, 1, 2, 3, 4)), // X(XX)(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(33),
),
 // FUN11Countdown.combine
appBuilder( // 35
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(42),
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(92),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(91),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(90),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(89),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(10),
),
appBuilder( // 41
comBuilder(5,19,List(1, 0, 2, 4, 3)), // X(X(XX)X)
ptrBuilder(40),
),
appBuilder( // 42
comBuilder(5,11,List(0, 3, 1, 4, 2)), // XX(XX)X
ptrBuilder(41),
ptrBuilder(43),
ptrBuilder(39),
),
 // FUN12Countdown.combi
appBuilder( // 43
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(49),
ptrBuilder(45),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 44
comBuilder(5,18,List(0, 1, 4, 2, 3)), // X(XXXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(73),
),
appBuilder( // 45
comBuilder(6,26,List(0, 1, 3, 5, 2, 4)), // X(XXX)XX
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)), // XX(XXXX)
ptrBuilder(44),
ptrBuilder(74),
),
appBuilder( // 46
comBuilder(5,9,List(0, 4, 2, 3, 1)), // XXXXX
ptrBuilder(50),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 47
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
),
appBuilder( // 48
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(47),
ptrBuilder(46),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 49
comBuilder(6,25,List(0, 1, 2, 4, 5, 3)), // XX(XX)XX
ptrBuilder(48),
),
 // FUN13Countdown.valid
appBuilder( // 50
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(59),
),
appBuilder( // 51
comBuilder(6,26,List(0, 5, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 1, 3, 2)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 52
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
ptrBuilder(51),
ptrBuilder(61),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 53
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
prmBuilder("=="),
intBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 54
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,41,List(0, 1, 4, 2, 4, 3)), // X(X(XX))(XX)
prmBuilder("<"),
intBuilder(3),
ptrBuilder(53),
),
appBuilder( // 55
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(54),
ptrBuilder(60),
),
appBuilder( // 56
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 57
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(56),
),
appBuilder( // 58
comBuilder(5,19,List(0, 1, 4, 2, 3)), // X(X(XX)X)
ptrBuilder(57),
ptrBuilder(55),
prmBuilder("<="),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 59
comBuilder(4,16,List(0, 3, 1, 3, 2)), // XX(XXX)
ptrBuilder(58),
ptrBuilder(52),
comBuilder(2,0,List(1)), // X
),
 // FUN14Data.Bool.not
appBuilder( // 60
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN15NanoPrelude.mod
appBuilder( // 61
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(62),
comBuilder(2,0,List(1)), // X
),
 // FUN16NanoPrelude.divMod
appBuilder( // 62
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(72),
),
appBuilder( // 63
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 64
comBuilder(5,53,List(0, 1, 1, 4, 2, 3)), // X(XX(XX)X)
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<="),
comBuilder(3,2,List(2, 1, 0)), // XXX
),
appBuilder( // 65
comBuilder(4,9,List(0, 3, 1, 2, 3)), // XXXXX
ptrBuilder(64),
ptrBuilder(63),
prmBuilder("-"),
),
appBuilder( // 66
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,16,List(0, 1, 3, 2, 3)), // XX(XXX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(65),
prmBuilder("+"),
),
appBuilder( // 67
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(66),
),
appBuilder( // 68
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
),
appBuilder( // 69
comBuilder(5,16,List(0, 1, 2, 3, 4)), // XX(XXX)
comBuilder(5,37,List(4, 0, 3, 1, 2, 4)), // XXXX(XX)
prmBuilder("<="),
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 70
comBuilder(4,31,List(0, 3, 1, 3, 2, 3)), // XX(X(XX))X
ptrBuilder(69),
ptrBuilder(68),
prmBuilder("-"),
),
appBuilder( // 71
comBuilder(5,40,List(0, 1, 2, 4, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)), // XXXX(XX)
prmBuilder("<="),
ptrBuilder(70),
),
appBuilder( // 72
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,16,List(0, 2, 2, 1, 2)), // XX(XXX)
ptrBuilder(71),
ptrBuilder(67),
prmBuilder("+"),
),
 // FUN17Countdown.App
appBuilder( // 73
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
intBuilder(5),
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
),
 // FUN18Countdown.apply
appBuilder( // 74
comBuilder(5,48,List(0, 3, 1, 4, 2, 4)), // XX(XX(XX))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(82),
ptrBuilder(76),
),
appBuilder( // 75
comBuilder(6,26,List(0, 5, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 1, 3, 2)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 76
comBuilder(5,39,List(0, 1, 2, 4, 4, 3)), // XX(XX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(75),
ptrBuilder(88),
prmBuilder("+"),
),
appBuilder( // 77
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
prmBuilder("=="),
intBuilder(3),
intBuilder(0),
),
appBuilder( // 78
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,41,List(0, 1, 4, 2, 4, 3)), // X(X(XX))(XX)
prmBuilder("<"),
intBuilder(3),
ptrBuilder(77),
),
appBuilder( // 79
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(78),
),
appBuilder( // 80
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 81
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(80),
),
appBuilder( // 82
comBuilder(5,57,List(0, 1, 4, 2, 3, 4)), // X(X(XX)(XX))
ptrBuilder(81),
ptrBuilder(79),
prmBuilder("-"),
ptrBuilder(83),
),
 // FUN19Countdown.mul
appBuilder( // 83
comBuilder(4,35,List(0, 1, 2, 3, 3, 3)), // X(X(XXX))X
ptrBuilder(87),
ptrBuilder(86),
ptrBuilder(85),
),
appBuilder( // 84
comBuilder(5,49,List(0, 1, 2, 4, 3, 4)), // XX(X(XXX))
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)), // X(XXX)XX
comBuilder(5,51,List(0, 4, 1, 2, 3, 2)), // X(XXXXX)
ptrBuilder(83),
prmBuilder("+"),
),
appBuilder( // 85
comBuilder(6,51,List(0, 1, 5, 2, 3, 4)), // X(XXXXX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(84),
prmBuilder("+"),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 86
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(62),
intBuilder(2),
),
appBuilder( // 87
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(1),
),
 // FUN20NanoPrelude.div
appBuilder( // 88
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(62),
comBuilder(2,0,List(0)), // X
),
 // FUN21Countdown.Add
appBuilder( // 89
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(1,0,List(0)), // X
),
 // FUN22Countdown.Sub
appBuilder( // 90
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(3),
comBuilder(1,0,List(0)), // X
),
 // FUN23Countdown.Mul
appBuilder( // 91
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(2),
comBuilder(1,0,List(0)), // X
),
 // FUN24Countdown.Div
appBuilder( // 92
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
comBuilder(1,0,List(0)), // X
),
 // FUN25Countdown.split
appBuilder( // 93
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(97),
),
appBuilder( // 94
comBuilder(6,61,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)X))
ptrBuilder(98),
ptrBuilder(101),
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(1,0,List(0)), // X
),
appBuilder( // 95
comBuilder(6,49,List(0, 1, 2, 3, 4, 5)), // XX(X(XXX))
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 96
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(95),
ptrBuilder(94),
ptrBuilder(93),
),
appBuilder( // 97
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(26),
ptrBuilder(96),
comBuilder(2,0,List(0)), // X
),
 // FUN26NanoPrelude.map
appBuilder( // 98
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(100),
),
appBuilder( // 99
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 100
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(99),
),
 // FUN27Countdown.cross
appBuilder( // 101
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(103),
),
appBuilder( // 102
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 103
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
ptrBuilder(102),
),
 // FUN28Countdown.Val
appBuilder( // 104
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN29Countdown.choices
appBuilder( // 105
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(106),
ptrBuilder(115),
),
appBuilder( // 106
ptrBuilder(10),
ptrBuilder(107),
),
 // FUN30Countdown.perms
appBuilder( // 107
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(109),
ptrBuilder(108),
),
appBuilder( // 108
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(10),
ptrBuilder(110),
ptrBuilder(107),
),
appBuilder( // 109
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN31Countdown.interleave
appBuilder( // 110
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
yBuilder(),
ptrBuilder(114),
ptrBuilder(111),
),
appBuilder( // 111
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(98),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 112
comBuilder(6,34,List(0, 1, 2, 3, 5, 4)), // X(XX(XX))X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 113
comBuilder(5,12,List(0, 1, 2, 4, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 114
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(113),
ptrBuilder(112),
),
 // FUN32Countdown.subs
appBuilder( // 115
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(118),
ptrBuilder(117),
),
appBuilder( // 116
comBuilder(6,59,List(0, 1, 2, 3, 4, 5)), // X(XX(X(XX)))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(13),
ptrBuilder(98),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 117
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(116),
ptrBuilder(115),
),
appBuilder( // 118
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
)
}