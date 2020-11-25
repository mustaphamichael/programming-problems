// See https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/

def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
  def shift(start: Int, end: Int): Unit = {
    for (i <- end until start by -1)
      nums1(i) = nums1(i - 1)
  }

  val len = nums1.length

  @scala.annotation.tailrec
  def loop(i1: Int, mc: Int, i2: Int, nc: Int): Int = {
    if (mc == 0 && nc == 0) 0
    else if (mc != 0 && nc != 0) {
      if (nums1(i1) <= nums2(i2)) loop(i1 + 1, mc - 1, i2, nc)
      else {
        shift(i1, len - 1)
        nums1(i1) = nums2(i2)
        loop(i1 + 1, mc, i2 + 1, nc - 1)
      }
    }
    else if (mc != 0 && nc == 0) loop(i1 + 1, 0, i2, nc)
    else {
      nums1(i1) = nums2(i2)
      loop(i1 + 1, mc, i2 + 1, nc - 1)
    }
  }

  loop(0, m, 0, n)
  println(nums1.toList)
}

// test
//val nums1 = Array(1, 2, 3, 0, 0, 0)
val nums1 = Array(1, 3, 4, 0, 0, 0)
//val nums2 = Array(2, 5, 6)
val nums2 = Array(1, 2, 3)
val m = 3
val n = 3
merge(nums1, m, nums2, n)