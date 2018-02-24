package Task1

class StringSort(val str: String) {
  val arrayOfWords: Array[String] = str.toLowerCase.split(" ")

  private def strBuilder(a: Array[String]): String = {
    val firstLetter = a(0)(0)
    firstLetter.toString + "=[" + a.mkString(", ") + "]"
  }
  def sortWords: String = {
    val mapOfLetters = arrayOfWords.map(x => x(0)).groupBy(identity).mapValues(_.length)
    val arrs = for ((k, v) <- mapOfLetters if v > 1) yield {
      for (i <- arrayOfWords if i.startsWith(k.toString)) yield i
    }

    val interStr = (for(arr <- arrs) yield strBuilder(arr.sorted)).toArray.sorted
    if (!interStr.isEmpty) "[" + interStr.mkString(", ") + "]"
    else ""
  }

}
