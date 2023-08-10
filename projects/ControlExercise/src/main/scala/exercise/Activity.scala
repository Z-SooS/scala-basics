package exercise

object Activity {
  //. The signum of a number is 1 if the number is positive, –1 if it is negative, and
  //0 if it is zero. Write a function that computes this value.
  def activity1(n: Int): Unit = {
    val signum = if (n > 0) 1 else if (n < 0) -1 else 0

    println(s"The signum of $n is $signum")
  }


  //What is the value of an empty block expression {}? What is its type?
  def activity2(): Unit = {
    println("The value and type of an empty block is 'Unit'")
  }

  //Come up with one situation where the assignment x = y = 1 is valid in Scala.
  //(Hint: Pick a suitable type for x.)
  def activity3(): Unit = {
    println("'x = y = 1' is valid if x is of type 'Any'")
  }
}
