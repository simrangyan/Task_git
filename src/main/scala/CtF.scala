import scala.io.StdIn

object CtF {
def main(arg:Array[String]):Unit={

//read the temp in celsius from source
println("Enter the temp in celsius")
val celsius = StdIn.readDouble()

//convert the temp from celsius to fahrenheit
  val fahrenheit = ((celsius * 9)/5)+32

  //print the Result
  println("${celsius}C is equal to ${fahrenheit}F")












}
}
