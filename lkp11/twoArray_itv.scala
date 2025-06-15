import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object twoArray_itv {
    def main( args: Array[String] ) : Unit = {
        val size = readLine().split(" ").map(_.trim.toInt).toList
        val n = size(0)
        val m = size(1)

        val arrayA = readLine().split(" ").take(n).map(_.trim.toInt)
        val arrayB = (
            for(i <- 0 until m) yield{

                val lst = ArrayBuffer[Int]()
                var k = 0

                while(i+k*m < n){
                    lst += arrayA(i + k*m)
                    k += 1
                    println(lst)
                }
                    
                lst.sum
            }).toList

        arrayB.foreach(x=> print(x+" "))
    }
}

/* 
ambil bagian dari array

 */