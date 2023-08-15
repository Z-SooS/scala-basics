package recursions

import scala.annotation.tailrec

object Recursions {
  def main(args: Array[String]): Unit = {
    println(fibonacci(90))
  }

  //Write a program to calculate a Fibonacci sequence recursively using Scala.
  //Hint: Use the if condition, check the index value and do the increment.
  def fibonacci(n: Int): List[Long] = {
    if (n == 0) return List.empty
    if (n == 1) return List(0)

    fibonacci(n, List(0, 1))
  }

  @tailrec
  private def fibonacci(n: Int, numbers: List[Long]): List[Long] = {
    if (n <= numbers.length) return numbers

    val lastTwo = numbers.takeRight(2)

    fibonacci(n, numbers :+ lastTwo.sum)
  }
}
