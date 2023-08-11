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

}
