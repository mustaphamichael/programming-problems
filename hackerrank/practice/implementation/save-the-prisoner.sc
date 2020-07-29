// Complete the saveThePrisoner function below.
def saveThePrisoner(n: Int, m: Int, s: Int): Int = {

  (m - 1 + s - 1) % n + 1
}

// test
val (n, m, s) = (5, 2, 2)

saveThePrisoner(n, m, s)