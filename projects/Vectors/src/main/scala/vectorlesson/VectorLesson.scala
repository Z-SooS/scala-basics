package vectorlesson

object VectorLesson {
  def main(args: Array[String]): Unit = {
    minMaxVector()
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
}
