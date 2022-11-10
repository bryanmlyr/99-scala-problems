package lists

object p07 {

  //  @tailrec
  def flatten[T](lists: List[T]): List[T] = {
    //    val flatCurrentLevel = lists.flatMap {
    //      case list: List[T] => list
    //      case value: T => List(value)
    //    }
    //
    //    val isFlatten = flatCurrentLevel.find {
    //      case _: List[T] => true
    //      case _: T => false
    //    }
    //
    //    isFlatten match {
    //      case Some(_) => flatten(flatCurrentLevel)
    //      case None => flatCurrentLevel
    //    }
    lists.flatMap {
      case list: List[T] => flatten(list)
      case value: T => List(value)
    }
  }
}
