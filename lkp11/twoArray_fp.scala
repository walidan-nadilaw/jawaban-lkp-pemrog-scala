import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object twoArray_fp {
    def main( args: Array[String] ) : Unit = {
        val size = readLine().split(" ").map(_.trim.toInt).toList
        val n = size(0)
        val m = size(1)

        val arrayA = readLine().split(" ").take(n).map(_.trim.toInt)
        val arrayB = (0 until m).map{ i =>
            arrayA
                .zipWithIndex
                .collect {case(value,idx) if (idx-i)%m == 0 => value} //collect semua nilai array pada idx = i+km
                .sum
        }

    }
}

/* 
ambil bagian dari array

 */