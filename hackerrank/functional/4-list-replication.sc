def f(num: Int, arr: List[Int]): List[Int] = {
  @annotation.tailrec
  def repeat(number: Int, count: Int, acc: List[Int]): List[Int] = {
    if (count <= 0) acc
    else repeat(number, count - 1, number :: acc)
  }

  arr match {
    case Nil => Nil
    case x :: xs => repeat(x, num, List()) ++ f(num, xs)
  }
}

val n = 3
val list = List(1, 2, 3, 4)

f(n, list)