import scala.io.StdIn._
object tungtungsahur {
    def main( args: Array [String] ) : Unit = {

        val tung_col = readLine().split(" ").takeWhile(_ != "-1")
        val pos_freq = tung_col.groupBy(identity)
            .map{ case (ronda, tungs) => (ronda, tungs.size)}
            .toList
            .sortBy(_._1)

        val tungs = pos_freq.map(_._2).mkString(", ")
        println(tungs)
    }
}