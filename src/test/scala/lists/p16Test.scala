package lists

import org.scalatest.flatspec.AnyFlatSpec

class p16Test extends AnyFlatSpec {
  it should "equals to List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(p16.drop(3, list) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
}
