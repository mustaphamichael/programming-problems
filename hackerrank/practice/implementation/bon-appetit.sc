// Complete the bonAppetit function below.
def bonAppetit(bill: Array[Int], k: Int, b: Int) {
  val totalAmount = bill.sum
  val actual = (totalAmount - bill(k)) / 2
  if (b <= actual) println("Bon Appetit")
  else println(b - actual)
}

// test
val bill = Array(3, 10, 2, 9)
val (k, b) = (1, 12)
bonAppetit(bill, k, b)