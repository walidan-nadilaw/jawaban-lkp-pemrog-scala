import scala.io.StdIn.readLine

/*
readLine
groupBy
toSeq.sortBy(_._1)
map(_._2)
.size
.mkString(", ")
*/

object p11soal3 {
  def main( args: Array[String]) : Unit = {
    
    val ketungan = readLine().split(" ").takeWhile(x => x != -1)
      .groupBy( x => x)
      .toSeq.sortBy(_._1)
      .map(_._2.size)
      .mkString(", ")
    println(ketungan)
  }
}