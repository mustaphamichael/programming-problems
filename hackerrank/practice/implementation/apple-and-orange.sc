// Complete the countApplesAndOranges function below.
def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
  def f(arr: Array[Int], d: Int) = arr.count(ap => {
    val distance = ap + d
    distance >= s && distance <= t
  })

  println(f(apples, a))
  println(f(oranges, b))
}

// test
val apples = Array(2, 3, -4)
val oranges = Array(3, -2, -4)
countApplesAndOranges(7, 10, 4, 12, apples, oranges)