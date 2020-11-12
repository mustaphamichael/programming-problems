def mergeSort(array: Array[Int]): Array[Int] = {
  // divide the array into 2 recursively until there is nothing to divide
  // compare the two elements and swap if necessary
  // merge the divided sub-arrays

  def split(list: List[Int]): (List[Int], List[Int]) = {
    val mid = list.length / 2
    list.splitAt(mid)
  }

  def merge(left: List[Int], right: List[Int]): List[Int] =
    (left, right) match {
      case (left, Nil) => left
      case (Nil, right) => right
      case (x :: xs, y :: ys) =>
        if (x < y) x :: merge(xs, right)
        else y :: merge(left, ys)
    }

  def sort(list: List[Int]): List[Int] = {
    // base case: If list is empty or contains only one value
    if (list.length <= 1) return list

    // split the list into halves
    val (left, right) = split(list)

    // recursively sort the halves
    // and merge the two sorted halves
    merge(sort(left), sort(right))
  }

  sort(array.toList).toArray
}

// test
val arr = "2 1 3 1 2".split(" ").map(_.trim.toInt)
mergeSort(arr)