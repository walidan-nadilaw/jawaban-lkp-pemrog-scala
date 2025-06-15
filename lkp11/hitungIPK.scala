import scala.io.StdIn._

object hitungIPK {
    def main( args: Array[String] ) : Unit = {

        val gradeMap = Map(
            "A" -> 4.0,
            "AB" -> 3.5,
            "B" -> 3.0,
            "BC" -> 2.5,
            "C" -> 2.0,
            "D" -> 1.0,
            "E" -> 0.0
        )

        val n = readInt()

        val inputs = List.fill(n)( readLine().split(", ").map(_.trim).toList ).groupBy( _(0) )

        val nama_nim = inputs.map{ case(nim, list) => {
            val nama = list(0)(1)
            val nilai = list.map( x => gradeMap( x(3) ))
            val ipk = nilai.sum / nilai.size
            (nim, nama, f"$ipk%.2f")
        }}.toList

        nama_nim.sortBy(_._1).foreach{ case (nim, nama,ipk) =>
            println(s"$nama $ipk")
        }
    }
}

/* 
5
G0401221001, Rangga Rafif, Blockchain, A
G0401221002, Raja Iblis, Blockchain, AB
G0401221003, Zantos Zantoso, Forensik, B
G0401221001, Rangga Rafif, PWN, BC
G0401221001, Rangga Rafif, Kriptografi, A
 */