package simpletest

object Hello extends App{
  val p = new Person("Alvin Alexander")
  println(s"Hello ${p.name}")
}

class Person(var name: String)
