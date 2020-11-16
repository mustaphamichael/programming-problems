// See https://www.hackerrank.com/challenges/ctci-ransom-note/problem
def checkMagazine(magazine: Array[String], note: Array[String]) {

  // group the words by their counts
  def count(words: Array[String]): Map[String, Int] =
    words.groupBy(w => w).map(w => w._1 -> w._2.length)

  val magazineCount = count(magazine) withDefaultValue 0 // set default count to zero(0)
  val noteCount = count(note)

  val result = if (noteCount.forall(w => magazineCount(w._1) >= w._2)) "Yes" else "No"
  println(result)
}

// test
val magazine = "ive got a lovely bunch of coconuts".split(" ")
val note = "ive got some coconuts".split(" ")
checkMagazine(magazine, note)