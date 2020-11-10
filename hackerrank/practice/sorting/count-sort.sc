// Count sort algorithm (where max = 9)

def sort(arr: Array[Int]): Array[Int] = {
  // known maximum
  val max = 9
  val ans = new Array[Int](arr.length)

  // create an array of size max+1
  val buffer = Array.fill(max + 1)(0)

  // update the index of the array with the frequency
  for (elem <- arr) buffer(elem) += 1

  // modify the array by adding consecutive numbers
  for (i <- 1 to max) buffer(i) += buffer(i - 1)

  // position the element of the old array in its new position
  for (elem <- arr) {
    val newIndex = buffer(elem) - 1
    ans(newIndex) = elem
    // update the buffer with the new count after decrementing
    buffer(elem) = newIndex
  }
  ans
}

// test
val arr = Array(2, 3, 4, 2, 3, 6, 8, 4, 5)
sort(arr)
