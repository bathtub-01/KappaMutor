package benchmarks
import common.Helper._
 
// Functions in this file: 11
// Apps in this file: 32
// Combinators in this file: 56
object Queens extends Benchmark {
override def toString() = "Queens" 
val combinatorCount = 56
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
 // FUN3Queens.gen
appBuilder( // 5
comBuilder(6,53,List(0, 1, 2, 3, 5, 4)), // X(XX(XX)X)
yBuilder(),
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(8),
ptrBuilder(7),
ptrBuilder(6),
),
appBuilder( // 6
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 7
comBuilder(6,27,List(0, 1, 2, 5, 3, 4)), // X(X(XX))XX
comBuilder(5,21,List(0, 3, 4, 1, 2)), // X(X(XXX))
ptrBuilder(9),
ptrBuilder(15),
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 8
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(0),
),
 // FUN4Data.List_Type.concatMap
appBuilder( // 9
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(11),
),
appBuilder( // 10
comBuilder(5,13,List(0, 1, 2, 4, 3)), // X(X(XX))X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(12),
),
appBuilder( // 11
comBuilder(5,16,List(4, 0, 1, 2, 3)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(10),
),
 // FUN5Data.List_Type.++
appBuilder( // 12
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
yBuilder(),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
comBuilder(3,3,List(0, 1, 2)), // X(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 14
comBuilder(4,6,List(3, 1, 0, 2)), // XX(XX)
ptrBuilder(13),
),
 // FUN6Queens.gen1
appBuilder( // 15
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(16),
ptrBuilder(29),
),
appBuilder( // 16
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(9),
ptrBuilder(17),
),
 // FUN7Queens.gen2
appBuilder( // 17
comBuilder(4,42,List(0, 2, 3, 1, 2, 3)), // XXX(XXX)
ptrBuilder(19),
ptrBuilder(18),
),
appBuilder( // 18
comBuilder(5,12,List(0, 1, 4, 3, 2)), // X(XXX)X
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(4,2,List(3, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
),
appBuilder( // 19
comBuilder(5,9,List(0, 4, 1, 3, 2)), // XXXXX
ptrBuilder(20),
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
 // FUN8Queens.safe
appBuilder( // 20
comBuilder(5,20,List(0, 1, 2, 3, 4)), // X(XX(XX))
yBuilder(),
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(27),
ptrBuilder(26),
),
appBuilder( // 21
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(5,21,List(0, 1, 4, 2, 3)), // X(X(XXX))
ptrBuilder(28),
prmBuilder("/="),
prmBuilder("-"),
),
appBuilder( // 22
comBuilder(5,11,List(0, 1, 4, 2, 3)), // XX(XX)X
comBuilder(5,21,List(0, 1, 4, 2, 3)), // X(X(XXX))
ptrBuilder(28),
prmBuilder("/="),
prmBuilder("+"),
),
appBuilder( // 23
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(5,22,List(0, 1, 2, 3, 4)), // X(X(X(XX)))
ptrBuilder(28),
),
appBuilder( // 24
comBuilder(5,17,List(0, 1, 2, 4, 3)), // XX(X(XX))
comBuilder(5,41,List(0, 1, 2, 4, 3, 4)), // X(X(XX))(XX)
comBuilder(4,11,List(0, 3, 1, 3, 2)), // XX(XX)X
ptrBuilder(23),
prmBuilder("/="),
),
appBuilder( // 25
comBuilder(4,39,List(0, 3, 1, 3, 2, 3)), // XX(XX)(XX)
ptrBuilder(24),
ptrBuilder(22),
ptrBuilder(21),
),
appBuilder( // 26
comBuilder(5,10,List(0, 1, 4, 2, 3)), // X(XX)XX
comBuilder(5,49,List(0, 4, 3, 4, 1, 2)), // XX(X(XXX))
ptrBuilder(25),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 27
comBuilder(4,6,List(0, 1, 2, 3)), // XX(XX)
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(1)), // X
),
 // FUN9Data.Bool.&&
appBuilder( // 28
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN10Queens.toOne
appBuilder( // 29
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("=="),
intBuilder(1),
ptrBuilder(31),
ptrBuilder(30),
),
appBuilder( // 30
comBuilder(4,2,List(3, 0, 1)), // XXX
intBuilder(1),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 31
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(29),
prmBuilder("-"),
intBuilder(1),
),
)
}