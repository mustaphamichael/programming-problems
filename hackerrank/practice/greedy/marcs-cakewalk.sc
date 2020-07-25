// Complete the marcsCakewalk function below.
def marcsCakewalk(calorie: Array[Int]): Long = {
  // Brute force O(n log n)
  //  val sorted = calorie.sorted(Ordering.Int.reverse)
  val sorted = calorie.sorted(Ordering.Int.reverse)
  val walk = for {
    i <- sorted.indices
    //    minWalk = math.pow(2, i) * sorted(sorted.length - 1 - i)
    minWalk = math.pow(2, i) * sorted(i)
  } yield minWalk
  walk.sum.toLong
}

// test
val calorie = Array(1, 3, 2)
marcsCakewalk(calorie)

val sorted = calorie.sorted
for (i <- sorted.length - 1 to 0 by -1) yield i
for (i <- sorted.indices) yield i