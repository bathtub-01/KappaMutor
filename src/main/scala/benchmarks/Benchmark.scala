package benchmarks

import common._

trait Benchmark {
  val prog: Seq[Application]
  val combinatorCount: Int
  // val applicationCount: Int = prog.length
}
