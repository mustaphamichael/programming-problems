// See https://www.hackerrank.com/challenges/reduced-string/problem

def superReducedString(s: String): String = {
  // It is advisable to use StringBuilder as it behaves likes an ArrayList
  @scala.annotation.tailrec
  def loop(i: Int, sb: StringBuilder): String = {
    if (i >= sb.length - 1) sb.toString
    else if (sb(i) == sb(i + 1)) loop(0, sb.delete(i, i + 2))
    else loop(i + 1, sb)
  }

  val ans = loop(0, new StringBuilder(s))
  if (ans.isEmpty) "Empty String" else ans
}

// test
val s = "aa"
superReducedString(s)