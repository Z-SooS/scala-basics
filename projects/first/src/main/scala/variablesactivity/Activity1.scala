package variablesactivity

object Activity1 {
    def main(args: Array[String]): Unit = {
    val donut1Name = "Vanilla Donut"
    val donut1Quantity : Int = 10
    val donut1Price = 2.5f

    val donut2 = ("Glazed Donut", 10, 2.5f)

    printDonutInfo(donut1Name, donut1Quantity, donut1Price)
    printDonutInfo(donut2._1, donut2._2, donut2._3)
  }

  private def printDonutInfo(name: String, quantity: Int, price: Float): Unit = {
    printf("\"donut_name\":\"%s\"\n", name)
    printf("\"quantity_purchased\":\"%d\"\n", quantity)
    printf("\"price\":\"%.2f\"\n\n", price)
  }
}
