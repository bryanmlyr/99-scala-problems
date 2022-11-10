package lists

object p08 {
  def compress[T](list: List[T]): List[T] = {
    list match {
      case head :: tail => tail.foldLeft(List(head)) { (acc, e) =>
        if (acc.last == e) acc else acc ++ List(e)
      }
      case _ :: Nil => list
      case Nil => Nil
    }
  }
}
