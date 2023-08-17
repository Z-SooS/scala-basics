package concurrency

object Concurrency {
  def main(args: Array[String]): Unit = {
    val t1 = new MyThread()
    t1.setPriority(10)
    t1.setName("Thread One")
    val t2 = new MyThread()
    t2.setPriority(1)
    t2.setName("Thread Two")
    t1.start()
    t2.start()
  }

  class MyThread extends Thread {
    override def run(): Unit = {
      for (i <- 1 to 10) {
        println(s"Hello this is thread ${this.getName} iteration $i")
      }
    }
  }
}
