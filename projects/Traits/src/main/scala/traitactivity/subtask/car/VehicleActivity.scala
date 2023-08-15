package traitactivity.subtask.car

object VehicleActivity {
  // Write a Scala program that defines a base abstract class to model a Vehicle type
  // that has a public make property of type String. This particular Vehicle base class
  // will be extended by two sub-types, namely, a Car, and a Bike, case class, and will
  // wire accordingly the make property of type String from the Vehicle base class.
  // Next, create a singleton object named VehicleReport that will define a printVehicles
  // method that will have as input a List of Vehicle types, and any of its sub-types or sub-classes.
  // The printVehicles() method will simply iterate through each of the Vehicle types and
  // output its corresponding make property.
  // Note that the printVehicles() method will have no return type defined as such.

  //You can use the following vehicle samples to model your data points:
  //A car whose make is: bmw 3 series
  //A car whose make is: vw golf
  //A bike whose make is: bmw g 310 r bike
  //A bike whose make is: fire storm bike
  abstract class Vehicle(make: String) {

  }

  private case class Bike(make: String) extends Vehicle(make) {
    override def toString: String = s"A bike whose make is $make"
  }

  private case class Car(make: String) extends Vehicle(make) {
    override def toString: String = s"A car whose make is $make"
  }

  private object VehicleReport {
    def printVehicles(vehicles: List[Vehicle]):Unit = {
      vehicles.foreach(println)
    }
  }

  def runActivity(): Unit = {
    val vehicles = List(
      Car("bmw 3 series"),
      Car("vw golf"),
      Bike("bmw g 310 r bike"),
      Bike("fire storm bike")
    )

    VehicleReport.printVehicles(vehicles)
  }
}
