package lists

import org.scalatest.flatspec.AnyFlatSpec

class p10Test extends AnyFlatSpec {
  it should "equals to List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(p10.encode(list) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
