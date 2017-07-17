/**
  * Created by nikigoya on 7/17/2017.
  */
object ListExample1 {
  def main(args: Array[String]): Unit = {

    //Append element to list
    println("Appending element to list")
    val x = List(2)
    println(x)
    val y = 1 :: x
    println(y)
    val z = 0 :: y
    println(z)

    println("Prepending and Appending element to list")
    val list1 = List(1)
    println(list1)
    val list2 = 0 +: list1 //Prepending
    println(list2)
    val list3 = list2 :+ 2 //Appending
    println(list3)

    //slicing example
    println("Slicing list")
    val list = List(1 ,2 ,3 ,4 ,5)
    list.slice(list.size -3, list.size -1) //doesn't slice original
    println(list)
    println(list.slice(list.size -3, list.size -1)) //return sublist
    println(list.slice(list.size -3, list.size -1).reverse)//return sublist and reverse
  }
}
