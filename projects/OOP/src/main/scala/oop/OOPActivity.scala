package oop

import oop.subtask.*

object OOPActivity extends App{
  private val chaos = BarelyControlledChaos()

  println(chaos.color())
  println(chaos.animal())
  println(chaos.numbers(10,99))
}
