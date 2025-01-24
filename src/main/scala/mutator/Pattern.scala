package mutator

abstract class Pattern
case class X() extends Pattern {
  override def toString = "X"
}
case class At(p1: Pattern, p2: Pattern) extends Pattern {
  override def toString =
    "(" ++ p1.toString ++ p2.toString ++ ")"
}

object Patterns {
  def comprehension(ps1: List[Pattern], ps2: List[Pattern]): List[Pattern] = {
	ps1.map(p1 =>
	  ps2.map(p2 =>
		At(p1, p2)
	  )
	).flatten
  }
  val x:      List[Pattern] = List(X())
  val xx:     List[Pattern] = List(comprehension(x, x)).flatten
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

  type Hole = (Boolean, Int) // false - argument; true - pointer
  sealed trait Mode
  object Mode {
    case object Spine extends Mode
    case object App1 extends Mode
    case object App2 extends Mode
    case object App3 extends Mode
  }
  case class State(val mode: Mode, val argCounter: Int, val ptrCounter: Int)
  case class Res(val spine: List[Hole], val app1: List[Hole], val app2: List[Hole], val app3: List[Hole]) {
    override def toString = {
      def Hole2String(h: Hole): String = {
        if(h._1) 
          s"PTR${h._2} "
        else
          s"ARG${h._2} "
      }
      "Spine: " ++ spine.map(Hole2String(_)).mkString ++ "\n" ++
      "App1: " ++ app1.map(Hole2String(_)).mkString ++ "\n" ++
      "App2: " ++ app2.map(Hole2String(_)).mkString ++ "\n" ++
      "App3: " ++ app3.map(Hole2String(_)).mkString ++ "\n"
    }
  }
  val emptyRes = new Res(List(), List(), List(), List())

  def parse(p: Pattern, s: State = new State(Mode.Spine, 0, 0)): (Res, State) = {
    def pendRes(r1: Res, r2: Res): Res =
      new Res(r1.spine ++ r2.spine, r1.app1 ++ r2.app1,
              r1.app2 ++ r2.app2, r1.app3 ++ r2.app3)
    p match {
      case X() => {
        val nState = s.copy(argCounter = s.argCounter + 1)
        s.mode match {
          case Mode.Spine => (emptyRes.copy(spine = List((false, s.argCounter))), nState)
          case Mode.App1 => (emptyRes.copy(app1 = List((false, s.argCounter))), nState)
          case Mode.App2 => (emptyRes.copy(app2 = List((false, s.argCounter))), nState)
          case Mode.App3 => (emptyRes.copy(app3 = List((false, s.argCounter))), nState)
        }
      }
      case At(p1, p2) => {
        val (lRes, lState) = parse(p1, s)
        def nextMode: Mode = {
          val ptrCounter = lState.ptrCounter
          if(ptrCounter == 0)
            Mode.App1
          else if(ptrCounter == 1)
            Mode.App2
          else
            Mode.App3
        }
        p2 match {
          case X() => {
            val (rRes, rState) = parse(p2, lState.copy(mode = s.mode))
            (pendRes(lRes, rRes), rState)
          }
          case At(_, _) => {
            val nHole = List((true, lState.ptrCounter))
            val nPtrCounter = lState.ptrCounter + 1
            val nState = lState.copy(mode = nextMode, ptrCounter = nPtrCounter)
            val nRes = s.mode match {
              case Mode.Spine => lRes.copy(spine = lRes.spine ++ nHole)
              case Mode.App1 => lRes.copy(app1 = lRes.app1 ++ nHole)
              case _ => lRes.copy(app2 = lRes.app2 ++ nHole)
            }
            val (rRes, rState) = parse(p2, nState)
            (pendRes(nRes, rRes), rState)
          }
        }
      }
    }
  }
}

object Pattern extends App {
  import Patterns._
  val pat = allPatterns(22)
  println(pat)
  println(parse(pat)._1)
  println(":)")
}
