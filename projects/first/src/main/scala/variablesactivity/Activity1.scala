package variablesactivity

object Activity1 {

  /**
   *
   * @param args Command line argument, takes three arguments as 'name: String' 'amount: Int' 'price: Float'
   */
  def main(args: Array[String]): Unit = {

    val defaultName = "Default Donut"
    val defaultQuantity: Int = 1
    val defaultPrice = 2.5f

    var donutName = defaultName
    var donutQuantity = defaultQuantity
    var donutPrice = defaultPrice

    if (args.length >= 3) {
      try {
        donutName = args(0)
        donutQuantity = args(1).toInt
        donutPrice = args(2).toFloat
      }
      catch {
        case e: NumberFormatException => println(e);donutName = defaultName;donutPrice=defaultPrice;donutQuantity=defaultQuantity
      }
    }

    printDonutInfo(donutName, donutQuantity, donutPrice)
  }

  private def printDonutInfo(name: String, quantity: Int, price: Float): Unit = {
    printf("\"donut_name\":\"%s\"\n", name)
    printf("\"quantity_purchased\":\"%d\"\n", quantity)
    printf("\"price\":\"%.2f\"\n\n", price)
  }
}
