/**
  * Created by nikigoya on 7/17/2017.
  */
class Person (val name: String, val zip: String)
case class Town (val name: String, val zip: String)

object Person {
  def apply(name: String, zip: String) : Person = {
    println("in apply, name = " + name + " zip = " + zip);
    return new Person(name, zip)
  }
  def unapply(p: Person) : Option[Pair[String, String]] = {
    println("in unapply, name = " + p.name + " zip = " + p.zip);
    return Some((p.name, p.zip))
  }
  /*
    def unapply(p: Person) = Some((p.name, p.zip))
  */

  def main(args: Array[String]): Unit = {

    val l = List(Person("Brian", "94110"), Person("Kelly", "63119"),
      new Person("Ray", "80526"),
      new Town("San Francisco", "94110"))

    val s = "Brian"

    for(person <- l) {
      person match {
        case Person(name, "95683") =>
          println("Found person in Ft. Collins; name = " + name)
        case Person(name, zip) if zip startsWith "9" =>
          println("Found person out west; name = " + name)
        case Person(name, zip) =>
          println("Found person; name = " + name)
        case somethingElse => println("Found something else: " + somethingElse);
      }
    }
  }
}
