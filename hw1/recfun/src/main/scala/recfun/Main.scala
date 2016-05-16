package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def log_factorial(num: Int, adder: Double = 0): Double = 
      if( num == 0) adder else log_factorial(num - 1, adder + math.log(num))
    math.exp(log_factorial(r) - log_factorial(c) - log_factorial(r-c)).round.toInt
  }
  /**
   * Non Tail-Recursive Version => Stack Overflow for large "r"
   */
  //def pascal(c: Int, r: Int): Int = 
  //  if (c == 0 || c == r) 1 else 
  //    pascal(c-1,r-1) + pascal(c,r-1)


  /**
   * Exercise 2
   */
   
  def balance(chars: List[Char]): Boolean = {
    def inner(x: String): Boolean = {
      val y = x.replaceAll("\\(\\)","")
      if (x == "") true else if (x==y) false else inner(y)
    }
    inner( chars.filter(s => s == '(' || s == ')').mkString )
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money == 0) 1 else if (money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  /*
    val x = List(1,2,3,4,5)
   */
}
