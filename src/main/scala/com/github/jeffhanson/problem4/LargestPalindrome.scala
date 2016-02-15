package com.github.jeffhanson.problem4

import scala.annotation.tailrec

//TODO: Make this less imperative, perhaps use pattern matching?

object LargestPalindrome {
  def findLargestPalindrome( ): Int = {
       /**
        * Find the largest palindrome recursively
        * x and y are factors of the palindrome and found is the largest palindrome found so far
        * This is modeled like a nested loop logic where x is the outer index and y is the inner
        * There are multiple places where it short circuits logic to provide better performance
        * by trimming the search set
        * It also starts at the top and counts down assuming that the largest number will be 
        * found more quickly starting at the top.
        */
       @tailrec
       def findPal( x: Int, y: Int, found: Int): Int = {
          require( x > 0 && y > 0 && found > -1 )
          val num = x * y
          // As an optimization check if we are already less than one we have found previously 
          if ( num <= found )
            // if our next attempt is also less then we have found our answer
            if ( (x-1) * 999 <= found) found
            // else keep searching 
            else findPal ( x - 1, 999, found )
          else {
            // if it is a palindrome then pass it in as the new largest found on a recursive call
            if ( isPalindromeNum(num) )
              findPal ( x - 1, 999, num )
            // if we have used all y values for this x value start a new one with a new x value
            else if ( y <= 100 ) findPal( x - 1, 999, found )
            // if we have exhausted all x values then we are done searching and return found
            else if ( x <= 100 ) found
            // common case: try next y value with current x ( inner loop )
            else findPal( x, y - 1, found )
          }
       }
       findPal(999, 999, 0 )
  }
  
  def isPalindromeNum( num: Int ): Boolean = {
    require( num >= 0 ) 
    
    num.toString.equals( num.toString.reverse )
  }
  
}