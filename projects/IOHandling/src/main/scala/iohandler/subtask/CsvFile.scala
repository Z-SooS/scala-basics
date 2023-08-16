package iohandler.subtask

import com.opencsv.CSVReader

import java.io.InputStreamReader
import scala.jdk.CollectionConverters._

object CsvFile {
  //You want to process the lines in a CSV file in Scala, either handling one line at a time
  //or storing them in a two-dimensional array. How to process a CSV file in Scala.
  //Hint: Use the getLines method to retrieve the values.

  def runActivity(): Unit = {
    //sbt specific
    val filename = "/trial.csv"
    val csvStream = getClass.getResourceAsStream(filename)

    try {
      val reader = new CSVReader(new InputStreamReader(csvStream, "UTF-8"))

      val lines = reader.readAll().asScala
      //if header
      //val lines = reader.readAll().toArray().tail


      for (line <- lines) {
        val Array(id, firstName, lastName, email) = line
        println(s"$id|$firstName $lastName|$email")
      }

      reader.close()
    } catch {
      case npe: NullPointerException => println("File not found\n"+npe)
    }
  }
}
