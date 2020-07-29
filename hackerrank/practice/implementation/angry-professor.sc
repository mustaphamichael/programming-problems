// Complete the angryProfessor function below.
def angryProfessor(k: Int, a: Array[Int]): String = {
  val earlyEntry = a.count(x => x <= 0)
  if (k > earlyEntry) "YES" else "NO"
}

// test
val a = Array(-1, -3, 4, 2)
angryProfessor(3, a)