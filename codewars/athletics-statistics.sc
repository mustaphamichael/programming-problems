// See https://www.codewars.com/kata/55b3425df71c1201a800009c/train/scala

def stat(strg: String): String = {
  val timeSplit = strg.split(", ").map(_.split("\\|").map(_.trim.toInt))

  def toSeconds(time: Array[Int]) = (time(0) * 60 + time(1)) * 60 + time(2)

  def format(seconds: Int): String = {
    val hh = seconds / 3600
    val mm = (seconds % 3600) / 60
    val ss = seconds % 60

    "%02d|%02d|%02d".format(hh, mm, ss)
  }

  val timeInSeconds = timeSplit.map(toSeconds)
  val range = format(timeInSeconds.max - timeInSeconds.min)
  val average = format(timeInSeconds.sum / timeInSeconds.length)

  def findMedian(time: Array[Int]): Int = {
    val len = time.length
    val sorted = time.sorted
    if (len % 2 != 0) sorted(len / 2)
    else (sorted(len / 2 - 1) + sorted(len / 2)) / 2
  }

  val median = format(findMedian(timeInSeconds))

  s"Range: $range Average: $average Median: $median"
}

// test
val strg = "01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"
stat(strg)