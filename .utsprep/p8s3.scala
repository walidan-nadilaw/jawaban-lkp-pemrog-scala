import scala.io.StdIn.readLine

object p8s3 {
  def main( args: Array[String] ) : Unit = {
    
    def factorial( n:Int ) : Int = {
      if( n == 0 ) return 1
      
      return n * factorial(n-1)
    }
    
    val n = readLine().trim.toInt
    println(factorial(n))
  }
}