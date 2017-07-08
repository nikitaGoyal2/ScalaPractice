/**
  * Created by nikigoya on 7/8/2017.
  */
class Employee(var fname:String, var lname:String, val salary:Double) {

  println("Inside")

  private val deptId = "dept1"

  println(s"Passed values $fname $lname $salary")


  override def toString: String = s"$fname $lname $deptId $salary"

  def printDeptId(): Unit = {
    println(s"DeptId = $deptId")
  }

  printDeptId()

  //Auxilary function
  def this(fname: String, lname: String) {
    this(fname, lname, 1900)
  }


  println("Leaving")

}

object Employee {
  def main(args: Array[String]): Unit = {
    val employee = new Employee("Nikita", "Goyal")
    println(employee)
  }

}