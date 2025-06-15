import scala.io.StdIn.readLine

object p10soal7 {
  def main( args: Array[String] ) : Unit = {
    
    val n = readLine().trim.toInt
    
    val inputs = (1 to n).map( _ => readLine().trim.split(" > ").toList ).toList
    
    val orangs = inputs.map( _(0) ).toSet
    val temanTerbaik = inputs.map( _(1) ).toSet
    
    orangs.diff(temanTerbaik).toList.sorted.foreach(println)
    
  }
}