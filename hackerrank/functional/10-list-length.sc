def f(arr: List[Int]): Int = {
  @annotation.tailrec
  def loop(arr: List[Int], size: Int): Int = (arr, size) match {
    case (Nil, s) => s
    case (x :: xs, s) => loop(xs, s + 1)
  }

  loop(arr, 0)
}

// test
val list = List()
f(list)