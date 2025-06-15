import scala.io.StdIn.readLine

object diskusi1 {
    def main ( args: Array[String]) : Unit = {
        val n = readLine().trim.toInt

        val nums = readLine().split(" ").take(n).map(_.toInt).groupBy(x => x)
        for ( (key, values) <- nums.toSeq.sortBy(_._1) ){
            println(s"$key -> ${values.length}")
        }
    }
}