package repetition

import scala.collection.mutable

object Repetition {
  def main(args: Array[String]): Unit = {
    println(reverse(123456))
    println(sumFirstLast(-456))
    println(digitFrequency(111223))
    println(digitFrequency(-111223))
    println(digitFrequency(0))
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

  //Write a Scala program to find the frequency of each digit in each integer.
  //Hint: Use While Loop
  private def digitFrequency(n: Int): Map[Int, Int] = {
    val resultMutableMap = mutable.Map.empty[Int, Int]

    if (n == 0) {
      resultMutableMap.put(0, 1)
      return resultMutableMap.toMap
    }
    var digitCounter = 10
    var remainder = if (n > 0) n else n * -1

    while (remainder != 0) {
      val currentValue = remainder % digitCounter
      val currentDigit = getDigit(currentValue, digitCounter)

      resultMutableMap.put(currentDigit, resultMutableMap.getOrElse(currentDigit, 0) + 1)

      remainder = remainder - currentValue
      digitCounter = digitCounter * 10
    }

    resultMutableMap.toMap
  }
}
