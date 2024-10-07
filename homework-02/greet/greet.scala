object Greet {
    def main(args: Array[String]): Unit = {
        print("Please enter name: ")
        val name = scala.io.StdIn.readLine()
        println(s"Hello $name!")
    }
}
