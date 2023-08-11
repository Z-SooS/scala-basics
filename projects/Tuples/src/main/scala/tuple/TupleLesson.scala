package tuple

object TupleLesson {
  //Write a Scala program and use the Tuple type to represent items in a shopping basket:
  //"T-Shirt", "Medium", 10.99
  //"Polo-Shirt", "Large", 4.99
  //"Vest", "Small", 5.99
  //"T-Shirt,” "Small,” 4.99
  //"T-Shirt,” "Small,” 4.99
  def main(args: Array[String]): Unit = {
    val items = Array(
      ("T-Shirt", "Medium", 10.99),
      ("Polo-Shirt", "Large", 4.99),
      ("Vest", "Small", 5.99),
      ("T-Shirt", "Small", 4.99),
      ("T-Shirt", "Small", 4.99)
    )
    displayTShirts(items)

    carInventory()
  }


  //You are free to use whatever data structure is appropriate to store the items mentioned above.
  //The Scala program should then output all "T-Shirt" items in an upper-case format.
  //Note that all other items in the shopping basket should be in lower-case form.
  private def displayTShirts(items: Array[(String, String, Double)]): Unit = {
    for ((name, size, price) <- items) {
      if (name.toUpperCase() == "T-SHIRT")
        println(s"${name.toUpperCase()}, ${size.toUpperCase()}, $price")
      else
        println(s"${name.toLowerCase()}, ${size.toLowerCase()}, $price")
    }
  }

  //Write a Scala program to simulate an actual car inventory.
  //In doing so, use a case class to represent a Car type that needs to have a name property of type String and a price property of type Double.
  //After that, it would help if you defined an aliased type named CarStock that will,
  //in effect, alias Scala's Tuple2 type and represent a tuple or pair of Car and Int.
  //The former is the Car mentioned above type, and the Int type means the current stock inventory for a particular Car item.
  //You should then define a create the following car stock items and use an appropriate data structure from Scala's Collection types.
  private case class Car(name: String, price: Double)
  private type CarStock = (Car, Int)

  private def carInventory(): Unit = {
    val data = getCarStockData

    displayCarList(data)
    println("\nActivity 4\n")
    displayCarList(orderByLowestStock(data))
  }

  private def displayCarList(list: List[CarStock]):Unit = {
    for ((car, stock) <- list)
      println(s"- a ${car.name} with the price of ${car.price} and stock of $stock")
  }

  //Create a method named orderByLowestStock which will input the Collection data structure of cars
  //to stock and order the car items from the collection by the lowest or minimum stock quantity.
  private def orderByLowestStock(list: List[CarStock]):List[CarStock] = {
    list.sortBy(t => t._2)
  }

  private def getCarStockData:List[CarStock] =
    List(
      (Car("VW Passat", 10000), 100),
      (Car("VW Golf", 12000), 50),
      (Car("BMW 3 series", 20000), 200),
      (Car("BMW 5 series", 50000), 75),
      (Car("Mazda 3 series", 15000), 49)
    )

}
