import Task1.StringSort

object Main extends App {
  val str = "apple avocado nectarine apricot lemon lime pear kiwi plum"
  val str2 = " "
  val a = new StringSort(str)
  println(a.sortWords)
}
