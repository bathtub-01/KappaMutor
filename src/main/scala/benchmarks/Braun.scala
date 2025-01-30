package benchmarks
import common.Helper._
 
// Functions in this file: 15
// Apps in this file: 34
// Combinators in this file: 70
object Braun extends Benchmark {
override def toString() = "Braun" 
val combinatorCount = 70
val prog = Seq(
 // FUN0Braun.main
appBuilder( // 0
ptrBuilder(4),
ptrBuilder(3),
),
appBuilder( // 1
ptrBuilder(28),
intBuilder(0),
intBuilder(255),
),
appBuilder( // 2
ptrBuilder(25),
intBuilder(2),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(5),
ptrBuilder(9),
ptrBuilder(2),
),
 // FUN1Braun.int
appBuilder( // 4
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(1),
),
 // FUN2NanoPrelude.all
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(8),
),
appBuilder( // 7
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(1)), // X
ptrBuilder(6),
),
 // FUN3Data.Bool.&&
appBuilder( // 8
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN4Braun.prop
appBuilder( // 9
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
ptrBuilder(10),
ptrBuilder(14),
ptrBuilder(20),
),
 // FUN5Braun.equal
appBuilder( // 10
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)), // X(XXX)(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(6,28,List(0, 1, 2, 5, 3, 4)), // XXX(XX)X
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
prmBuilder("=="),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 12
comBuilder(6,25,List(0, 1, 5, 2, 3, 4)), // XX(XX)XX
comBuilder(5,16,List(0, 1, 2, 4, 3)), // XX(XXX)
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(11),
ptrBuilder(10),
),
appBuilder( // 13
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN6Braun.toList
appBuilder( // 14
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(15),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 15
comBuilder(6,25,List(0, 1, 2, 5, 3, 4)), // XX(XX)XX
comBuilder(5,31,List(0, 1, 2, 3, 4, 3)), // XX(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(16),
ptrBuilder(14),
),
 // FUN7Braun.ilv
appBuilder( // 16
comBuilder(3,6,List(1, 2, 0, 2)), // XX(XX)
ptrBuilder(19),
),
appBuilder( // 17
comBuilder(5,28,List(0, 1, 2, 3, 4, 3)), // XXX(XX)X
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 18
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(17),
ptrBuilder(16),
),
appBuilder( // 19
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(18),
),
 // FUN8Braun.fromList
appBuilder( // 20
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(21),
),
appBuilder( // 21
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(22),
ptrBuilder(20),
),
 // FUN9Braun.insertTree
appBuilder( // 22
comBuilder(5,46,List(0, 4, 1, 4, 2, 3)), // XX(XXXX)
ptrBuilder(23),
ptrBuilder(24),
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(1)), // X
),
appBuilder( // 23
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)), // X(XXXX)X
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(24),
ptrBuilder(22),
),
 // FUN10Braun.Branch
appBuilder( // 24
comBuilder(5,18,List(0, 4, 1, 2, 3)), // X(XXXX)
comBuilder(2,0,List(0)), // X
),
 // FUN11NanoPrelude.replicate
appBuilder( // 25
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(27),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 26
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
comBuilder(5,34,List(0, 1, 4, 2, 4, 3)), // X(XX(XX))X
prmBuilder("<="),
intBuilder(0),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 27
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(26),
ptrBuilder(25),
prmBuilder("-"),
intBuilder(1),
),
 // FUN12NanoPrelude.enumFromTo
appBuilder( // 28
comBuilder(6,39,List(0, 1, 2, 3, 4, 5)), // XX(XX)(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(29),
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
ptrBuilder(33),
),
 // FUN13NanoPrelude.takeWhile
appBuilder( // 29
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(32),
),
appBuilder( // 30
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 31
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(30),
),
appBuilder( // 32
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(31),
),
 // FUN14NanoPrelude.enumFrom
appBuilder( // 33
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(33),
prmBuilder("+"),
intBuilder(1),
),
)
}