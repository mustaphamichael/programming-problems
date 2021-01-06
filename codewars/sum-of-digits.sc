// See https://www.codewars.com/kata/541c8630095125aba6000c00/train/scala

def digitalRoot(n: Int): Int = {
  @scala.annotation.tailrec
  def loop(num: String): String = {
    if (num.length == 1) num
    else loop(num.split("").map(_.trim.toInt).sum.toString)
  }

  loop(n.toString).toInt
}

// test
val n = 9999
digitalRoot(n)