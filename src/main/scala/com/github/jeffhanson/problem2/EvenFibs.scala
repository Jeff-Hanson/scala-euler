package com.github.jeffhanson.problem2

object EvenFibs {
  
  // Create a stream of fibonacci numbers to be used 
  lazy val fib:Stream[Int] = 0 #:: fib.scanLeft(1)(_ + _)                                                //> fib: => Stream[Int]
    
  /**
   * Find the sum of the even fibonacci numbers up to a given limit
   * The limit passed in is the upper bounds on the sequence. 
   */
  def evenFibsSum(limit: Int): Int = {
    require( limit > 0 )
    fib.takeWhile( x => x < limit ).toList.filter( x => x % 2 == 0).sum
  }
}