package lists

object p09 {
  def pack[T](list: List[T]): List[List[T]] = {
    list match {
      case head :: tail => tail.foldLeft(List(List(head))) { (acc, e) =>
        if (acc.last.last == e) {
          acc.init ++ List(acc.last ++ List(e))
        } else {
          acc ++ List(List(e))
        }
      }
      case _ :: Nil => List(list)
      case Nil => Nil
    }
  }
}
