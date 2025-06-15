    import scala.io.StdIn.readLine

    object noDuplicates {
        def main(args: Array [String]) : Unit = {
            val n = readLine().trim.split(" ");
            val n_arrays = n(0).toInt

            val no_duplicate = (1 to n_arrays)
                .map( _ => readLine().trim.split(" ").groupBy(x=>x).count(_._2.length > 1) )
                .toList
                .filter( _ == 0)        

            println(no_duplicate.size)
        }
    }