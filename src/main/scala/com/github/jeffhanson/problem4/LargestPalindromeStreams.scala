package com.github.jeffhanson.problem4

object LargestPalindromeStreams {
    
  /**
   * Construct a stream of products of 3 digit numbers
   */
    def make(x: Int, y: Int) : Stream[Int] = {
       if ( y <= 99 ) make( x - 1, 999 )
       else if ( x <= 99 ) Stream.Empty
       else 
         ( x * y) #:: make(x, y - 1)
    }
    /**
     * Create a stream of products and then filter it checking for palindrome. Sort to find
     * the largest.
     * Could we use fold here?
     */
    def findLargestPalindrome( x:Int, y:Int ): Int = {
      require( x > 0 && y > 0 )
      make(x,y).filter( x => x.toString.equals( x.toString.reverse )).sorted.last
    }
    
}