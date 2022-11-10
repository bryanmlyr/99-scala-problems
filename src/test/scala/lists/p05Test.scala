package lists

import org.scalatest.flatspec.AnyFlatSpec

class p05Test extends AnyFlatSpec {
  it should "equals to List(8, 5, 3, 2, 1, 1)" in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(p05.reverse(list) == List(8, 5, 3, 2, 1, 1))
  }
}
