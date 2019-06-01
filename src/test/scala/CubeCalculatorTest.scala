import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(new CubeCalculator().cube(3) === 27)
  }
}