// See https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

def removeElement(nums: Array[Int], `val`: Int): Int = {
  val len = nums.length

  def shift(start: Int, end: Int): Unit = {
    for (i <- start until end) nums(i - 1) = nums(i)
  }

  @scala.annotation.tailrec
  def loop(i: Int, removed: Int): Int = {
    if (i + removed == len) removed
    else if (nums(i) == `val`) {
      if (i == len) {
        nums(i) = 0
        loop(i + 1, removed)
      }
      else {
        shift(i + 1, len)
        loop(0, removed + 1) // start over
      }
    }
    else loop(i + 1, removed)
  }

  len - loop(0, 0)
}

// test
val nums = Array(0,1,2,2,3,0,4,2)
removeElement(nums, 2)
println(nums.toList)