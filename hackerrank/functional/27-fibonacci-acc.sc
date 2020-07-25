// fibonacci series using accumulator

def fibonacci(x: Int): Int = {
  @annotation.tailrec
  def loop(x: Int, first: Int, second: Int): Int = {
    if (x == 2) second
    else loop(x - 1, second, first + second)
  }

  loop(x, 0, 1)
}

fibonacci(5)