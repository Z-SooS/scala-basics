package oop

import oop.subtask.*
import oop.subtask.bus.Bus

object OOPActivity extends App{
  private val chaos = BarelyControlledChaos()

  println(chaos.color())
  println(chaos.animal())
  println(chaos.numbers(10,99))

  println(Bus("busboy"))
}
