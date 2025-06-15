import scala.io.StdIn.readLine

object transpose {
    def main (args : Array [String]) : Unit = {

        val m_n = readLine.trim.split(" ")
        val m = m_n(0).toInt
        val n = m_n(1).toInt

        val matriks = (1 to m).map( _ => {
            readLine().trim.split(" ").take(n).toList
        }).toList

        val matriks_trs = (for (i <- 0 to n-1) yield ( 
            matriks.map( _(i)).mkString(" ")
        ))

        matriks_trs.foreach(println)
    }
}

/* 
scan matriks


 */