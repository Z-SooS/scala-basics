package oop.subtask.beauty

class CustomerTest extends org.scalatest.funsuite.AnyFunSuiteLike {
  test("getName returns expected name") {
    val expectedName = "test man"
    val customer = Customer(expectedName)

    val actualName = customer.getName

    assert(expectedName equals actualName)
  }
  test("isMember returns expected boolean") {
    val expectedMemberValue = true
    val customer = Customer("", "")

    val actualMemberValue = customer.isMember

    assert(expectedMemberValue equals actualMemberValue)
  }
  test("getMemberType returns expected type") {
    val expectedType = "Gold"
    val customer = Customer("_", expectedType)

    val actualType = customer.getMemberType

    assert(expectedType equals actualType)
  }
  test("Constructor with name only leaves 'member' boolean variable as 'false'") {
    val expectedMemberValue = false
    val customer = Customer("_")
    
    val actualMemberValue = customer.isMember
    
    assert(expectedMemberValue equals actualMemberValue)
  }
  test("Constructor with name only leaves 'memberType' string variable as empty String") {
    val expectedMemberType = ""
    val customer = Customer("_")

    val actualMemberType = customer.getMemberType

    assert(expectedMemberType equals actualMemberType)
  }
  test("Constructor with name and type sets 'member' boolean as 'true'") {
    val expectedMemberValue = true
    val customer = Customer("_", "Gold")

    val actualMemberValue = customer.isMember
    
    assert(expectedMemberValue equals actualMemberValue)
  }
  test("setMember correctly sets value") {
    val customer = Customer("_")
    val originalMember = customer.isMember
    val expectedMember = !originalMember
    
    customer.setMember(expectedMember)
    val actualMember = customer.isMember
    
    assert(expectedMember equals actualMember)
  }
  test("setMemberType correctly sets value") {
    val customer = Customer("_")
    val expectedMember = "_"
    
    customer.setMemberType(expectedMember)
    val actualMemberType = customer.getMemberType
    
    assert(expectedMember equals actualMemberType)
  }

}
