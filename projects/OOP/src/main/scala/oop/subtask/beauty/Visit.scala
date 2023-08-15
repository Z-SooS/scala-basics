package oop.subtask.beauty

import java.util.Date

class Visit(val customer: Customer, val date: Date) {
  private var serviceExpense: Double = 0
  private var productExpense: Double = 0

  def getServiceExpense: Double = serviceExpense

  def getProductExpense: Double = productExpense

  def setServiceExpense(price: Double): Unit = {
    val discounted =
      if (customer.isMember) price - (price * DiscountRate.getServiceDiscountRate(customer.getMemberType))
      else price

    serviceExpense = discounted
  }

  def setProductExpense(price: Double): Unit = {
    val discounted =
      if (customer.isMember) price - (price * DiscountRate.getProductDiscountRate(customer.getMemberType))
      else price

    productExpense = discounted
  }

  def getTotalExpense: Double = {
    serviceExpense + productExpense
  }

  override def toString: String = s"$date|S:$serviceExpense|P:$productExpense|T:$getTotalExpense\n\t$customer"
}
