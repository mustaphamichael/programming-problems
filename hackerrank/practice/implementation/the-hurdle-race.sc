// Complete the hurdleRace function below.
def hurdleRace(k: Int, height: Array[Int]): Int = {
  val maxHeight = height.max
  val diff = maxHeight - k
  if (diff < 0) 0 else diff
}

// test
val k = 4
val height = Array(1, 6, 3, 5, 2)
hurdleRace(k, height)