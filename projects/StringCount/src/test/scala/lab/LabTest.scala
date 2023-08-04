package lab

import org.scalatest.funsuite.AnyFunSuite

class LabTest extends AnyFunSuite {
  test("checkOccurrences found the expected amount in all lowercase") {
    val testString = "This is a perfectly normal sentence with 4 counts of the letter i"
    val searchChar = 'i'
    val expectedResult = true

    val actualResult = Lab.checkOccurrences(testString, searchChar)

    assert(expectedResult equals actualResult)
  }

  test("checkOccurrences ignores case") {
    val testString = "iI"
    val searchChar = 'I'
    val expectedResult = true

    val actualResult = Lab.checkOccurrences(testString, searchChar)

    assert(expectedResult equals actualResult)
  }

  test("checkOccurrences finds special characters") {
    val testString = "Th%is is % a perfectly normal sentence%"
    val searchChar = '%'
    val expectedResult = true

    val actualResult = Lab.checkOccurrences(testString, searchChar)

    assert(expectedResult equals actualResult)
  }

  test("checkOccurrences returns false on too many or too few instances") {
    val tooManyString = "i".repeat(Lab.maxOccurrence+1)
    val tooManyExpectedResult = false

    val tooFewString = "i".repeat(if (Lab.maxOccurrence > 0) Lab.minOccurrence-1 else 0)
    val tooFewExpectedResult = false
    val searchChar = 'i'

    val tooManyActualResult = Lab.checkOccurrences(tooManyString, searchChar)
    val tooFewActualResult = Lab.checkOccurrences(tooFewString, searchChar)

    assert(tooManyActualResult equals tooManyExpectedResult, "Should return false on more than specified 'maxOccurrence+1'")
    assert(tooFewActualResult equals tooFewExpectedResult, "Should return false on less than specified 'minOccurrence-1 or 0'")
  }
}
