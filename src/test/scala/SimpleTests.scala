import org.scalatest._
import Task1.StringSort

class SimpleTests extends FunSuite with Matchers {
  test("Expected String") {
    val t = new StringSort("apple avocado nectarine apricot lemon lime pear kiwi plum")
    assert(t.sortWords == "[a=[apple, apricot, avocado], l=[lemon, lime], p=[pear, plum]]")
  }

  test("Empty String") {
    val t = new StringSort(" ")
    assert(t.sortWords == "")
  }

  test("UpperCase Test") {
    val t = new StringSort("Apple avocado nectarine apricot Lemon lime Pear kiwi plum")
    assert(t.sortWords == "[a=[apple, apricot, avocado], l=[lemon, lime], p=[pear, plum]]")
  }
}
