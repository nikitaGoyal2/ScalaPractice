/**
  * Created by nikigoya on 7/17/2017.
  */
object GenericExample {
  def logValue[T](value: Maybe[T]): Unit = value match {
    case Value(v) => println(s"We have a value here: $v")
    case NoValue => println("I'm sorry, no value")
  }

  def main(args: Array[String]): Unit = {
    val v: Maybe[Int] = Value(42)
    val v_1: Maybe[Int] = NoValue
    logValue(v) // prints We have a value here: 42
    logValue(v_1) // prints I'm sorry, no value
  }


}

sealed trait Maybe[+T]
case class Value[T](value: T) extends Maybe[T]
case object NoValue extends Maybe[Nothing]
