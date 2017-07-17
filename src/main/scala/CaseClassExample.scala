/**
  * Created by nikigoya on 7/17/2017.
  */
object CaseClassExample {

  def main(args: Array[String]): Unit = {
    val b1 = Book("Scala book", 150)

    println(b1.title) //Scala book
    println(b1.pages) //150

    val b2 = b1.copy(pages = 220)
    println(b2.title) //Scala book
    println(b2.pages )//220

    println(b1.productArity) //2
    println(b1.productPrefix)
    println(b1.productElement(0)) //Scala book
    println(b1.productElement(1)) //150

    println(b1.eq(b2)) //false
    println(b1.eq(Book("Scala book", 150))) //false
    println(b1.equals(Book("Scala book", 150))) //true
    println(b1 == b2) //false
    println(b1 == Book("Scala book", 150)) //true - compares values like equals
    // Compile time error - b1.pages = 150
    val mutableBook = MutableBook("Book 1", 123)
    mutableBook.pages = 121;
    println(mutableBook)

  }
}


case class Book(title : String, pages: Int); //default val
case class MutableBook(var title : String, var pages: Int);
