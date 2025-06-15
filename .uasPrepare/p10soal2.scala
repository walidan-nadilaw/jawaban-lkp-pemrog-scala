import scala.io.StdIn._

object p10soal2 {
    def main (args: Array[String]): Unit ={
      
      val n = readLine().trim.toInt
      
      val names = (1 to n).map(_ => readLine().trim).sortBy{ name => 
        name.split(" ")(1).charAt(0)
      }
        .foreach(println)
    }
}