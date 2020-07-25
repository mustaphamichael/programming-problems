def f(arr: List[Int]): Int =
  (for (i <- arr if i % 2 != 0) yield i).sum

//def f(arr: List[Int]): Int =
//  arr.foldLeft(0)((c, t) => if (c % 2 != 0) c + t else t)

// test
val list = List (3, 2, 4, 6, 5, 7, 8, 0, 1)
f(list)