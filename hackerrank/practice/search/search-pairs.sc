// Complete the pairs function below.
def pairs(k: Int, arr: Array[Int]): Int = {
  var count = 0
  // the given array is unique
  // a set is used for constant time lookup
  val sets = arr.toSet
  for {
    value <- sets
    num = value - k
    if sets.contains(num)
  } count += 1

  count
}

// test
val arr = Array(1, 2, 3, 4)
pairs(1, arr)