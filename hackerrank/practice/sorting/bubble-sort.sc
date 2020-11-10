// Complete the countSwaps function below.
def countSwaps(a: Array[Int]): Unit = {

  var count = 0

  def swap(f: Int, s: Int) {
    val tmp = a(s)
    a(s) = a(f)
    a(f) = tmp
    count += 1
  }

  for {
    i <- a.indices
    //    j <- 0 until a.length - 1
    j <- 0 until a.length - 1 - count // -count added for optimization
    if a(j) > a(j + 1)
  } swap(j, j + 1)
  println(s"Array is sorted in $count swaps.")
  println(s"First Element: ${a.head}")
  println(s"Last Element: ${a.last}")
}

// test
val arr = Array(1, 2, 3)
//val arr = Array(6, 4, 6, 2, 7)
countSwaps(arr)