package lists

object p02 {
  def penultimate[T](list: List[T]): T = list.init.last
}
