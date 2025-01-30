package benchmarks
import common.Helper._
 
// Functions in this file: 38
// Apps in this file: 115
// Combinators in this file: 233
object Sumpuz extends Benchmark {
override def toString() = "Sumpuz" 
val combinatorCount = 233
val prog = Seq(
 // FUN0Sumpuz.main
appBuilder( // 0
comBuilder(2,4,List(0, 1, 1, 1)), // XXXX
ptrBuilder(10),
ptrBuilder(9),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(3),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(8),
ptrBuilder(4),
),
 // FUN1Sumpuz.count
appBuilder( // 10
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(11),
ptrBuilder(15),
),
 // FUN2Sumpuz.sumMap
appBuilder( // 11
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(12),
intBuilder(0),
),
 // FUN3Sumpuz.sumMapAcc
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(6,46,List(0, 3, 2, 5, 1, 4)), // XX(XXXX)
comBuilder(3,2,List(0, 2, 1)), // XXX
prmBuilder("+"),
),
appBuilder( // 14
comBuilder(5,46,List(3, 4, 0, 1, 2, 4)), // XX(XXXX)
ptrBuilder(13),
),
 // FUN4Sumpuz.fx
appBuilder( // 15
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
ptrBuilder(11),
ptrBuilder(16),
),
 // FUN5Sumpuz.fy
appBuilder( // 16
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(11),
ptrBuilder(17),
),
 // FUN6Sumpuz.fz
appBuilder( // 17
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(18),
intBuilder(0),
intBuilder(1),
),
 // FUN7Sumpuz.valid
appBuilder( // 18
comBuilder(5,40,List(0, 1, 4, 2, 3, 4)), // X(XXX)(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(23),
ptrBuilder(25),
ptrBuilder(22),
),
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 20
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(28),
ptrBuilder(31),
ptrBuilder(19),
),
appBuilder( // 21
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)), // XXX(XXX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(24),
ptrBuilder(25),
prmBuilder("=="),
),
appBuilder( // 22
comBuilder(4,14,List(0, 3, 1, 2, 3)), // XXX(XX)
ptrBuilder(21),
ptrBuilder(25),
ptrBuilder(20),
),
appBuilder( // 23
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)), // XXX(XXX)
comBuilder(5,22,List(0, 1, 2, 3, 4)), // X(X(X(XX)))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(24),
ptrBuilder(25),
prmBuilder("=="),
),
 // FUN8Data.Bool.&&
appBuilder( // 24
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9NanoPrelude.length
appBuilder( // 25
yBuilder(),
ptrBuilder(27),
intBuilder(0),
),
appBuilder( // 26
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 27
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(26),
),
 // FUN10Sumpuz.isSingleton
appBuilder( // 28
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(30),
),
appBuilder( // 29
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 30
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(29),
),
 // FUN11Sumpuz.solutions
appBuilder( // 31
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(52),
ptrBuilder(51),
ptrBuilder(43),
ptrBuilder(54),
),
appBuilder( // 32
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
ptrBuilder(108),
ptrBuilder(114),
intBuilder(1),
intBuilder(0),
intBuilder(9),
),
appBuilder( // 33
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)), // X(X(XX)XX)
ptrBuilder(108),
ptrBuilder(114),
ptrBuilder(107),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 34
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)), // X(XX)(XXX)
ptrBuilder(55),
ptrBuilder(106),
ptrBuilder(33),
intBuilder(9),
),
appBuilder( // 35
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,19,List(0, 1, 2, 4, 3)), // X(X(XX)X)
ptrBuilder(83),
ptrBuilder(34),
ptrBuilder(55),
),
appBuilder( // 36
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(35),
ptrBuilder(32),
),
appBuilder( // 37
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,36,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)))X
comBuilder(1,0,List(0)), // X
ptrBuilder(83),
),
appBuilder( // 38
comBuilder(6,55,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX))X)
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
ptrBuilder(38),
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(89),
ptrBuilder(53),
ptrBuilder(106),
),
appBuilder( // 40
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,21,List(0, 1, 2, 4, 3)), // X(X(XXX))
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)), // XXX(XX)X
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)), // XXX(XXX)
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
comBuilder(2,0,List(0)), // X
),
appBuilder( // 42
comBuilder(6,49,List(0, 1, 2, 3, 5, 4)), // XX(X(XXX))
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)), // X(XXX)XX
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
ptrBuilder(41),
ptrBuilder(40),
ptrBuilder(31),
),
appBuilder( // 43
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(42),
ptrBuilder(107),
ptrBuilder(36),
),
appBuilder( // 44
comBuilder(6,30,List(0, 5, 1, 2, 3, 4)), // XX(XXX)X
ptrBuilder(55),
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 45
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(44),
ptrBuilder(54),
),
appBuilder( // 46
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(53),
prmBuilder("=="),
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 47
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(6,41,List(0, 1, 2, 5, 3, 4)), // X(X(XX))(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(46),
ptrBuilder(45),
),
appBuilder( // 48
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(47),
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 49
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(53),
prmBuilder("=="),
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 50
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(49),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(54),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 51
comBuilder(5,57,List(2, 3, 0, 4, 1, 4)), // X(X(XX)(XX))
ptrBuilder(50),
ptrBuilder(48),
),
appBuilder( // 52
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)), // XXX(XXX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
),
 // FUN12NanoPrelude.fst
