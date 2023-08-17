package actors

import actors.OrderProcessor.Order
import actors.Shipper.{Shipment, ShipmentMessage}
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.event.Logging

class Shipper extends Actor {
  private val log = Logging(context.system, this)

  override def receive: Receive = {
    case message: Shipment =>
      println(s"Working on order: ${message.orderId}|${message.product}|${message.number}")
      sender() ! ShipmentMessage(message.orderId, "Successfully shipped")
    case any: Any => log.warning("Incorrect shipment message:" + any)
  }
}

object Shipper:
  final case class Shipment(orderId: Int, product: String, number: Int)
  final case class ShipmentMessage(orderId: Int, shipmentInfo: String)
end Shipper


class OrderProcessor(shipperRef: ActorRef) extends Actor {
  private val log = Logging(context.system, this)

  override def receive: Receive = {
    case addedOrder: Order =>
      log.info(addedOrder.toString)
      shipperRef ! Shipment(addedOrder.id, addedOrder.product, addedOrder.number)
    case reply: ShipmentMessage =>
      log.info(s"Order ${reply.orderId}: ${reply.shipmentInfo}")
    case any: Any => log.warning("Incorrect order message:" + any)
  }
}

object OrderProcessor:
  final case class Order(id: Int, product: String, number: Int)
end OrderProcessor


object Actors {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val shipper = system.actorOf(Props(new Shipper), name = "shipper")
    val orderProcessor = system.actorOf(Props(new OrderProcessor(shipper)), name = "processor")



    //    val orderProcessor = ActorSystem(OrderProcessor(), "orders")
    orderProcessor ! Order(0, "Jacket", 2)
    orderProcessor ! Order(1, "Sneakers", 1)
    orderProcessor ! Order(2, "Socks", 5)
      orderProcessor ! Order(3, "Umbrella", 3)
    //    orderProcessor ! (1, "tuple", 4)

  }
}
