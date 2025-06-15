import scala.io.StdIn._

object match_practice{
    def main(args: Array[String]): Unit ={
        for( x <- 1 to 5){
            val n = readInt()
            val hasil = n match{
                case 1 => "satu"
                case 2 => "dua"
                case 3 => "tiga"
                case _ => "angka tidak dikenal" 
            }

            println(hasil)
        }
    }
}