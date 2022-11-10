package lists

import org.scalatest.flatspec.AnyFlatSpec

class p23Test extends AnyFlatSpec {
  it should "equals to 3" in {
    val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val res = p23.randomSelect(3, list)

    println(res)
    assert(res.length == 3)
  }
}
