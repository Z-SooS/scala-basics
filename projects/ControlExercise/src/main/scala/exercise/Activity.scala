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

  //Write a Scala equivalent for the Java loop
  //for (int i = 10; i >= 0; i--) System.out.println(i);
  def activity4(): Unit = {
    println("The scala equivalent of 'for (int i = 10; i >= 0; i--) System.out.println(i);' is:")
    println("for (i <- 10 to 0 by -1) println(i)")
    //for (i <- 10 to 0 by -1) println(i)
  }

  //Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  def activity5(nOuter: Int): Unit = {
    def countdown(n: Int): Unit = {
      val direction = if (n > 0) -1 else 1

      val result = (n to 0 by direction).mkString(" ")
      println(result)
    }

    countdown(nOuter)
  }


  //Write a for loop for computing the product of the Unicode codes of all letters
  //in a string. For example, the product of the characters
  //in "Hello" is 9415087488L.
  def activity6(input: String): Unit = {
    var result: Long = 1L

    for (c <- input) {
      result *= c.toLong
    }

    println(s"The result of '$input' is $result")
  }

  //Solve the preceding exercise without writing a loop. (Hint: Look at
  //the StringOps Scaladoc.)
  def activity7(input: String): Unit = {
    val result = product(input)

    println(s"No loop: The result of '$input' is $result")
  }

  //8. Write a function product(s : String) that computes the product, as described
  //in the preceding exercises.
  private def product(s: String): Long = s.foldLeft(1L)((accumulator, c) => accumulator * c.toLong)

  //Make the function of the preceding exercise a recursive function.
  def activity8(input: String): Unit = {
    val result = recursiveProduct(input)

    println(s"The recursive result is $result")
  }

  private def recursiveProduct(subString: String) : Long = {
    if (subString.isEmpty) {
      return 1L
    }
    if (subString.length == 1) return subString.charAt(0).toLong

    subString.charAt(0).toLong * recursiveProduct(subString.tail)
  }


}
