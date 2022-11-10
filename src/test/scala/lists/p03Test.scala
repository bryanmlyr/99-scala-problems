package lists

import org.scalatest.flatspec.AnyFlatSpec

class p03Test extends AnyFlatSpec {
  it should "equals to 2" in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(p03.nth(2, list).contains(2))
    assert(p03.nth(10, list).isEmpty)
  }
}
