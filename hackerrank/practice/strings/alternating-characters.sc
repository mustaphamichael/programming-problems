// Complete the alternatingCharacters function below.
def alternatingCharacters(s: String): Int = {
  @annotation.tailrec
  def loop(index: Int, count: Int): Int = {
    if (index == s.length - 1) count
    else if (s(index) == s(index + 1)) loop(index + 1, count + 1)
    else loop(index + 1, count)
  }

  loop(0, 0)
}

// test
val string = "AAABBB"
alternatingCharacters(string) // 4
