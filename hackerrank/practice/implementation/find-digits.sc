// See https://www.hackerrank.com/challenges/find-digits/problem

def findDigits(n: Int): Int = {
  // get the list of digits in the number
  def allDigits(n: Int): Array[Int] = {
    @scala.annotation.tailrec
    def loop(r: Int, digits: List[Int]): Array[Int] = {
      if (r == 0) digits.toArray
      else loop(r / 10, r % 10 :: digits)
    }

    loop(n, List())
  }

  val digits = allDigits(n)

  @scala.annotation.tailrec
  def divisible(i: Int, count: Int): Int = {
    if (i == digits.length) return count

    val v = digits(i)
    if (v == 0 || n % v != 0) divisible(i + 1, count)
    else divisible(i + 1, count + 1)
  }

  divisible(0, 0)
}

// test
findDigits(1012)