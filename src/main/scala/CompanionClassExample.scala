/**
  * Created by nikigoya on 7/8/2017.
  */

class CompanionClassExample {
  def add( n :Int) = {
    CompanionClassExample.sharedVal = CompanionClassExample.sharedVal + n
    CompanionClassExample.sharedVal
  }
}

object CompanionClassExample{
  var sharedVal:Int = 1;
}

object TestCompanionClassExample{
  def main(args: Array[String]): Unit = {
    var x1 = new CompanionClassExample
    var x2 = new CompanionClassExample
    println(x1.add(2))
    println(CompanionClassExample.sharedVal)
    println(x2.add(5))
    println(CompanionClassExample.sharedVal)
  }
}
