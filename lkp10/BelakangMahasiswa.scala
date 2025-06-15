import scala.io.StdIn._

object BelakangMahasiswa{
    def main(args: Array[String]): Unit = {
        val n = readLine().trim.toInt

        val MahasiswaList = (1 to n).map(_ => readLine().trim).toList
        println()
        
        val sortMahasiswa = MahasiswaList.sortBy { name => 
            val bagian = name.split(" ")
            val belakang = bagian(1)
            belakang.charAt(0)
        }.foreach(name => println(name))    
    }
}