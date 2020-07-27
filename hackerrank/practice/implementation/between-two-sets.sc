/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

def getTotalX(a: Array[Int], b: Array[Int]): Int = {
  // Write your code here

  @annotation.tailrec
  def gcd(a: Int, b: Int): Int =
    if (a == 0) b else gcd(b % a, a)

  // find the LCM of a
  // LCM(a, b) = (a * b) / gcd(a, b)
  def lcm(a: Int, b: Int): Int =
    (a * b) / gcd(a, b)

  val lcmA = a.foldLeft(1)((acc, e) => lcm(acc, e))

  // find the gcd of b
  val gcdB = b.foldLeft(0)((acc, e) => gcd(acc, e))

  // multiples of lcmA to the gcdB
  val count = for {
    mult <- lcmA to gcdB by lcmA
    if gcdB % mult == 0
  } yield true
  count.length
}

// test
val a = Array(2, 4)
val b = Array(16, 32, 96)
getTotalX(a, b)

// Do you know?
// LCM(a, b) * HCF(a, b) = a * b