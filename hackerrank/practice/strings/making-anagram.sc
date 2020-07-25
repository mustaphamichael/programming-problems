def makeAnagram(a: String, b: String): Int = {
  // we need to know the number of chars to be deleted from
  // both strings to make an anagram

  // create an array of ascii character length
  val charCount = new Array[Int](26)

  // increment the number of times
  // a char exists in the 'first' word
  for (char <- a) charCount(char - 'a') += 1

  // decrement the 'second' word char count
  for (char <- b) charCount(char - 'a') -= 1

  // add the resultant values after successful deletion
  charCount.map(x => math.abs(x)).sum
}

// test
val a = "cde"
val b = "dcf"
println(makeAnagram(a, b))