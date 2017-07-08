/**
  * Created by nikigoya on 7/8/2017.
  */
object ImplicitClassExample {
  implicit class IntTimes(x: Int) {
    def times [A](f: =>A): Unit = {
      def loop(current: Int): Unit =

        if(current > 0){
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}

import ImplicitClassExample._

object DemoImplicit {
  def main(args: Array[String]) {

    val obj = new ImplicitClassExample.IntTimes(4)

    obj.times(println("hello"))

    4 times println("next way")
  }
}
