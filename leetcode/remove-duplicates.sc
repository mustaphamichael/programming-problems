// See https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/

def removeDuplicates(nums: Array[Int]): Int = {
  if (nums.isEmpty) return 0

  var unique = 0
  for (j <- 1 until nums.length) {
    if (nums(unique) != nums(j)) {
      unique += 1
      nums(unique) = nums(j)
    }
  }

  unique + 1
}

// test
//val nums = Array(1,1,2)
val nums = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
removeDuplicates(nums)