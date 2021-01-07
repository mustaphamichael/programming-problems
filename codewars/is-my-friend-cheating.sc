// See https://www.codewars.com/kata/5547cc7dcad755e480000004/train/scala

def removNb(n: Long): List[(Long, Long)] = {
  val sumOfSeq = (1L to n).sum //OR  n * (n+1) / 2
  (for {
    a <- 1L to n
    b = (sumOfSeq - a) / (a + 1)
    if a * b == sumOfSeq - (a + b) && b < n
  } yield (a, b)).toList
}

// test
val n = 1000003L
removNb(n)