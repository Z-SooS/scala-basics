package exercise.subtask

object Pastry {
  private abstract class Donut(name: String) {
    def printName(): Unit
  }

  private case class VanillaDonut(name: String) extends Donut(name):
    override def printName(): Unit = println(s"Vanilla Donut : $name")

  private case class GlazedDonut(name: String) extends Donut(name):
    override def printName(): Unit = println(s"Glazed Donut : $name")

  private class Pastry[A <: Donut](pastry: A) {
    def name(): Unit = pastry.printName()
  }

  def runExercise(): Unit = {

    val pastry1 = new Pastry[VanillaDonut](VanillaDonut("Classic"))
    val pastry2 = new Pastry[Donut](GlazedDonut("Chocolate"))

    pastry1.name()
    pastry2.name()
  }

  //Write a Scala program and use an abstract class to model a Donut pastry
  //with a name property of type String, and having also a printName()
  //method that does not have a return type. Use Scala's case class construct
  //to define two sub-classes of the abstract Donut class to define two
  //additional types, namely, a VanillaDonut, and a GlazedDonut. Next, create
  //a class that accepts an upper type bound for a Donut type as its
  //constructor argument. This particular Pastry class will further have a
  //name() method that basically calls a given pastry's printName() method -
  //that is of course derived from the upper type bound constraint that is
  //applied to the Pastry's constructor argument. With the above classes
  //defined, create two instances of Pastry, one with an upper type bound
  //constraint of VanillaDonut, whereas the other, is bound to the abstract
  //Donut type. You will have to respectively pass-through corresponding
  //objects - that is, a VanillaDonut, and a GlazedDonut - to the two Pastry
  //instances, and thereafter call the Pastry's name() method.
  //Expected Output:
  //Vanilla Donut
  //Glazed Donut
}
