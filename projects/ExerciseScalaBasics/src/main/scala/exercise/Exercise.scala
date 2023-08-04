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

    val text = scala.io.StdIn.readLine("\nGive me a string:\n")

    println("Exercise4:")
    println(s"Result: ${exercise4(text)}")

    println("Exercise5:")
    println(s"Result: ${exercise5(text)}")

    println("Exercise6:")
    println(s"Result: ${exercise6(a)}")

    println("Exercise7:")
    println(s"Result: ${exercise7(text)}")

    println("Give me a third number:")
    val c = scala.io.StdIn.readInt()

    println("Exercise8:")
    println(s"Result: ${exercise8(a, b, c)}")

    println("Exercise9:")
    println(s"Result: ${exercise9(a, b)}")

    //Commented out for convenience
//    val haystackString = scala.io.StdIn.readLine("\nGive me a string to search in:\n")
//    val searchString1 = scala.io.StdIn.readLine("\nGive me a string to search for:\n")
//    val searchString2 = scala.io.StdIn.readLine("\nGive me another string to search for:\n")
//
//    println("Exercise10:")
//    println(s"The given string is: $haystackString")
//    println(s"Are the appearance of '$searchString1' and '$searchString2' equal? ${exercise10(haystackString, searchString1, searchString2)}")

    var haystackString = "Thisisthethesis"
    val searchString1 = "the"
    val searchString2 = "is"

    println("Exercise10:")
    println(s"The given string is: $haystackString")
    println(s"Are the appearance of '$searchString1' and '$searchString2' equal? ${exercise10(haystackString, searchString1, searchString2)}")

    haystackString = "Thisisthethes"

    println(s"The given string is: $haystackString")
    println(s"Are the appearance of '$searchString1' and '$searchString2' equal? ${exercise10(haystackString, searchString1, searchString2)}")
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

  //Write a Scala program to exchange the first and last characters in a given
  //string and return the new string.
  private def exercise4(text: String): String = {
    if (text.length < 2) return text

    text(text.length - 1) + text.substring(1, text.length - 1) + text(0)
  }

  //Write a Scala program to create a new string which is 4 copies of the 2 front
  //characters of a given string.If the given string length is less than 2 return the
  //original string.
  private def exercise5(text: String): String = {
    if (text.length < 2) return text

    text.substring(0, 2).repeat(4)
  }

  //Write a Scala program to check whether a given positive number (3,12,14,37)
  //is a multiple of 3 or a multiple of 7.
  private def exercise6(n: Int): Boolean = n % 3 == 0 || n % 7 == 0

  //Write a Scala program to check whether a given string starts with 'Sc' or not.
  private def exercise7(text: String): Boolean = text.length > 1 && text.substring(0, 2).equalsIgnoreCase("sc")

  //Write a Scala program to check the largest number among three given integers.
  private def exercise8(a: Int, b: Int, c: Int): Int = math.max(a, math.max(b, c))

  //Write a Scala program to check whether two given positive integers have the
  //same last digit.
  private def exercise9(a: Int, b: Int): Boolean = a % 10 == b % 10

  //Write a Scala program to program to check the number of appearances of
  //the two substrings that appear anywhere in the string.
  private def exercise10(text: String, search1: String, search2: String): Boolean = {
    val searchLower1 = search1.toLowerCase()
    val searchLower2 = search2.toLowerCase()

    val count1 = text.toLowerCase().sliding(searchLower1.length).count(w => w == searchLower1)
    val count2 = text.toLowerCase().sliding(searchLower2.length).count(w => w == searchLower2)

    count1 equals count2
  }
}
