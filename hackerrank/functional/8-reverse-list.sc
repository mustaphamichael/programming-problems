// reverse list w/out using in-built function

def f(arr: List[Int]): List[Int] = arr match {
  case Nil => Nil
  case x :: xs => f(xs) ++ List(x)
}

// test
val list = List(1, 2, 3, 4)
f(list)