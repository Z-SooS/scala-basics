package oop.subtask.beauty

import java.util.Date

class VisitTest extends org.scalatest.funspec.AnyFunSpec {
  describe("Visit::constuctor") {
    it("should save same Customer object") {
      val expectedCustomer: Customer = Customer("expected customer", "expected member type")
      val testVisit = Visit(expectedCustomer, new Date())

      val actualCustomer = testVisit.customer

      assert(expectedCustomer eq actualCustomer)
    }
    it("should save exact values as customer") {
      val expectedCustomer: Customer = Customer("expected customer", "expected member type")
      val testVisit = Visit(expectedCustomer, new Date())

      val actualCustomer = testVisit.customer

      assert(expectedCustomer equals actualCustomer)
    }
    it("should save passed date") {
      val expectedDate = new Date()
      val testVisit = Visit(Customer("_"), expectedDate)

      val actualDate = testVisit.date

      assert(expectedDate equals actualDate)
    }
  }
  describe("Visit::get/set serviceExpense") {
    it("should change and return serviceExpense values correctly") {
      val customerMembership = "Premium"
      val testVisit = Visit(Customer("_", customerMembership), new Date())
      val origialExpense = 100
      //Do not know how to mock it
      val expectedExpense = origialExpense - (origialExpense * DiscountRate.getServiceDiscountRate(customerMembership))

      testVisit.setServiceExpense(origialExpense)
      val actualExpense = testVisit.getServiceExpense

      assert(expectedExpense equals actualExpense)
    }
    it("should throw exception on negative input") {
      val testVisit = Visit(Customer("_"), new Date())
      val setValue = -1000

      assertThrows[IllegalArgumentException] {
        testVisit.setServiceExpense(setValue)
      }
    }
  }
  describe("Visit::get/set productExpense") {
    it("should change and return serviceExpense values correctly") {
      val customerMembership = "Premium"
      val testVisit = Visit(Customer("_", customerMembership), new Date())
      val origialExpense = 100
      //Do not know how to mock it
      val expectedExpense = origialExpense - (origialExpense * DiscountRate.getProductDiscountRate(customerMembership))

      testVisit.setProductExpense(origialExpense)
      val actualExpense = testVisit.getProductExpense

      assert(expectedExpense equals actualExpense)
    }
    it("should throw exception on negative input") {
      val testVisit = Visit(Customer("_"), new Date())
      val setValue = -1000

      assertThrows[IllegalArgumentException] {
        testVisit.setProductExpense(setValue)
      }
    }
  }
}
