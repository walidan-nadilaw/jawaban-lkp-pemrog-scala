import scala.io.StdIn.readLine

object p9s2 {
  def main( args: Array[String] ) : Unit = {
    
    val n = readLine().trim.toInt
    println(readLine().split(" ").take(n).map(_.trim.toInt)
      .filter( x => math.sqrt(x) % 1 == 0)
      .sum)
  }
}