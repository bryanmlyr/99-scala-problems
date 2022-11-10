package lists

import org.scalatest.flatspec.AnyFlatSpec

class p06Test extends AnyFlatSpec {
  "% 2 != 0" should "equals to true" in {
    val list = List(1, 2, 3, 2, 1)
    assert(p06.isPalindrome(list))
  }

  "%2 == 0" should "equals to true" in {
    val list = List(1, 2, 2, 1)
    assert(p06.isPalindrome(list))
  }

  "%2 == 0" should "equals to false" in {
    val list = List(1, 2, 1, 2)
    assert(!p06.isPalindrome(list))
  }
}
