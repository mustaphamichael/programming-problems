// See https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/scala

def accum(s: String) = {
  (for {
    i <- s.indices
    charString = s(i).toString
  } yield charString.toUpperCase + charString.toLowerCase * i)
    .mkString("-")
}

// Shorter and succinct
def accum2(s: String) = {
  s.zipWithIndex.map {
    case (char, index) => (char.toString.toLowerCase * (index + 1)).capitalize
  }.mkString("-")
}

// test
val s = "ZpglnRxqenU"
accum(s) == accum2(s)