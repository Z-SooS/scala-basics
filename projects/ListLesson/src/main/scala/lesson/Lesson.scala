package lesson

object Lesson {
  def main(args: Array[String]): Unit = {
    val (list1, list2) = getLists

    val combined = mergeLists(list1,list2)

    outputListForClassroom(combined.flatten)

    val numberList = getNumberList
    println(numberList)
  }

  //Write a Scala program to create two Lists data structures as follows:
  //The first List will have items named "pencil", "pen", "sharpener", and
  //The second List will have items name "math book", "french book", "english book".
  private def getLists:(List[String], List[String]) = (List("pencil", "pen", "sharpener"), List("math book", "french book", "english book"))

  //Merge the two List data structures such that the resulting combined data structure is of type List[List[String]].
  //Finally, output all items with the literal " is required in the classroom."
  private def mergeLists[T](lists: List[T]*) : List[List[T]] = lists.toList

  private def outputListForClassroom(l : List[Any]) : Unit = {
    l.foreach(printf("%s is required in the classroom.\n", _))
  }

  //Create a Scala program to represent a List with a sequence of number from 100 to 150.
  //You should omit the last numeric item of 150, and each numeric item should have a 10 numeric interval.
  private def getNumberList: List[Int] = List.range(100, 150, 10)
}
