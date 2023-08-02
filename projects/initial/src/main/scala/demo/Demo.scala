package hu.zsoos.initial
package demo

object Demo {
  def main(args: Array[String]): Unit = {
    val s = scala.io.StdIn.readLine("Gib text:\n")

    printf("You said: %s", s)
  }
}
