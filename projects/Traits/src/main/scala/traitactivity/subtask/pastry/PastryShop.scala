package traitactivity.subtask.pastry

object PastryShop {
  // Write a Scala program and use an abstract class to model a Donut pastry with a name
  // property of type String, and having also a printName() method that does not have a
  // return type. Use Scala's case class construct to define two sub-classes of the abstract
  // Donut class to define two additional types, namely, a VanillaDonut, and a GlazedDonut.
  private abstract class Donut(protected val name: String) {
    def printName(): Unit
  }

  private case class VanillaDonut() extends Donut("Vanilla Donut") {
    override def printName(): Unit = println(name)
  }

  private case class GlazedDonut() extends Donut("Glazed Donut") {
    override def printName(): Unit = println(name)

  }

  // Next,create a class that accepts an upper type bound for a Donut type as its constructor argument.
  // This particular Pastry class will further have a name() method that basically calls a given
  // pastry's printName() method - that is of course derived from the upper type bound constraint
  //   that is applied to the Pastry's constructor argument. With the above classes defined, create two instances
  //   of Pastry, one with an upper type bound constraint of VanillaDonut,
  //   whereas the other, is bound to the abstract Donut type.
  private class Pastry[A <: Donut](donut: A) {
    def name(): Unit = {
      donut.printName()
    }
  }

  def runExercise(): Unit = {
    val pastryVanilla: Pastry[VanillaDonut] = Pastry[VanillaDonut](VanillaDonut())
    val pastryDonut: Pastry[Donut] = Pastry[Donut](GlazedDonut())

    pastryVanilla.name()
    pastryDonut.name()
  }

}
