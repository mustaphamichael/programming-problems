// Complete the plusMinus function below.
def plusMinus(arr: Array[Int]): Unit = {
  val length = arr.length

  println(f"${arr.count(_ > 0).toDouble / length}%1.6f")
  println(f"${arr.count(_ < 0).toDouble / length}%1.6f")
  println(f"${arr.count(_ == 0).toDouble / length}%1.6f")
}

// test
val arr = Array(-4, 3, -9, 0, 4, 1)
plusMinus(arr)

//  def roundUp(n: Int): Long =
//    (math.round((n.toDouble / length) * 1000000) / 1000000.0).toLong

