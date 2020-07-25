def sherlockAndAnagrams(s: String): Int = {
  // select all possible anagrams
  // sort the anagrams i.e fai && ifa = afi
  val possibleAnagrams = for {
    i <- 1 until s.length
    j <- 0 until s.length - i + 1
    sub = s.substring(j, j + i)
  } yield sub.sorted

  // group the anagrams based on number of occurrence
  // filter out the anagrams that appear more than once
  val mapped = possibleAnagrams groupBy (w => w) map (m => m._1 -> m._2.size) filter (i => i._2 >= 2)

  // sum the ranges of the counts
  mapped.map { case (s, i) => (1 until i).sum }.sum
}

// test
sherlockAndAnagrams("ifailuhkqq") // 3
sherlockAndAnagrams("kkkk") // 10