package benchmarks
import common.Helper._
 
// Functions in this file: 33
// Apps in this file: 112
// Combinators in this file: 243
object Countdown extends Benchmark {
override def toString() = "Countdown" 
val combinatorCount = 243
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
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(9),
ptrBuilder(15),
ptrBuilder(101),
),
 // FUN3Data.List_Type.concatMap
appBuilder( // 9
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 14
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(13),
),
 // FUN5Countdown.solns
appBuilder( // 15
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
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
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,9,List(4, 0, 1, 2, 3)), // XXXXX
prmBuilder("=="),
),
appBuilder( // 18
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)), // X(XX)XXX
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
),
appBuilder( // 19
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(18),
ptrBuilder(17),
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 20
comBuilder(5,18,List(3, 0, 1, 2, 4)), // X(XXXX)
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(20),
),
 // FUN7Countdown.results
appBuilder( // 22
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
comBuilder(2,0,List(0)), // X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(25),
ptrBuilder(23),
),
appBuilder( // 23
comBuilder(5,33,List(0, 1, 2, 4, 4, 3)), // X(X(XX)X)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(100),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 24
ptrBuilder(9),
ptrBuilder(28),
),
appBuilder( // 25
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,50,List(0, 4, 1, 2, 3, 4)), // XX(X(X(XX)))
ptrBuilder(26),
ptrBuilder(24),
ptrBuilder(89),
comBuilder(4,2,List(3, 0, 1)), // XXX
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
comBuilder(5,18,List(4, 0, 1, 2, 3)), // X(XXXX)
comBuilder(4,13,List(0, 1, 2, 3, 2)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(29),
ptrBuilder(22),
),
appBuilder( // 29
ptrBuilder(30),
ptrBuilder(34),
),
 // FUN10Countdown.concatProdWith
appBuilder( // 30
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(33),
),
appBuilder( // 31
comBuilder(6,61,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)X))
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(12),
ptrBuilder(9),
),
appBuilder( // 32
comBuilder(5,23,List(0, 1, 3, 4, 2, 3)), // XXXXXX
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(6,44,List(0, 5, 1, 2, 3, 4)), // X(XX)(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(32),
),
 // FUN11Countdown.combine
appBuilder( // 34
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(40),
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(88),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(87),
ptrBuilder(35),
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(86),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(85),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(9),
ptrBuilder(41),
),
appBuilder( // 40
comBuilder(5,16,List(0, 3, 1, 4, 2)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(39),
ptrBuilder(38),
),
 // FUN12Countdown.combi
appBuilder( // 41
comBuilder(5,30,List(0, 4, 1, 3, 4, 2)), // XX(XXX)X
ptrBuilder(47),
ptrBuilder(43),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 42
comBuilder(5,18,List(0, 1, 4, 2, 3)), // X(XXXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(69),
),
appBuilder( // 43
comBuilder(6,26,List(0, 1, 3, 5, 2, 4)), // X(XXX)XX
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)), // XX(XXXX)
ptrBuilder(42),
ptrBuilder(70),
),
appBuilder( // 44
comBuilder(5,9,List(0, 4, 2, 3, 1)), // XXXXX
ptrBuilder(48),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 45
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
),
appBuilder( // 46
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(45),
ptrBuilder(44),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 47
comBuilder(6,25,List(0, 1, 2, 4, 5, 3)), // XX(XX)XX
ptrBuilder(46),
),
 // FUN13Countdown.valid
appBuilder( // 48
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(57),
),
appBuilder( // 49
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,26,List(0, 5, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 1, 3, 2)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 50
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)), // X(X(XX)XX)
ptrBuilder(49),
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(59),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 51
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
prmBuilder("=="),
intBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 52
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,41,List(0, 1, 4, 2, 4, 3)), // X(X(XX))(XX)
prmBuilder("<"),
intBuilder(3),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(52),
),
appBuilder( // 54
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)), // XXX(XX)X
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
ptrBuilder(53),
ptrBuilder(58),
prmBuilder("<="),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 55
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 56
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)), // X(XX)(XXX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(55),
ptrBuilder(54),
),
appBuilder( // 57
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(56),
ptrBuilder(50),
comBuilder(2,0,List(1)), // X
),
 // FUN14Data.Bool.not
