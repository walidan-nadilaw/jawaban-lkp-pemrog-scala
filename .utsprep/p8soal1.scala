import scala.io.StdIn.readLine

object p8s1{
    def main(args: Array[String]): Unit = {
        val n = readLine().trim.toInt
        val input = readLine().split(" ").take(n).map(_.trim.toInt).toList

        val biggest = input.max
        val smallest = input.min
        val sumOFodd = input.filter(x => x % 2 != 0).sum

        println(smallest+" "+biggest+" "+sumOFodd)
    }
}