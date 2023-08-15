package oop.subtask.beauty

class Customer(private val name: String) {
  private var member: Boolean = false
  private var memberType: String = ""
  
  def this(name:String, memberType: String) = {
    this(name)
    this.member = true
    this.memberType = memberType
  }

  def getName: String = name

  def isMember: Boolean = member

  def setMember(newValue: Boolean): Unit = {
    member = newValue
  }

  def getMemberType: String = memberType

  def setMemberType(newType: String): Unit = {
    memberType = newType
  }

  override def toString: String = s"$name, isMember: $member, what type: $memberType"
}
