package lists

import org.scalatest.flatspec.AnyFlatSpec

class p21Test extends AnyFlatSpec {
  it should "equals to List('a, 'new, 'b, 'c, 'd)" in {
    val list = List('a, 'b, 'c, 'd)
    assert(p21.insertAt('new, 1, list) == List('a, 'new, 'b, 'c, 'd))
  }
}
