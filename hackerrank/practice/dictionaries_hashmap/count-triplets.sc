// See https://www.hackerrank.com/challenges/count-triplets-1/problem
def countTriplets(arr: Array[Long], r: Long): Long = {
  // O(nlogn)

  // number of partitions (triplet)
  val num = 3

  // set of numbers divisible by 'r'
  val arrSet = arr.toSet.filter(n => n == 1 || n % r == 0).toList.sorted

  // frequency of the numbers in the array
  val arrCount = arr.groupBy(o => o).map(o => o._1 -> o._2.length)

  println(arrSet, arrCount)

  // take the triples from the arrSet
  val loops = arr.size - num + 1
  println(loops)
  (for {
    i <- 0 until loops
    triplet = arrSet.slice(i, i + num)
  } yield triplet.map(o => arrCount(o)).max).sum
}

// test
val array = "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1".split(" ").map(_.trim.toLong)
val r = 1
countTriplets(array, r)