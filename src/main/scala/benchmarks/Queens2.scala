package benchmarks
import common.Helper._
 
// Functions in this file: 19
// Apps in this file: 58
// Combinators in this file: 83
object Queens2 extends Benchmark {
override def toString() = "Queens2" 
val combinatorCount = 83
val prog = Seq(
 // FUN0Queens2.main
appBuilder( // 0
ptrBuilder(1),
intBuilder(5),
),
 // FUN1Queens2.nqueens
appBuilder( // 1
comBuilder(5,58,List(0, 1, 4, 2, 4, 3)), // X(XX(XXX))
ptrBuilder(2),
ptrBuilder(5),
ptrBuilder(55),
comBuilder(2,0,List(0)), // X
),
 // FUN2NanoPrelude.length
appBuilder( // 2
yBuilder(),
ptrBuilder(4),
intBuilder(0),
),
appBuilder( // 3
comBuilder(6,49,List(0, 1, 4, 5, 2, 3)), // XX(X(XXX))
comBuilder(4,6,List(3, 2, 0, 1)), // XX(XX)
comBuilder(2,0,List(0)), // X
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 4
comBuilder(3,4,List(0, 1, 2, 2)), // XXXX
ptrBuilder(3),
),
 // FUN3Queens2.solve
appBuilder( // 5
comBuilder(4,4,List(0, 3, 1, 2)), // XXXX
ptrBuilder(8),
ptrBuilder(45),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 7
comBuilder(5,21,List(0, 1, 4, 2, 3)), // X(X(XXX))
ptrBuilder(9),
ptrBuilder(15),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 8
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
prmBuilder("=="),
intBuilder(0),
ptrBuilder(7),
),
 // FUN4Data.List_Type.concatMap
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
 // FUN5Data.List_Type.++
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
 // FUN6Queens2.sol
appBuilder( // 15
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(16),
ptrBuilder(5),
ptrBuilder(20),
),
appBuilder( // 16
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(17),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN7NanoPrelude.map
appBuilder( // 17
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(19),
),
appBuilder( // 18
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 19
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(18),
),
 // FUN8Queens2.next
appBuilder( // 20
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(21),
ptrBuilder(40),
),
appBuilder( // 21
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
ptrBuilder(22),
ptrBuilder(22),
ptrBuilder(27),
ptrBuilder(35),
),
 // FUN9Queens2.merge
appBuilder( // 22
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(26),
),
appBuilder( // 23
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 24
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(23),
ptrBuilder(12),
),
appBuilder( // 25
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(24),
),
appBuilder( // 26
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(25),
ptrBuilder(22),
),
 // FUN10Queens2.down
appBuilder( // 27
ptrBuilder(17),
ptrBuilder(29),
),
appBuilder( // 28
ptrBuilder(34),
intBuilder(2),
),
appBuilder( // 29
ptrBuilder(30),
ptrBuilder(28),
),
 // FUN11Queens2.one
appBuilder( // 30
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(33),
),
appBuilder( // 31
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 32
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)), // X(XX)X(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(32),
),
 // FUN12Queens2.eq
appBuilder( // 34
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("=="),
),
 // FUN13Queens2.left
appBuilder( // 35
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(38),
ptrBuilder(39),
),
appBuilder( // 36
ptrBuilder(34),
intBuilder(0),
),
appBuilder( // 37
ptrBuilder(30),
ptrBuilder(36),
),
appBuilder( // 38
ptrBuilder(17),
ptrBuilder(37),
),
 // FUN14NanoPrelude.tail
appBuilder( // 39
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN15Queens2.right
appBuilder( // 40
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(44),
ptrBuilder(43),
),
appBuilder( // 41
ptrBuilder(34),
intBuilder(1),
),
appBuilder( // 42
ptrBuilder(30),
ptrBuilder(41),
),
appBuilder( // 43
ptrBuilder(17),
ptrBuilder(42),
),
appBuilder( // 44
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN16Queens2.fill
appBuilder( // 45
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(48),
),
appBuilder( // 46
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(17),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 47
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(12),
ptrBuilder(49),
ptrBuilder(46),
),
appBuilder( // 48
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(47),
ptrBuilder(45),
),
 // FUN17Queens2.lrd
appBuilder( // 49
comBuilder(6,33,List(4, 0, 1, 5, 2, 3)), // X(X(XX)X)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(54),
comBuilder(2,0,List(0)), // X
ptrBuilder(50),
),
appBuilder( // 50
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 51
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 52
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(51),
),
appBuilder( // 53
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(52),
),
appBuilder( // 54
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(53),
),
 // FUN18NanoPrelude.replicate
appBuilder( // 55
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(57),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 56
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
prmBuilder("<="),
intBuilder(0),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 57
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(56),
ptrBuilder(55),
prmBuilder("-"),
intBuilder(1),
),
)
}