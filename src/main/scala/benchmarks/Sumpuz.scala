package benchmarks
import common.Helper._
 
// Functions in this file: 40
// Apps in this file: 107
// Combinators in this file: 247
object Sumpuz extends Benchmark {
override def toString() = "Sumpuz" 
val combinatorCount = 247
val prog = Seq(
 // FUN0Sumpuz.main
appBuilder( // 0
comBuilder(2,4,List(0, 1, 1, 1)),
ptrBuilder(10),
ptrBuilder(9),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(3),
comBuilder(2,0,List(0)),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(4,2,List(3, 0, 1)),
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(8),
ptrBuilder(4),
),
 // FUN1Sumpuz.count
appBuilder( // 10
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(11),
ptrBuilder(14),
),
 // FUN2Sumpuz.sumMap
appBuilder( // 11
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(12),
intBuilder(0),
),
 // FUN3Sumpuz.sumMapAcc
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(13),
),
appBuilder( // 13
comBuilder(6,51,List(0, 1, 2, 4, 3, 5)),
comBuilder(3,6,List(1, 2, 0, 2)),
comBuilder(6,46,List(0, 3, 1, 5, 2, 4)),
comBuilder(3,2,List(0, 2, 1)),
prmBuilder("+"),
),
 // FUN4Sumpuz.fx
appBuilder( // 14
comBuilder(5,12,List(0, 1, 4, 3, 2)),
ptrBuilder(11),
ptrBuilder(15),
),
 // FUN5Sumpuz.fy
appBuilder( // 15
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(4,5,List(0, 1, 3, 2)),
ptrBuilder(11),
ptrBuilder(16),
),
 // FUN6Sumpuz.fz
appBuilder( // 16
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,10,List(0, 1, 4, 2, 3)),
comBuilder(4,4,List(0, 3, 1, 2)),
ptrBuilder(17),
intBuilder(0),
intBuilder(1),
),
 // FUN7Sumpuz.valid
appBuilder( // 17
comBuilder(5,40,List(0, 1, 4, 2, 3, 4)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(22),
ptrBuilder(24),
ptrBuilder(21),
),
appBuilder( // 18
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,58,List(0, 1, 5, 2, 3, 4)),
ptrBuilder(27),
ptrBuilder(30),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 19
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(18),
intBuilder(0),
comBuilder(2,0,List(0)),
),
appBuilder( // 20
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(23),
ptrBuilder(24),
prmBuilder("=="),
),
appBuilder( // 21
comBuilder(4,14,List(0, 3, 1, 2, 3)),
ptrBuilder(20),
ptrBuilder(24),
ptrBuilder(19),
),
appBuilder( // 22
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,22,List(0, 1, 2, 3, 4)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(23),
ptrBuilder(24),
prmBuilder("=="),
),
 // FUN8Data.Bool.&&
appBuilder( // 23
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN9NanoPrelude.length
appBuilder( // 24
yBuilder(),
ptrBuilder(26),
intBuilder(0),
),
appBuilder( // 25
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)),
comBuilder(4,6,List(3, 2, 0, 1)),
comBuilder(2,0,List(0)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 26
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(25),
),
 // FUN10Sumpuz.isSingleton
