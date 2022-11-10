package lists

import org.scalatest.flatspec.AnyFlatSpec

class p18Test extends AnyFlatSpec {
  it should "equals to List('d, 'e, 'f, 'g)" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(p18.slice(3, 7, list) == List('d, 'e, 'f, 'g))
  }
}
