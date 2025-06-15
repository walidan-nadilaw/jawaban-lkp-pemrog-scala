import scala.io.StdIn.readLine

object jumlahKelas {
    def main(args : Array[String]) : Unit = {
        val n = readLine().trim.toInt

        val inputs = List.fill(n)(readLine().split(" ").map(_.trim).toList)

        val listKelas = inputs.map(_.tail).reduce(_ ++ _).toSet
        println(listKelas.size)
        
        val sortedListKelas = listKelas.toList.sorted.foreach(println)
    }
}
/* 
4
Berio Matematika Fisika Kimia
Tesa Fisika Kimia Olahraga Biologi
Renado Sosiologi Sejarah Multimedia Kewarganegaraan
Naliong Olahraga Biologi Kimia Astronomi
 */