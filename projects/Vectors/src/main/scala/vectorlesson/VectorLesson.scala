package vectorlesson

object VectorLesson {
  def main(args: Array[String]): Unit = {
    minMaxVector()
    vectorReverse()
  }

  //Create a Vector with the following numeric items:
  // 0, 10, 20, 47, -2, 99, -98.
  // Write a Scala program to find the smallest and the largest numeric item in the Vector.
  private def minMaxVector(): Unit = {
    val v = Vector(0, 10, 20, 47, -2, 99, -98)

    // This does not feel in spirit of the lesson
    // sorted.head?
    println(s"The smallest item in the vector is ${v.min}")
    println(s"The largest item in the vector is ${v.max}")
  }

  //Write a Scala program to create an object of Vector collection.
  //Then we will reverse the vector elements using
  //the reverse() method and print the reversed vector on the console screen.
  private def vectorReverse(): Unit = {
    val v = Vector("first", "second", "third")

    println(s"Original vector:\n$v")
    println(s"Reversed vector:\n${v.reverse}")
  }
}
