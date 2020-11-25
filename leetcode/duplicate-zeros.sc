// See https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/

def duplicateZeros(arr: Array[Int]): Unit = {
  def shift(start: Int, end: Int): Unit = {
    for (i <- end until start by -1)
      arr(i) = arr(i - 1)
  }

  @scala.annotation.tailrec
  def loop(i: Int): Int = {
    if (i == arr.length) i
    else if (arr(i) == 0 && i + 1 < arr.length) {
      shift(i + 1, arr.length - 1)
      arr(i + 1) = 0
      loop(i + 2)
    }
    else loop(i + 1)
  }

  loop(0)

  println(arr.mkString(", "))
}

// test
//val array = Array(1, 0, 2, 3, 0, 4, 5, 0)
val array = Array(0, 0, 0, 0, 0, 0, 0)
duplicateZeros(array)
// 0, 0, 0, 0, 0, 0, 0
// 1, 0, 2, 3, 0, 4, 5, 0
