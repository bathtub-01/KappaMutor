package benchmarks
import common.Helper._
 
// Functions in this file: 5
// Apps in this file: 16
// Combinators in this file: 18
object EqList extends Benchmark {
override def toString() = "EqList" 
val combinatorCount = 18
val prog = Seq(
 // FUN0EqList.main
appBuilder( // 0
ptrBuilder(4),
ptrBuilder(3),
),
appBuilder( // 1
ptrBuilder(12),
intBuilder(101),
intBuilder(200),
),
appBuilder( // 2
ptrBuilder(12),
intBuilder(1),
intBuilder(100),
),
appBuilder( // 3
ptrBuilder(5),
prmBuilder("<"),
ptrBuilder(2),
ptrBuilder(1),
),
 // FUN1EqList.boolToInt
appBuilder( // 4
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(42),
),
 // FUN2EqList.eqList
appBuilder( // 5
comBuilder(3,3,List(0, 1, 2)), // X(XX)
yBuilder(),
ptrBuilder(10),
),
appBuilder( // 6
comBuilder(6,40,List(0, 1, 2, 4, 3, 5)), // X(XXX)(XX)
ptrBuilder(11),
),
appBuilder( // 7
comBuilder(6,48,List(3, 0, 1, 4, 2, 5)), // XX(XX(XX))
comBuilder(2,0,List(0)), // X
),
appBuilder( // 8
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 9
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)), // X(XXX)(XX)
comBuilder(2,0,List(1)), // X
ptrBuilder(8),
),
appBuilder( // 10
comBuilder(5,19,List(0, 1, 2, 3, 4)), // X(X(XX)X)
ptrBuilder(9),
ptrBuilder(7),
ptrBuilder(6),
),
 // FUN3Data.Bool.&&
appBuilder( // 11
comBuilder(2,1,List(1, 0)), // XX
comBuilder(2,0,List(0)), // X
),
 // FUN4NanoPrelude.enumFromTo
appBuilder( // 12
comBuilder(3,5,List(0, 1, 2, 2)), // X(XX)X
ptrBuilder(15),
ptrBuilder(14),
),
appBuilder( // 13
comBuilder(4,7,List(0, 1, 3, 2)), // X(XXX)
ptrBuilder(12),
prmBuilder("+"),
intBuilder(1),
),
appBuilder( // 14
comBuilder(4,16,List(0, 2, 1, 2, 3)), // XX(XXX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(13),
),
appBuilder( // 15
comBuilder(5,37,List(0, 3, 4, 1, 2, 4)), // XXXX(XX)
prmBuilder("<="),
comBuilder(2,0,List(0)), // X
),
)
}
