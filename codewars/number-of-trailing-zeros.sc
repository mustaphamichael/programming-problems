// See https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/scala

// The formula for finding the number of trailing zeros cane be found in
// https://mathworld.wolfram.com/Factorial.html (3) and (4)

def zeros(n: Int): Int = {
  val kMax = math.floor(math.log(n) / math.log(5))

  @scala.annotation.tailrec
  def loop(k: Int, acc: Double): Int = {
    if (k > kMax) acc.toInt
    else loop(k + 1, acc + math.floor(n / math.pow(5, k)))
  }

  loop(1, 0)
}


// Better Solution (Yea! I am surprised too)
def zeros2(n: Int): Int =
  n / 5 match {
    case 0 => 0
    case x => x + zeros2(x)
  }

// test
zeros(1000)