// Complete the utopianTree function below.
def utopianTree(n: Int): Int = {

  // noticed a pattern
  // odd periods are in Summer = height + 1
  // even periods are in Spring = height  * 2
  @scala.annotation.tailrec
  def loop(period: Int, height: Int): Int = {
    if (period == n) height
    else {
      if (period % 2 != 0) loop(period + 1, height + 1)
      else loop(period + 1, height * 2)
    }
  }

  loop(0, 1)
}

// test
val n = 4
utopianTree(n)