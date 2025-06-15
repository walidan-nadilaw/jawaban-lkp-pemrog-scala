import scala.io.StdIn.readLine

object TemanFavorit{
    def main (args: Array[String]): Unit = {
        val n = readLine().trim.toInt

        def noFavorit(orang: List[String], favorit: List[String]) : Unit ={
            orang.filterNot(favorit.contains)
            .sorted
            .foreach(println)
        }

        val strings = List.fill(n)(readLine().trim)
        val orang = strings.map(_.split(" > ")(0)).toSet.toList
        val favorit = strings.map(_.split(" > ")(1)).toSet.toList

        println()
        noFavorit(orang, favorit)
    }
}