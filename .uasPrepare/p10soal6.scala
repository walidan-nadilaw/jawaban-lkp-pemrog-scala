import scala.io.StdIn.readLine

object p10soal6 {
  def main( args: Array[String] ) : Unit = {
    
    val text = Iterator.continually(readLine())
      .takeWhile(_.nonEmpty)
      .mkString(" ")
      .replace("-", " ")
      .replaceAll("[()\\.]", "")
      .split(" ")
      .toList
      
    val jumlah = text.size
    val meanOFsize = text.map(_.size).sum.toDouble / jumlah
    val longest = text.maxBy(_.size)
    val mostOFTEN = text.groupBy(x => x).toSeq.maxBy(_._2.size)._1
    
    println(jumlah)
    println(f"$meanOFsize%.2f")
    println(longest)
    println(mostOFTEN)
  }
}