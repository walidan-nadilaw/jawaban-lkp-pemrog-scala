import scala.io.StdIn.readLine

object p10s1 {
    def main( args: Array[String] ) : Unit = {

        val n = readLine().trim().toInt

        val names = (1 to n).map(_ => readLine().trim()).groupBy(_.length)
            .toSeq
            .sortBy(_._1)
            .foreach{ case (key, names) => println(f"$key : ${names.mkString(", ")}") }
    }
}