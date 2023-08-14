package lab

import scala.util.control.Breaks.break

object Lab {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5,6,7,8,9,10,1,2,3)
    val l2:List[Int] = List()

    println(dropWhile(l, (x:Int) => x < 5))
    println(dropWhile(l2, (x:Int) => x < 5))
  }

  private def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    if(l.length<=0) return l

    val result = scala.collection.mutable.ListBuffer.from(l)

    var itemFitsCondition = true

    while(itemFitsCondition) {
      if(f(result.head)) result.remove(0)
      else itemFitsCondition = false
    }

    result.toList
  }
  //Implement dropWhile, which removes elements from the List prefix as long as
  //they match a predicate.
  //* def dropWhile[A](l: List[A], f: A => Boolean): List[A]
}
