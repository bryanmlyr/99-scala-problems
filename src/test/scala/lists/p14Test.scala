package lists

import org.scalatest.flatspec.AnyFlatSpec

class p14Test extends AnyFlatSpec {
  it should "equals to List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    assert(p14.duplicate(list) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
}
