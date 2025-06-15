import scala.io.StdIn.readLine

object p11soal1 {
  def main( args: Array[String] ) : Unit = {
    
    val Array(row, column) = readLine().split(" ").map(_.trim.toInt)
    
    val original = (1 to row).map( _ => readLine().split(" ").toList ).toList
    
    val sizeOForiginal = original.map(_.size)
    val sizeOFnodup = original.map( _.toSet.size)
    
    println( (1 to row).filter( x => sizeOForiginal(x-1) == sizeOFnodup(x-1) ).size )
  }
}