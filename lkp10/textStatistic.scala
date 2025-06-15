import scala.io.StdIn._ 

object textStatistic {
    def main( args: Array[String]): Unit = {

        val text = Iterator.continually(readLine())
            .takeWhile(_.nonEmpty)
            .mkString(" ")

        val cleaned = text.toLowerCase
            .replace("-", " ")
            .replaceAll("[()\\.,]", "")
            .split(" ")
            .toList

        val jumlah = cleaned.length
        val rata2_panjang = cleaned.map(_.length).sum.toDouble / jumlah
        val terpanjang = cleaned.maxBy(_.length)
        val tersering = cleaned.groupBy(x => x).maxBy(_._2.length)._1

        println(
            s"jumlah total kata : $jumlah\n" +
            f"Rata-rata panjang kata: $rata2_panjang%.2f\n" +
            s"Kata terpanjang : $terpanjang\n" +
            s"kata paling sering muncul : $tersering\n"
        )
    }
}