// Complete the viralAdvertising function below.
def viralAdvertising(n: Int): Int = {

  @scala.annotation.tailrec
  def loop(day: Int, shared: Int, liked: Int, cumulative: Int): Int = {
    if (day == n) cumulative
    else {
      val mLike = shared / 2
      val mCumm = mLike + cumulative
      loop(day + 1, mLike * 3, mLike, mCumm)
    }
  }

  loop(0, 5, 0, 0)
}

// test
val n = 4
viralAdvertising(n)