/*
 * Complete the pageCount function below.
 */
def pageCount(n: Int, p: Int): Int = {
  // maximum book flips
  val maxFlips = (n - 1) / 2 + (n - 1) % 2

  // minimum flip of the book from front or back
  val minTurns = (p / 2) min (maxFlips - (p / 2))

  if (minTurns < 0) 0 else minTurns
}

// test
val (n, p) = (5, 4)
pageCount(n, p)