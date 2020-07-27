// Complete the migratoryBirds function below.
def migratoryBirds(arr: Array[Int]): Int = {
  // ids are only from 1 -5
  val ids = List(1, 2, 3, 4, 5)
  // group the id by their number of occurrence
  val occurrence = arr.groupBy(i => i)
    .map { case (elem, count) => elem -> count.length }

  // find the least id with the highest occurrence
  @annotation.tailrec
  def loop(ids: List[Int], leastId: Int, max: Int): Int = ids match {
    case Nil => leastId
    case x :: xs if max >= occurrence.getOrElse(x, 0) => loop(xs, leastId, max)
    case x :: xs => loop(xs, x, occurrence.getOrElse(x, 0))
  }

  loop(ids, -1, 0)
}

// test
val arr = Array(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)
migratoryBirds(arr)
