package condition

object Condition {
  def main(args: Array[String]): Unit = {
    println("Please give me a number:")
    val a = scala.io.StdIn.readInt()

    println("\nActivity 1")
    println(s"The number $a ${if (activity1(a)) "IS" else "IS NOT"} within 20 of 100")
  }

  //Write a Scala program to check a given integer and return true if it is within 20 of 100 or false in the other case.
  //
  //         Hint: Use the math function and the OR Operator.
  // I do not know how I should use them both math.addExact?
  private def activity1(n: Int): Boolean = math.abs(100 - n) <= 20
}
