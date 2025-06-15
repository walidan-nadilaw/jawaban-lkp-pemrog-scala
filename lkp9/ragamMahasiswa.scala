import scala.io.StdIn._

object ragamMahasiswa {
def main(args: Array[String]): Unit = {
        val n = readLine().trim.toInt
        val sigma = readLine().split(" ").take(n).map(x => x.toDouble).filter(x => x >= 0 && x <=100)

        val count = sigma.length
        val mean = sigma.sum / sigma.length
        val upper = sigma.map(x => (x-mean)*(x-mean) ).sum
        printf("%.2f", upper/count)
    }
}