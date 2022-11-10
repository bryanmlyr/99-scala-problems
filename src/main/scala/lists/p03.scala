package lists

object p03 {
  def nth[T](index: Int, list: List[T]): Option[T] = list.lift(index)
}
