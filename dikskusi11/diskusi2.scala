import scala.io.StdIn.readLine

object diskusi2 {
    def main( args: Array[String]) : Unit = {

        val n = readLine().trim.toInt
        val nums = readLine().trim.split(" ").map(_.toInt)
        val factors = nums.map( a => (1 to a).filter( b => a%b == 0).length)
        val map = (nums zip factors).toMap.toSeq.sortBy(_._1)

        for( (num, factor) <- map){
            println(s"$num -> $factor")
        }
    }
}