package com.github.jeffhanson.problem9

object PythagoreanTripletAndSum {
  
    /**
     * Function to check triplet criteria, sum equals 1000, pythag, and ascending order 
     */
    def isPythagAndSum( x: Int, y: Int, z: Int ): Option[Int] = {
     if ((x + y + z == 1000) && ((x * x) + (y * y) == (z * z )) && ((x < y) && (y < z))) 
       Some(x*y*z) 
     else None
  }
    
  /**
   * Use for comprehension to loop through all possible values.  
   */
  def findSumAndPythagTriplet( x: Int, f: (Int,Int,Int) => Option[Int] ): Int = {  
		  val ans = for {
			  a <- Vector.range(3,x)
			  b <- Vector.range(3,x)
			  c <- Vector.range(3,x)
			  (x) <- f( a, b, c )
		  } yield( x )
		  ans.head
  }
}