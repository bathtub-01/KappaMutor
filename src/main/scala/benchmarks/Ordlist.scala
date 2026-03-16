package benchmarks
import common.Helper._
 
// Functions in this file: 12
// Apps in this file: 43
// Combinators in this file: 68
object Ordlist extends Benchmark {
override def toString() = "Ordlist" 
val combinatorCount = 68
val prog = Seq(
 // FUN0Ordlist.main
appBuilder( // 0
ptrBuilder(5),
ptrBuilder(4),
intBuilder(0),
intBuilder(1),
),
appBuilder( // 1
ptrBuilder(42),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 2
ptrBuilder(42),
ptrBuilder(1),
),
appBuilder( // 3
ptrBuilder(42),
ptrBuilder(2),
),
appBuilder( // 4
ptrBuilder(42),
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
ptrBuilder(33),
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
ptrBuilder(33),
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
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(21),
ptrBuilder(28),
),
appBuilder( // 21
comBuilder(4,45,List(0, 1, 3, 1, 2, 3)), // X(XX)(X(XX))
ptrBuilder(22),
ptrBuilder(23),
),
 // FUN6Ordlist.implies
appBuilder( // 22
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(1)), // X
),
 // FUN7Ordlist.ord
appBuilder( // 23
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(26),
),
appBuilder( // 24
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(4,8,List(0, 1, 2, 3)), // X(X(XX))
ptrBuilder(27),
),
appBuilder( // 25
comBuilder(6,33,List(0, 1, 2, 5, 3, 4)), // X(X(XX)X)X
comBuilder(3,6,List(0, 2, 1, 2)), // XX(XX)
ptrBuilder(24),
ptrBuilder(22),
ptrBuilder(23),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 26
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
ptrBuilder(25),
),
 // FUN8Data.Bool.&&
appBuilder( // 27
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN9Ordlist.ins
appBuilder( // 28
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(32),
ptrBuilder(31),
),
appBuilder( // 29
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(22),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 30
comBuilder(5,11,List(0, 1, 2, 4, 3)), // XX(XX)X
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
comBuilder(5,48,List(0, 4, 1, 2, 3, 4)), // XX(XX(XX))
ptrBuilder(29),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
),
appBuilder( // 31
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(30),
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 32
comBuilder(5,16,List(0, 1, 2, 3, 4)), // XX(XXX)
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(4,2,List(3, 1, 0)), // XXX
comBuilder(2,0,List(0)), // X
),
 // FUN10Ordlist.boolList
appBuilder( // 33
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(41),
ptrBuilder(34),
),
appBuilder( // 34
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
),
appBuilder( // 36
ptrBuilder(17),
ptrBuilder(35),
),
appBuilder( // 37
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(36),
ptrBuilder(33),
),
appBuilder( // 38
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 39
ptrBuilder(17),
ptrBuilder(38),
),
appBuilder( // 40
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
ptrBuilder(14),
ptrBuilder(39),
ptrBuilder(33),
ptrBuilder(37),
),
appBuilder( // 41
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
ptrBuilder(14),
ptrBuilder(33),
ptrBuilder(40),
),
 // FUN11Ordlist.S
appBuilder( // 42
comBuilder(3,3,List(0, 2, 1)), // X(XX)
comBuilder(2,0,List(0)), // X
),
)
}