// Aim: Write my own filter function

def f(delim: Int, arr: List[Int]): List[Int] = arr match {
  case Nil => Nil
  case x :: xs if x < delim => x :: f(delim, xs)
  case _ :: xs => f(delim, xs)
}

// test
val d = 3
val list = List(9, 8, 2, 7, 5, 1, 3, 0)
f(d, list)