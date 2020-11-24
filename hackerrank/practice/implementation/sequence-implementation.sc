// See https://www.hackerrank.com/challenges/permutation-equation/problem

def permutationEquation(p: Array[Int]): Array[Int] = {
  // Array.indexOf() runs in O(N) time
  (for (i <- p.indices) yield p.indexOf(p.indexOf(i + 1) + 1) + 1).toArray
}

// test
val p = "5 2 1 3 4".split(" ").map(_.trim.toInt)
permutationEquation(p)