import scala.io.StdIn.readLine
import scala.collection.mutable

object jembatanPulau {
    def main (args: Array[String]) : Unit = {
        val Array(mStr, src) = readLine().split(" ")
        val m = mStr.toInt
        val graph = mutable.Map[String, mutable.Set[String]]()

        for (_ <- 0 until m) {
        val Array(u, v) = readLine().split(" ")
        graph.getOrElseUpdate(u, mutable.Set()) += v
        graph.getOrElseUpdate(v, mutable.Set()) += u
        }

        val visited = mutable.Set[String]()
        def dfs(pulau: String): Unit = {
        if (!visited.contains(pulau)) {
            visited += pulau
            graph.getOrElse(pulau, Set()).foreach(dfs)
        }
        }

        dfs(src)
        visited.foreach(println)
    }
}