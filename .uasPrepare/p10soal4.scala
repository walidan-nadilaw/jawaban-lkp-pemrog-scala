import scala.io.StdIn._

object p10soal4 {
  def main (args: Array[String]): Unit ={
      
      val kalimat1 = readLine().split(" ").toList
      val kalimat2 = readLine().split(" ").toList
      
      val kalimat3 = kalimat1.filter( x => kalimat2.map(_.toLowerCase).contains(x.toLowerCase))
        .sorted
        .foreach(println)
  }
}