appBuilder( // 58
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN15NanoPrelude.mod
appBuilder( // 59
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(60),
comBuilder(2,0,List(1)), // X
),
 // FUN16NanoPrelude.divMod
appBuilder( // 60
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
yBuilder(),
ptrBuilder(68),
comBuilder(2,2,List(1, 0, 1)), // XXX
),
appBuilder( // 61
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 62
comBuilder(5,53,List(0, 1, 1, 4, 2, 3)), // X(XX(XX)X)
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<="),
comBuilder(3,2,List(2, 1, 0)), // XXX
),
appBuilder( // 63
comBuilder(5,49,List(0, 4, 1, 2, 3, 4)), // XX(X(XXX))
ptrBuilder(62),
ptrBuilder(61),
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("-"),
),
appBuilder( // 64
comBuilder(6,28,List(0, 4, 1, 2, 5, 3)), // XXX(XX)X
comBuilder(5,16,List(0, 4, 1, 2, 3)), // XX(XXX)
comBuilder(3,7,List(0, 2, 1, 2)), // X(XXX)
ptrBuilder(63),
),
appBuilder( // 65
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
comBuilder(5,42,List(4, 0, 3, 1, 2, 3)), // XXX(XXX)
prmBuilder("<="),
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 66
comBuilder(5,37,List(0, 4, 1, 2, 4, 3)), // XXXX(XX)
ptrBuilder(65),
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
prmBuilder("-"),
),
appBuilder( // 67
comBuilder(5,28,List(0, 1, 2, 3, 4, 4)), // XXX(XX)X
comBuilder(5,14,List(0, 1, 3, 2, 4)), // XXX(XX)
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)), // XXXX(XX)
prmBuilder("<="),
ptrBuilder(66),
),
appBuilder( // 68
comBuilder(6,27,List(0, 1, 2, 5, 3, 4)), // X(X(XX))XX
comBuilder(5,40,List(0, 1, 2, 4, 3, 2)), // X(XXX)(XX)
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(67),
ptrBuilder(64),
prmBuilder("+"),
),
 // FUN17Countdown.App
appBuilder( // 69
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
intBuilder(5),
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
),
 // FUN18Countdown.apply
appBuilder( // 70
comBuilder(4,14,List(0, 2, 3, 1, 3)), // XXX(XX)
ptrBuilder(78),
ptrBuilder(72),
),
appBuilder( // 71
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,26,List(0, 5, 1, 2, 3, 4)), // X(XXX)XX
comBuilder(4,15,List(0, 3, 1, 3, 2)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(1),
),
appBuilder( // 72
comBuilder(5,41,List(0, 1, 2, 4, 4, 3)), // X(X(XX))(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(71),
ptrBuilder(84),
prmBuilder("+"),
),
appBuilder( // 73
comBuilder(4,4,List(3, 0, 1, 2)), // XXXX
prmBuilder("=="),
intBuilder(3),
intBuilder(0),
),
appBuilder( // 74
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,41,List(0, 1, 4, 2, 4, 3)), // X(X(XX))(XX)
prmBuilder("<"),
intBuilder(3),
ptrBuilder(73),
),
appBuilder( // 75
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(74),
),
appBuilder( // 76
comBuilder(5,39,List(0, 1, 4, 2, 3, 4)), // XX(XX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(75),
prmBuilder("-"),
ptrBuilder(79),
),
appBuilder( // 77
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
prmBuilder("<"),
intBuilder(2),
),
appBuilder( // 78
comBuilder(6,43,List(0, 4, 1, 2, 3, 5)), // XXX(X(XX))
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(77),
ptrBuilder(76),
),
 // FUN19Countdown.mul
