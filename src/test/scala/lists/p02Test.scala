package lists

import org.scalatest.flatspec.AnyFlatSpec

class p02Test extends AnyFlatSpec {
  it should "equals to 5" in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(p02.penultimate[Int](list) == 5)
  }
}
