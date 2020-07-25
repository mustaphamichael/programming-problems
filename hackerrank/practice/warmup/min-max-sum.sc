// Complete the miniMaxSum function below.
def miniMaxSum(arr: Array[Int]) {
  val sorted = arr.sorted
  val minSum = sorted.init.map(_.toLong).sum
  val maxSum = sorted.tail.map(_.toLong).sum
  println(s"$minSum $maxSum")
}

// test
//val arr = Array(1, 3, 5, 7, 9)
val arr = Array(793810624, 895642170, 685903712, 623789054, 468592370)
miniMaxSum(arr)