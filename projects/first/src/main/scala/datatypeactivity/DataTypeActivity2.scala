package datatypeactivity

object DataTypeActivity2 {
  // Takes number as argument instead of asking
  def main(args: Array[String]):Unit={
    val numbersToCheckAgainst = Seq(100,300)
    val maxDifference = 20

    var invalidArg = true
    var number = 0

    printf("Checking if number is within %d of %s\n", maxDifference, numbersToCheckAgainst.mkString(" or "))

    if (args.length > 0) {
      try {
        number = args(0).toInt
        invalidArg = false
      }
      catch {
        case e: NumberFormatException => println(e);
      }
    }

    if(invalidArg) {
      println("Please supply a number to check")
      number = scala.io.StdIn.readInt()
    }

    println("Checking for number "+number)

    val isWithinRange = numbersToCheckAgainst.exists(n => number <= n + maxDifference && number >= n - maxDifference)
    if (isWithinRange) {
      println("Yes it is in range")
    } else {
      println("No it is not in range")
    }
  }
}
