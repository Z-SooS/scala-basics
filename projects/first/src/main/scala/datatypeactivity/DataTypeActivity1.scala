package datatypeactivity

object DataTypeActivity1 {
  def main(args: Array[String]): Unit = {
    val upperLimit = 20
    val lowerLimit = 10
    val rand = scala.util.Random

    val seqAny = Seq(
      "James", rand.between(lowerLimit,upperLimit),
      "Andy", rand.between(lowerLimit,upperLimit),
      "Tommy", rand.between(lowerLimit,upperLimit),
      "Bob", rand.between(lowerLimit,upperLimit),
      "Sam", rand.between(lowerLimit,upperLimit)
    )
    val seqTuple: Seq[(String, Int)] = Seq(
      ("James", rand.between(lowerLimit,upperLimit)),
      ("Andy", rand.between(lowerLimit,upperLimit)),
      ("Tommy", rand.between(lowerLimit,upperLimit)),
      ("Bob", rand.between(lowerLimit,upperLimit)),
      ("Sam", rand.between(lowerLimit,upperLimit))
    )

    println("\nWith type 'Any'")
    for (i <- seqAny.indices by 2) {
      printf("%s: %s\n", seqAny(i), seqAny(i+1))
    }

    println("\nWith type 'Tuple'")
    for (i <- seqTuple.indices) {
      printf("%s: %s\n", seqTuple(i)._1, seqTuple(i)._2)
    }
  }

}
