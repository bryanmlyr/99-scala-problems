package lists

import org.scalatest.flatspec.AnyFlatSpec

class p25Test extends AnyFlatSpec {
  it should "equals to 6" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    val res = p25.randomPermute(list)

    println(res)
    assert(res.length == 6)
  }
}
