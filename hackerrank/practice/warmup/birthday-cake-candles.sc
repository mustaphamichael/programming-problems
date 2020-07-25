// Complete the birthdayCakeCandles function below.
def birthdayCakeCandles(ar: Array[Int]): Int = {
  var max = 0
  var count = 0
  for (elem <- ar) {
    if (elem > max) {
      max = elem
      count = 1
    } else if (elem == max) count += 1
  }
  count
}

// test
//val arr = Array(4, 4, 1, 3)
val arr = Array(10, 9, 3, 2, 1, 9)
birthdayCakeCandles(arr)