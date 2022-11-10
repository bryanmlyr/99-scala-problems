package lists

object p11 {
  def encodeModified[T](list: List[T]): List[Any] = {
    p09.pack(list).map { elem =>
      val length: Int = elem.size
      val value: T = elem.head

      if (length > 1) {
        (length, value)
      } else {
        value
      }
    }
  }
}