appBuilder( // 79
comBuilder(2,2,List(0, 1, 1)), // XXX
ptrBuilder(83),
),
appBuilder( // 80
comBuilder(5,49,List(0, 1, 2, 4, 3, 4)), // XX(X(XXX))
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)), // X(XXX)XX
comBuilder(5,51,List(0, 4, 1, 2, 3, 2)), // X(XXXXX)
ptrBuilder(79),
prmBuilder("+"),
),
appBuilder( // 81
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(80),
prmBuilder("+"),
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 82
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,42,List(0, 5, 1, 2, 3, 4)), // XXX(XXX)
ptrBuilder(60),
intBuilder(2),
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(81),
),
appBuilder( // 83
comBuilder(5,42,List(0, 1, 2, 3, 4, 4)), // XXX(XXX)
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(1),
ptrBuilder(82),
),
 // FUN20NanoPrelude.div
appBuilder( // 84
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(60),
comBuilder(2,0,List(0)), // X
),
 // FUN21Countdown.Add
appBuilder( // 85
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(1,0,List(0)), // X
),
 // FUN22Countdown.Sub
appBuilder( // 86
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(3),
comBuilder(1,0,List(0)), // X
),
 // FUN23Countdown.Mul
appBuilder( // 87
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(2),
comBuilder(1,0,List(0)), // X
),
 // FUN24Countdown.Div
appBuilder( // 88
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
comBuilder(1,0,List(0)), // X
),
 // FUN25Countdown.split
appBuilder( // 89
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(93),
),
appBuilder( // 90
comBuilder(6,61,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)X))
ptrBuilder(94),
ptrBuilder(97),
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(1,0,List(0)), // X
),
appBuilder( // 91
comBuilder(6,46,List(0, 1, 2, 3, 4, 5)), // XX(XXXX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(5,12,List(4, 0, 2, 1, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 92
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(91),
ptrBuilder(90),
ptrBuilder(89),
),
appBuilder( // 93
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(26),
ptrBuilder(92),
comBuilder(2,0,List(0)), // X
),
 // FUN26NanoPrelude.map
appBuilder( // 94
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(96),
),
appBuilder( // 95
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 96
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(95),
),
 // FUN27Countdown.cross
appBuilder( // 97
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(99),
),
appBuilder( // 98
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 99
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
ptrBuilder(98),
),
 // FUN28Countdown.Val
appBuilder( // 100
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
intBuilder(4),
comBuilder(2,1,List(1, 0)), // XX
),
 // FUN29Countdown.choices
appBuilder( // 101
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(102),
ptrBuilder(109),
),
appBuilder( // 102
ptrBuilder(9),
ptrBuilder(103),
),
 // FUN30Countdown.perms
appBuilder( // 103
comBuilder(5,12,List(4, 0, 1, 2, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
ptrBuilder(104),
),
appBuilder( // 104
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(9),
ptrBuilder(105),
ptrBuilder(103),
),
 // FUN31Countdown.interleave
appBuilder( // 105
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)), // X(XX(XXX))
yBuilder(),
ptrBuilder(108),
ptrBuilder(107),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 106
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)), // X(XXX(XX))
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
comBuilder(4,14,List(0, 1, 2, 1, 3)), // XXX(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 107
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
ptrBuilder(106),
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(94),
),
appBuilder( // 108
comBuilder(6,60,List(0, 1, 2, 3, 4, 5)), // X(X(XXXX))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,2,List(0, 2, 1)), // XXX
comBuilder(4,54,List(3, 0, 0, 2, 1, 1)), // X(X(XXX)X)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN32Countdown.subs
appBuilder( // 109
comBuilder(5,12,List(4, 0, 1, 2, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
ptrBuilder(111),
),
appBuilder( // 110
comBuilder(6,43,List(0, 1, 2, 3, 4, 5)), // XXX(X(XX))
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(12),
ptrBuilder(94),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 111
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(110),
ptrBuilder(109),
),
)
}