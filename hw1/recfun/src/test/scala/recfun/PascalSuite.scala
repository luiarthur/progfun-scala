package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main.pascal
  test("pascal: col=0,row=2") {
    assert(pascal(0,2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1,3) === 3)
  }

  test("pascal: col=5,row=10") {
    assert(pascal(5,10) === 252)
  }

  test("pascal: col=5000000,row=5000000") {
    assert(pascal(5000000,5000000) === 1)
  }

  test("pascal: col=1499999,row=1500000") {
    assert(pascal(1499999,1500000) === 1500000)
  }

}
