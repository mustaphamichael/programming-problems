// Complete the divisibleSumPairs function below.
def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
  // Brute force
  val pairs = for {
    i <- 0 until n
    j <- i + 1 until n
    if (ar(i) + ar(j)) % k == 0
  } yield i -> j

  pairs.length
}

// test
val (n, k) = (6, 3)
val ar = Array(1, 3, 2, 6, 1, 26)
divisibleSumPairs(n, k, ar)