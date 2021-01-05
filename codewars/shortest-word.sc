// See https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/scala

def findShort(str: String): Int =
  str.split(" ").map(_.length).min

// test
val str = "bitcoin take over the world maybe who knows perhaps"
findShort(str)