// Complete the beautifulDays function below.
def beautifulDays(i: Int, j: Int, k: Int): Int = {
  (for {
    day <- i to j
    reverse = day.toString.reverse.toInt
    if math.abs(day - reverse) % k == 0
  } yield true).size
}

// test
val (i, j, k) = (20, 23, 6)
beautifulDays(i, j, k)