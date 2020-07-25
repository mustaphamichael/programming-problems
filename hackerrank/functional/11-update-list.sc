def f(arr: List[Int]): List[Int] =
  for (i <- arr) yield math.abs(i)

// test
val list = List(2, -4, 3, -1, 23, -4, -54)
f(list)