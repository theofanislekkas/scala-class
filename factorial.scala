object exercise {
	// My pseudo code below
	// def fct(n: Int, i: Int): Int =
	//   if (n == 0) i else
	//   n * (n - 1) = i
	//   fct(n - 1) 
	// If I was more comfortable with syntax I may have had a better solution.
	// I should have done it in Python first, then tried translating it into scala.
	// This was the solution from the class
	def main(args: Array[String]) {
		def factorial(n: Int): Int = {
		  def loop(acc: Int, n: Int): Int =
		    if(n == 0) acc
		    else loop(acc * n, n - 1)
		  loop(1,n)
		}
	println(factorial(4))
	}
	
}