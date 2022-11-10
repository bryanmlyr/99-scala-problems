package lists

import org.scalatest.flatspec.AnyFlatSpec

class p08Test extends AnyFlatSpec {
  it should "equals to List('a, 'b, 'c, 'a, 'd, 'e)" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(p08.compress(list) == List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
