package oop.subtask.beauty

object DiscountRate {
  private val serviceDiscountPremium: Double = 0.2
  private val serviceDiscountGold: Double = 0.15
  private val serviceDiscountSilver: Double = 0.1
  private val productDiscountPremium: Double = 0.1
  private val productDiscountGold: Double = 0.1
  private val productDiscountSilver: Double = 0.1

  private val checkServiceDiscount: PartialFunction[String, Double] = {
    case "Premium" => serviceDiscountPremium
    case "Gold" => serviceDiscountGold
    case "Silver" => serviceDiscountSilver
  }

  private val checkProductDiscount: PartialFunction[String, Double] = {
    case "Premium" => productDiscountPremium
    case "Gold" => productDiscountGold
    case "Silver" => productDiscountSilver
  }

  private val noDiscount: PartialFunction[String, Double] = {
    case _ => 0
  }

  val getServiceDiscountRate: PartialFunction[String, Double] = {
    checkServiceDiscount orElse noDiscount
  }
  val getProductDiscountRate: PartialFunction[String, Double] = {
    checkProductDiscount orElse noDiscount
  }
}