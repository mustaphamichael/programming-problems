// Complete the minimumBribes function below.
def minimumBribes(q: Array[Int]): Any = {
  val queueIndex = q.indices zip q
  // check if there exist a queue movement of more than 2
  if (queueIndex.exists { case (i, p) => p - i > 3 }) "Too chaotic"
  else {
    for {
      (i, p) <- queueIndex
      r <- math.max(p - 2, 0) until i
      if q(r) > p
    } yield 1
  }.sum
}


// test
val arr1 = Array(2, 1, 5, 3, 4)
val arr2 = Array(2, 5, 1, 3, 4)

minimumBribes(arr1) // 3
minimumBribes(arr2) // Too chaotic