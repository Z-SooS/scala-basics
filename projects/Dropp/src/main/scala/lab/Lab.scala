package lab

import scala.util.control.Breaks.break

object Lab {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5,6,7,8,9,10,1,2,3)

    println(dropWhile(l, (x:Int) => x < 5))
  }

  private def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    val result = scala.collection.mutable.ListBuffer.from(l)

    var itemFitsCondition = true
    var i = 0

    while(itemFitsCondition && i < result.length) {
      if(f(result(i))) result.remove(i)
      else itemFitsCondition = false
    }

    result.toList
  }
  //Implement dropWhile, which removes elements from the List prefix as long as
  //they match a predicate.
  //* def dropWhile[A](l: List[A], f: A => Boolean): List[A]
}
