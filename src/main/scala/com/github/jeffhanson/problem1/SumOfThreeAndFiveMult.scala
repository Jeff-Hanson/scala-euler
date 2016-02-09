package com.github.jeffhanson.problem1

object SumOfThreeAndFiveMult {
  
  def getSumOfThreeAndFive( limit: Int ): Int = {
       Stream.from( 0 ).take(limit).filter ( x => ( x % 5 == 0 ) || (x % 3 == 0 )).sum
  }                                               //> getSumOfThreeAndFive: (limit: Int)Int
  
}