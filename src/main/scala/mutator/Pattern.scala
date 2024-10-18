package mutator

abstract class Pattern
case class X() extends Pattern
case class XX() extends Pattern
case class At(p1: Pattern, p2: Pattern) extends Pattern

object Patterns {
  def comprehension(ps1: List[Pattern], ps2: List[Pattern]): List[Pattern] = {
	ps1.map(p1 =>
	  ps2.map(p2 =>
		At(p1, p2)
	  )
	).flatten
  }
  val x:      List[Pattern] = List(X())
  val xx:     List[Pattern] = List(XX())
  val xxx:    List[Pattern] = List(comprehension(xx, x), 
                                   comprehension(x, xx)).flatten
  val xxxx:   List[Pattern] = List(comprehension(xxx, x),
                                   comprehension(xx, xx),
                                   comprehension(x, xxx)).flatten
  val xxxxx:  List[Pattern] = List(comprehension(xxxx, x),
                                   comprehension(xxx, xx),
                                   comprehension(xx, xxx),
                                   comprehension(x, xxxx)).flatten
  val xxxxxx: List[Pattern] = List(comprehension(xxxxx, x),
                                   comprehension(xxxx, xx),
                                   comprehension(xxx, xxx),
                                   comprehension(xx, xxxx),
                                   comprehension(x, xxxxx)).flatten
  // there are 65 patterns in total, but we don't include `X(X(X(X(XX))))`
  // thus it's 64 patterns for us.
  val allPatterns: List[Pattern] =
	x ++ xx ++ xxx ++ xxxx ++ xxxxx ++ xxxxxx.init
}

object Pattern extends App {
  import Patterns._
  val a = Patterns.xxxxxx.length + xxxxx.length + xxxx.length + xxx.length + xx. length + x.length
  println(xxxxxx.last)
  println(":)")
}
