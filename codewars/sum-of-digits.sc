// See https://www.codewars.com/kata/541c8630095125aba6000c00/train/scala

@scala.annotation.tailrec
def digitalRoot(n: Int): Int = {
  if (n < 10) n
  else digitalRoot(n.toString.map(_.asDigit).sum)
}

// test
val n = 87
digitalRoot(n)