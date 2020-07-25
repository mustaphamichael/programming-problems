import scala.collection.mutable

// Complete the isBalanced function below.
def isBalanced(s: String): String = {
  val length = s.length
  val mid = s.length / 2
  if (length % 2 != 0) "NO"
  else {
    val first = s.substring(0, mid)
    val second = s.substring(mid, s.length)
    val stack = mutable.Stack[Char]()
    val queue = mutable.Queue[Char]()

    // add first part to a stack (LIFO)
    for (c <- first) stack.push(c)
    // add second part to a queue (FIFO)
    for (c <- second) queue.enqueue(c)

    val k = (for {
      i <- 0 until mid
      left = stack.pop
      right = queue.dequeue
      comparison = if (left == '{' && right == '}') "YES"
      else if (left == '[' && right == ']') "YES"
      else if (left == '(' && right == ')') "YES"
      else "NO"
    } yield comparison).toSet
    if (k.contains("NO")) "NO" else "YES"
  }
}

// test
val string = "{(([])[])[]}"
isBalanced(string)
string.length