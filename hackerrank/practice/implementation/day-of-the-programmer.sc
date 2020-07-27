// Complete the dayOfProgrammer function below.
def dayOfProgrammer(year: Int): String = {
  // Useful Information
  // Day of programmer - 256th day
  // In a leap year = 12th September
  // In a non-leap year = 13th September
  // Julian calendar - 1700 - 1917 (leap years are divisible by 4)
  // Georgian calendar - 1919 - present (leap years are divisible by 400, by 4 & not by 100)
  // In 1918 - 27th September is the Day of the Programmer

  if (year == 1918) "26.09.1918"
  else if (year >= 1700 && year < 1917) {
    // Julian
    if (year % 4 == 0) s"12.09.$year" else s"13.09.$year"
  }
  else {
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) s"12.09.$year"
    else s"13.09.$year"
  }
}

// test
val year = 2000
dayOfProgrammer(year)