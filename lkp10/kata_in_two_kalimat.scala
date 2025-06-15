import scala.io.StdIn._

object kata_in_two_kalimat {
    def main(args: Array[String]): Unit = {
        
        val string1 = readLine().trim.toLowerCase
        val string2 = readLine().trim.toLowerCase
        
        println()
        val kata = string2.split(" ")
            .filter( s => string1.contains(s.toLowerCase)) 
            .sorted
            .foreach(println)
    }
}