import scala.io.StdIn



object kilogramstograms {
  def main(args:Array[String]):Unit={

//Read the input in kilograms from Source

   println("Enter weight in kilogrms")
    val kilograms = StdIn.readDouble()
//convert kilograms to grams
    val grams = kilograms * 1000


    //print the Result

    println(s"${kilograms}kg is equal to ${grams}g")





  }

}
