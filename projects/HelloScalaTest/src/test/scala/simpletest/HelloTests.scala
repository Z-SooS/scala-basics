package simpletest

import org.scalatest.funsuite.AnyFunSuite

class HelloTests extends AnyFunSuite {
  //test1
  test("The name is set correctly in constructor") {
    val expectedName = "Barney Rubble"
    val p = new Person(expectedName)
    assert(p.name == expectedName)
  }

  //test2
  test("Person's name can be changed") {
    val originalName = "Chad Johnson"
    val changedName = "Ochocinco"
    val p = new Person(originalName)
    p.name = changedName
    assert(p.name == changedName)
  }
}
