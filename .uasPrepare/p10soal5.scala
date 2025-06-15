import scala.io.StdIn.readLine

object p10soal5 {
  def main( args: Array[String] ) : Unit = {
    
    val n = readLine().trim.toInt
    
    val lines = (1 to n).map(_ => readLine().trim )
      .foreach{ line => 
        val bagian = line.split(" : ")
        
        if( bagian(0).toLowerCase.sorted == bagian(1).toLowerCase.sorted ) println("Anagram")
        else println("Bukan Anagram")
      }
  }
}