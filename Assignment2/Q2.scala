object Q2 {

   def main(args:Array[String])
  {
     println("Enter Price of ticket: Rs. ")
     var price=scala.io.StdIn.readInt()
     
     var profits=profit(price)
     println("The profit is Rs. "+profits)
     
  }

   //find attendees
  def attendees(x:Int):Int=
  {
    var attendees=120+((15-x)/5)*20
    return attendees
  }

  //find revenue
  def revenue(x:Int):Int=
  {
    var revenue=attendees(x)*x
    return revenue
  }

  // find cost
  def cost(x:Int):Int=
  {
    var cost=500+(attendees(x)*3)
    return cost
  }

  //find profits
  def profit(x:Int):Int=
  {
    var profit=revenue(x)-cost(x)
    return profit
  }
     
}