package com.github.jeffhanson.problem1

object SumOfThreeAndFiveMult {
  
  /**
   * Get the sum of the multiples of 3 and 5 in a sequence of numbers. The limit passed in 
   * specifies the upper bounds on the sequence of numbers to use.
   */
  def getSumOfThreeAndFive( limit: Int ): Int = {
       require( limit > -1 )
       Stream.from( 0 ).take(limit).filter ( x => ( x % 5 == 0 ) || (x % 3 == 0 )).sum
  }                                               
  
}