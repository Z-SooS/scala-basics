package concurrency

object Concurrency {
  def main(args: Array[String]): Unit = {
    val extendGroup = new ThreadGroup("Extend Thread")
    val runnableGroup = new ThreadGroup("Implement Runnable")


    val t1 = new MyThread(extendGroup, "Thread One")
    t1.setPriority(10)

    val t2 = new MyThread(extendGroup, "Thread Two")
    t2.setPriority(1)


    val myRunnable = new MyRunnable()
    val t3 = new Thread(runnableGroup, myRunnable)
    t3.setName("Runnable")

    t1.start()
    t2.start()
    t3.start()

    displayAllThreads()

    Futures.runActivity()
  }

  private def displayAllThreads(): Unit = {
    val threadMXBean = java.lang.management.ManagementFactory.getThreadMXBean

    val threads = threadMXBean.dumpAllThreads(false, false)

    threads.foreach(threadInfo => println(s"Thread: ${threadInfo.getThreadName}"))
  }
}
class MyThread(threadGroup: ThreadGroup, name: String) extends Thread(threadGroup, name) {
  override def run(): Unit = {
    for (i <- 1 to 10) {
      println(s"Hello this is thread ${this.getThreadGroup.getName} ${this.getName} iteration $i")
    }
  }
}

class MyRunnable extends Runnable {
  override def run(): Unit = {
    for (i <- 1 to 10) {
      println(s"Hello this is runnable iteration $i")
    }
  }
}
