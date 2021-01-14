// See https://www.codewars.com/kata/5536a85b6ed4ee5a78000035/train/scala

def tour(arrFriends: List[String], ftwns: List[(String, String)], h: Map[String, Double]): Int = {
  def getTown(index: Int) = ftwns.toMap.getOrElse(arrFriends(index), "t")

  def getDistance(town: String) = h.getOrElse(town, 0.0)

  // Using Pythagorean theorem
  def distanceBtwPoints(hyp: Double, opp: Double) =
    math.sqrt(math.abs(math.pow(hyp, 2) - math.pow(opp, 2)))

  @scala.annotation.tailrec
  def loop(index: Int, totalDistance: Double): Double = {
    val currentTown = getTown(index)
    val currentDistance = getDistance(currentTown)
    if (index == arrFriends.length - 1) totalDistance + currentDistance
    else {
      val adjDistance = distanceBtwPoints(currentDistance, getDistance(getTown(index + 1)))
      loop(index + 1, totalDistance + adjDistance)
    }
  }

  loop(0, getDistance(getTown(0))).toInt
}

// test
val friends1 = List("A1", "A2", "A3", "A4", "A5")
val fTowns1 = List(("A1", "X1"), ("A2", "X2"), ("A3", "X3"), ("A4", "X4"))
val distTable1 = Map("X1" -> 100.0, "X2" -> 200.0, "X3" -> 250.0, "X4" -> 300.0)

tour(friends1, fTowns1, distTable1)