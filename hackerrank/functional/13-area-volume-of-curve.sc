// This function will be used while invoking "Summation" to compute
// The area under the curve.
def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  // Fill Up this function body
  // To compute the value of the function
  // For the given coefficients, powers and value of x
  (coefficients, powers) match {
    case (Nil, Nil) => 0.0
    case (a :: as, b :: bs) => a * math.pow(x, b) + f(as, bs, x)
  }
}

// This function will be used while invoking "Summation" to compute
// The Volume of revolution of the curve around the X-Axis
// The 'Area' referred to here is the area of the circle obtained
// By rotating the point on the curve (x,f(x)) around the X-Axis
def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  // Fill Up this function body
  // To compute the area of the circle on revolving the point
  // (x,f(x)) around the X-Axis
  // For the given coefficients, powers and value of x

  // area_of _circle = pi * r^2
  math.Pi * math.pow(f(coefficients, powers, x), 2)
}

// This is the part where the series is summed up
// This function is invoked once with func = f to compute the area under the curve
// Then it is invoked again with func = area to compute the volume
// of revolution of the curve
def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
  // Fill up this function

  // using sub-intervals of length = 0.001
  val step = 0.001
  val intervals = BigDecimal(lowerLimit) to upperLimit by step
  intervals.foldLeft(0.0)((acc, x) => acc + func(coefficients, powers, x.toDouble) * step)
}

// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.

def readLine() = scala.io.StdIn.readLine

/** Points Taken
 *
 * 1. Try to use the reduce or fold function for accumulative task instead of recursion
 * 2. Range step does not work on Double. You have to use the BigDecimal type for it
 */