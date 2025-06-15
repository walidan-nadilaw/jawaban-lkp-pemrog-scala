import scala.io.StdIn._

object max_max10 {
    def main (args: Array[String]): Unit = {
        val n = readLine().trim.toInt

        val maxList1 = readLine().split(" ").take(n).map(x => Math.abs(x.toInt) ).max
        val maxList2 = readLine().split(" ").take(n).map(x => Math.abs(x.toInt) ).max
        println(maxList1 * maxList2)
    }
}