// Complete the kangaroo function below.
def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
  if (v2 - v1 == 0) "NO"
  else {
    val div = (x1 - x2) / (v2 - v1)
    val mod = (x1 - x2) % (v2 - v1)
    if (div > 0 && mod == 0) "YES" else "NO"
  }
}

// test
kangaroo(0, 4, 2, 4)