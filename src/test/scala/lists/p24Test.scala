package lists

import org.scalatest.flatspec.AnyFlatSpec

class p24Test extends AnyFlatSpec {
  it should "equals to 6" in {
    val res = p24.lotto(6, 49)

    println(res)
    assert(res.length == 6)
  }
}
