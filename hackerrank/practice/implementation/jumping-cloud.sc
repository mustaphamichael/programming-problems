// See https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

def jumpingOnClouds(c: Array[Int], k: Int): Int = {
  val n = c.length

  @scala.annotation.tailrec
  def loop(i: Int, energy: Int): Int = {
    println(i, energy)
    if (i == 0) energy
    else {
      val index = (i + k) % n
      loop(index, energy - c(index) * 2 - 1)
    }
  }

  val initIndex = k % n
  val initEnergy = 100 - c(initIndex) * 2 - 1
  loop(initIndex, initEnergy)
}

// test
val c = "0 0 1 0 0 1 1 0".split(" ").map(_.trim.toInt)
val k = 2
jumpingOnClouds(c, k)