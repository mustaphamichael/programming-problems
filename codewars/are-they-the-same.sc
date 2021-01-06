// See https://www.codewars.com/kata/550498447451fbbd7600041c/train/scala

def comp(seq1: Seq[Int], seq2: Seq[Int]): Boolean = {
  if (seq1 == null || seq2 == null) return false

  // group the sequence by the function 'f'
  def compute(seq: Seq[Int])(f: Int => Int): Map[Int, Seq[Int]] =
    seq.map(f).groupBy(identity)

  val seq1Squared = compute(seq1)(c => c * c)
  val seq2Squared = compute(seq2)(identity)

  seq1Squared == seq2Squared
}

// test
val s1 = Vector(31, 32)
val s2 = Vector(961, 1024)
comp(s1, s2)