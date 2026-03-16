package benchmarks
import common.Helper._
 
// Functions in this file: 15
// Apps in this file: 46
// Combinators in this file: 59
object SumEuler extends Benchmark {
override def toString() = "SumEuler" 
val combinatorCount = 59
val prog = Seq(
 // FUN0SumEuler.main
appBuilder( // 0
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 1
ptrBuilder(5),
intBuilder(1),
intBuilder(30),
),
 // FUN1NanoPrelude.sum
appBuilder( // 2
ptrBuilder(3),
prmBuilder("+"),
intBuilder(0),
),
 // FUN2NanoPrelude.foldr
appBuilder( // 3
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(4),
),
appBuilder( // 4
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN3SumEuler.totients
appBuilder( // 5
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(4,7,List(0, 3, 1, 2)), // X(XXX)
ptrBuilder(39),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(6,48,List(0, 1, 2, 4, 3, 5)), // XX(XX(XX))
ptrBuilder(8),
ptrBuilder(11),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN4NanoPrelude.map
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 9
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 10
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(9),
),
 // FUN5SumEuler.euler
appBuilder( // 11
comBuilder(5,57,List(0, 1, 2, 4, 3, 4)), // X(X(XX)(XX))
ptrBuilder(13),
ptrBuilder(16),
ptrBuilder(20),
ptrBuilder(12),
),
appBuilder( // 12
comBuilder(5,16,List(0, 1, 4, 2, 3)), // XX(XXX)
ptrBuilder(39),
intBuilder(1),
prmBuilder("-"),
intBuilder(1),
),
 // FUN6NanoPrelude.length
appBuilder( // 13
yBuilder(),
ptrBuilder(15),
intBuilder(0),
),
appBuilder( // 14
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 15
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(14),
),
 // FUN7NanoPrelude.filter
appBuilder( // 16
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(19),
),
appBuilder( // 17
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 18
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,30,List(0, 2, 1, 2, 3, 3)), // XX(XXX)X
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(17),
),
appBuilder( // 19
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(18),
),
 // FUN8SumEuler.relprime
appBuilder( // 20
comBuilder(5,9,List(0, 3, 4, 1, 2)), // XXXXX
ptrBuilder(21),
prmBuilder("=="),
intBuilder(1),
),
 // FUN9SumEuler.hcf
appBuilder( // 21
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(23),
ptrBuilder(22),
),
appBuilder( // 22
comBuilder(4,16,List(0, 3, 1, 2, 3)), // XX(XXX)
ptrBuilder(21),
ptrBuilder(24),
),
appBuilder( // 23
comBuilder(5,28,List(0, 1, 4, 2, 4, 3)), // XXX(XX)X
intBuilder(0),
prmBuilder("=="),
),
 // FUN10NanoPrelude.mod
appBuilder( // 24
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(25),
comBuilder(2,0,List(1)), // X
),
 // FUN11NanoPrelude.divMod
appBuilder( // 25
comBuilder(5,19,List(0, 1, 2, 4, 3)), // X(X(XX)X)
yBuilder(),
comBuilder(4,42,List(0, 2, 3, 3, 1, 3)), // XXX(XXX)
ptrBuilder(38),
prmBuilder("+"),
),
appBuilder( // 26
comBuilder(2,2,List(1, 0, 1)), // XXX
prmBuilder("+"),
),
appBuilder( // 27
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("-"),
),
appBuilder( // 28
comBuilder(6,40,List(5, 4, 0, 1, 2, 3)), // X(XXX)(XX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 29
comBuilder(5,42,List(2, 0, 3, 1, 3, 4)), // XXX(XXX)
prmBuilder("<="),
comBuilder(3,2,List(2, 1, 0)), // XXX
),
appBuilder( // 30
comBuilder(5,45,List(0, 1, 4, 2, 3, 4)), // X(XX)(X(XX))
comBuilder(4,42,List(0, 3, 2, 1, 3, 2)), // XXX(XXX)
ptrBuilder(29),
ptrBuilder(28),
ptrBuilder(27),
),
appBuilder( // 31
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(30),
ptrBuilder(26),
),
appBuilder( // 32
comBuilder(4,6,List(1, 3, 0, 2)), // XX(XX)
ptrBuilder(31),
),
appBuilder( // 33
comBuilder(5,16,List(4, 0, 2, 1, 3)), // XX(XXX)
intBuilder(1),
prmBuilder("-"),
),
appBuilder( // 34
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
),
appBuilder( // 35
comBuilder(5,37,List(4, 0, 3, 1, 2, 4)), // XXXX(XX)
prmBuilder("<="),
),
appBuilder( // 36
comBuilder(4,29,List(0, 1, 3, 2, 3, 3)), // X(XX)(XX)X
ptrBuilder(35),
ptrBuilder(34),
ptrBuilder(33),
),
appBuilder( // 37
comBuilder(5,37,List(4, 0, 1, 2, 3, 4)), // XXXX(XX)
prmBuilder("<="),
),
appBuilder( // 38
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)), // X(XX)(XXX)
ptrBuilder(37),
ptrBuilder(36),
ptrBuilder(32),
),
 // FUN12NanoPrelude.enumFromTo
appBuilder( // 39
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(41),
ptrBuilder(40),
ptrBuilder(45),
),
appBuilder( // 40
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
 // FUN13NanoPrelude.takeWhile
appBuilder( // 41
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(44),
),
appBuilder( // 42
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 43
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)), // XXX(XXX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 44
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(43),
ptrBuilder(42),
),
 // FUN14NanoPrelude.enumFrom
appBuilder( // 45
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(45),
prmBuilder("+"),
intBuilder(1),
),
)
}
