package stringactivity

object Activity1 {
  //1. Write a Scala program to reverse a given string.  “Hello”
  def main(args: Array[String]) : Unit = {
    val word = if (args.length > 0) args(0) else scala.io.StdIn.readLine("What word would you like to reverse?\n")

    println(s"The word \"$word\" reversed is \"${word.reverse}\"")
  }

}
