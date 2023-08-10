package handler

object Handler {
  def main(args: Array[String]): Unit = {
    activity1()
    activity2()
  }


  //Create a Scala program to ask the user for a real number and display its square root. Errors must be trapped using "try..catch".
  //                  Hint: Use the Sqrt function in the try catch block.
  //Write a program that illustrates the application of multiple catch statements.
  //              Hint: Use any exceptions like divide by zero cases to use multiple catch statements.
  private def activity1(): Unit = {
    println("Give me a real number")
    try {
      val input = scala.io.StdIn.readInt()
      val root = Sqrt(input)
      println(s"The square root of $input is $root")
    } catch {
      case nfo: NumberFormatException => println("That was not a real number ", nfo)
      case ae: ArithmeticException => println("Problem with the number: ", ae)
    }
  }

  private def Sqrt(n: Int): Double = {
    if (n < 0) throw new ArithmeticException(s"$n is not a real number")

    math.sqrt(n)
  }

  //Write a program to handle the Divide by Zero exception in Scala.
  //              Hint: Use multiple catch statements to handle divide by zero cases.
  private def activity2(): Unit = {
    println("Please give me a number")
    try {
      val num1: Int = scala.io.StdIn.readInt()

      println("Please give me another number")
      val num2: Int = scala.io.StdIn.readInt()

      val result: Double = num1 / num2

      println(s"$num1 / $num2 = $result")
    } catch {
      case nfo: NumberFormatException => println("This is not a number ",nfo)
      case ae: ArithmeticException => println(ae)
    }
  }
}
