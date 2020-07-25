// Complete the compareTriplets function below.
def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
  var ag = 0
  var bg = 0
  for ((i, j) <- a zip b) {
    if (i > j) ag += 1
    else if (i < j) bg += 1
  }
  Array(ag, bg)
}

// test
val a = Array(5, 6, 7)
val b = Array(3, 6, 10)

compareTriplets(a, b)

b.sum