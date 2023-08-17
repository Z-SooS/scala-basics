package concurrency

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success, Try}

object Futures {
  val ec = ExecutionContext.fromExecutor(new java.util.concurrent.ForkJoinPool(2))
  def runActivity(): Unit = {
    val repeater = new Repeater

    funnyNumber().onComplete(printFunnyNumber)(ec)

    repeater.run()
  }

  private def funnyNumber(): Future[Int] = Future {
    Thread.sleep(3000)
    420
  }(ec)

  private def printFunnyNumber[A](result: Try[A]):Unit = result match
    case Success(number) => println(s"funny number is: $number")
    case Failure(_) => println("This is not funny")
}


class Repeater extends Thread {
  override def run(): Unit = {
    for (i <- 1 to 100) {
      Thread.sleep(100)
      println("Repeater = " + i)
    }
  }
}
