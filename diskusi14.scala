
object diskusi14 {
    def main( args: Array[String]) : Unit = {

        val people = new java.util.HashMap[String, Int]()
        val name = List("aji", "widodo", "denis", "aghnat")
        val usia = List(19, 40, 13, 20)

        val n = List(name.size, usia.size).minBy( identity )
        for ( i <- 0 until n) people.put(name(i), usia(i))

        val iterator = people.entrySet().iterator()

        while( iterator.hasNext() ){
            val entry = iterator.next()
            val nama = entry.getKey()
            val usia = entry.getValue()
            println( f"nama : $nama \tusia: $usia" )
        }
    }
}