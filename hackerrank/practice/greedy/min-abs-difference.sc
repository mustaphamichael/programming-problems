// Complete the minimumAbsoluteDifference function below.
def minimumAbsoluteDifference(arr: Array[Int]): Int = {
  // Brute force // O(n*n)
  //  val pair = for {
  //    i <- arr.indices
  //    j <- arr.drop(i + 1)
  //  } yield math.abs(arr(i) - j)
  //
  //  pair.min

  // O(n log n)
  val sorted = arr.sorted
  val pair = for {
    i <- 0 until sorted.length - 1
    diff = math.abs(sorted(i) - sorted(i + 1))
  } yield diff
  pair.min
}

// test
val list = Array(1, -3, 71, 68, 17)
minimumAbsoluteDifference(list)