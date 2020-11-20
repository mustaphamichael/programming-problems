// perform basic string compression using the counts of repeated characters

// O(P + K); P = string length; K= No of character sequence
def compressString(string: String): String = {
  // avoid concatenating the strings as it takes a longer time
  var count = 0
  val compressedString = new StringBuilder

  for (i <- string.indices) {
    count += 1
    if (i + 1 >= string.length || string(i) != string(i + 1)) {
      compressedString.append(string(i).toString + count)
      count = 0
    }
  }
  if (compressedString.length < string.length) compressedString.toString
  else string
}

// test
val s = "aabcccccaaa"
compressString(s)