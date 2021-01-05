// See https://www.codewars.com/kata/57ea5b0b75ae11d1e800006c/train/scala

def sortByLength(arr: Array[String]): Array[String] =
  arr.sortBy(_.length)

// test
val arr = Array("Telescopes", "Glasses", "Eyes", "Monocles")
sortByLength(arr)