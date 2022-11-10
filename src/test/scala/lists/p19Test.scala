package lists

import org.scalatest.flatspec.AnyFlatSpec

class p19Test extends AnyFlatSpec {
  "rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" should "equals to List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(p19.rotate(3, list) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }

  "rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" should "equals to List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(p19.rotate(-2, list) == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }
}
