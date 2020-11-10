// See https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem

def activityNotifications(expenditure: Array[Int], d: Int): Int = {
  // maximum range according to constraint
  val max = 200

  // count the frequency of occurrence of each element
  val counts = new Array[Int](max + 1)
  for (elem <- 0 until d) counts(expenditure(elem)) += 1

  def median(data: Array[Int]): Double = {
    // Use count sort to find the median
    if (d % 2 == 0) {
      @scala.annotation.tailrec
      def loop(index: Int, sum: Int, m1: Int, m2: Int): Double = {
        val s = data(index) + sum
        if (m1 != 0 && m2 != 0) (m1 + m2) / 2.0
        else if (m1 == 0 && s >= d / 2) loop(0, 0, index, m2) // restart the loop
        else if (m2 == 0 && s >= d / 2 + 1) loop(index + 1, s, m1, index)
        else loop(index + 1, s, m1, m2)
      }

      loop(0, 0, 0, 0)
    } else {
      @scala.annotation.tailrec
      def loop(index: Int, sum: Int, m: Double): Double = {
        val s = data(index) + sum
        if (m != 0) m
        else if (m == 0 && s > d / 2) loop(index + 1, s, index)
        else loop(index + 1, s, m)
      }

      loop(0, 0, 0)
    }
  }

  var notifications = 0
  for (i <- d until expenditure.length) {
    if (expenditure(i) >= 2 * median(counts)) notifications += 1
    counts(expenditure(i - d)) -= 1
    counts(expenditure(i)) += 1
  }
  notifications

  // Using tail recursion and immutable data structures

  //    def loop(data: Array[Int], i: Int, notifications: Int): Int = {
  //      val first = expenditure(i)
  //      val second = expenditure(i - d)
  //      val updated = data.updated(first, data(first) + 1).updated(second, data(second) - 1)
  //      println(median(data, d))
  //      if (i == expenditure.length - 1) notifications
  //      else if (first >= 2 * median(data, d)) loop(updated, i + 1, notifications + 1)
  //      else loop(updated, i + 1, notifications)
  //    }
  //
  //    loop(counts, d, 0)
}

// test
val arr = "2 3 4 2 3 6 8 4 5".split(" ").map(_.trim.toInt)
val d = 5
activityNotifications(arr, d)