package lists

object p17 {
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    list.splitAt(n)
  }
}
