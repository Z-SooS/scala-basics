package variablesactivity

object Activity2 {
  def main(args: Array[String]): Unit = {
    println("Dear customer!")

    val customerName = scala.io.StdIn.readLine("Please provide your name:\n")

    println("And age:")
    val customerAge = scala.io.StdIn.readInt()

    printf("You are: %s, %d years old", customerName, customerAge)
  }
}
