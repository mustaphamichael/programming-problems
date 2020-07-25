// Complete the whatFlavors function below.
//def whatFlavors(cost: Array[Int], money: Int) {
//  val length = cost.length
//  val withIndex = (1 to length) zip cost
//  val reasonableCosts = withIndex.filter { case (_, cost) => cost < money }.toMap
//  val pairs = for {
//    (aIndex, aValue) <- reasonableCosts
//    (bIndex, bValue) <- reasonableCosts.drop(aIndex)
//    remainder = money - aValue
//    if remainder == bValue
//  } yield aIndex -> bIndex
//
//  val (first, second) = pairs.dropWhile { case (k, v) => k == v }.head
//  println(s"$first $second")
//}

// Complete the whatFlavors function below.
def whatFlavors(cost: Array[Int], money: Int) {
  val withIndex = (1 to cost.length) zip cost
  val sets = cost.toSet
  val pairs = for {
    (index, amount) <- withIndex
    balance = money - amount
    if sets.contains(balance)
  } yield index -> (cost.indexOf(balance) + 1)

  val (first, second) = pairs.dropWhile { case (k, v) => k == v }.head
  println(s"${if (first > second) s"$second $first" else s"$first $second"}")
}

// test
val cost = Array(7, 2, 5, 4, 11)
val money = 12
whatFlavors(cost, money) // 1 3
