def twoStrings(s1: String, s2: String): String = {
  val set1 = s1.toSet
  val set2 = s2.toSet

  val exists = (for (c <- set1 if set2.contains(c) )yield true).nonEmpty
  if (exists) "YES" else "NO"
}

// test
println(twoStrings("hi", "world"))