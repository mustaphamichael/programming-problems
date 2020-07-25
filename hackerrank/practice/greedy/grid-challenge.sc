def gridChallenge(grid: Array[String]): String = {
  // Brute force

  val sortedRow = grid.map(_.toSeq.sorted)
//  val columns = for {
//    i <- 0 until sortedRow.length - 1
//    zip = sortedRow(i) zip sortedRow(i + 1)
//  } yield zip

  println(sortedRow.mkString(", "))
//  println(columns)

  "YES"
}

// test
val grid = Array("ebacd", "fghij", "olmkn", "trpqs", "xywuv")
gridChallenge(grid)