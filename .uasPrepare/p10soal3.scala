import scala.io.StdIn._

object p10soal3 {
  def main (args: Array[String]): Unit ={
      
      val n = readLine().trim.toInt
      
      val words= (1 to n).map(_ => readLine().trim).groupBy{ word => 
        word.reverse.charAt(0)
      }
        .toSeq
        .sortWith(_._2.size > _._2.size)
        .foreach{ case(key, words) => println( f"$key : ${ words.size } " ) }
  }
}