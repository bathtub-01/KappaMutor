package benchmarks
import common.Helper._
 
// Functions in this file: 6
// Apps in this file: 21
// Combinators in this file: 34
object TreePari extends Benchmark {
override def toString() = "TreePari" 
val combinatorCount = 34
val prog = Seq(
 // FUN0TreePari.main
appBuilder( // 0
ptrBuilder(3),
ptrBuilder(2),
),
appBuilder( // 1
ptrBuilder(17),
intBuilder(10),
),
appBuilder( // 2
ptrBuilder(4),
ptrBuilder(14),
ptrBuilder(1),
),
 // FUN1TreePari.peek
appBuilder( // 3
comBuilder(3,2,List(2, 0, 1)), // XXX
intBuilder(0),
intBuilder(42),
),
 // FUN2TreePari.pariWhere
appBuilder( // 4
comBuilder(4,20,List(0, 1, 3, 2, 3)), // X(XX(XX))
yBuilder(),
ptrBuilder(11),
ptrBuilder(9),
),
appBuilder( // 5
comBuilder(4,57,List(0, 0, 1, 2, 1, 3)), // X(X(XX)(XX))
ptrBuilder(12),
),
appBuilder( // 6
comBuilder(3,3,List(0, 1, 2)), // X(XX)
ptrBuilder(5),
comBuilder(1,0,List(0)), // X
),
appBuilder( // 7
comBuilder(6,24,List(0, 1, 5, 2, 4, 3)), // X(XX)XXX
comBuilder(6,46,List(0, 5, 1, 2, 3, 4)), // XX(XXXX)
),
appBuilder( // 8
comBuilder(5,10,List(0, 1, 4, 3, 2)), // X(XX)XX
ptrBuilder(7),
ptrBuilder(6),
comBuilder(2,0,List(1)), // X
),
appBuilder( // 9
comBuilder(6,23,List(0, 2, 3, 4, 5, 1)), // XXXXXX
ptrBuilder(8),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 10
comBuilder(5,18,List(4, 3, 0, 1, 2)), // X(XXXX)
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 11
comBuilder(5,42,List(0, 1, 4, 2, 3, 4)), // XXX(XXX)
ptrBuilder(10),
),
 // FUN3TreePari.xor
appBuilder( // 12
comBuilder(5,40,List(3, 4, 0, 1, 2, 4)), // X(XXX)(XX)
comBuilder(2,0,List(1)), // X
comBuilder(2,0,List(0)), // X
ptrBuilder(13),
),
appBuilder( // 13
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
comBuilder(2,0,List(1)), // X
),
 // FUN4TreePari.withTwoLeaf
appBuilder( // 14
comBuilder(3,2,List(2, 0, 1)), // XXX
comBuilder(2,0,List(0)), // X
ptrBuilder(16),
),
appBuilder( // 15
comBuilder(3,0,List(0)), // X
comBuilder(2,0,List(0)), // X
),
appBuilder( // 16
comBuilder(4,12,List(2, 3, 0, 1, 1)), // X(XXX)X
comBuilder(2,0,List(1)), // X
ptrBuilder(15),
),
 // FUN5TreePari.mkTree
appBuilder( // 17
comBuilder(3,2,List(0, 2, 1)), // XXX
ptrBuilder(20),
comBuilder(2,0,List(0)), // X
),
appBuilder( // 18
comBuilder(3,2,List(0, 2, 1)), // XXX
prmBuilder("-"),
intBuilder(1),
),
appBuilder( // 19
comBuilder(3,15,List(0, 1, 2, 1, 2)), // X(XX)(XX)
comBuilder(4,2,List(3, 0, 1)), // XXX
ptrBuilder(17),
),
appBuilder( // 20
comBuilder(5,43,List(0, 4, 1, 2, 3, 4)), // XXX(X(XX))
prmBuilder("=="),
intBuilder(0),
ptrBuilder(19),
ptrBuilder(18),
),
)
}
