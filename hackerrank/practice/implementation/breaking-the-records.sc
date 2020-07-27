// Complete the breakingRecords function below.
def breakingRecords(scores: Array[Int]): Array[Int] = {

  @annotation.tailrec
  def loop(index: Int, min: Int, max: Int, minCount: Int, maxCount: Int): Array[Int] = {
    if (index == scores.length) Array(maxCount, minCount)
    else {
      val score = scores(index)
      if (score > max) loop(index + 1, min, score, minCount, maxCount + 1)
      else if (score < min) loop(index + 1, score, max, minCount + 1, maxCount)
      else loop(index + 1, min, max, minCount, maxCount)
    }
  }

  loop(1, scores(0), scores(0), 0, 0)
}

// test
//val scores = Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42) // (4, 0)
val scores = Array(10, 5, 20, 20, 4, 5, 2, 25, 1) // (2, 4)
breakingRecords(scores)