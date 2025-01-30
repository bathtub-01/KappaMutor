package benchmarks
import common.Helper._
 
// Functions in this file: 19
// Apps in this file: 55
// Combinators in this file: 85
object Queens2 extends Benchmark {
override def toString() = "Queens2" 
val combinatorCount = 85
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
ptrBuilder(52),
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
comBuilder(6,42,List(0, 5, 1, 2, 3, 4)), // XXX(XXX)
ptrBuilder(7),
ptrBuilder(42),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 6
comBuilder(5,21,List(0, 1, 4, 2, 3)), // X(X(XXX))
ptrBuilder(8),
ptrBuilder(14),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(5,40,List(0, 4, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
prmBuilder("=="),
intBuilder(0),
ptrBuilder(6),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 9
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(9),
),
 // FUN5Data.List_Type.++
appBuilder( // 11
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 13
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(12),
),
 // FUN6Queens2.sol
appBuilder( // 14
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(15),
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(5),
ptrBuilder(18),
),
 // FUN7NanoPrelude.map
appBuilder( // 15
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(17),
),
appBuilder( // 16
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 17
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(16),
),
 // FUN8Queens2.next
appBuilder( // 18
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(19),
ptrBuilder(37),
),
appBuilder( // 19
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
ptrBuilder(20),
ptrBuilder(20),
ptrBuilder(24),
ptrBuilder(32),
),
 // FUN9Queens2.merge
appBuilder( // 20
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(23),
),
appBuilder( // 21
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(11),
),
appBuilder( // 22
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(21),
ptrBuilder(20),
),
appBuilder( // 23
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(22),
),
 // FUN10Queens2.down
appBuilder( // 24
ptrBuilder(15),
ptrBuilder(26),
),
appBuilder( // 25
ptrBuilder(31),
intBuilder(2),
),
appBuilder( // 26
ptrBuilder(27),
ptrBuilder(25),
),
 // FUN11Queens2.one
appBuilder( // 27
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(30),
),
appBuilder( // 28
comBuilder(6,24,List(0, 3, 5, 4, 1, 2)), // X(XX)XXX
comBuilder(6,44,List(0, 1, 5, 2, 4, 3)), // X(XX)(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 29
comBuilder(4,9,List(0, 1, 2, 3, 3)), // XXXXX
ptrBuilder(28),
),
appBuilder( // 30
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(29),
),
 // FUN12Queens2.eq
appBuilder( // 31
comBuilder(2,1,List(1, 0)), // XX
prmBuilder("=="),
),
 // FUN13Queens2.left
appBuilder( // 32
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(35),
ptrBuilder(36),
),
appBuilder( // 33
ptrBuilder(31),
intBuilder(0),
),
appBuilder( // 34
ptrBuilder(27),
ptrBuilder(33),
),
appBuilder( // 35
ptrBuilder(15),
ptrBuilder(34),
),
 // FUN14NanoPrelude.tail
appBuilder( // 36
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN15Queens2.right
appBuilder( // 37
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(41),
ptrBuilder(40),
),
appBuilder( // 38
ptrBuilder(31),
intBuilder(1),
),
appBuilder( // 39
ptrBuilder(27),
ptrBuilder(38),
),
appBuilder( // 40
ptrBuilder(15),
ptrBuilder(39),
),
appBuilder( // 41
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN16Queens2.fill
appBuilder( // 42
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(45),
),
appBuilder( // 43
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(15),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 44
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(11),
ptrBuilder(46),
ptrBuilder(43),
),
appBuilder( // 45
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(44),
ptrBuilder(42),
),
 // FUN17Queens2.lrd
appBuilder( // 46
comBuilder(6,33,List(4, 0, 1, 5, 2, 3)), // X(X(XX)X)X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(51),
comBuilder(2,0,List(0)), // X
ptrBuilder(47),
),
appBuilder( // 47
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 48
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(2),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 49
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(48),
),
appBuilder( // 50
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(49),
),
appBuilder( // 51
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(50),
),
 // FUN18NanoPrelude.replicate
appBuilder( // 52
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(54),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 53
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
prmBuilder("<="),
intBuilder(0),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 54
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(53),
ptrBuilder(52),
prmBuilder("-"),
intBuilder(1),
),
)
}