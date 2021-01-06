// See https://www.codewars.com/kata/550498447451fbbd7600041c/train/scala

def comp(seq1: Seq[Int], seq2: Seq[Int]): Boolean = {
  if (seq1 == null || seq2 == null) return false
  val hash1: Set[Double] = seq1.map(_.toDouble).toSet

  seq2.forall(d => hash1.contains(math.sqrt(d)))
}

// test
val s1 = Vector(31, 32)
val s2 = Vector(961, 1025)
comp(s1, s2)