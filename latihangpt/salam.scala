import scala.io.StdIn._
import scala.util.control.Breaks._

object salam{
    def salam(): Unit ={ println( "Assalamualaikum") }

    def main(args: Array[String]): Unit ={
        var x = 0
        
        breakable{ for( i <- 1 to 3){
            salam()
            val jawab = readLine()

            if(jawab == "bacot") println("Astaghfirullah")

            if( jawab.equalsIgnoreCase("Waalaikumsalam")){
                x = 1
                break
            }
        }}

        if(x == 1) println("alhamdulillah")
        else println("tai")

    }
}