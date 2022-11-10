package lists

import scala.language.postfixOps

object p26 {
  def combinations[T](n: Int, list: List[T]): List[List[T]] = {
    list.combinations(n).toList
  }
}
