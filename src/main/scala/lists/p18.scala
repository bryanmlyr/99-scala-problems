package lists

object p18 {
  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    list.slice(i, k)
  }
}
