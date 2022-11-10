package lists

import scala.util.Random

object p23 {
  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    val rand = new Random()
    (0 until n).map { _ =>
      list(rand.nextInt(n))
    }.toList
  }
}
