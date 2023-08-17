package actors

import actors.OrderProcessor.Order
import akka.actor.{Actor, ActorSystem, Props}
import akka.event.Logging

//object Notifier {
//  final case class Notification(orderId: Int, shipmentSuccess: Boolean)
//
//  def apply(): Behavior[Notification] = Behaviors.receive {
//    (context, message) => {
//      println(message.toString)
//
//      Behaviors.same
//    }
//  }
//}
//
//object Shipper {
//  final case class Shipment(orderId: Int, product: String, number: Int, replyTo: ActorRef[Notification])
//
//  def apply():Behavior[Shipment] = Behaviors.receive {
//    (context, message) => {
//      context.log.info(message.toString)
//      message.replyTo ! Notification(message.orderId, true)
//      Behaviors.same
//    }
//  }
//}
//
//
//object OrderProcessor {
//  private final case class Order(id: Int, product: String, number: Int)
//
//  def apply(): Behavior[Order] = Behaviors.setup {
//    context => {
//
//      val shipperRef: ActorRef[Shipper.Shipment] = context.spawn(Shipper(), "shipper")
//      val notifier: ActorRef[Notifier.Notification] = context.spawn(Notifier(), "notifier")
//
//      Behaviors.receiveMessage {
//        message => {
//          context.log.info(message.toString)
//          shipperRef ! Shipment(message.id,message.product,message.number, notifier)
//          Behaviors.same
//        }
//      }
//    }
//  }
//}
class OrderProcessor extends Actor {
  private val log = Logging(context.system, this)

  override def receive: Receive = {
    case message: Order =>
      log.info(message.toString)
    case any: Any => log.warning("Incorrect message:" + any)
  }
  //  def apply(): Behavior[Order] = Behaviors.setup {
  //    context => {
  //
  //      val shipperRef: ActorRef[Shipper.Shipment] = context.spawn(Shipper(), "shipper")
  //      val notifier: ActorRef[Notifier.Notification] = context.spawn(Notifier(), "notifier")
  //
  //      Behaviors.receiveMessage {
  //        message => {
  //          context.log.info(message.toString)
  //          shipperRef ! Shipment(message.id,message.product,message.number, notifier)
  //          Behaviors.same
  //        }
  //      }
  //    }
  //  }
}

object OrderProcessor:
  final case class Order(id: Int, product: String, number: Int)
end OrderProcessor


object Actors {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val orderProcessor = system.actorOf(Props(new OrderProcessor()), name = "processor")



    //    val orderProcessor = ActorSystem(OrderProcessor(), "orders")
    orderProcessor ! Order(0, "Jacket", 2)
    orderProcessor ! Order(1, "Sneakers", 1)
    orderProcessor ! Order(2, "Socks", 5)
    orderProcessor ! Order(3, "Umbrella", 3)
    orderProcessor ! (1, "tuple", 4)

  }
}
