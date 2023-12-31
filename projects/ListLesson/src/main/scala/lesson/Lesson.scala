package lesson

object Lesson {
  def main(args: Array[String]): Unit = {
    val (list1, list2) = getLists

    val combined = mergeLists(list1,list2)

    outputListForClassroom(combined.flatten)

    val numberList = getNumberList
    println(numberList)

    println(sumNumberList(numberList))

    generateLists()
    deleteElements()
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

  //You should then calculate the sum of all the numeric items in the List.
  private def sumNumberList(numbers: List[Int]):Int = {
    //l.sum
    var s = 0
    for (num <- numbers) s += num
    s
  }

  //Write a Scala program to create a list in different ways
  private def generateLists():Unit = {
    val l1 = List(1,2,3,4,5)
    println(l1)

    val l2 = 6::7::8::9::10::Nil
    println(l2)

    val empty = List.empty
    println("empty"+empty)


    val fill = List.fill(5)(10)
    println("fill\n"+fill)

    val concat = l1 ++ l2
    val concat2 = l1 ::: l2

    println("Concat")
    println(concat)
    println(concat2)

    val listRange1 = (0 to 10 by 2).toList
    val listRange2 = List.range(1,9,2)

    println("Range")
    println(listRange1)
    println(listRange2)
  }

  //Write a Scala program to delete the element(s) from a given List.
  private def deleteElements():Unit = {
    println("Deleting elements\n")

    val originalList = List(1,2,3,4,5)

    val filtered = originalList.filter(x => x == 2 || x == 4)
    println("filtered\n"+filtered)

    val filterNot = originalList.filterNot(x => x == 2 || x == 4)
    println("filterNot\n"+filterNot)

    val dropped = originalList.drop(2)
    println("dropped\n"+dropped)
  }
}
