package lists

object p14 {
  def duplicate[T](list: List[T]): List[T] = {
    list.flatMap { elem =>
      List.fill(2)(elem)
    }
  }
}
