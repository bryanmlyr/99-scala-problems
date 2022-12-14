package lists

object p15 {
  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list.flatMap { elem =>
      List.fill(n)(elem)
    }
  }
}
