package benchmarks
import common.Helper._
 
// Functions in this file: 3
// Apps in this file: 9
// Combinators in this file: 9
object TreeSum extends Benchmark {
override def toString() = "TreeSum" 
val combinatorCount = 9
val prog = Seq(
 // FUN0TreeSum.main
appBuilder( // 0
ptrBuilder(2),
ptrBuilder(1),
),
appBuilder( // 1
ptrBuilder(5),
intBuilder(13),
),
 // FUN1TreeSum.treeSum
appBuilder( // 2
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(1),
ptrBuilder(4),
),
appBuilder( // 3
comBuilder(4,28,List(0, 2, 1, 0, 3, 1)), // XXX(XX)X
ptrBuilder(2),
prmBuilder("+"),
),
appBuilder( // 4
comBuilder(4,4,List(0, 2, 3, 1)), // XXXX
ptrBuilder(3),
intBuilder(1),
),
 // FUN2TreeSum.mkTree
appBuilder( // 5
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(8),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 6
comBuilder(3,2,List(2, 0, 1)), // XXX
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 7
comBuilder(3,15,List(0, 1, 2, 1, 2)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(5),
),
appBuilder( // 8
comBuilder(5,43,List(4, 0, 1, 2, 3, 4)), // XXX(X(XX))
prmBuilder("=="),
intBuilder(0),
ptrBuilder(7),
ptrBuilder(6),
),
)
}
