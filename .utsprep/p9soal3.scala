import scala.io.StdIn.readLine

object p9s3 {
  def main( args: Array[String] ) : Unit = {
    
    val n = readLine().trim.toInt
    val input = readLine().split(" ").map(_.trim.toInt)
      .filter(x => x >= 0 && x <= 100)
      .toList
      
    val mean = input.sum.toDouble / input.size

    val ragam = input.map( x => (x-mean)*(x-mean) ).sum.toDouble / input.size
    
    println( f"$ragam%.2f")
 }
}