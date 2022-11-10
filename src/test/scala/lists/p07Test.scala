package lists

import org.scalatest.flatspec.AnyFlatSpec

class p07Test extends AnyFlatSpec {
  it should "equals to List(1, 1, 2, 3, 5, 8)" in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))
    assert(p07.flatten(list) == List(1, 1, 2, 3, 5, 8))
  }
}
