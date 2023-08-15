package exercise.subtask

object Partial {
  def runExercise(): Unit = {
    val names = Array("John", "Joe", "Jack", "Jill", "Bob")
    for (n <- names) {
      println(s"Name $n is valid = ${nameChecker.apply(n)}")
    }
  }

  val nameIsJohn: PartialFunction[String, Boolean] = {
    case "John" => true
  }
  val nameIsJoe: PartialFunction[String, Boolean] = {
    case "Joe" => true
  }
  val nameIsJackOrJill: PartialFunction[String, Boolean] = {
    case "Jack" | "Jill" => true
  }
  val nameIsInvalid: PartialFunction[String, Boolean] = {
    case _ => false
  }

  val nameChecker: PartialFunction[String, Boolean] = {
    nameIsJohn orElse nameIsJoe orElse nameIsJackOrJill orElse nameIsInvalid
  }
}
