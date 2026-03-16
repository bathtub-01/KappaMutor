package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 37
// Combinators in this file: 69
object Permsort extends Benchmark {
override def toString() = "Permsort" 
val combinatorCount = 69
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
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(9),
ptrBuilder(11),
ptrBuilder(20),
),
appBuilder( // 11
ptrBuilder(12),
ptrBuilder(15),
),
 // FUN3NanoPrelude.filter
appBuilder( // 12
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(5,38,List(0, 2, 4, 3, 1, 4)), // X(XX)X(XX)
comBuilder(4,45,List(0, 1, 3, 2, 1, 3)), // X(XX)(X(XX))
comBuilder(4,2,List(3, 0, 1)), // XXX
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
ptrBuilder(18),
),
appBuilder( // 16
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(19),
),
appBuilder( // 17
comBuilder(6,33,List(0, 1, 5, 2, 3, 4)), // X(X(XX)X)X
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(16),
prmBuilder("<="),
ptrBuilder(15),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 18
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(17),
),
 // FUN5Data.Bool.&&
appBuilder( // 19
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN6Permsort.perm
appBuilder( // 20
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 21
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(23),
ptrBuilder(29),
ptrBuilder(20),
),
appBuilder( // 22
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
 // FUN7Data.List_Type.concatMap
appBuilder( // 23
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(25),
),
appBuilder( // 24
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(26),
),
appBuilder( // 25
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(24),
),
 // FUN8Data.List_Type.++
appBuilder( // 26
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(28),
),
appBuilder( // 27
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 28
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(27),
),
 // FUN9Permsort.place
appBuilder( // 29
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
yBuilder(),
ptrBuilder(33),
ptrBuilder(30),
),
appBuilder( // 30
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(34),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 31
comBuilder(6,34,List(0, 1, 2, 3, 5, 4)), // X(XX(XX))X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 32
comBuilder(5,12,List(0, 1, 2, 4, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 33
comBuilder(5,39,List(0, 1, 2, 4, 3, 4)), // XX(XX)(XX)
comBuilder(5,17,List(0, 1, 2, 3, 4)), // XX(X(XX))
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(32),
ptrBuilder(31),
),
 // FUN10NanoPrelude.map
appBuilder( // 34
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(36),
),
appBuilder( // 35
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 36
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(35),
),
)
}