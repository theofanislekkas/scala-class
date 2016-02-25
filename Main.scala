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
  def pascal(c: Int, r: Int): Int = 
    // Reference: https://class.coursera.org/progfun-005/forum/thread?thread_id=153#post-572
    // First, we have to build the triangle to (c,r)

    // Second, we have to sum the values from row (r - 1) in columns (c + (c-1))
    // Third, we have to return that value

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
