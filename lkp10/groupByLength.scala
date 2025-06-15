/* 
read n
readint 5 kali      
 */

import scala.io.StdIn._

object groupByLength {
    def main (args: Array[String]): Unit ={
        val n = readLine().trim.toInt

        val smap = (1 to n).map(_ => readLine().trim).toList.groupBy(_.length)
        val sortedsmap = smap.toSeq.sortBy(_._1)
        
        sortedsmap.foreach{ case (key, strings) => 
            println(s"$key: ${strings.mkString(", ")}") 
        }
    }
}   