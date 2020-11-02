// Complete the maximumToys function below.
def maximumToys(prices: Array[Int], k: Int): Int = {
  // sort and use greedy algorithm
  val sortedPrices = prices.sorted.toList

  @scala.annotation.tailrec
  def loop(result: List[Int], sorted: List[Int], amount: Int): List[Int] = sorted match {
    case Nil => result
    case x :: xs if x > amount => loop(result, xs, amount)
    case x :: xs => loop(x :: result, xs, amount - x)
  }

  loop(List(), sortedPrices, k).size
}

// test
val arr = Array(1, 12, 5, 111, 200, 1000, 10)
val k = 50
maximumToys(arr, k) == 4