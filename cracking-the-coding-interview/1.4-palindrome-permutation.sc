// Check if a given string is a permutation of a palindrome
// Assumptions:
// - only letters of the alphabet (a - z) are considered
// - not case sensitive

// Method 1 - using an array
def isPermutationOfPalindrome(phrase: String): Boolean = {
  // a palindrome is a string that is the same forward and backwards
  // it will have at most only one character that is odd

  def getCharNumber(char: Char): Int = {
    if ('a' <= char && char <= 'z') char - 'a'
    else -1
  }

  val counts = new Array[Int](26)
  for (char <- phrase) {
    val charInt = getCharNumber(char)
    if (charInt != -1) counts(charInt) += 1
  }

  val odds = counts.count(_ % 2 != 0)
  odds <= 1
}

// Method 2 - using a hashtable
def isPermutationOfPalindrome2(phrase: String): Boolean = {
  val letters = "abcdefghijklmnopqrstuvwxyz".toSet

  val odds = phrase.filter(letters.contains)
    .groupBy(c => c)
    .map(_._2.length)
    .count(_ % 2 != 0)
  odds <= 1
}

// test
val p1 = "tact coap apa"
isPermutationOfPalindrome(p1)
isPermutationOfPalindrome2(p1)