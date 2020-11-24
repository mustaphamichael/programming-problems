// See https://www.hackerrank.com/challenges/extra-long-factorials/problem

def extraLongFactorials(n: Int): Unit = {
  // Print the factorial of a number. Advisable to use BigIntegers

  @scala.annotation.tailrec
  def loop(index: Int, factorial: BigInt): BigInt = {
    if (index == 1) factorial
    else loop(index - 1, index * factorial)
  }

  println(loop(n, 1))
}

// test
extraLongFactorials(25)