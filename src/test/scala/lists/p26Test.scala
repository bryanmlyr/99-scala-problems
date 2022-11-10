package lists

import org.scalatest.flatspec.AnyFlatSpec

class p26Test extends AnyFlatSpec {
  it should "equals to combinations" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    val res = p26.combinations(3, list)

    println(res)
    assert(res.length == 20)
  }
}
