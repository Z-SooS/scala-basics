package repetition

object Repetition {
  def main(args: Array[String]): Unit = {
    println(reverse(123456))
    println(sumFirstLast(-456))
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

  //Write a Scala program to find the sum of the first and last digit of a number
  //Hint: Use While Loop
  private def sumFirstLast(n: Int): Byte = {
    var result = n % 10
    var digitCounter = 100
    var remainder = n - result

    while (remainder != 0) {
      val currentDigitValue = remainder % digitCounter

      if (remainder - currentDigitValue == 0) result += getDigit(currentDigitValue, digitCounter)

      remainder = remainder - currentDigitValue
      digitCounter = digitCounter * 10
    }

    result.toByte
  }

  private def getDigit(currentValue: Int, currentCounter: Int): Byte = {
    (currentValue / (currentCounter / 10)).toByte
  }
}
