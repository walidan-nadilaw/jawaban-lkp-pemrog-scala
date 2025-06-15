import scala.io.StdIn._

object func{
    def tambah(a: Int, b: Int) = a+b
    def main(args: Array[String]): Unit ={
        print("masukkan angka (a, b) : ")
        val input = readLine()
        val part = input.split(" ")
        val a = part(0).toInt
        val b = part(1).toInt
        val hasil = tambah(a,b)
        println(s"a+b = $hasil")    
    }
}