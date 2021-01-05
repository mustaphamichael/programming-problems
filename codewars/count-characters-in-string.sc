// See https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/scala

def count(string: String): Map[Char,Int] = {
  string.toSeq.groupBy(identity)
    .map { case (char, str) => char -> str.length }
}

// test
val str = "aba"
count(str) // HashMap('a' -> 2, 'b' -> 1)