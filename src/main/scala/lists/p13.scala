package lists

object p13 {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    list match {
      case head :: tail => tail.foldLeft(List((1, head))) { (acc, e) =>
        if (acc.last._2 == e) {
          val tuple: (Int, T) = (acc.last._1 + 1, acc.last._2)
          acc.init ++ List(tuple)
        } else {
          acc ++ List((1, e))
        }
      }
      case head :: Nil => List((1, head))
      case Nil => Nil
    }
  }
}
