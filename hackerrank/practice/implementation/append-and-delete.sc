// See https://www.hackerrank.com/challenges/append-and-delete/problem

def appendAndDelete(s: String, t: String, k: Int): String = {
  // find the character difference between the two strings
  // return 'No' if the difference is greater than 'k'

  val sCount = new Array[Int](26) //26 letters
  val tCount = new Array[Int](26) //26 letters
  for (c <- s) sCount(c - 'a') += 1
  for (c <- t) tCount(c - 'a') += 1

  val diff = for (i <- sCount.indices) yield math.abs(sCount(i) - tCount(i))
  val diffSum = diff.sum
  if (diffSum % 2 != 0 || diffSum > k) "No" else "Yes"
}

// test
val s = "qwerasdf"
val t = "qwerbsdf"
val k = 10
appendAndDelete(s, t, k)

// abcd abcdert 10

// qwerasdf qwerbsdf 6