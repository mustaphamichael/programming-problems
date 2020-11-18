// Check permutation of two strings
// Assumptions:
// - Case sensitive
// - Whitespace is significant

// Method 1: sort the strings and compare them O(SlogS) + O(TlogT)
def permutation(s: String, t: String): Boolean = {
  // if the length of the strings differ, return false
  if (s.length != t.length) return false

  def sort(string: String): String =
    string.toSeq.sorted.toString

  sort(s).equals(sort(t))
}

// Method 2: count the number of characters in one string and
// compare with the other O(S + T)
def permutation2(s: String, t: String): Boolean = {
  if (s.length != t.length) return false

  val letters = new Array[Int](128) // Assuming ASCII string
  for (char <- s) letters(char) += 1

  for (char <- t) {
    letters(char) -= 1
    if (letters(char) < 0) return false
  }
  println(letters.mkString(", "))
  true
}

// test
val s = "   Michael  "
val t = "Michael"
permutation2(s, s) // true
permutation2(s, t) // false