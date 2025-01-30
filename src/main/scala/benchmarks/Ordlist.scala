package benchmarks
import common.Helper._
 
// Functions in this file: 12
// Apps in this file: 40
// Combinators in this file: 69
object Ordlist extends Benchmark {
override def toString() = "Ordlist" 
val combinatorCount = 69
val prog = Seq(
 // FUN0Ordlist.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
intBuilder(0),
intBuilder(1),
),
appBuilder( // 1
ptrBuilder(39),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 2
ptrBuilder(39),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(39),
ptrBuilder(2),
),
appBuilder( // 4
ptrBuilder(39),
ptrBuilder(3),
),
 // FUN1Ordlist.top
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(12),
ptrBuilder(11),
),
appBuilder( // 6
ptrBuilder(20),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 7
ptrBuilder(17),
ptrBuilder(6),
),
appBuilder( // 8
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(7),
ptrBuilder(31),
),
appBuilder( // 9
ptrBuilder(20),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 10
ptrBuilder(17),
ptrBuilder(9),
),
appBuilder( // 11
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(14),
ptrBuilder(10),
ptrBuilder(31),
ptrBuilder(8),
),
 // FUN2NanoPrelude.and
appBuilder( // 12
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(13),
),
appBuilder( // 13
comBuilder(4,5,List(0, 3, 1, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(12),
),
 // FUN3Data.List_Type.++
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 15
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 16
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(15),
),
 // FUN4NanoPrelude.map
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
 // FUN5Ordlist.prop
appBuilder( // 20
comBuilder(5,14,List(0, 1, 2, 3, 4)), // XXX(XX)
comBuilder(4,45,List(0, 1, 3, 1, 2, 3)), // X(XX)(X(XX))
ptrBuilder(21),
ptrBuilder(22),
ptrBuilder(26),
),
 // FUN6Ordlist.implies
appBuilder( // 21
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN7Ordlist.ord
appBuilder( // 22
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(24),
),
appBuilder( // 23
comBuilder(6,28,List(0, 1, 2, 3, 5, 4)), // XXX(XX)X
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(25),
ptrBuilder(21),
ptrBuilder(22),
),
appBuilder( // 24
comBuilder(6,31,List(0, 1, 2, 3, 5, 4)), // XX(X(XX))X
comBuilder(4,6,List(3, 0, 1, 2)), // XX(XX)
comBuilder(2,0,List(1)), // X
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(23),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
 // FUN8Data.Bool.&&
appBuilder( // 25
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9Ordlist.ins
appBuilder( // 26
comBuilder(3,7,List(0, 1, 2, 2)), // X(XXX)
yBuilder(),
ptrBuilder(30),
),
appBuilder( // 27
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,51,List(0, 1, 2, 3, 4, 5)), // X(XXXXX)
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(21),
),
appBuilder( // 28
comBuilder(5,12,List(0, 1, 4, 2, 3)), // X(XXX)X
comBuilder(5,9,List(0, 4, 1, 2, 3)), // XXXXX
ptrBuilder(27),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 29
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(28),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 30
comBuilder(6,37,List(0, 1, 2, 3, 4, 5)), // XXXX(XX)
comBuilder(6,37,List(0, 1, 4, 2, 3, 5)), // XXXX(XX)
comBuilder(5,12,List(4, 0, 1, 2, 3)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(29),
),
 // FUN10Ordlist.boolList
appBuilder( // 31
comBuilder(6,32,List(5, 0, 1, 2, 3, 4)), // X(XXXX)X
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(14),
ptrBuilder(31),
ptrBuilder(38),
ptrBuilder(32),
),
appBuilder( // 32
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 33
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
),
appBuilder( // 34
ptrBuilder(17),
ptrBuilder(33),
),
appBuilder( // 35
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(34),
ptrBuilder(31),
),
appBuilder( // 36
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 37
ptrBuilder(17),
ptrBuilder(36),
),
appBuilder( // 38
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(14),
ptrBuilder(37),
ptrBuilder(31),
ptrBuilder(35),
),
 // FUN11Ordlist.S
appBuilder( // 39
comBuilder(3,3,List(0, 2, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
)
}