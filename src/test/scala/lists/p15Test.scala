package lists

import org.scalatest.flatspec.AnyFlatSpec

class p15Test extends AnyFlatSpec {
  it should "equals to List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    assert(p15.duplicateN(3, list) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
}
