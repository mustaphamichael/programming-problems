def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
  // Brute force O(k*d)
  val tCost = for {
    k <- keyboards
    d <- drives
    cost = k + d
    if cost <= b
  } yield cost
  if (tCost.isEmpty) -1 else tCost.max

  // Optimized O(k+d log(k+d))
  // sort keyboard in descending order and drives in ascending order
  // perform computation on k and d without repeating indices of both
}

// test
val keyboards = Array(3, 1)
val drives = Array(5, 2, 8)
val b = 10
getMoneySpent(keyboards, drives, b)