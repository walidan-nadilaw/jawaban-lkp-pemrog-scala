object hello{
    def main(args: Array[String]): Unit ={
        print("input nama : ")
        val nama = scala.io.StdIn.readLine()
        var umur = 19
        println(s"nama : $nama\numur : $umur")
    }
}