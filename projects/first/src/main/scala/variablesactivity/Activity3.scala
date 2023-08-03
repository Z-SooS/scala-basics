package variablesactivity

object Activity3 {
  /**
   *
   * @param args = Command line argument, takes one number as amount of donuts to calculate
   */
  def main(args: Array[String]) :Unit = {
    val donutPrice = 2.5f
    var donutQuantity = 10

    if (args.length > 0) {
      try {
        donutQuantity = args(0).toInt
      }
      catch {
        case e: NumberFormatException => println(e);
      }
    }

    val resultPrice = donutPrice*donutQuantity

    printf("The price for %d Glazed Donut is: %.2f", donutQuantity, resultPrice)
  }

}
