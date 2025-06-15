import scala.io.StdIn.readLine

/*
func huruftomutu
func calculate ipk
groupby nim. sorted
*/

object p11soal3 {
  
  def hurufTOmutu(h:String) : Double = {
    if( h == "A") return 4.0
    if( h == "AB") return 3.5
    if( h == "B") return 3.0
    if( h == "BC") return 2.5
    if( h == "C") return 2.0
    if( h == "D") return 1.0
    else return 0
  }
  
  def get_IPK( lists:List[List[Any]] ) : Double = {
    val grades = lists.map( line => hurufTOmutu( line(3).toString ) )
    grades.sum / grades.size
  }
  
  def get_nama ( lists:List[List[Any]] ) : String = {
    lists(0)(1).toString
  }

  def main( args: Array[String] ) : Unit = {
    
    val n = readLine().trim.toInt
    
    val people = (1 to n).map( _ => readLine().split(", ").toList )
      .groupBy(_(0))
      .toSeq
      .sortBy(_._1)
      .map(_._2.toList)
    
    people.foreach{ x => 
      val nama = get_nama(x)
      val ipk = get_IPK(x)
      println( f"$nama $ipk%.2f")
    }
  }
}