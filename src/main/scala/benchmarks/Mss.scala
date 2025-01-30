package benchmarks
import common.Helper._
 
// Functions in this file: 15
// Apps in this file: 37
// Combinators in this file: 61
object Mss extends Benchmark {
override def toString() = "Mss" 
val combinatorCount = 61
val prog = Seq(
 // FUN0Mss.main
appBuilder( // 0
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 1
intBuilder(0),
prmBuilder("-"),
intBuilder(20),
),
appBuilder( // 2
ptrBuilder(31),
ptrBuilder(1),
intBuilder(20),
),
 // FUN1Mss.mss
appBuilder( // 3
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(5),
ptrBuilder(4),
ptrBuilder(15),
),
appBuilder( // 4
ptrBuilder(11),
ptrBuilder(14),
),
 // FUN2NanoPrelude.maximum
appBuilder( // 5
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
ptrBuilder(7),
),
appBuilder( // 6
comBuilder(3,5,List(0, 2, 1, 2)), // X(XX)X
comBuilder(3,4,List(0, 2, 2, 1)), // XXXX
prmBuilder(">"),
),
appBuilder( // 7
ptrBuilder(8),
ptrBuilder(6),
),
 // FUN3NanoPrelude.foldr
appBuilder( // 8
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 9
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 10
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
ptrBuilder(9),
),
 // FUN4NanoPrelude.map
appBuilder( // 11
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 13
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(12),
),
 // FUN5NanoPrelude.sum
appBuilder( // 14
ptrBuilder(8),
prmBuilder("+"),
intBuilder(0),
),
 // FUN6Mss.segments
appBuilder( // 15
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(16),
ptrBuilder(25),
),
appBuilder( // 16
ptrBuilder(17),
ptrBuilder(23),
),
 // FUN7Data.List_Type.concatMap
appBuilder( // 17
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(19),
),
appBuilder( // 18
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(20),
),
appBuilder( // 19
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(18),
),
 // FUN8Data.List_Type.++
appBuilder( // 20
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(22),
),
appBuilder( // 21
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 22
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(21),
),
 // FUN9Mss.tails
appBuilder( // 23
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(24),
),
appBuilder( // 24
comBuilder(4,11,List(0, 1, 1, 3, 2)), // XX(XX)X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(23),
),
 // FUN10Mss.inits
appBuilder( // 25
comBuilder(5,40,List(4, 0, 1, 2, 3, 4)), // X(XXX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(4,17,List(0, 3, 1, 2, 3)), // XX(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(25),
ptrBuilder(28),
),
appBuilder( // 27
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
ptrBuilder(26),
),
 // FUN11NanoPrelude.init
appBuilder( // 28
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(1),
ptrBuilder(30),
),
appBuilder( // 29
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(3,1,List(0, 1)), // XX
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(28),
),
appBuilder( // 30
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,6,List(2, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(29),
),
 // FUN12NanoPrelude.enumFromTo
appBuilder( // 31
comBuilder(6,39,List(0, 1, 2, 3, 4, 5)), // XX(XX)(XX)
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(32),
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
ptrBuilder(36),
),
 // FUN13NanoPrelude.takeWhile
appBuilder( // 32
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(35),
),
appBuilder( // 33
comBuilder(5,40,List(0, 3, 4, 1, 2, 4)), // X(XXX)(XX)
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
comBuilder(2,0,List(0)), // X
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 34
comBuilder(4,4,List(0, 1, 3, 2)), // XXXX
ptrBuilder(33),
),
appBuilder( // 35
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(34),
),
 // FUN14NanoPrelude.enumFrom
appBuilder( // 36
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(36),
prmBuilder("+"),
intBuilder(1),
),
)
}