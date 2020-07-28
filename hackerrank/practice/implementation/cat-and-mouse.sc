// Complete the catAndMouse function below.
def catAndMouse(x: Int, y: Int, z: Int): String = {
  val mouseA = math.abs(x - z)
  val mouseB = math.abs(y - z)
  if (mouseA == mouseB) "Mouse C"
  else if (mouseA < mouseB) "Cat A"
  else "Cat B"
}

// test
val (x, y, z) = (1, 3, 2)
catAndMouse(x, y, z)