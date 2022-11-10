package lists

object p06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    list.slice(0, list.length/2) == list.slice(list.length/2+1, list.length).reverse
  }
}
