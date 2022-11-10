package lists

object p10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    p09.pack(list).map { elem =>
      val length: Int = elem.size
      val value: T = elem.head

      (length, value)
    }
  }
}
