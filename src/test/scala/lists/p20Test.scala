package lists

import org.scalatest.flatspec.AnyFlatSpec

class p20Test extends AnyFlatSpec {
  it should "equals to (List('a, 'c, 'd),'b)" in {
    val list = List('a, 'b, 'c, 'd)
    assert(p20.removeAt(1, list) == (List('a, 'c, 'd),'b))
  }
}
