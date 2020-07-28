def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] = {
  // get distinct scores
  val distinctPositions = scores.distinct

  @annotation.tailrec
  def alicePosition(score: Int, index: Int, position: Int): Int = {
    if (index < 0) position + 1
    else {
      // the current position on the score table
      val current = distinctPositions(index)

      // don't include this; as it adds extra runtime for large test cases
      // if (score == current) position

      if (score < current) position + 1
      else alicePosition(score, index - 1, position - 1)
    }
  }

  // get Alice's position presuming she is joint last on the table
  val length = distinctPositions.length
  for (i <- alice)
    yield alicePosition(i, length - 1, length)

}

// test
val scores = Array(100, 100, 50, 40, 40, 20, 10)
val alice = Array(5, 25, 50, 120)

//val scores = Array(100, 90, 90, 80, 75, 60)
//val alice = Array(50, 65, 77, 90, 102)
climbingLeaderboard(scores, alice)

