import scala.io.StdIn._

object factorial{
    def factorial( x: Int) : Int = {
        if (x == 0) 1
        else x * factorial(x-1)
    }

    def main(args: Array[String]): Unit = {
        val n = readInt()
        println( factorial(n) )
    }
}