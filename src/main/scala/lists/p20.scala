package lists

object p20 {
  def removeAt[T](n: Int, list: List[T]): (List[T], T) = {
    (list.slice(0, n) ++ list.slice(n+1, list.length), list(n))
  }
}
