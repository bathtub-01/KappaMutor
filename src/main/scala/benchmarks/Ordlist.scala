package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 38
// Combinators in this file: 62
object Ordlist extends Benchmark {
override def toString() = "Ordlist" 
val combinatorCount = 62
val prog = Seq(
 // FUN0Ordlist.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
intBuilder(0),
intBuilder(1),
),
appBuilder( // 1
comBuilder(3,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
appBuilder( // 2
comBuilder(3,1,List(1, 0)), // XX
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(3,1,List(1, 0)), // XX
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(3,1,List(1, 0)), // XX
ptrBuilder(3),
),
 // FUN1Ordlist.top
appBuilder( // 5
comBuilder(5,48,List(0, 1, 2, 4, 3, 4)), // XX(XX(XX))
comBuilder(1,0,List(0)), // X
ptrBuilder(8),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(5,15,List(0, 1, 2, 3, 4)), // X(XX)(XX)
ptrBuilder(13),
ptrBuilder(16),
comBuilder(2,0,List(0)), // X
ptrBuilder(32),
),
appBuilder( // 7
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)), // X(X(XX)(XX))
ptrBuilder(10),
ptrBuilder(13),
ptrBuilder(16),
comBuilder(2,0,List(1)), // X
ptrBuilder(32),
),
 // FUN2NanoPrelude.and
appBuilder( // 8
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(9),
),
appBuilder( // 9
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(8),
),
 // FUN3Data.List_Type.++
appBuilder( // 10
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 12
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(11),
),
 // FUN4NanoPrelude.map
appBuilder( // 13
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(15),
),
appBuilder( // 14
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 15
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(14),
),
 // FUN5Ordlist.prop
appBuilder( // 16
comBuilder(5,44,List(0, 1, 4, 2, 3, 4)), // X(XX)(XXX)
ptrBuilder(18),
ptrBuilder(19),
ptrBuilder(17),
),
appBuilder( // 17
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(19),
ptrBuilder(25),
),
 // FUN6Ordlist.implies
appBuilder( // 18
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN7Ordlist.ord
appBuilder( // 19
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(23),
),
appBuilder( // 20
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(19),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 21
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)), // X(XXX)(XX)
ptrBuilder(24),
ptrBuilder(18),
),
appBuilder( // 22
comBuilder(4,11,List(0, 2, 1, 3, 3)), // XX(XX)X
ptrBuilder(21),
ptrBuilder(20),
),
appBuilder( // 23
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(22),
),
 // FUN8Data.Bool.&&
appBuilder( // 24
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9Ordlist.ins
appBuilder( // 25
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(31),
ptrBuilder(26),
),
appBuilder( // 26
comBuilder(4,16,List(0, 1, 0, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 27
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 28
comBuilder(5,42,List(0, 1, 3, 2, 3, 4)), // XXX(XXX)
ptrBuilder(18),
),
appBuilder( // 29
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
ptrBuilder(28),
ptrBuilder(27),
),
appBuilder( // 30
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 31
comBuilder(5,38,List(0, 1, 4, 2, 3, 4)), // X(XX)X(XX)
comBuilder(6,47,List(5, 0, 1, 2, 4, 3)), // XX(X(XX)X)
ptrBuilder(30),
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(29),
),
 // FUN10Ordlist.boolList
appBuilder( // 32
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(37),
ptrBuilder(33),
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 34
comBuilder(5,15,List(0, 1, 2, 3, 4)), // X(XX)(XX)
ptrBuilder(13),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(32),
),
appBuilder( // 35
comBuilder(6,57,List(0, 1, 2, 3, 4, 5)), // X(X(XX)(XX))
ptrBuilder(10),
ptrBuilder(13),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(32),
),
appBuilder( // 36
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(35),
ptrBuilder(34),
),
appBuilder( // 37
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(10),
ptrBuilder(32),
ptrBuilder(36),
),
)
}