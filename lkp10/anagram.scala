/* 
bikin function isAnagram
    ambil string
    split jadi kata1 dan kata2
    cek apakah kata1.sorted.lowercase = kata2.sorted.lowercase

input string dan jadikan list
untuk setiap kata, kalau anagram, print anagram
else print bukan anagram
*/


import scala.io.StdIn._ 

object anagram {
    def main (args: Array[String]): Unit = {
        
        def isAnagram(pair: String) : Boolean ={
            val words = pair.split(" : ")
            words(0).toLowerCase.sorted == words(1).toLowerCase.sorted
        }

        val n = readLine().trim.toInt
        val strings = (1 to n).map(_ => readLine().trim).toList

        strings.foreach{ x =>
            if(isAnagram(x)) println("Anagram")
            else println("Not Anagram")
        }

    }
}