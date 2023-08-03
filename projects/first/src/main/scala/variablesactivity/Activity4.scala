package variablesactivity

object Activity4 {
  def main(args: Array[String]) :Unit = {
    println("Dear Customer!")
    val input = scala.io.StdIn.readLine("What is your favorite movie of all time?\n")

    printf("\"%s\" is totally awesome!", input)
  }
}
