package benchmarks
import common.Helper._
 
// Functions in this file: 32
// Apps in this file: 106
// Combinators in this file: 178
object Adjoxo extends Benchmark {
override def toString() = "Adjoxo" 
val combinatorCount = 178
val prog = Seq(
 // FUN0Adjoxo.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
ptrBuilder(2),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
comBuilder(2,0,List(0)),
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
comBuilder(2,0,List(0)),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(3),
),
 // FUN1Adjoxo.adjudicate
appBuilder( // 5
comBuilder(4,15,List(0, 1, 3, 2, 3)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(13),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,12,List(0, 1, 4, 3, 2)),
ptrBuilder(73),
ptrBuilder(77),
ptrBuilder(76),
),
appBuilder( // 7
ptrBuilder(73),
ptrBuilder(91),
ptrBuilder(76),
),
appBuilder( // 8
ptrBuilder(73),
ptrBuilder(91),
comBuilder(2,0,List(0)),
),
appBuilder( // 9
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)),
comBuilder(6,54,List(0, 1, 2, 5, 4, 3)),
ptrBuilder(22),
ptrBuilder(73),
ptrBuilder(77),
ptrBuilder(76),
),
appBuilder( // 10
comBuilder(5,30,List(0, 1, 2, 4, 4, 3)),
comBuilder(5,30,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(22),
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 11
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(14),
ptrBuilder(19),
ptrBuilder(19),
),
appBuilder( // 12
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,47,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(11),
ptrBuilder(10),
ptrBuilder(7),
),
appBuilder( // 13
comBuilder(5,28,List(0, 4, 1, 2, 4, 3)),
ptrBuilder(12),
ptrBuilder(73),
ptrBuilder(77),
comBuilder(2,0,List(0)),
),
 // FUN2Adjoxo.cmp
appBuilder( // 14
comBuilder(5,12,List(0, 1, 4, 2, 3)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(15),
ptrBuilder(17),
ptrBuilder(18),
),
appBuilder( // 15
comBuilder(5,29,List(0, 4, 1, 4, 2, 3)),
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)),
prmBuilder("=="),
prmBuilder("<="),
ptrBuilder(16),
),
 // FUN3NanoPrelude.GT
appBuilder( // 16
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN4NanoPrelude.LT
appBuilder( // 17
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN5NanoPrelude.EQ
appBuilder( // 18
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN6NanoPrelude.length
appBuilder( // 19
yBuilder(),
ptrBuilder(21),
intBuilder(0),
),
appBuilder( // 20
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)),
comBuilder(4,6,List(3, 2, 0, 1)),
comBuilder(2,0,List(0)),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 21
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,2,List(0, 1, 1)),
ptrBuilder(20),
),
 // FUN7Adjoxo.hasLine
appBuilder( // 22
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(60),
ptrBuilder(56),
),
appBuilder( // 23
comBuilder(4,2,List(3, 0, 1)),
intBuilder(7),
comBuilder(2,0,List(0)),
),
appBuilder( // 24
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(23),
),
appBuilder( // 25
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(24),
),
appBuilder( // 26
ptrBuilder(63),
ptrBuilder(25),
),
appBuilder( // 27
comBuilder(4,2,List(3, 0, 1)),
intBuilder(9),
comBuilder(2,0,List(0)),
),
appBuilder( // 28
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(27),
),
appBuilder( // 29
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(28),
),
appBuilder( // 30
ptrBuilder(63),
ptrBuilder(29),
),
appBuilder( // 31
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(30),
ptrBuilder(26),
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)),
intBuilder(9),
comBuilder(2,0,List(0)),
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
ptrBuilder(33),
),
appBuilder( // 35
ptrBuilder(63),
ptrBuilder(34),
),
appBuilder( // 36
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(35),
ptrBuilder(31),
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)),
intBuilder(8),
comBuilder(2,0,List(0)),
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(37),
),
appBuilder( // 39
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(38),
),
appBuilder( // 40
ptrBuilder(63),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(40),
ptrBuilder(36),
),
appBuilder( // 42
comBuilder(4,2,List(3, 0, 1)),
intBuilder(7),
comBuilder(2,0,List(0)),
),
appBuilder( // 43
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(42),
),
appBuilder( // 44
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(43),
),
appBuilder( // 45
ptrBuilder(63),
ptrBuilder(44),
),
appBuilder( // 46
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(45),
ptrBuilder(41),
),
appBuilder( // 47
comBuilder(4,2,List(3, 0, 1)),
intBuilder(9),
comBuilder(2,0,List(0)),
),
appBuilder( // 48
comBuilder(4,2,List(3, 0, 1)),
intBuilder(8),
ptrBuilder(47),
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)),
intBuilder(7),
ptrBuilder(48),
),
appBuilder( // 50
ptrBuilder(63),
ptrBuilder(49),
),
appBuilder( // 51
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(50),
ptrBuilder(46),
),
appBuilder( // 52
comBuilder(4,2,List(3, 0, 1)),
intBuilder(6),
comBuilder(2,0,List(0)),
),
appBuilder( // 53
comBuilder(4,2,List(3, 0, 1)),
intBuilder(5),
ptrBuilder(52),
),
appBuilder( // 54
comBuilder(4,2,List(3, 0, 1)),
intBuilder(4),
ptrBuilder(53),
),
appBuilder( // 55
ptrBuilder(63),
ptrBuilder(54),
),
appBuilder( // 56
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(61),
ptrBuilder(55),
ptrBuilder(51),
),
appBuilder( // 57
comBuilder(4,2,List(3, 0, 1)),
intBuilder(3),
comBuilder(2,0,List(0)),
),
appBuilder( // 58
comBuilder(4,2,List(3, 0, 1)),
intBuilder(2),
ptrBuilder(57),
),
appBuilder( // 59
comBuilder(4,2,List(3, 0, 1)),
intBuilder(1),
ptrBuilder(58),
),
appBuilder( // 60
ptrBuilder(63),
ptrBuilder(59),
),
 // FUN8Data.Bool.||
