// Complete the rotLeft function below.
def rotLeft(a: Array[Int], d: Int): Array[Int] = {
  a.drop(d).concat(a.take(d))
}

// test
val arr = Array(1, 2, 3, 4, 5)
val d = 4
rotLeft(arr, d) // (5 1 2 3 4)