package benchmarks
import common.Helper._
 
// Functions in this file: 8
// Apps in this file: 29
// Combinators in this file: 38
object ProgramBin extends Benchmark {
override def toString() = "ProgramBin" 
val combinatorCount = 38
val prog = Seq(
 // FUN0PlainSum.main
appBuilder( // 0
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 1
ptrBuilder(23),
intBuilder(1),
intBuilder(50),
),
appBuilder( // 2
ptrBuilder(6),
intBuilder(1),
intBuilder(500),
ptrBuilder(1),
),
 // FUN1NanoPrelude.sum
appBuilder( // 3
ptrBuilder(4),
prmBuilder("+"),
intBuilder(0),
),
 // FUN2NanoPrelude.foldr
appBuilder( // 4
comBuilder(4,7,List(0, 1, 2, 3)), // X(XXX)
yBuilder(),
ptrBuilder(5),
),
appBuilder( // 5
comBuilder(5,16,List(4, 2, 0, 1, 3)), // XX(XXX)
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
),
 // FUN3PlainSum.inboundIdx
appBuilder( // 6
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
ptrBuilder(17),
ptrBuilder(15),
ptrBuilder(18),
ptrBuilder(22),
intBuilder(0),
),
appBuilder( // 7
comBuilder(5,14,List(4, 0, 1, 2, 3)), // XXX(XX)
prmBuilder("<="),
),
appBuilder( // 8
comBuilder(5,14,List(4, 0, 1, 2, 3)), // XXX(XX)
prmBuilder(">="),
),
appBuilder( // 9
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
comBuilder(6,62,List(0, 1, 2, 5, 3, 4)), // X(X(XX(XX)))
),
appBuilder( // 10
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
ptrBuilder(9),
),
appBuilder( // 11
comBuilder(5,29,List(0, 1, 4, 2, 4, 3)), // X(XX)(XX)X
ptrBuilder(10),
),
appBuilder( // 12
comBuilder(6,29,List(0, 1, 4, 2, 5, 3)), // X(XX)(XX)X
ptrBuilder(11),
ptrBuilder(8),
ptrBuilder(7),
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 13
comBuilder(6,52,List(4, 0, 1, 2, 3, 5)), // X(X(XX)XX)
comBuilder(4,23,List(0, 1, 2, 3, 1, 2)), // XXXXXX
),
appBuilder( // 14
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(13),
ptrBuilder(12),
),
appBuilder( // 15
comBuilder(6,46,List(5, 0, 1, 2, 3, 4)), // XX(XXXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(14),
),
appBuilder( // 16
comBuilder(6,48,List(0, 1, 2, 5, 3, 4)), // XX(XX(XX))
yBuilder(),
),
appBuilder( // 17
comBuilder(6,24,List(0, 1, 5, 2, 3, 4)), // X(XX)XXX
ptrBuilder(16),
),
 // FUN4NanoPrelude.zip
appBuilder( // 18
comBuilder(4,6,List(2, 0, 1, 3)), // XX(XX)
comBuilder(2,0,List(0)), // X
ptrBuilder(21),
),
appBuilder( // 19
comBuilder(6,44,List(0, 1, 4, 2, 3, 5)), // X(XX)(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 20
comBuilder(4,5,List(0, 1, 3, 2)), // X(XX)X
ptrBuilder(19),
comBuilder(3,2,List(2, 0, 1)), // XXX
ptrBuilder(18),
),
appBuilder( // 21
comBuilder(5,16,List(2, 0, 1, 3, 4)), // XX(XXX)
comBuilder(2,0,List(0)), // X
ptrBuilder(20),
),
 // FUN5NanoPrelude.enumFrom
appBuilder( // 22
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(22),
prmBuilder("+"),
intBuilder(1),
),
 // FUN6NanoPrelude.enumFromTo
appBuilder( // 23
comBuilder(5,15,List(0, 1, 4, 2, 3)), // X(XX)(XX)
ptrBuilder(25),
ptrBuilder(24),
ptrBuilder(22),
),
appBuilder( // 24
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("<="),
),
 // FUN7NanoPrelude.takeWhile
appBuilder( // 25
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(28),
),
appBuilder( // 26
comBuilder(4,6,List(0, 2, 1, 3)), // XX(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
),
appBuilder( // 27
comBuilder(5,42,List(1, 3, 0, 2, 3, 4)), // XXX(XXX)
comBuilder(2,0,List(0)), // X
),
appBuilder( // 28
comBuilder(6,48,List(5, 0, 1, 3, 2, 4)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
ptrBuilder(27),
ptrBuilder(26),
),
)
}