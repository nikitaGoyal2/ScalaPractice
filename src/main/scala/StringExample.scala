object StringExample extends App {

  override def main(args: Array[String]): Unit = {
    println("Hello Scala!") //print string
    println('0') //print char
    val str = "Hello Scala!"
    println(str.length) //str length
    println(str.charAt(0)) //char at index
    println(str.substring(6))
    println(str.replace("Scala" , "Java"))
    println(str.take(5))
    println(str.drop(6))
    val n = "Scala"
    println(s"We are learning $n language")
    println(str.takeRight(6))
    println(s"Power of 2: ${math.pow(2, 4)}")
    println(f"Power of 2: ${math.pow(2, 4)}%1.0f")

    val html = """
    <form id="form">
      <input type="submit">
    </form>"""
    println(html)

  }
}