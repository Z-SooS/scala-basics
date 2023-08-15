package oop.subtask.beauty

import oop.subtask.BarelyControlledChaos

import java.util.Date
import scala.collection.mutable.ArrayBuffer

class Saloon(chaos: BarelyControlledChaos) {
  def run(): Unit = {
    val customers = generateCustomers
    val visits = generateVisits(customers)

    println("Visits:")
    visits.foreach(println)
  }

  private def generateCustomers: List[Customer] = {
    val customerNone = Customer("Nonn Memberson")
    val customerPremium = Customer("Sparkles", "Premium")
    val customerGold = Customer("Richard", "Gold")
    val customerSilver = Customer("Gray", "Silver")

    List(
      customerNone,
      customerPremium,
      customerGold,
      customerSilver
    )
  }
  
  private def generateVisits(customers: Seq[Customer]): List[Visit] = {
    val date = new Date()
    
    val visits = ArrayBuffer[Visit]()
    val numberOfVisits = 100
    
    for (_ <- 0 to numberOfVisits) {
      val visitNew = Visit(chaos.pickFromSequence(customers), date)
      visitNew.setServiceExpense(100)
      visitNew.setProductExpense(10)
      visits.addOne(visitNew)
    }
    
    visits.toList
  }
}
