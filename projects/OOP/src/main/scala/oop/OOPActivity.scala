package oop

import oop.subtask.*
import oop.subtask.beauty.{Customer, DiscountRate, Saloon}
import oop.subtask.bus.Bus

object OOPActivity extends App{
  private val chaos = BarelyControlledChaos()

  println(chaos.color())
  println(chaos.animal())
  println(chaos.numbers(10,99))

  println(Bus("busboy"))

  println(DiscountRate.getServiceDiscountRate("Premium"))
  println(DiscountRate.getServiceDiscountRate("Gold"))
  println(DiscountRate.getServiceDiscountRate("Silver"))
  println(DiscountRate.getServiceDiscountRate(""))

  val saloon = Saloon(chaos)
  saloon.run()
}
