package lists

import org.scalatest.flatspec.AnyFlatSpec

class p11Test extends AnyFlatSpec {
  it should "equals to List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(p11.encodeModified(list) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
}
