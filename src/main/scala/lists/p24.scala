package lists

import scala.language.postfixOps
import scala.util.Random

object p24 {
  def lotto(n: Int, max: Int): List[Int] = {
    val rand = new Random()

    0 until n map { _  =>
      rand.nextInt(max)
    } toList
  }
}
