package iohandler

import com.opencsv.CSVReader
import iohandler.lab.Lab
import iohandler.subtask.{CsvFile, JsonHandler, JsonMatcher}
import iohandler.exercise.Exercise

import java.io.InputStreamReader

object Main {
  def main(args: Array[String]): Unit = {
//    runWithSbt()
    runCurrentFile()
  }

  private def runWithSbt(): Unit = {
    CsvFile.runActivity()
    JsonHandler.runActivity()
    JsonMatcher.runActivity()
  }

  private def runCurrentFile(): Unit = {
    Lab.runActivity()
    Exercise.sampleFile()
  }

  private def messingAround(): Unit = {
    val filename = "/trial.csv"
    val csvStream = getClass.getResourceAsStream(filename)

    val json = ujson.Arr(ujson.Obj("id" -> 1, "name" -> "jason"))
    println(ujson.write(json, indent = 4))

    val reader = new CSVReader(new InputStreamReader(csvStream, "UTF-8"))
    try {
      val iter = reader.iterator()
      while (iter.hasNext) {
        val Array(id, firstName, lastName, email) = iter.next()
        println(s"$id|$firstName $lastName|$email")
      }
    } finally {
      reader.close()
    }
  }
}

