import java.math.RoundingMode
import java.text.DecimalFormat

import scala.collection.mutable

// See https://www.codewars.com/kata/55a29405bc7d2efaff00007c/train/scala

def going(n: Int): Double = {
  var cache = mutable.HashMap[Int, BigDecimal]()

  @scala.annotation.tailrec
  def factorial(i: Int, fct: BigDecimal): BigDecimal = {
    if (i == n + 1) fct
    else {
      if (cache.contains(i - 1)) {
        cache += i -> i * cache(i - 1)
        factorial(i + 1, cache(i))
      }
      else {
        cache += i -> i * fct
        factorial(i + 1, cache(i))
      }
    }
  }

  def format(bd: BigDecimal): Double = {
    val df = new DecimalFormat("#.######")
    df.setRoundingMode(RoundingMode.FLOOR)
    df.format(bd).toDouble
  }

  val f = factorial(1, 1)
  val res = cache.values.sum / f
  format(res)
}

// A better solution.
// I love this. FP @ its best!!
def going2(n: Int): Double = {
  val factorials = (2 to n).scanLeft(BigDecimal(1))(_ * _)
  (factorials.sum / factorials(n - 1).setScale(6, BigDecimal.RoundingMode.FLOOR)).toDouble
}

// test
going2(5)