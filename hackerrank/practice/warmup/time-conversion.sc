def timeConversion(s: String): String = {
  /*
   * Write your code here.
   */
  // find out if string contains A< or PM
  // if AM, return exact time
  // if PM, add 12 hours to the time
  def splitTime(format: String): (String, String, String) = {
    val time = s.split(format).mkString("").split(":")
    (time(0), time(1), time(2))
  }

  if (s.contains("AM")) {
    // AM
    val (h, m, s) = splitTime("AM")
    s"${if (h == "12") "00" else h}:$m:$s"
  } else {
    //PM
    val (h, m, s) = splitTime("PM")
    s"${if (h == "12") "12" else (h.toInt + 12) % 24}:$m:$s"
  }
}

// test
val time = "12:59:59PM"
timeConversion(time)