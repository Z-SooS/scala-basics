package exercise.subtask

import scala.annotation.tailrec

object School {
  private case class Student(name: String, age: Int)

  def runExercise(): Unit = {
    val students = List(
      Student("John", 7),
      Student("Jack", 13),
      Student("Joe", 15),
      Student("Jill", 15),
      Student("James", 11)
    )

    printStudents(students)
    println(s"Is there a student who is 15 years old = ${isThere15(students)}")
  }

  private def printStudents(studentsList: List[Student]): Unit = {
    studentsList.foreach(println)
  }

  
  @tailrec
  private def isThere15(studentList: List[Student]): Boolean = {
    if (studentList.isEmpty) return false
    if (studentList.head.age == 15) return true

    isThere15(studentList.tail)
  }



  //Write a Scala program and use a case class structure to represent the
  //following students: (1) John who is 7 years old, (2) Jack who is 13 years old,
  //(3) Joe who is 15 years old, (4) Jill who is 15 years old, and (5) James who is
  //11 years old. Use an appropriate data structure, and store the abovementioned students. Next, write a recursive method that will walk through
  //your data structure and output true for the first student that is of 15 years
  //old. If no students are found matching this particular criterion, the
  //recursive function should return false.
  //Expected Output:
  //Student(John,7)
  //Student(Jack,13)
  //Student(Joe,15)
  //Student(Jill,15)
  //Student(James,11)
  //Is there a student who is 15 years old = true
}
