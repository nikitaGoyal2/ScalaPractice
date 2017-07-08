  /**
  * Created by nikigoya on 7/8/2017.
  */
class FunctionExample {

  def sumOfSquares(x: Int, y: Int): Int = {
    val x2 = x * x
    val y2 = y * y
    x2 + y2
  }

  def sumOfSquaresShort(x: Int, y: Int): Int = x * x + y * y

  def factorial(n: Int): Int = {
    if (n == 1 )
      1
    else
      n * factorial(n-1)
  }
}

object Demo {
  def main(args: Array[String]) {

    val result  = (new FunctionExample).sumOfSquaresShort(2,3)
    println(result)
  }
}