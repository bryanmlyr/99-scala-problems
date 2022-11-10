package lists

object p21 {
  def insertAt[T](newElement: T, n: Int, list: List[T]): List[T] = {
    list.slice(0, n) ++ List(newElement) ++ list.slice(n, list.length)
  }
}
