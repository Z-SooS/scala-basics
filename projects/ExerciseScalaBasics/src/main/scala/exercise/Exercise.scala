package exercise

object Exercise {
  def main(args: Array[String]): Unit = {
    println("Give me main number:")
    val a = scala.io.StdIn.readInt()

    println("Give me secondary number:")
    val b = scala.io.StdIn.readInt()

    println("Exercise1:")
    println(s"Result: ${exercise1(a, b)}")
  }

  //  Write a Scala program to compute the sum of the two given integer values. If
  //  the two values are the same, then return triples of their sum
  private def exercise1(a: Int, b: Int): Int = if (a == b) 3 * (a + b) else a + b
}
