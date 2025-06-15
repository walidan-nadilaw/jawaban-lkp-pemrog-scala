import scala.io.StdIn._ 

object groupByLastChar {
    def main(args: Array[String]): Unit = {
        val n = readLine().trim.toInt

        val wordMap = (1 to n).map(_ => readLine().trim).toList

        val grouped = wordMap.groupBy(string =>
            string.reverse.charAt(0) 
        )

        for ( (huruf, strings) <- grouped.toSeq.sortWith(_._1 > _._1)){
            println(s"$huruf: ${strings.length}")
        }
    }
}