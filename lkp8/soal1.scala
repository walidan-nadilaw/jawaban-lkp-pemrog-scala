import scala.io.StdIn.readLine
object soal1{
    def main(args: Array[String]): Unit = {
        val n = readLine().toInt
        var min = Int.MaxValue
        var max = Int.MinValue
        var sum = 0

        for(i <- 1 to n){ 
            val num = readLine().toInt

            if ( num < min) min = num
            if ( num > max) max = num
            if ( num % 2 != 0 ) sum+= num
        }

        println(min+" "+max+" "+sum)
    }
}