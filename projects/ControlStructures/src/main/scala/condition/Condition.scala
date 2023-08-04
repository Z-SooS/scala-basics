package condition

object Condition {
  def main(args: Array[String]): Unit = {
    println("Please give me a number:")
    val a = scala.io.StdIn.readInt()

    println("\nActivity 1")
    println(s"The number $a ${if (activity1(a)) "IS" else "IS NOT"} within 20 of 100")

    println("\nPlease give me a second number:")
    val b = scala.io.StdIn.readInt()

    println("\nActivity 2")
    println(s"From the numbers $a and $b: ${
      if (activity2(a, b)) "one is greater than 100 and one smaller than 0"
      else "they do not meet requirements"
    }")


  }

  //Write a Scala program to check a given integer and return true if it is within 20 of 100 or false in the other case.
  //
  //         Hint: Use the math function and the OR Operator.
  // I do not know how I should use them both math.addExact?
  private def activity1(n: Int): Boolean = math.abs(100 - n) <= 20

  //Write a Scala program to check whether one of the given temperatures is less than 0 and the other is greater than 100.
  //
  // Hint: Use both the AND and OR Operator.
  private def activity2(a: Int, b: Int): Boolean = {
    if (a > 100 && b < 0) {
      true
    } else if (b > 100 && a < 0) {
      true
    } else {
      false
    }
  }
}
