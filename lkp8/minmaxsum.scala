import scala.io.StdIn.readLine

object soal1new{
    def main(args: Array[String]): Unit = {
        val n = readLine().toInt

        val numlist = (1 to n).map(_=> readLine().toInt).toList
        val min = numlist.min
        val max = numlist.max
        val sumganjil = numlist.filter(_ % 2 != 0).sum

        println(min+" "+max+" "+sumganjil)
    }
}