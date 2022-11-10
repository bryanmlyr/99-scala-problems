package lists

import org.scalatest.flatspec.AnyFlatSpec

class p04Test extends AnyFlatSpec {
  it should "equals to 6" in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(p04.length(list) == 6)
  }
}
