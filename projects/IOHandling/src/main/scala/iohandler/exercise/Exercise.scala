package iohandler.exercise

import java.io.{File, FileWriter}

object Exercise {
  //Write a Scala program to create and store information in a text file.
  //Sample Data:
  //Input a sentence for the file: This is the content of the file test.txt.
  // Expected Output:
  //The file test.txt created successfully...!!
  def sampleFile(): Unit = {
    val filename = "test.txt"

    val writer = new FileWriter(new File(filename))
    writer.write("This is the content of the file test.txt.")
    writer.close()
    println("The file test.txt created successfully...!!")
  }

}
