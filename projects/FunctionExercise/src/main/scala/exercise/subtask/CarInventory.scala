package exercise.subtask

object CarInventory {
  private case class Car(name: String, price: Double)

  private type CarStock = (Car, Int)

  def runExercise(): Unit = {
    val carInventory = List(
      (Car("vw passat", 10.000), 100),
      (Car("vw golf", 12.000), 50),
      (Car("bmw 3 series", 20.000), 200),
      (Car("bmw 5 series", 50.000), 75),
      (Car("mazda 3 series", 15.000), 49),
    )

    printCars(carInventory)
  }

  private def printCars(cars: List[CarStock]): Unit = {
    cars.foreach((car, inv) => println(s"a ${car.name} with price of ${car.price} and stock of $inv"))
  }

  //Write a Scala program to simulate a very basic car inventory. In doing so,
  //use a case class to represent a Car type that needs to have a name
  //property of type String, and a price property of type Double. Thereafter
  //you should define an aliased type named CarStock that will in effect, alias,
  //Scala's Tuple2 type and represent a tuple or pair of Car and Int. The
  //former is obviously the above-mentioned Car type, and the Int type
  //represents the current stock inventory for a particular Car item. You
  //should then define a create the following car stock items, and use an
  //appropriate data structure from Scala's Collection types.
  //- a vw passat with price of 10,000 and stock of 100
  //- a vw golf with price of 12,000 and stock of 50
  //- a bmw 3 series with price of 20,000 and stock of 200
  //- a bmw 5 series with price of 50,000 and stock of 75
  //- a mazda 3 series with price of 15,000 and stock of 49
}
