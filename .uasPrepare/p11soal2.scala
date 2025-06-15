import scala.io.StdIn.readLine

object p11soal2 {
  def main( args: Array[String] ) : Unit = {
    
    val Array(r, c) = readLine().split(" ").map(_.trim.toInt)
    
    val matrix = (1 to r).map( _ => 
      readLine().trim.split(" ").toList 
    ).toList
    
    val transpose = (for(i <- 0 until c) yield {
      
      matrix.map( _(i) ).mkString(" ")
      
    }).foreach(println)
    
  }
}