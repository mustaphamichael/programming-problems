import scala.annotation.tailrec
// check if two strings are one edit (or zero edits) away

def oneEditAway(first: String, second: String): Boolean = {
  // three(3) edits can only occur
  // 1- Replacement  2- Insertion  3- Removal
  // insertion can be seen as the inverse of removal

  // check if replace occurs once or none at all
  def replace(s1: String, s2: String): Boolean = {
    @tailrec
    def loop(i: Int, changed: Boolean): Boolean = {
      if (i == s1.length) changed
      else if (s1(i) != s2(i)) {
        if (changed) false // if changed before, return false
        else loop(i + 1, changed = true)
      }
      else true
    }

    loop(0, changed = false)
  }

  // insert from s2 to s1
  def insert(s1: String, s2: String): Boolean = {
    @tailrec
    def loop(i: Int, j: Int, changed: Boolean): Boolean = {
      if (i == s1.length && j == s2.length) changed
      else if (s1(i) != s2(j)) {
        if (changed) false
        else loop(i, j + 1, changed = true)
      }
      else loop(i + 1, j + 1, changed)
    }

    loop(0, 0, changed = false)
  }

  if (first.length == second.length) replace(first, second)
  else if (first.length + 1 == second.length) insert(first, second)
  else if (first.length - 1 == second.length) insert(second, first)
  else false
}

// test
oneEditAway("pale", "bale") // pale -> bale
oneEditAway("ple", "pale") // ple -> pale
oneEditAway("apple", "aple") // apple -> aple