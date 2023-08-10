package repetition

object Repetition {
  def main(args: Array[String]): Unit = {
    println(reverse(123456))
  }

  //Write a Scala program to reverse all the digits of numbers.
  //Hint: Use for Loop
  private def reverse(n: Int): Int = {
    val resultString: StringBuilder = new StringBuilder()
    val numberString = n.toString

    for (c <- numberString.length - 1 to 0 by -1) {
      resultString.append(numberString(c))
    }

    resultString.result().toInt
  }
}
