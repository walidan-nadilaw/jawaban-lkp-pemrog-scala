import scala.io.StdIn.readLine

/*
func get index(i, m, n) : List[Int]
func get Bi( A:List[Int], i, m, n) : Int
read m dan n
read a
for ( idx <- 0 until n) print( Bi(A, i, m) + " ")
*/

object p11soal5 {
  def main( args: Array[String]) : Unit = {
    
    
    def Bi(A:List[Int], i:Int, k:Int, m:Int, n:Int): Int = {
      if( i+k*m >= n) return 0
      return A(i+k*m) + Bi(A, i, k+1, m, n)
    }
    
    val Array(n, m) = readLine().split(" ").map(_.trim.toInt)
    val A = readLine().split(" ").map( _.trim.toInt)
      .toList
    
    val k = 0
    val B = for( i <- 0 until m) print( Bi(A, i, k, m, n)+" " )
  }
}