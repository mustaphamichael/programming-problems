// See https://www.hackerrank.com/challenges/ctci-merge-sort/problem

def countInversions(arr: Array[Int]): Long = {
  // Perform sort
  var swaps = 0

  def split(array: Array[Int]): (Array[Int], Array[Int]) = {
    val mid = array.length / 2
    array.splitAt(mid)
  }

  def merge(left: List[Int], right: List[Int]): List[Int] =
    (left, right) match {
      case (left, Nil) => left
      case (Nil, right) => right
      case (x :: xs, y :: ys) =>
        if (x <= y) x :: merge(xs, right)
        else {
          //the size of xs is also used to determine how many elements is crossed over
          swaps += xs.size + 1
          println(x, y, swaps)

          y :: merge(left, ys)
        }
    }

  def sort(array: Array[Int]): Array[Int] = {
    if (array.length <= 1) return array

    val (left, right) = split(array)
    merge(sort(left).toList, sort(right).toList).toArray
  }

  println(sort(arr).toList)
  swaps
}

// test
val arr = "2 3 4 2 3 6 8 4 5".split(" ").map(_.trim.toInt)
//val arr = "7 5 3 1".split(" ").map(_.trim.toInt)
countInversions(arr)