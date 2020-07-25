def minimumSwaps(arr: Array[Int]): Int = {
  @annotation.tailrec
  def loop(as: Array[Int], index: Int, count: Int): Int = {
    if (index == arr.length) count
    else if (as(index) == index + 1) loop(as, index + 1, count)
    else {
      // swap values at indices
      val temp = as(index)
      val other = as(temp - 1)
      as(temp - 1) = temp
      as(index) = other
      loop(as, index, count + 1)
    }
  }

  loop(arr, 0, 0)
}

println(minimumSwaps(Array(2, 3, 4, 1, 5)))