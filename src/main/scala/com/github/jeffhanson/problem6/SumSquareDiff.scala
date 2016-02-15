package com.github.jeffhanson.problem6

object SumSquareDiff {
  
  /**
   * Find the difference of the square of the sum of a range and the sum of the squares of the 
   * same range.
   * 
   */
  def findSumSquareDiff( x: Int ): Int = {
    require(x > 0)
    Math.pow( Vector.range(1,x+1).sum.toDouble, 2.0 ).toInt - Vector.range(1,x+1).map( x => x * x ).sum
  }

}