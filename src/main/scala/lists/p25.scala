package lists

import scala.language.postfixOps
import scala.util.Random

object p25 {
  def randomPermute[T](list: List[T]): List[T] = {
    val rand = new Random()
    val value = rand.nextInt(list.permutations.length)
    val permutations = list.permutations

    permutations.zipWithIndex.find(_._2 == value).get._1
  }
}
