package oop.subtask.bus

class Bus(name: String) extends Vehicle(name, 50) {

  override def fare(): Double = super.fare() * 1.1
}
