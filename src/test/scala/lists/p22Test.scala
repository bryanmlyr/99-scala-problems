package lists

import org.scalatest.flatspec.AnyFlatSpec

class p22Test extends AnyFlatSpec {
  it should "equals to List(4, 5, 6, 7, 8, 9)" in {
    assert(p22.range(4, 9) == List(4, 5, 6, 7, 8, 9))
  }
}
