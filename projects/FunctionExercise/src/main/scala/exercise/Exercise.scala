package exercise

import exercise.subtask._
object Exercise {
  def main(args: Array[String]): Unit = {
    Partial.runExercise()
    println()
    School.runExercise()
    println()
    CarInventory.runExercise()
  }
}
