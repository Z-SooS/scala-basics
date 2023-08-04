package lab

import scala.util.control.Breaks.break

object Lab {
  val minOccurrence = 2
  val maxOccurrence = 4
  private val quitString = ":q"

  def main(args: Array[String]):Unit = {
    var continue = true
    while(continue) {
      val textInput = scala.io.StdIn.readLine("What text would you like to search in?:")
      if (textInput equalsIgnoreCase quitString) continue = false

      if(continue) {
        print("What character to search for?:")
        val charInput = scala.io.StdIn.readChar()

        println(s"\nResult: ${checkOccurrences(textInput, charInput)}\n")
      }
    }
    println("Bye!")
  }

  def checkOccurrences(text: String, searchChar: Char) : Boolean = {
    val searchLowerCase:Char = searchChar.toLower
    val found: Int = text.toLowerCase().count(c => c == searchLowerCase)

    found >= minOccurrence && found <= maxOccurrence
  }
}
