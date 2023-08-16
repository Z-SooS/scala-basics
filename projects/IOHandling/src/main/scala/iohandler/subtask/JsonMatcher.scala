package iohandler.subtask

import scala.util.matching.Regex

object JsonMatcher {
  def runActivity(): Unit = {
    val pattern = """"name"\s*:\s*"([^"]+)"""".r
//    val pattern = """_""".r
    val jsonString =
      """
        |[
        |  { "id": 1, "name": "jason" },
        |  { "id": 2, "name": "misuta" }
        |]
        """.stripMargin

    if(jsonContainsPattern(jsonString, pattern)) {
      println("The input does contain pattern")
    } else {
      println("The input does not contain pattern")
    }
  }

  private def jsonContainsPattern(input: String, pattern: Regex): Boolean = {
    println(s"input is $input")
    println(s"pattern is $pattern")
    try {
      val json: ujson.Value = ujson.read(input)
      println(json)
      json.str match
        case pattern(_*) => true
        case _ => false
    } catch {
      case _: Exception => false
    }
  }
}
