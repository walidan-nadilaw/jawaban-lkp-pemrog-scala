import scala.collection.immutable.SortedMap
import scala.io.StdIn.readLine

object chimpanziBananini {
    def main (args: Array[String]) : Unit = {
        
        val n = readLine().trim.toInt
        val kata_ganti = (1 to n).map{ _ =>
            val parts = readLine().split(" ").map(_.trim)
            parts(0) -> parts(1)
        }.toMap

        val kalimat = readLine()

        val kalimatBaru = println( kalimat.split(" ")
            .map{ kata => 
                kata_ganti.getOrElse(kata, kata)
            } 
            .mkString(" ")
        )
    }
}


/* 
masukin soal intersection
masukin Some(_), None, .flatten, .transpose

.getOrElse

 */