appBuilder( // 61
comBuilder(3,2,List(1, 2, 0)),
ptrBuilder(62),
),
 // FUN9Data.Bool_Type.True
appBuilder( // 62
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN10Adjoxo.subset
appBuilder( // 63
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(64),
ptrBuilder(65),
),
 // FUN11NanoPrelude.null
appBuilder( // 64
comBuilder(5,16,List(4, 0, 1, 2, 3)),
ptrBuilder(62),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN12Adjoxo.diff
appBuilder( // 65
comBuilder(4,5,List(0, 3, 1, 2)),
comBuilder(3,3,List(0, 1, 2)),
comBuilder(2,0,List(0)),
ptrBuilder(71),
),
appBuilder( // 66
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(4,8,List(0, 1, 2, 3)),
ptrBuilder(72),
ptrBuilder(65),
),
appBuilder( // 67
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(14),
ptrBuilder(65),
),
appBuilder( // 68
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(5,48,List(0, 1, 2, 4, 3, 4)),
comBuilder(4,5,List(0, 1, 3, 2)),
comBuilder(3,6,List(0, 2, 1, 2)),
ptrBuilder(67),
),
appBuilder( // 69
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(68),
ptrBuilder(66),
ptrBuilder(72),
),
appBuilder( // 70
comBuilder(4,14,List(0, 3, 1, 2, 3)),
ptrBuilder(69),
ptrBuilder(65),
ptrBuilder(72),
),
appBuilder( // 71
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)),
comBuilder(4,15,List(0, 1, 3, 2, 3)),
ptrBuilder(72),
ptrBuilder(70),
),
 // FUN13Data.List_Type.:
appBuilder( // 72
comBuilder(4,2,List(0, 1, 2)),
comBuilder(3,2,List(2, 0, 1)),
),
 // FUN14Adjoxo.report
appBuilder( // 73
comBuilder(5,10,List(0, 4, 1, 2, 3)),
comBuilder(4,41,List(0, 1, 2, 3, 1, 3)),
intBuilder(3),
ptrBuilder(74),
ptrBuilder(75),
),
 // FUN15Adjoxo.side
appBuilder( // 74
comBuilder(3,2,List(2, 0, 1)),
intBuilder(0),
intBuilder(88),
),
 // FUN16Adjoxo.opp
appBuilder( // 75
comBuilder(3,2,List(2, 0, 1)),
ptrBuilder(76),
comBuilder(2,0,List(0)),
),
 // FUN17Adjoxo.X
appBuilder( // 76
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN18Adjoxo.analysis
appBuilder( // 77
comBuilder(5,11,List(0, 1, 2, 4, 3)),
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(22),
ptrBuilder(83),
ptrBuilder(96),
),
appBuilder( // 78
ptrBuilder(102),
intBuilder(1),
intBuilder(9),
),
appBuilder( // 79
ptrBuilder(65),
ptrBuilder(78),
),
appBuilder( // 80
ptrBuilder(86),
ptrBuilder(89),
),
appBuilder( // 81
comBuilder(5,14,List(0, 1, 2, 3, 4)),
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)),
ptrBuilder(80),
ptrBuilder(92),
ptrBuilder(94),
),
appBuilder( // 82
comBuilder(4,17,List(0, 3, 1, 2, 3)),
ptrBuilder(81),
ptrBuilder(65),
ptrBuilder(79),
),
appBuilder( // 83
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(4,11,List(0, 3, 1, 3, 2)),
ptrBuilder(84),
ptrBuilder(82),
ptrBuilder(90),
),
 // FUN19Adjoxo.gridFull
