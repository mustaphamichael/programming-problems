// Complete the designerPdfViewer function below.
def designerPdfViewer(h: Array[Int], word: String): Int = {
  val alphabet = "abcdefghijklmnopqrstuvwxyz"

  @annotation.tailrec
  def maxHeight(index: Int, max: Int): Int = {
    if (index == word.length) max
    else {
      // the index of the character in the alphabet; 0 -25
      val charIndex = alphabet.indexOf(word(index))
      val height = h(charIndex)
      if (max > height) maxHeight(index + 1, max)
      else maxHeight(index + 1, height)
    }
  }

  // compute area = word length * maximum height
  word.length * maxHeight(0, 0)
}

// test
val h = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7"
  .split(" ").map(_.trim.toInt)
val word = "zaba"
designerPdfViewer(h, word)