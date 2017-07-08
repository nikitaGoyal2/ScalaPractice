/**
  * Created by nikigoya on 7/8/2017.
  */
object TraitExample {
  def main(args: Array[String]): Unit = {
    val mytrait = new ClassTest
    println(mytrait.spt)
    println(mytrait.spt1)
    println(mytrait.spt2)
  }
}

trait SuperClass{
  def spt = "abc"
}

trait SubClass1 extends SuperClass{
  def spt1 = "pqr"
}

trait SubClass2 extends SubClass1{
  def spt2 = "pqr"
}

class ClassTest extends SubClass2 {
}

