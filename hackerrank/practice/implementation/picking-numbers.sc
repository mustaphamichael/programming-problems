def pickingNumbers(a: Array[Int]): Int = {
  // Complexity = O(n*m) n = array; m = sets
  // create a set of the number array to count the number of occurrence
  val sets = a.toSet

  // find the number of times the number and its +1 occur in the array
  val occurrence = for {
    n <- sets
    count = a.count(x => x == n || x == n + 1)
  } yield count
  occurrence.max
}

// test
val arr = Array(1, 2, 2, 3, 1, 2)
pickingNumbers(arr)