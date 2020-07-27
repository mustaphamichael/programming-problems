// Complete the birthday function below.
def birthday(s: Array[Int], d: Int, m: Int): Int = {
  // find 'm' combination of integers to give a sum of 'd'
  val chocBars = for {
    i <- s.indices
    bars = s.slice(i, i + m)
    if bars.sum == d
  } yield bars
  chocBars.length
}

// test
val s = Array(4)
val (d, m) = (4, 1)
birthday(s, d, m)