appBuilder( // 27
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(28),
),
appBuilder( // 28
comBuilder(6,9,List(0, 1, 2, 3, 4)),
comBuilder(5,16,List(4, 0, 1, 2, 3)),
ptrBuilder(29),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN11Data.Bool_Type.True
appBuilder( // 29
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN12Sumpuz.solutions
appBuilder( // 30
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(51),
ptrBuilder(53),
),
appBuilder( // 31
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)),
ptrBuilder(102),
ptrBuilder(106),
intBuilder(1),
intBuilder(0),
intBuilder(9),
),
appBuilder( // 32
comBuilder(6,52,List(0, 1, 2, 5, 3, 4)),
ptrBuilder(102),
ptrBuilder(106),
ptrBuilder(101),
intBuilder(1),
intBuilder(0),
),
appBuilder( // 33
comBuilder(5,44,List(0, 1, 4, 2, 4, 3)),
ptrBuilder(54),
ptrBuilder(100),
ptrBuilder(32),
intBuilder(9),
),
appBuilder( // 34
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,19,List(0, 1, 2, 4, 3)),
ptrBuilder(81),
ptrBuilder(33),
ptrBuilder(54),
),
appBuilder( // 35
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(34),
ptrBuilder(31),
),
appBuilder( // 36
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,36,List(0, 1, 2, 3, 5, 4)),
comBuilder(1,0,List(0)),
ptrBuilder(81),
),
appBuilder( // 37
comBuilder(6,55,List(0, 1, 2, 3, 5, 4)),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(37),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(85),
ptrBuilder(52),
ptrBuilder(100),
),
appBuilder( // 39
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,21,List(0, 1, 2, 4, 3)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,20,List(0, 1, 3, 2, 3)),
comBuilder(2,0,List(0)),
),
appBuilder( // 41
comBuilder(6,49,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)),
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(40),
ptrBuilder(39),
ptrBuilder(30),
),
appBuilder( // 42
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(41),
ptrBuilder(101),
ptrBuilder(35),
),
appBuilder( // 43
comBuilder(6,30,List(0, 5, 1, 2, 3, 4)),
ptrBuilder(54),
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 44
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(43),
ptrBuilder(53),
),
appBuilder( // 45
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(52),
prmBuilder("=="),
intBuilder(1),
comBuilder(2,0,List(0)),
),
appBuilder( // 46
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(6,27,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,16,List(4, 0, 1, 2, 3)),
ptrBuilder(45),
ptrBuilder(44),
),
appBuilder( // 47
comBuilder(6,32,List(0, 1, 5, 2, 3, 4)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(46),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 48
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(52),
prmBuilder("=="),
intBuilder(0),
comBuilder(2,0,List(0)),
),
appBuilder( // 49
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(48),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(53),
comBuilder(2,0,List(0)),
),
appBuilder( // 50
comBuilder(5,57,List(2, 3, 0, 4, 1, 4)),
ptrBuilder(49),
ptrBuilder(47),
),
appBuilder( // 51
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,42,List(0, 1, 2, 3, 5, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(50),
ptrBuilder(42),
),
 // FUN13NanoPrelude.fst
appBuilder( // 52
comBuilder(2,1,List(1, 0)),
comBuilder(2,0,List(0)),
),
 // FUN14NanoPrelude.snd
appBuilder( // 53
comBuilder(3,3,List(2, 0, 1)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN15Sumpuz.bindings
appBuilder( // 54
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(61),
ptrBuilder(56),
),
appBuilder( // 55
comBuilder(4,2,List(3, 1, 0)),
comBuilder(2,0,List(0)),
),
appBuilder( // 56
comBuilder(6,37,List(0, 1, 4, 2, 3, 5)),
comBuilder(5,9,List(0, 4, 1, 2, 3)),
ptrBuilder(79),
comBuilder(2,0,List(0)),
ptrBuilder(55),
),
appBuilder( // 57
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(69),
ptrBuilder(72),
ptrBuilder(73),
),
appBuilder( // 58
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(57),
ptrBuilder(78),
),
appBuilder( // 59
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(68),
),
appBuilder( // 60
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(66),
ptrBuilder(59),
ptrBuilder(58),
),
appBuilder( // 61
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)),
ptrBuilder(62),
ptrBuilder(60),
),
 // FUN16NanoPrelude.lookup
appBuilder( // 62
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(64),
),
appBuilder( // 63
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,28,List(0, 1, 2, 4, 5, 3)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
prmBuilder("=="),
ptrBuilder(65),
),
appBuilder( // 64
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(3,3,List(1, 0, 2)),
ptrBuilder(63),
),
 // FUN17NanoPrelude.Just
appBuilder( // 65
comBuilder(3,1,List(0, 1)),
comBuilder(2,1,List(1, 0)),
),
 // FUN18NanoPrelude.map
appBuilder( // 66
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(67),
),
appBuilder( // 67
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(68),
),
 // FUN19Data.List_Type.:
appBuilder( // 68
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN20NanoPrelude.zip
appBuilder( // 69
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(71),
),
appBuilder( // 70
comBuilder(6,35,List(0, 1, 2, 3, 5, 4)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(68),
comBuilder(3,2,List(2, 0, 1)),
),
appBuilder( // 71
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(70),
ptrBuilder(69),
),
 // FUN21NanoPrelude.repeat
appBuilder( // 72
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(68),
ptrBuilder(72),
),
 // FUN22Sumpuz.diff
appBuilder( // 73
ptrBuilder(75),
ptrBuilder(74),
),
appBuilder( // 74
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(76),
),
 // FUN23NanoPrelude.foldl
appBuilder( // 75
comBuilder(5,18,List(0, 1, 2, 3, 4)),
yBuilder(),
comBuilder(5,28,List(0, 1, 3, 2, 4, 4)),
comBuilder(5,16,List(4, 3, 0, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
),
 // FUN24Sumpuz.del
appBuilder( // 76
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(77),
),
appBuilder( // 77
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,13,List(0, 1, 2, 3, 3)),
prmBuilder("=="),
ptrBuilder(68),
),
 // FUN25Sumpuz.rng
appBuilder( // 78
ptrBuilder(66),
ptrBuilder(53),
),
 // FUN26NanoPrelude.elem
appBuilder( // 79
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(80),
),
appBuilder( // 80
comBuilder(5,11,List(0, 1, 4, 2, 3)),
comBuilder(5,10,List(0, 1, 4, 3, 2)),
comBuilder(4,5,List(0, 1, 3, 2)),
prmBuilder("=="),
ptrBuilder(29),
),
 // FUN27Sumpuz.ofAll
appBuilder( // 81
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(82),
),
appBuilder( // 82
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(83),
),
 // FUN28Data.List_Type.++
appBuilder( // 83
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(84),
),
appBuilder( // 84
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(6,46,List(5, 3, 0, 1, 2, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(68),
),
 // FUN29Sumpuz.solns
appBuilder( // 85
comBuilder(4,7,List(0, 1, 3, 2)),
ptrBuilder(92),
ptrBuilder(88),
),
appBuilder( // 86
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(98),
),
appBuilder( // 87
comBuilder(6,37,List(0, 1, 4, 2, 3, 5)),
comBuilder(5,37,List(0, 4, 1, 2, 3, 4)),
ptrBuilder(98),
prmBuilder("+"),
ptrBuilder(86),
),
appBuilder( // 88
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,18,List(0, 1, 4, 2, 3)),
ptrBuilder(94),
ptrBuilder(87),
prmBuilder("+"),
),
appBuilder( // 89
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)),
ptrBuilder(54),
comBuilder(4,2,List(3, 0, 1)),
ptrBuilder(53),
comBuilder(2,0,List(0)),
),
appBuilder( // 90
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(81),
ptrBuilder(93),
ptrBuilder(52),
),
appBuilder( // 91
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(90),
ptrBuilder(89),
),
appBuilder( // 92
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(91),
),
 // FUN30NanoPrelude.curry
appBuilder( // 93
comBuilder(4,7,List(1, 0, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN31Sumpuz.divMod10
appBuilder( // 94
comBuilder(4,16,List(0, 3, 1, 2, 3)),
ptrBuilder(97),
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
),
appBuilder( // 95
comBuilder(4,7,List(0, 3, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 96
comBuilder(5,12,List(0, 4, 1, 2, 3)),
ptrBuilder(94),
prmBuilder("-"),
intBuilder(10),
ptrBuilder(95),
),
appBuilder( // 97
comBuilder(4,14,List(3, 0, 1, 2, 3)),
prmBuilder("<="),
intBuilder(9),
ptrBuilder(96),
),
 // FUN32Sumpuz.img
appBuilder( // 98
comBuilder(4,7,List(0, 1, 3, 2)),
ptrBuilder(99),
ptrBuilder(62),
),
 // FUN33NanoPrelude.fromJust
appBuilder( // 99
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(4),
comBuilder(1,0,List(0)),
),
 // FUN34NanoPrelude.head
appBuilder( // 100
comBuilder(3,2,List(2, 0, 1)),
errorBuilder(3),
comBuilder(2,0,List(0)),
),
 // FUN35NanoPrelude.tail
appBuilder( // 101
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN36NanoPrelude.enumFromTo
appBuilder( // 102
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,12,List(0, 1, 2, 4, 3)),
ptrBuilder(103),
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
ptrBuilder(105),
),
 // FUN37NanoPrelude.takeWhile
appBuilder( // 103
comBuilder(5,20,List(0, 1, 2, 3, 4)),
yBuilder(),
comBuilder(4,6,List(3, 0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(104),
),
appBuilder( // 104
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
comBuilder(2,0,List(0)),
ptrBuilder(68),
),
 // FUN38NanoPrelude.enumFrom
appBuilder( // 105
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(68),
ptrBuilder(105),
prmBuilder("+"),
intBuilder(1),
),
 // FUN39Sumpuz.ifNull
appBuilder( // 106
comBuilder(5,10,List(0, 3, 4, 1, 2)),
comBuilder(4,7,List(0, 1, 2, 3)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
)
}