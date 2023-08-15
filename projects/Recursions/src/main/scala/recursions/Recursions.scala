package recursions

import scala.annotation.tailrec

object Recursions {
  def main(args: Array[String]): Unit = {
    println(fibonacci(90))

    println(factorial(10))

    println(sum(10))
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

  //Find the factorial of an input positive number using the Recursive function. (Factorial of a number ( n ) is the product of all the integers from 1 to n )
  //Hint: Use the for loop to the increment part.
  def factorial(n: Int): Long = {
    factorial(n, 1)
  }

  @tailrec
  private def factorial(n: Int, acc: Long): Long = {
    if (n <= 1) return acc

    factorial(n - 1, n * acc)
  }

  def sum(n: Int): Long = {
    sum(n, 0)
  }

  @tailrec
  private def sum(n: Int, acc: Long): Long = {
    if (n <= 0) return acc

    sum(n - 1, acc + n)
  }
}
