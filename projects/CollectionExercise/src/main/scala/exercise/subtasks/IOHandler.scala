package exercise.subtasks

import scala.annotation.tailrec

object IOHandler {
  def print(text: String): Unit = println(text)

  def readString(prompt: String): String = {
    scala.io.StdIn.readLine(prompt)
  }

  @tailrec
  def readInt(prompt: String, min: Int, max: Int): Int = {
    print(prompt)
    try {
      val input = scala.io.StdIn.readInt()

      if (input < min || input > max) throw new NumberFormatException("Number must be within parameters")

      input
    }
    catch {
      case _: NumberFormatException => readInt(prompt, min, max)
    }
  }

  @tailrec
  def readDouble(prompt: String, min: Double, max: Double): Double = {
    print(prompt)
    try {
      val input = scala.io.StdIn.readDouble()

      if (input < min || input > max) throw new NumberFormatException("Number must be within parameters")

      input
    }
    catch {
      case _: NumberFormatException => readDouble(prompt, min, max)
    }
  }

  @tailrec
  def readFloat(prompt: String, min: Float, max: Float): Float = {
    print(prompt)
    try {
      val input = scala.io.StdIn.readFloat()

      if (input < min || input > max) throw new NumberFormatException("Number must be within parameters")

      input
    }
    catch {
      case _: NumberFormatException => readFloat(prompt, min, max)
    }
  }

  @tailrec
  def readLong(prompt: String, min: Long, max: Long): Long = {
    print(prompt)
    try {
      val input = scala.io.StdIn.readLong()

      if (input < min || input > max) throw new NumberFormatException("Number must be within parameters")

      input
    }
    catch {
      case _: NumberFormatException => readLong(prompt, min, max)
    }
  }


  //2. Write a Scala Program based on the instruction below

  //print
  //Print a given String to the console. The String value displayed should be passed
  //in as a parameter.

  //readString
  //Display a given message String to prompt the user to enter in a String, then read
  //in the user response as a String and return that value. The prompt message
  //should be passed in as a parameter and the String value read in should be the
  //return value of the method.

  //readInt
  //Display a given message String to prompt the user to enter in an integer, then
  //read in the user response and return that integer value. The prompt message
  //value should be passed in as a parameter and the value that is read in should be
  //the return of the method.
  //Display a prompt to the user to enter an integer between a specified min and
  //max range, and read in an integer. If the user's number does not fall within the
  //range, keep prompting the user for new input until it does. The prompt message
  //and the min and max values should be passed in as parameters. The value read
  //in from the console should be the return of the method.

  //readDouble
  //Display a given message String to prompt the user to enter in a double, then
  //read in the user response and return that double value. The prompt message
  //value should be passed in as a parameter and the value that is read in should be
  //the return of the method.
  //Display a prompt to the user to enter a double between a specified min and max
  //range, and read in a double. If the user's number does not fall within the range,
  //keep prompting the user for new input until it does. The prompt message and
  //min and max values should be passed in as parameters. The value read in from
  //the console should be the return of the method.

  //readFloat
  //Display a given message String to prompt the user to enter a float and then read
  //in the user response and return that float value. The prompt message value
  //should be passed in as a parameter and the value that is read in should be the
  //return of the method.
  //Display a prompt to the user to enter a float between a specified min and max
  //range, and read in a float. If the user's number does not fall within the range,
  //keep prompting the user for new input until it does. The prompt message and
  //min and max values should be passed in as parameters. The value read in from
  //the console should be the return of the method.

  //readLong
  //Display a given message String to prompt the user to enter in a long, then read
  //in the user response and return that long value. The prompt message value
  //should be passed in as a parameter and the value that is read in should be the
  //return of the method.
  //Display a prompt to the user to enter a length between a specified min and max
  //range and read in a long. If the user's number does not fall within the range,
  //keep prompting the user for new input until it does. The prompt message and
  //min and max values should be passed in as parameters. The value read in from
  //the console should be the return of the method.
}
