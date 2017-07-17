/**
  * Created by nikigoya on 7/17/2017.
  */

object CurryingExample {

  def concatenator(w1: String)(w2: String) = w1 + " " + w2

  def isInRange(from: Int, to: Int) (x :Int) : Boolean = {
    if (from <= x && to >= x)
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {

    //Simple example
    val heyWord = concatenator("Hey")_
    println(heyWord("Word!"))

    //Simple example 2
    println(isInRange(0,10)(3))
    println(isInRange(-100,10)(30))

    //Example case and currying
    val k1 = Keyword("restaurant")("storage", 1)

    // won't compile
    //val source = k1.source
    println(k1.text) //can't access second parameters because no accessor defined for it
    val k2 = NewKeyword("restaurant")("storage", 1)
    println(k2.foo)
    println(k2.source)
    println(k2.text)

    // won't compile
   // val k3 = k2.copy()(source = "web")

    // will compile
    val k3 = k2.copy()(source = "web", foo = 1)
    println(k1 == Keyword("restaurant")("storage2", 11))
    // also the equals implementation, you get for free for case classes, only applies to the first parameter section

  }
}

case class Keyword(text: String)(source: String, foo: Int)

case class NewKeyword(text: String)(val source: String, val foo: Int)