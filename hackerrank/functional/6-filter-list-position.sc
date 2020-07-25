def f(arr: List[Int]): List[Int] = {
  def select(as: List[Int], index: Int): List[Int] = (as, index) match {
    case (Nil, _) => Nil
    case (x :: xs, i) if i % 2 != 0 => x :: select(xs, i + 1)
    case (x :: xs, i) => select(xs, i + 1)
  }

  select(arr, 0)
}


// Using zipWithIndex
def f2(arr: List[Int]): List[Int] =
  arr.zipWithIndex.filter { case (_, i) => i % 2 != 0 }.map(_._1)


// test
val list = List(8, 15, 22, 1, 10, 6, 2, 18, 18, 1)
f(list).foreach(println)
f2(list).foreach(println)