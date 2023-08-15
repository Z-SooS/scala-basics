package oop.subtask.bus

abstract class Vehicle(name:String, capacity: Int) {

  def fare():Double = capacity*100

  override def toString: String = s"This is $name, it holds $capacity people, the fare is ${fare()}"
}
