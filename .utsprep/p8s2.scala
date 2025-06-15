  import scala.io.StdIn.readLine
  
  object p8s2{
    def main(args: Array[String]) : Unit = {
      val n = readLine().trim.toInt
      
      val max1 = readLine().split(" ").map(x => math.abs(x.trim.toInt) ).max
      val max2 = readLine().split(" ").map(x => math.abs(x.trim.toInt) ).max
      
      println(max1*max2)
    }
  }