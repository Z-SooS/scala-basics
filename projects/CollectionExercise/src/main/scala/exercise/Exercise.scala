package exercise

import exercise.subtasks.{IOHandler, States}

object Exercise {
  def main(args: Array[String]): Unit = {
    States.printStates()
    States.printCapitals()
    States.printStateWithCapital()

    val n = IOHandler.readDouble("Give me number", -100, 100)
    IOHandler.print(s"Number: $n")
  }

}
