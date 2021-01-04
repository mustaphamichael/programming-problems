// See https://www.codewars.com/kata/51b6249c4612257ac0000005/train/scala

def decode(roman: String): Int = {
  val romanValues: Map[Char, Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
  val arr = new Array[Int](roman.length)
  // populate the first symbol
  arr(0) = romanValues(roman(0))

  for (id <- 1 until roman.length) {
    val char = roman(id)
    val value = romanValues(char)
    val prevId = id - 1
    if (value > arr(prevId)) {
      arr(id) = value - arr(prevId)
      arr(prevId) = 0
    } else arr(id) = value
  }

  arr.sum
}

// test
val roman = "MCMXC" // 1990
decode(roman)