import scala.collection.mutable
// See https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/

def checkIfExist(arr: Array[Int]): Boolean = {
  val elements = new mutable.HashSet[Int]()

  for (elem <- arr) {
    val hasHalf = elem % 2 == 0
    if (elements.contains(elem * 2) ||
      (hasHalf && elements.contains(elem / 2))) return true
    elements += elem
  }
  false
}

// test
val arr = Array(0, 0)
//val arr = Array(7, 1, 14, 11)
//val arr = Array(3, 0, 1, 7, 11)
checkIfExist(arr)