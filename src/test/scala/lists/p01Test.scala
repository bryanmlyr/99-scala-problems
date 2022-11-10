package lists

import org.scalatest.flatspec.AnyFlatSpec

class p01Test extends AnyFlatSpec {
  it should "equals to 8" in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(p01.last[Int](list) == 8)
  }
}
