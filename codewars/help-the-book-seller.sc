// See https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/scala

def stockSummary(lstOfArt: Array[String], lstOfCat: Array[String]): String = {
  if (lstOfArt.isEmpty || lstOfCat.isEmpty) return ""

  val tableOfArt = lstOfArt.map(_.split(" ")) // split each element in the array
    .map(list => list(0)(0).toString -> list(1).toInt) //create a tuple of the label and quantity
    .groupMapReduce(lst => lst._1)(_._2)(_ + _) // create a map of the label and its quantity sum
    .withDefaultValue(0)

  val summary = lstOfCat.map(cat => s"($cat : ${tableOfArt(cat)})")
  summary.mkString(" - ")
}

// test
val lstOfArt = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
val lstOfCat = Array("A", "B", "C", "D")
stockSummary(lstOfArt, lstOfCat)