appBuilder( // 53
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN13NanoPrelude.snd
appBuilder( // 54
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN14Sumpuz.bindings
appBuilder( // 55
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(62),
ptrBuilder(57),
),
appBuilder( // 56
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 57
comBuilder(6,37,List(0, 5, 3, 1, 2, 4)), // XXXX(XX)
ptrBuilder(81),
comBuilder(2,0,List(0)), // X
ptrBuilder(56),
),
appBuilder( // 58
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(70),
ptrBuilder(73),
ptrBuilder(74),
),
appBuilder( // 59
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(58),
ptrBuilder(80),
),
appBuilder( // 60
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(69),
),
appBuilder( // 61
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(66),
ptrBuilder(60),
ptrBuilder(59),
),
appBuilder( // 62
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(63),
ptrBuilder(61),
),
 // FUN15NanoPrelude.lookup
appBuilder( // 63
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(65),
),
appBuilder( // 64
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)), // XXX(XX)X
comBuilder(6,28,List(0, 1, 2, 4, 5, 3)), // XXX(XX)X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
comBuilder(3,1,List(2, 0)), // XX
),
appBuilder( // 65
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(0)), // X
comBuilder(3,3,List(1, 0, 2)), // X(XX)
ptrBuilder(64),
),
 // FUN16NanoPrelude.map
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
 // FUN17Data.List_Type.:
appBuilder( // 69
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN18NanoPrelude.zip
appBuilder( // 70
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(72),
),
appBuilder( // 71
comBuilder(6,30,List(0, 1, 2, 3, 5, 4)), // XX(XXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 72
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(71),
ptrBuilder(70),
),
 // FUN19NanoPrelude.repeat
appBuilder( // 73
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(73),
),
 // FUN20Sumpuz.diff
appBuilder( // 74
ptrBuilder(76),
ptrBuilder(75),
),
appBuilder( // 75
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(78),
),
 // FUN21NanoPrelude.foldl
appBuilder( // 76
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(77),
),
appBuilder( // 77
comBuilder(5,28,List(0, 1, 3, 2, 4, 4)), // XXX(XX)X
comBuilder(5,16,List(4, 3, 0, 1, 2)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
 // FUN22Sumpuz.del
appBuilder( // 78
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)), // X(XXX(XX))
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(79),
),
appBuilder( // 79
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,13,List(0, 1, 2, 3, 3)), // X(X(XX))X
prmBuilder("=="),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN23Sumpuz.rng
appBuilder( // 80
ptrBuilder(66),
ptrBuilder(54),
),
 // FUN24NanoPrelude.elem
appBuilder( // 81
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)), // X(XXX(XX))
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(82),
),
appBuilder( // 82
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(5,10,List(0, 1, 4, 3, 2)), // X(XX)XX
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
prmBuilder("=="),
comBuilder(2,0,List(1)), // X
),
 // FUN25Sumpuz.ofAll
appBuilder( // 83
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(85),
),
appBuilder( // 84
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(86),
),
appBuilder( // 85
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(84),
),
 // FUN26Data.List_Type.++
appBuilder( // 86
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(88),
),
appBuilder( // 87
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 88
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(87),
),
 // FUN27Sumpuz.solns
appBuilder( // 89
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(97),
ptrBuilder(94),
),
appBuilder( // 90
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(104),
),
appBuilder( // 91
comBuilder(5,37,List(0, 4, 2, 1, 3, 4)), // XXXX(XX)
ptrBuilder(104),
prmBuilder("+"),
),
appBuilder( // 92
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(91),
ptrBuilder(90),
),
appBuilder( // 93
comBuilder(6,51,List(0, 1, 4, 5, 2, 3)), // X(XXXXX)
ptrBuilder(99),
),
appBuilder( // 94
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(93),
ptrBuilder(92),
prmBuilder("+"),
),
appBuilder( // 95
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)), // X(X(XX)X)X
ptrBuilder(55),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(54),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 96
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(83),
ptrBuilder(98),
ptrBuilder(53),
),
appBuilder( // 97
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(96),
ptrBuilder(95),
),
 // FUN28NanoPrelude.curry
appBuilder( // 98
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN29Sumpuz.divMod10
appBuilder( // 99
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(103),
ptrBuilder(100),
),
appBuilder( // 100
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 101
comBuilder(4,7,List(0, 3, 1, 2)), // X(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 102
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
ptrBuilder(99),
prmBuilder("-"),
intBuilder(10),
ptrBuilder(101),
),
appBuilder( // 103
comBuilder(4,14,List(3, 0, 1, 2, 3)), // XXX(XX)
prmBuilder("<="),
intBuilder(9),
ptrBuilder(102),
),
 // FUN30Sumpuz.img
appBuilder( // 104
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(105),
ptrBuilder(63),
),
 // FUN31NanoPrelude.fromJust
appBuilder( // 105
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(4),
comBuilder(1,0,List(0)), // X
),
 // FUN32NanoPrelude.head
appBuilder( // 106
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(3),
comBuilder(2,0,List(0)), // X
),
 // FUN33NanoPrelude.tail
appBuilder( // 107
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN34NanoPrelude.enumFromTo
appBuilder( // 108
comBuilder(6,39,List(0, 1, 2, 3, 4, 5)), // XX(XX)(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(109),
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
ptrBuilder(113),
),
 // FUN35NanoPrelude.takeWhile
appBuilder( // 109
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(112),
),
appBuilder( // 110
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 111
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(110),
),
appBuilder( // 112
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(111),
),
 // FUN36NanoPrelude.enumFrom
appBuilder( // 113
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(113),
prmBuilder("+"),
intBuilder(1),
),
 // FUN37Sumpuz.ifNull
appBuilder( // 114
comBuilder(4,5,List(0, 2, 3, 1)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,0,List(0)), // X
),
)
}