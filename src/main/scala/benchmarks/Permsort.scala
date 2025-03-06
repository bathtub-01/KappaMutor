package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 40
// Combinators in this file: 59
object Permsort extends Benchmark {
override def toString() = "Permsort" 
val combinatorCount = 59
val prog = Seq(
 // FUN0Permsort.main
appBuilder( // 0
ptrBuilder(9),
ptrBuilder(8),
),
appBuilder( // 1
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(12),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 2
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(12),
ptrBuilder(1),
),
appBuilder( // 3
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
ptrBuilder(2),
),
appBuilder( // 4
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(9),
ptrBuilder(3),
),
appBuilder( // 5
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(7),
ptrBuilder(4),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(6),
ptrBuilder(5),
),
appBuilder( // 7
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(10),
ptrBuilder(6),
),
appBuilder( // 8
ptrBuilder(10),
ptrBuilder(7),
),
 // FUN1NanoPrelude.head
appBuilder( // 9
comBuilder(3,2,List(2, 0, 1)), // XXX
errorBuilder(3),
comBuilder(2,0,List(0)), // X
),
 // FUN2Permsort.permSort
appBuilder( // 10
comBuilder(5,20,List(0, 1, 2, 3, 4)), // X(XX(XX))
ptrBuilder(9),
ptrBuilder(11),
ptrBuilder(15),
ptrBuilder(21),
),
 // FUN3NanoPrelude.filter
appBuilder( // 11
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 12
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 13
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(4,30,List(0, 2, 1, 2, 3, 3)), // XX(XXX)X
comBuilder(5,39,List(0, 3, 1, 4, 2, 4)), // XX(XX)(XX)
ptrBuilder(12),
),
appBuilder( // 14
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(13),
),
 // FUN4Permsort.ord
appBuilder( // 15
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(19),
),
appBuilder( // 16
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
ptrBuilder(15),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 17
comBuilder(6,40,List(0, 2, 1, 4, 3, 5)), // X(XXX)(XX)
ptrBuilder(20),
prmBuilder("<="),
),
appBuilder( // 18
comBuilder(4,11,List(0, 2, 1, 3, 3)), // XX(XX)X
ptrBuilder(17),
ptrBuilder(16),
),
appBuilder( // 19
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(18),
),
 // FUN5Data.Bool.&&
appBuilder( // 20
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN6Permsort.perm
appBuilder( // 21
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(23),
ptrBuilder(22),
),
appBuilder( // 22
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(24),
ptrBuilder(30),
ptrBuilder(21),
),
appBuilder( // 23
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN7Data.List_Type.concatMap
appBuilder( // 24
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(26),
),
appBuilder( // 25
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(27),
),
appBuilder( // 26
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(25),
),
 // FUN8Data.List_Type.++
appBuilder( // 27
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(29),
),
appBuilder( // 28
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 29
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(28),
),
 // FUN9Permsort.place
appBuilder( // 30
comBuilder(5,53,List(0, 1, 4, 2, 4, 3)), // X(XX(XX)X)
yBuilder(),
ptrBuilder(36),
ptrBuilder(33),
ptrBuilder(31),
),
appBuilder( // 31
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(37),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 32
comBuilder(4,58,List(0, 0, 1, 0, 2, 3)), // X(XX(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 33
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(32),
),
appBuilder( // 34
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 35
comBuilder(5,5,List(4, 0, 2, 1)), // X(XX)X
ptrBuilder(34),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 36
comBuilder(6,45,List(5, 0, 1, 2, 3, 4)), // X(XX)(X(XX))
ptrBuilder(35),
),
 // FUN10NanoPrelude.map
appBuilder( // 37
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(39),
),
appBuilder( // 38
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 39
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(38),
),
)
}