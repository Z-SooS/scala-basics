package stringactivity

object Activity4 {
  //4. Write a Scala Program to accept a string from the user and find the number of occurrences of a specific character as per user choice.
  def main(args: Array[String]): Unit = {
    println("Finding the number of occurrences in a given string")

    val textLower = (if(args.length>0) args(0) else scala.io.StdIn.readLine("Text to search in:\n")).toLowerCase()
    println(s"Searching in:\n$textLower")

    var char: Char = 0
    if(args.length>1 && args(1).length == 1) {
      char = args(1).charAt(0).toLower
    } else {
      println("Character to search for:")
      char = scala.io.StdIn.readChar().toLower
    }
    println(s"Searching for: $char")

    val foundNumber = textLower.count(c => c equals char)

    println(s"Found $foundNumber instances")
  }
}
