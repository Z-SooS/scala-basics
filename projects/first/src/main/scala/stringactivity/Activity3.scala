package stringactivity

import scala.collection.mutable.ListBuffer

object Activity3 {
  private val quittingString = ":wq"
  //Write a Scala Program to accept strings from the user and concatenate the strings.
  def main(args: Array[String]) : Unit = {
    val words = ListBuffer.from(args);

    var continueToAdd = true;

    while(continueToAdd) {
      println(s"Words currently to concatenate:\n${words.mkString("->")}");
      val input = scala.io.StdIn.readLine(s"What text would you like to add to it? ('$quittingString' to finish)\n");

      if(input.equalsIgnoreCase(quittingString)) continueToAdd = false
      else words.addOne(input)
    }

    //concat
    var result = ""
    words.foreach(s => result = result.concat(s).concat(" "))
    println(result.dropRight(1))

    //mkString
    println(words.mkString(" "))
  }

}
