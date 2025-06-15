import scala.io.StdIn._

object MinMaxSum10{
    def main(args: Array[String]): Unit = {
        val n = readLine().trim.toInt

        val numlist = readLine().split(" ").map(_.toInt)
        val listMax = numlist.max
        val listMin = numlist.min
        val sum = numlist.filter(_ % 2 != 0).sum
        print(s"$listMin $listMax $sum")
    }
}