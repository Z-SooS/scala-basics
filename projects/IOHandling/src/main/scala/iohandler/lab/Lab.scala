package iohandler.lab

import scala.io.Source
object Lab {
  def runActivity(): Unit = {
    val filename = "./src/main/resources/funnyfile.txt"
    val source = Source.fromFile(filename)

    for (line<- source.getLines()) {
      println(line)
    }

    source.close()
  }
}
