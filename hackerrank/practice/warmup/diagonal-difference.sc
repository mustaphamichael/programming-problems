def diagonalDifference(arr: Array[Array[Int]]): Int = {
  // Write your code here
  // It is a square matrix
  val indices = arr.indices
  val zipped = indices zip indices.sorted(Ordering.Int.reverse)
  val diagonals = for {
    i <- arr.indices
    array = arr(i)
    (l, r) = zipped(i)
  } yield array(l) -> array(r)

  math.abs(diagonals.foldLeft(0)((acc, e) => acc + (e._1 - e._2)))
}

// test
val arr = Array(Array(11, 2, 4), Array(4, 5, 6), Array(10, 8, -12))
//val arr = Array(Array(1, 2, 4), Array(4, 5, 6), Array(9, 8, 9))
diagonalDifference(arr)