package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 37
// Combinators in this file: 49
object Queens extends Benchmark {
override def toString() = "Queens" 
val combinatorCount = 49
val prog = Seq(
 // FUN0Queens.main
appBuilder( // 0
ptrBuilder(1),
intBuilder(6),
),
 // FUN1Queens.nsoln
appBuilder( // 1
comBuilder(3,7,List(0, 1, 2, 2)), // X(XXX)
ptrBuilder(2),
ptrBuilder(5),
),
 // FUN2NanoPrelude.length
appBuilder( // 2
yBuilder(),
ptrBuilder(4),
intBuilder(0),
),
appBuilder( // 3
comBuilder(5,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 4
comBuilder(4,16,List(3, 2, 0, 1, 2)), // XX(XXX)
ptrBuilder(3),
),
 // FUN3Queens.gen
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 7
comBuilder(4,7,List(2, 3, 0, 1)), // X(XXX)
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 8
comBuilder(6,44,List(0, 1, 3, 2, 4, 5)), // X(XX)(XXX)
ptrBuilder(11),
ptrBuilder(17),
ptrBuilder(7),
),
appBuilder( // 9
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(0),
),
appBuilder( // 10
comBuilder(5,12,List(0, 1, 3, 4, 2)), // X(XXX)X
ptrBuilder(9),
ptrBuilder(8),
ptrBuilder(6),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 11
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(13),
),
appBuilder( // 12
comBuilder(5,15,List(0, 1, 3, 2, 4)), // X(XX)(XX)
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(12),
),
 // FUN5Data.List_Type.++
appBuilder( // 14
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(16),
),
appBuilder( // 15
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 16
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(15),
),
 // FUN6Queens.gen1
appBuilder( // 17
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(11),
ptrBuilder(18),
ptrBuilder(34),
),
 // FUN7Queens.gen2
appBuilder( // 18
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(20),
ptrBuilder(19),
),
appBuilder( // 19
comBuilder(6,12,List(5, 0, 3, 2, 1)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 20
comBuilder(5,9,List(0, 4, 1, 3, 2)), // XXXXX
ptrBuilder(21),
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
 // FUN8Queens.safe
appBuilder( // 21
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(32),
),
appBuilder( // 22
comBuilder(6,58,List(0, 3, 1, 5, 2, 4)), // X(XX(XXX))
ptrBuilder(33),
prmBuilder("/="),
prmBuilder("-"),
),
appBuilder( // 23
comBuilder(6,24,List(0, 1, 5, 2, 4, 3)), // X(XX)XXX
comBuilder(6,54,List(0, 1, 2, 3, 4, 5)), // X(X(XXX)X)
),
appBuilder( // 24
comBuilder(5,24,List(0, 1, 4, 3, 2, 4)), // X(XX)XXX
ptrBuilder(23),
),
appBuilder( // 25
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(24),
ptrBuilder(22),
prmBuilder("+"),
),
appBuilder( // 26
comBuilder(6,58,List(0, 3, 1, 5, 2, 4)), // X(XX(XXX))
ptrBuilder(33),
prmBuilder("/="),
prmBuilder("+"),
),
appBuilder( // 27
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(5,46,List(0, 3, 1, 3, 2, 4)), // XX(XXXX)
),
appBuilder( // 28
comBuilder(6,29,List(0, 1, 2, 3, 5, 4)), // X(XX)(XX)X
ptrBuilder(27),
ptrBuilder(26),
),
appBuilder( // 29
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(28),
ptrBuilder(25),
intBuilder(1),
),
appBuilder( // 30
comBuilder(6,40,List(0, 2, 1, 4, 3, 5)), // X(XXX)(XX)
ptrBuilder(33),
prmBuilder("/="),
),
appBuilder( // 31
comBuilder(4,15,List(0, 1, 3, 2, 3)), // X(XX)(XX)
comBuilder(5,32,List(0, 1, 2, 3, 4, 4)), // X(XXXX)X
ptrBuilder(30),
ptrBuilder(29),
),
appBuilder( // 32
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
comBuilder(2,0,List(1)), // X
ptrBuilder(31),
),
 // FUN9Data.Bool.&&
appBuilder( // 33
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN10Queens.toOne
appBuilder( // 34
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(1),
ptrBuilder(36),
ptrBuilder(35),
),
appBuilder( // 35
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 36
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(34),
prmBuilder("-"),
intBuilder(1),
),
)
}