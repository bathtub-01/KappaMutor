package benchmarks
import common.Helper._
 
// Functions in this file: 38
// Apps in this file: 118
// Combinators in this file: 219
object Sumpuz extends Benchmark {
override def toString() = "Sumpuz" 
val combinatorCount = 219
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
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(24),
ptrBuilder(22),
),
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 20
comBuilder(6,30,List(0, 1, 2, 5, 3, 4)), // XX(XXX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(25),
ptrBuilder(26),
prmBuilder("=="),
ptrBuilder(26),
),
appBuilder( // 21
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)), // X(XX(XX)X)
ptrBuilder(20),
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(29),
),
appBuilder( // 22
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(21),
ptrBuilder(32),
ptrBuilder(19),
),
appBuilder( // 23
comBuilder(5,22,List(0, 1, 2, 3, 4)), // X(X(X(XX)))
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(25),
),
appBuilder( // 24
comBuilder(6,54,List(0, 1, 2, 5, 3, 4)), // X(X(XXX)X)
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(23),
ptrBuilder(26),
prmBuilder("=="),
ptrBuilder(26),
),
 // FUN8Data.Bool.&&
appBuilder( // 25
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9NanoPrelude.length
appBuilder( // 26
yBuilder(),
ptrBuilder(28),
intBuilder(0),
),
appBuilder( // 27
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 28
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(27),
),
 // FUN10Sumpuz.isSingleton
appBuilder( // 29
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(31),
),
appBuilder( // 30
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(30),
),
 // FUN11Sumpuz.solutions
appBuilder( // 32
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(51),
ptrBuilder(42),
),
appBuilder( // 33
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)), // X(XXXX)X
ptrBuilder(109),
ptrBuilder(117),
intBuilder(1),
intBuilder(0),
intBuilder(9),
),
appBuilder( // 34
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)), // X(X(XX)XX)
ptrBuilder(109),
ptrBuilder(117),
ptrBuilder(108),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 35
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)), // X(XX)(XXX)
ptrBuilder(54),
ptrBuilder(107),
ptrBuilder(34),
intBuilder(9),
),
appBuilder( // 36
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,19,List(0, 1, 2, 4, 3)), // X(X(XX)X)
ptrBuilder(84),
ptrBuilder(35),
ptrBuilder(54),
),
appBuilder( // 37
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(36),
ptrBuilder(33),
ptrBuilder(53),
),
appBuilder( // 38
comBuilder(6,36,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX)))X
comBuilder(1,0,List(0)), // X
ptrBuilder(84),
),
appBuilder( // 39
comBuilder(6,58,List(0, 1, 2, 3, 5, 4)), // X(XX(XXX))
comBuilder(5,40,List(0, 1, 4, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(6,55,List(0, 1, 2, 3, 5, 4)), // X(X(X(XX))X)
comBuilder(5,37,List(0, 4, 1, 2, 3, 4)), // XXXX(XX)
ptrBuilder(39),
ptrBuilder(90),
ptrBuilder(52),
),
appBuilder( // 41
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(5,37,List(0, 4, 1, 2, 3, 4)), // XXXX(XX)
ptrBuilder(40),
ptrBuilder(107),
ptrBuilder(32),
),
appBuilder( // 42
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(41),
ptrBuilder(108),
ptrBuilder(37),
),
appBuilder( // 43
comBuilder(4,6,List(0, 1, 3, 2)), // XX(XX)
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 44
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 45
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(52),
prmBuilder("=="),
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 46
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(6,60,List(0, 1, 2, 5, 3, 4)), // X(X(XXXX))
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(45),
ptrBuilder(54),
ptrBuilder(44),
),
appBuilder( // 47
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
comBuilder(4,6,List(0, 3, 1, 2)), // XX(XX)
ptrBuilder(46),
ptrBuilder(53),
comBuilder(3,0,List(0)), // X
),
appBuilder( // 48
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(52),
prmBuilder("=="),
intBuilder(0),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 49
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(48),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(53),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 50
comBuilder(5,44,List(3, 0, 4, 1, 4, 2)), // X(XX)(XXX)
ptrBuilder(49),
ptrBuilder(47),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 51
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(50),
ptrBuilder(43),
),
 // FUN12NanoPrelude.fst
appBuilder( // 52
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN13NanoPrelude.snd
appBuilder( // 53
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN14Sumpuz.bindings
appBuilder( // 54
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(61),
ptrBuilder(56),
),
appBuilder( // 55
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 56
comBuilder(6,37,List(0, 5, 3, 1, 2, 4)), // XXXX(XX)
ptrBuilder(81),
comBuilder(2,0,List(0)), // X
ptrBuilder(55),
),
appBuilder( // 57
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(68),
),
appBuilder( // 58
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(65),
ptrBuilder(57),
),
appBuilder( // 59
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)), // X(XX(XX)X)
ptrBuilder(58),
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
),
appBuilder( // 60
comBuilder(6,27,List(0, 1, 2, 5, 3, 4)), // X(X(XX))XX
ptrBuilder(59),
ptrBuilder(69),
ptrBuilder(72),
ptrBuilder(73),
ptrBuilder(80),
),
appBuilder( // 61
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(62),
ptrBuilder(60),
),
 // FUN15NanoPrelude.lookup
appBuilder( // 62
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
yBuilder(),
ptrBuilder(64),
ptrBuilder(63),
),
appBuilder( // 63
comBuilder(6,34,List(0, 1, 2, 5, 3, 4)), // X(XX(XX))X
comBuilder(5,19,List(3, 0, 2, 4, 1)), // X(X(XX)X)
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
comBuilder(3,1,List(2, 0)), // XX
),
appBuilder( // 64
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN16NanoPrelude.map
appBuilder( // 65
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(67),
),
appBuilder( // 66
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 67
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(66),
),
 // FUN17Data.List_Type.:
appBuilder( // 68
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN18NanoPrelude.zip
appBuilder( // 69
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(71),
),
appBuilder( // 70
comBuilder(6,30,List(0, 1, 2, 3, 5, 4)), // XX(XXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,2,List(2, 0, 1)), // XXX
),
appBuilder( // 71
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(70),
ptrBuilder(69),
),
 // FUN19NanoPrelude.repeat
appBuilder( // 72
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(72),
),
 // FUN20Sumpuz.diff
appBuilder( // 73
ptrBuilder(75),
ptrBuilder(74),
),
appBuilder( // 74
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(77),
),
 // FUN21NanoPrelude.foldl
appBuilder( // 75
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(76),
),
appBuilder( // 76
comBuilder(5,34,List(0, 1, 3, 2, 4, 4)), // X(XX(XX))X
comBuilder(3,2,List(2, 1, 0)), // XXX
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
 // FUN22Sumpuz.del
appBuilder( // 77
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(79),
),
appBuilder( // 78
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 79
comBuilder(6,53,List(0, 1, 2, 5, 3, 4)), // X(XX(XX)X)
ptrBuilder(78),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(4,13,List(0, 1, 2, 3, 3)), // X(X(XX))X
prmBuilder("=="),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN23Sumpuz.rng
appBuilder( // 80
ptrBuilder(65),
ptrBuilder(53),
),
 // FUN24NanoPrelude.elem
appBuilder( // 81
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(83),
),
appBuilder( // 82
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 83
comBuilder(6,53,List(0, 1, 2, 5, 3, 4)), // X(XX(XX)X)
ptrBuilder(82),
comBuilder(5,10,List(0, 1, 4, 3, 2)), // X(XX)XX
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
prmBuilder("=="),
comBuilder(2,0,List(1)), // X
),
 // FUN25Sumpuz.ofAll
appBuilder( // 84
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(86),
),
appBuilder( // 85
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(87),
),
appBuilder( // 86
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(85),
),
 // FUN26Data.List_Type.++
appBuilder( // 87
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(89),
),
appBuilder( // 88
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 89
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(88),
),
 // FUN27Sumpuz.solns
appBuilder( // 90
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(98),
ptrBuilder(95),
),
appBuilder( // 91
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(105),
),
appBuilder( // 92
comBuilder(5,37,List(0, 4, 2, 1, 3, 4)), // XXXX(XX)
ptrBuilder(105),
prmBuilder("+"),
),
appBuilder( // 93
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(92),
ptrBuilder(91),
),
appBuilder( // 94
comBuilder(6,51,List(0, 1, 4, 5, 2, 3)), // X(XXXXX)
ptrBuilder(100),
),
appBuilder( // 95
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
ptrBuilder(94),
ptrBuilder(93),
prmBuilder("+"),
),
appBuilder( // 96
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)), // X(X(XX)X)X
ptrBuilder(54),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(53),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 97
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)), // X(XX(XX)X)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(84),
ptrBuilder(99),
ptrBuilder(52),
),
appBuilder( // 98
comBuilder(6,39,List(0, 1, 2, 5, 3, 4)), // XX(XX)(XX)
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(97),
ptrBuilder(96),
),
 // FUN28NanoPrelude.curry
appBuilder( // 99
comBuilder(4,7,List(1, 0, 2, 3)), // X(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
),
 // FUN29Sumpuz.divMod10
appBuilder( // 100
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(104),
ptrBuilder(101),
),
appBuilder( // 101
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 102
comBuilder(4,7,List(0, 3, 1, 2)), // X(XXX)
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 103
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
ptrBuilder(100),
prmBuilder("-"),
intBuilder(10),
ptrBuilder(102),
),
appBuilder( // 104
comBuilder(4,14,List(3, 0, 1, 2, 3)), // XXX(XX)
prmBuilder("<="),
intBuilder(9),
ptrBuilder(103),
),
 // FUN30Sumpuz.img
appBuilder( // 105
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(106),
ptrBuilder(62),
),
 // FUN31NanoPrelude.fromJust
appBuilder( // 106
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(4),
comBuilder(1,0,List(0)), // X
),
 // FUN32NanoPrelude.head
appBuilder( // 107
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(3),
comBuilder(2,0,List(0)), // X
),
 // FUN33NanoPrelude.tail
appBuilder( // 108
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN34NanoPrelude.enumFromTo
appBuilder( // 109
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(111),
ptrBuilder(116),
),
appBuilder( // 110
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
appBuilder( // 111
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(112),
ptrBuilder(110),
),
 // FUN35NanoPrelude.takeWhile
appBuilder( // 112
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(115),
),
appBuilder( // 113
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 114
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(113),
),
appBuilder( // 115
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(114),
),
 // FUN36NanoPrelude.enumFrom
appBuilder( // 116
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(116),
prmBuilder("+"),
intBuilder(1),
),
 // FUN37Sumpuz.ifNull
appBuilder( // 117
comBuilder(4,5,List(0, 2, 3, 1)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(3,0,List(0)), // X
),
)
}