package exercise

object Activity {
  //. The signum of a number is 1 if the number is positive, –1 if it is negative, and
  //0 if it is zero. Write a function that computes this value.
  def activity1(n: Int): Unit = {
    val signum = if (n > 0) 1 else if (n < 0) -1 else 0

    println(s"The signum of $n is $signum")
  }
}
