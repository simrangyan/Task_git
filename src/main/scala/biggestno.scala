import scala.io.StdIn

object biggestno {
  def main(args:Array[String]):Unit={
    //Declare the three numbers
    println("Enter the number1")
    var x=StdIn.readInt()
    println("Enter the number2")
    var y=StdIn.readInt()
    println("Enter the number3")
    var z=StdIn.readInt()
    var biggest:Int=0
    //Finding the Biggest Number

    biggest = if (x>y && x>z)x else if (y>x && y>z) y else z

    println(biggest + "is the largest number")




  }

}
