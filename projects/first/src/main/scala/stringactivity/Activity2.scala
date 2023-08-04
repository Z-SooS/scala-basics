package stringactivity

object Activity2 {
  //2. Write a Scala program to check the length of the given string, “Demogorgon”.
  def main(args: Array[String]) : Unit = {
    val word = if (args.length > 0) args(0) else scala.io.StdIn.readLine("What word would you like to check the length of?\n")

    println(s"The length of $word is ${word.length}")
  }

}
