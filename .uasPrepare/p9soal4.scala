import scala.io.StdIn.readLine

object p9s4 {
  def main( args: Array[String] ) : Unit = {
    
    def isEven      (x:Int) : Boolean = { x%2 == 0}
    def isOdd       (x:Int) : Boolean = { x%2!=0 }
    def isPositive  (x:Int) : Boolean = { x > 0 }
    def Mult        (factor:Int) : Int => Boolean = {
      (x) => x%factor == 0
    }
    
    def filterLIST( lst:List[Int], func:Int=>Boolean) : Unit = {
      lst.filter(func).foreach( println(_+" ") )
    }
    
    thisList = readLine().split(" ").map(_.trim.toInt).toList
    
    filterLIST(thisList, isEven)
 }
}