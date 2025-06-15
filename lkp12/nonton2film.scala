import scala.io.StdIn.readLine

object nonton2film {
    def main (args: Array[String]) : Unit ={
        
        val n = readLine().trim.toInt
        val movies = List.fill(n)(readLine().split(",").map(_.trim).toList)

        def cek2movies ( a: Int, b:Int, movies:List[List[String]] ) : Unit = {
            val intersection = movies(a).intersect(movies(b)).sorted
            if (intersection.nonEmpty){
                println(intersection.mkString(","))
            }
            else println(-1)
        }

        val q = readLine().trim.toInt

        for(i <- 1 to q) yield {
            val Array(a,b) = readLine().split(" ").map(_.trim.toInt)
            cek2movies(a-1,b-1,movies)
        }
    }
}

/* 
scana baris
input baris
map semuanya jadi list
bikin function jika ada yang sama, jadiin list

bikin function cek apakah ada nama di antara dua list, dengan dua argumen integer
    intersection antara dua list
    jika list ada, 
        mkstringlist -> print
    jika tidak ada 
        print(-1)
ambil dua input
masukin ke dalam function

 */


/* 
5
Samsudin,Masrudin,Nurudin,Muhidin,Jalaludin,Aminudin
Zakinudin,Lukmanudin,Ahmadudin,Unorudin,Ariyudin,Dareludin
Tajudin,Saifudin,Muhidin,Samsudin,Afifudin,Komarudin
Masrudin,Aminudin,Tajudin,Afifudin,Samsudin
Bimanudin,Nurudin,Ariyudin,Jalaludin
3
1 4
5 2
2 3
 */


