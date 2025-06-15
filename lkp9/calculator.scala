/*
4. Buat HOF bernama filterList yang menerima sebuah koleksi bilangan bulat dan sebuah
fungsi (yang menerima bilangan bulat dan mengembalikan boolean) sebagai parameter.
Fungsi filterList harus mengembalikan daftar baru yang hanya berisi elemen-elemen yang
memenuhi kondisi yang diberikan.
Implementasikan filter dasar berikut sebagai fungsi:
1. isEven: Mengembalikan true jika bilangan genap.
2. isOdd: Mengembalikan true jika bilangan ganjil.
3. isPositive: Mengembalikan true jika bilangan positif.
4. isMult(factor): Mengembalikan true jika bilangan tersebut merupakan kelipatan dari
factor.
*/

import scala.io.StdIn._
object HelloWorld {
def main(args: Array[String]): Unit = {
        val nums = readLine().split(" ").map(_.toInt).toList
        val isEven:             Int => Boolean = (x:Int)   =>    x%2 == 0
        val isOdd:              Int => Boolean = (x:Int) => x%2 != 0
        val positive:           Int => Boolean = (x:Int) => x > 0
        def Mult(factor: Int):  Int => Boolean = {
            (x) => x % factor == 0
        }

        def filter_list( lst:List[Int], func:Int => Boolean): Unit = lst.filter(func).foreach(x => print(x+" "))

        print("Even\t\t: ")
        filter_list(nums, isEven)

        print("\nOdd\t\t: ")
        filter_list(nums, isOdd)

        print("\nPositive\t: ")
        filter_list(nums, positive)

        print("\nMultiply of 3\t: ")
        filter_list(nums, Mult(3))

        print("\nMultiply of 7\t: ")
        filter_list(nums, Mult(7))
    }
}