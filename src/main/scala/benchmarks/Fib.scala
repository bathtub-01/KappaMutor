package benchmarks
import common.Helper._
 
// Functions in this file: 2
// Apps in this file: 4
// Combinators in this file: 3
object Fib extends Benchmark {
override def toString() = "Fib" 
val combinatorCount = 3
val prog = Seq(
 // FUN0Fib.main
appBuilder( // 0
ptrBuilder(1),
intBuilder(17),
),
 // FUN1Fib.fib
appBuilder( // 1
comBuilder(5,28,List(4, 0, 1, 2, 4, 3)), // XXX(XX)X
prmBuilder("<="),
intBuilder(1),
ptrBuilder(3),
intBuilder(1),
),
appBuilder( // 2
comBuilder(5,12,List(0, 4, 1, 2, 3)), // X(XXX)X
ptrBuilder(1),
prmBuilder("-"),
intBuilder(2),
prmBuilder("+"),
),
appBuilder( // 3
comBuilder(5,49,List(0, 4, 1, 4, 2, 3)), // XX(X(XXX))
ptrBuilder(2),
ptrBuilder(1),
prmBuilder("-"),
intBuilder(1),
),
)
}