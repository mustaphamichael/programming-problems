// See https://www.hackerrank.com/challenges/circular-array-rotation/problem

def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
  // Brute force approach: Iterate through the array 'k' times, making the last value the first and shifting the rest to the right
  // This would be slow because shifting the elements of an array takes O(N) times multiplied by the number of rotations

  // A more optimized approach would be to take the last 'k' elements, appended by remaining elements on the left
  // Edge case: if the number of rotations is more than the length of the array - rotate just the modulus
  val rotations = if (k < a.length) k else k % a.length
  val rotated = a.drop(a.length - rotations)
  val left = a.take(a.length - rotations)
  val array = rotated ++ left
  for (e <- queries) yield array(e)
}

// test
val a = Array(1, 2, 3)
circularArrayRotation(a, 5, Array(0, 1, 2))