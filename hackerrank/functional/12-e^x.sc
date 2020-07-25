def factorial(n: Int): Int =
  if (n == 2) 2
  else factorial(n - 1) * n

// e^x series = 1 + x + x^2/2! + x^3/3! + ...
def exp(x: Double): Double = {
  def loop(x: Double, count: Int): Double = {
    if (count == 1) x + 1
    else (math.pow(x, count) / factorial(count)) + loop(x, count - 1)
  }

  // first 10 terms (0 - 9)
  // with a precision of 4 decimal places
  math.round(loop(x, 9) * 10000) / 10000.0
}

// test
factorial(3)
exp(20.0000) // 2423600.1887