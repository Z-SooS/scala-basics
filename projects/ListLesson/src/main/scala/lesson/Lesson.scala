package lesson

object Lesson {
  def main(args: Array[String]): Unit = {
    val (list1, list2) = getLists

  }

  //Write a Scala program to create two Lists data structures as follows:
  //The first List will have items named "pencil", "pen", "sharpener", and
  //The second List will have items name "math book", "french book", "english book".
  private def getLists:(List[String], List[String]) = (List("pencil", "pen", "sharpener"), List("math book", "french book", "english book"))
}
