object Q1 {

  def main(args:Array[String])
  {
     println("Enter Number of working hours(h): ")
     var work_hour=scala.io.StdIn.readInt()
     
     println("Enter Number of OT hours(h): ")
     var ot_hour=scala.io.StdIn.readInt()
     
     var takehome_salary=takehome(work_hour,ot_hour)
     println("Takehome salary of an employee: Rs. "+takehome_salary)
  }

  //find income
  def income(x:Int,y:Int):Int=
  {
    var income=(x*150 + y*75)
    return income
  }

  //find tax
  def tax(income:Int):Double=
  {
    var tax=income*0.1
    return tax
  }

  //find take home salary
  def takehome(x:Int,y:Int):Double=
  {
     var takehome_salary=income(x,y)-tax(income(x,y))
     return takehome_salary
  }
}