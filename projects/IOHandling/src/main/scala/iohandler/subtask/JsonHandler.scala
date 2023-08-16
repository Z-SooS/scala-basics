package iohandler.subtask

import ujson.{Arr, Value, read}

import scala.collection.mutable.ArrayBuffer

object JsonHandler {
  //You have a JSON string that represents an array of objects, and you need to deserialize it into objects you can use in your Scala application.
  //Hint: Use th ecase class to match the JSON data.
  private case class Person(id: Int, name: String)

  def runActivity(): Unit = {
    val jsonValue = getJsonValue

    val people = castToList(jsonValue)

    println(people)
  }

  private def castToList(jsonValue: ujson.Value): List[Person] = {
    val buffer = ArrayBuffer[Person]()

    jsonValue match
      case arr: Arr => buffer.addAll(
        arr.arr.map(
          jsObj => {
            Person(jsObj("id").num.toInt, jsObj("name").str)
          }
        )
      )
      case _ => println("!!!Invalid Json:" + jsonValue)

    buffer.toList
  }

  private def getJsonValue: ujson.Value = {
    try {
      val filename = "funni.json"
      val inputStream = getClass.getResourceAsStream(filename)

      val js = ujson.read(inputStream)
      inputStream.close()
      js
    } catch {
      case _: NullPointerException => ujson.read(defaultJsonString)
    }
  }

  private val defaultJsonString =
    """[{
      |		"id": 1,
      |		"name": "jason"
      |	},
      |	{
      |		"id": 2,
      |		"name": "misuta"
      |	}
      |]""".stripMargin
}