appBuilder( // 84
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(85),
intBuilder(9),
),
appBuilder( // 85
comBuilder(6,26,List(0, 1, 5, 2, 3, 4)),
comBuilder(5,10,List(0, 1, 4, 2, 3)),
ptrBuilder(19),
prmBuilder("+"),
ptrBuilder(19),
prmBuilder("=="),
),
 // FUN20NanoPrelude.foldr1
appBuilder( // 86
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(88),
),
appBuilder( // 87
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,16,List(4, 0, 1, 2, 3)),
errorBuilder(0),
comBuilder(3,5,List(0, 1, 2, 2)),
comBuilder(3,6,List(2, 1, 0, 2)),
),
appBuilder( // 88
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
ptrBuilder(87),
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)),
comBuilder(5,17,List(0, 1, 2, 3, 4)),
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN21Adjoxo.bestOf
appBuilder( // 89
comBuilder(6,32,List(0, 1, 2, 3, 5, 4)),
comBuilder(3,2,List(0, 2, 1)),
comBuilder(4,32,List(2, 3, 0, 0, 1, 3)),
ptrBuilder(90),
ptrBuilder(91),
ptrBuilder(91),
),
 // FUN22Adjoxo.Draw
appBuilder( // 90
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
),
 // FUN23Adjoxo.Win
appBuilder( // 91
comBuilder(3,1,List(0, 1)),
comBuilder(2,0,List(0)),
comBuilder(1,0,List(0)),
),
 // FUN24NanoPrelude.map
appBuilder( // 92
comBuilder(6,56,List(0, 1, 2, 3, 4, 5)),
yBuilder(),
comBuilder(4,6,List(0, 1, 2, 3)),
comBuilder(3,2,List(2, 0, 1)),
comBuilder(2,0,List(0)),
ptrBuilder(93),
),
appBuilder( // 93
comBuilder(5,13,List(0, 1, 2, 4, 3)),
comBuilder(3,3,List(0, 1, 2)),
ptrBuilder(72),
),
 // FUN25Adjoxo.moveval
appBuilder( // 94
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(5,21,List(0, 1, 2, 4, 3)),
ptrBuilder(95),
ptrBuilder(77),
ptrBuilder(97),
),
 // FUN26Adjoxo.inverse
appBuilder( // 95
comBuilder(4,4,List(3, 0, 1, 2)),
ptrBuilder(90),
ptrBuilder(91),
ptrBuilder(96),
),
 // FUN27Adjoxo.Loss
appBuilder( // 96
comBuilder(2,0,List(0)),
comBuilder(2,0,List(0)),
),
 // FUN28Adjoxo.insert
appBuilder( // 97
comBuilder(3,3,List(0, 1, 2)),
yBuilder(),
ptrBuilder(101),
),
appBuilder( // 98
comBuilder(6,37,List(0, 1, 2, 3, 5, 4)),
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)),
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)),
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)),
prmBuilder("<="),
),
appBuilder( // 99
comBuilder(5,16,List(0, 1, 2, 4, 3)),
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)),
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)),
ptrBuilder(72),
comBuilder(2,0,List(0)),
),
appBuilder( // 100
comBuilder(5,30,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(99),
ptrBuilder(98),
ptrBuilder(72),
comBuilder(3,3,List(0, 1, 2)),
),
appBuilder( // 101
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)),
comBuilder(3,2,List(0, 2, 1)),
ptrBuilder(100),
ptrBuilder(72),
ptrBuilder(72),
),
 // FUN29NanoPrelude.enumFromTo
appBuilder( // 102
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)),
comBuilder(5,12,List(0, 1, 2, 4, 3)),
ptrBuilder(103),
comBuilder(3,2,List(2, 0, 1)),
prmBuilder("<="),
ptrBuilder(105),
),
 // FUN30NanoPrelude.takeWhile
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
ptrBuilder(72),
),
 // FUN31NanoPrelude.enumFrom
appBuilder( // 105
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)),
ptrBuilder(72),
ptrBuilder(105),
prmBuilder("+"),
intBuilder(1),
),
)
}