object Solution {

  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}

// scala.io.StdIn.readInt() - read integer
//def readLine() = scala.io.StdIn.readLine