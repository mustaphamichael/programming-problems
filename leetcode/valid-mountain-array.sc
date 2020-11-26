// See https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

def validMountainArray(arr: Array[Int]): Boolean = {
  val len = arr.length
  if (len < 3) return false

  @scala.annotation.tailrec
  def up(i: Int, count: Int): Int = {
    if (i == len - 1) count
    else if (arr(i) < arr(i + 1)) up(i + 1, count + 1)
    else up(i + 1, count)
  }

  @scala.annotation.tailrec
  def down(i: Int, count: Int): Int = {
    if (i == len - 1) count
    else if (arr(i) > arr(i + 1)) down(i + 1, count + 1)
    else down(i + 1, count)
  }

  val upwards = up(0, 0)
  if (upwards == 0 || upwards == len - 1) return false
  upwards + down(upwards, 0) == len - 1
}

// test
//val arr = Array(2,0,2)
//val arr = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
//val arr = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).reverse
val arr = Array(0, 2, 3, 5, 2, 1, 0)
validMountainArray(arr)