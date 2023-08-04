package exercise

object Exercise {
  def main(args: Array[String]): Unit = {
    println("Give me main number:")
    val a = scala.io.StdIn.readInt()

    println("Give me secondary number:")
    val b = scala.io.StdIn.readInt()

    println("Exercise1:")
    println(s"Result: ${exercise1(a, b)}")

    println("Exercise2:")
    println(s"Result: ${exercise2(a)}")

    println("Exercise3:")
    println(s"Result: ${exercise3(a, b)}")

  }

  //  Write a Scala program to compute the sum of the two given integer values. If
  //  the two values are the same, then return triples of their sum
  private def exercise1(a: Int, b: Int): Int = if (a == b) 3 * (a + b) else a + b

  //Write a Scala program to get the absolute difference between n and 51. If n is
  //greater than 51 return triple the absolute difference.
  private def exercise2(n: Int): Int = {
    val diff = math.abs(n - 51)

    if (n > 51) 3 * diff else diff
  }

  //Write a Scala program to check two given integers, and return true if one of
  //them is 30 or if their sum is 30.
  private def exercise3(a: Int, b: Int): Boolean = a == 30 || b == 30 || a + b == 30
}
