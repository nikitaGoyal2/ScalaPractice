/**
  * Created by nikigoya on 7/17/2017.
  */
object RequireExample {
  def run(x:Int) = {
     require(x >=48 , {
       println(s" failed! got x $x")
       false
     })

    println(s" got x $x")
    true
  }

  def main(args: Array[String]): Unit = {

    val ob = RequireExample
    ob.run(500)
    ob.run(5)

  }
}
