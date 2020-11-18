import scala.collection.mutable

// Find uniqueness w/o using an extra data structure
def isUnique(string: String): Boolean = {
  // assuming that the string is an ASCII string
  val charSet: Array[Boolean] = new Array[Boolean](128)

  for (char <- string) {
    // check if the character has been added in the array
    if (charSet(char)) return false
    charSet(char) = true
  }
  true
}

// A HashMap can also be used
def isUnique2(string: String): Boolean = {
  // a map to hold the state of each character
  val charMap = mutable.HashMap[Char, Boolean]()

  for (char <- string) {
    if (charMap.contains(char) && charMap(char)) return false
    charMap += char -> true
  }
  true
}

// test
val s1 = "Michael"
val s2 = "Michelle"
assert(isUnique(s1) == isUnique2(s1)) // true
assert(isUnique(s2) == isUnique2(s2)) // false