package benchmarks
import common.Helper._
 
// Functions in this file: 12
// Apps in this file: 66
// Combinators in this file: 115
object TribeLie extends Benchmark {
override def toString() = "TribeLie" 
val combinatorCount = 115
val prog = Seq(
 // FUN0TribeLie.main
appBuilder( // 0
ptrBuilder(1),
ptrBuilder(9),
ptrBuilder(21),
),
 // FUN1TribeLie.count
appBuilder( // 1
comBuilder(6,47,List(0, 1, 2, 3, 4, 5)), // XX(X(XX)X)
comBuilder(1,0,List(0)), // X
ptrBuilder(3),
ptrBuilder(6),
ptrBuilder(2),
),
appBuilder( // 2
comBuilder(4,4,List(2, 3, 0, 1)), // XXXX
intBuilder(0),
intBuilder(1),
),
 // FUN2NanoPrelude.sum
appBuilder( // 3
ptrBuilder(4),
prmBuilder("+"),
intBuilder(0),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 4
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(5),
),
appBuilder( // 5
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN4NanoPrelude.map
appBuilder( // 6
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(8),
),
appBuilder( // 7
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 8
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(7),
),
 // FUN5TribeLie.predicate
appBuilder( // 9
comBuilder(2,1,List(1, 0)), // XX
ptrBuilder(15),
),
appBuilder( // 10
comBuilder(7,23,List(0, 1, 2, 3, 4, 5)), // XXXXXX
comBuilder(7,12,List(0, 1, 2, 3, 4)), // X(XXX)X
ptrBuilder(16),
ptrBuilder(17),
),
appBuilder( // 11
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(7,54,List(0, 1, 2, 3, 5, 4)), // X(X(XXX)X)
),
appBuilder( // 12
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
ptrBuilder(11),
ptrBuilder(10),
ptrBuilder(16),
ptrBuilder(18),
),
appBuilder( // 13
comBuilder(5,24,List(0, 1, 4, 2, 3, 4)), // X(XX)XXX
comBuilder(5,46,List(0, 4, 1, 2, 3, 4)), // XX(XXXX)
),
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(13),
ptrBuilder(12),
ptrBuilder(19),
),
appBuilder( // 15
comBuilder(5,23,List(0, 1, 2, 3, 4, 4)), // XXXXXX
ptrBuilder(14),
),
 // FUN6Data.Bool.&&
appBuilder( // 16
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN7TribeLie.childs_statement_is_valid
appBuilder( // 17
comBuilder(4,12,List(2, 3, 0, 1, 0)), // X(XXX)X
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN8TribeLie.parent1_statement_is_valid
appBuilder( // 18
comBuilder(4,12,List(2, 3, 0, 1, 0)), // X(XXX)X
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN9TribeLie.parent2_statement_is_valid
appBuilder( // 19
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(5,42,List(0, 3, 4, 4, 1, 2)), // XXX(XXX)
ptrBuilder(20),
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
appBuilder( // 20
comBuilder(5,58,List(2, 3, 0, 4, 1, 0)), // X(XX(XXX))
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN10TribeLie.allCombis
appBuilder( // 21
yBuilder(),
ptrBuilder(64),
ptrBuilder(23),
),
appBuilder( // 22
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 23
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(22),
),
appBuilder( // 24
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 25
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(24),
),
appBuilder( // 26
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 27
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(26),
),
appBuilder( // 28
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 29
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(28),
),
appBuilder( // 30
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 31
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(34),
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 37
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 39
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
ptrBuilder(38),
ptrBuilder(65),
),
appBuilder( // 40
comBuilder(6,54,List(0, 1, 2, 3, 4, 5)), // X(X(XXX)X)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
comBuilder(6,37,List(0, 1, 2, 4, 3, 5)), // XXXX(XX)
),
appBuilder( // 41
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
ptrBuilder(40),
ptrBuilder(39),
),
appBuilder( // 42
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 43
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
ptrBuilder(42),
),
appBuilder( // 44
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
ptrBuilder(43),
ptrBuilder(41),
ptrBuilder(37),
),
appBuilder( // 45
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
),
appBuilder( // 46
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 47
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
ptrBuilder(46),
),
appBuilder( // 48
comBuilder(6,33,List(0, 1, 2, 4, 5, 3)), // X(X(XX)X)X
ptrBuilder(47),
ptrBuilder(45),
ptrBuilder(44),
ptrBuilder(35),
),
appBuilder( // 49
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
ptrBuilder(48),
),
appBuilder( // 50
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 51
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
ptrBuilder(50),
),
appBuilder( // 52
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(51),
ptrBuilder(49),
ptrBuilder(33),
),
appBuilder( // 53
comBuilder(5,18,List(0, 1, 2, 3, 4)), // X(XXXX)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
ptrBuilder(52),
),
appBuilder( // 54
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 55
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
ptrBuilder(54),
ptrBuilder(53),
ptrBuilder(31),
),
appBuilder( // 56
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
ptrBuilder(55),
),
appBuilder( // 57
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 58
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(57),
ptrBuilder(56),
ptrBuilder(29),
),
appBuilder( // 59
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
ptrBuilder(58),
),
appBuilder( // 60
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
),
appBuilder( // 61
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(60),
ptrBuilder(59),
ptrBuilder(27),
),
appBuilder( // 62
comBuilder(6,44,List(5, 1, 3, 0, 2, 4)), // X(XX)(XXX)
ptrBuilder(61),
),
appBuilder( // 63
comBuilder(6,32,List(0, 1, 3, 4, 5, 2)), // X(XXXX)X
yBuilder(),
ptrBuilder(62),
ptrBuilder(25),
),
appBuilder( // 64
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(63),
),
 // FUN11TribeLie.PuzzleAnswer
appBuilder( // 65
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(6,23,List(0, 1, 5, 2, 3, 4)), // XXXXXX
comBuilder(6,23,List(5, 0, 1, 2, 3, 4)), // XXXXXX
),
)
}
