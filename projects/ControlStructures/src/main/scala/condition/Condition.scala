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

    println("\nActivity 3")
    println(s"The number $a ${if (activity3(a)) "IS" else "IS NOT"} a prime number")

    println("\nActivity 4")
    println(activity4(a))

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

  //Write a Scala Program to accept the input from the user and check if the input from the user is Prime number or not.
  // Hint: Use if condition.
  private def activity3(n: Int): Boolean = {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    for (i <- 5 to math.sqrt(n).toInt by 6) {
      if (n % i == 0 || n % (i + 2) == 0) return false
    }

    true
  }

  //Write a Scala program to get a number from the user and print whether it is positive or negative
  //Hint: Use if condition.
  private def activity4(n: Int): String = {
    s"The number '$n' " +
      (if (n > 0) "greater than" else if (n < 0) "less than" else "is") +
      " zero"
  }
}
