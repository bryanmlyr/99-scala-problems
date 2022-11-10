package lists

object p12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    list.flatMap { elem =>
      List.fill(elem._1)(elem._2)
    }
  }
}
