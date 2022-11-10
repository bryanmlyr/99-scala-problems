package lists

object p16 {
  def drop[T](n: Int, list: List[T]): List[T] = {
    list.grouped(n).flatMap { elem =>
      if (elem.length == n)
        elem.init
      else
        elem
    }.toList
  }
}
