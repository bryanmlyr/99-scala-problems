package lists

object p19 {
  def rotate[T](n: Int, list: List[T]): List[T] = {
    val r = if (n < 0) {
      list.length - (n * -1) % list.length
    } else if (n >= list.length) {
      n % list.length - 1
    } else {
      n
    }

    list.slice(r, list.length) ++ list.slice(0, r)
  }
}
