package oop.subtask

class BarelyControlledChaos {
  //Create a class named BarelyControlledChaos  and implements the methods needed to complete it as stated below:
  //a.	Write a method that returns a randomly chosen color (have it choose from at LEAST five different colors!)
  //b.	Write a method that returns a randomly chosen animal (have it choose from at LEAST five different animals!)
  //c.	Write another method that returns a random integer chosen from a range (min/max) that can be either of the two numbers or anything between.
  //Hint: Create class named BarelyControlledChaos. and create 3 mthods color, animal and numbers.
  def color(): String = {
    val colors = Array("red", "white", "blue", "yellow", "green")
    colors(scala.util.Random.nextInt(colors.length))
  }

  def animal(): String = {
    val animals = Array("fox", "dog", "cat", "bird", "mouse")
    animals(scala.util.Random.nextInt(animals.length))
  }

  def numbers(a: Int, b: Int): Int = {
    scala.util.Random.between(a,b+1)
  }

  def pickFromSequence[A](l: Seq[A]): A = {
    val max = l.length
    l(scala.util.Random.nextInt(max))
  }
}
