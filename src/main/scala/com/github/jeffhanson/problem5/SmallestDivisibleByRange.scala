package com.github.jeffhanson.problem5

import scala.annotation.tailrec

object SmallestDivisibleByRange {
    // create a list of divisors for convenience and clarity
    val divisors = Vector.range(2,21)
    
    /**
     * find the smallest multiple of numbers 1 thru 20. This function is 
     * seeded by an initial guess to allow any incorrect answers to be skipped
     * it is recommended that this initial guess be a multiple of 20.
     * We use a recursive call that will only terminate when a multiple is found.
     * Each subsequent recursive call is incremented by the largest divisor (20) 
     * and forced to a multiple of 20 for efficiency.
     * Note that we don't go as far as forcing the guess to be a multiple of 20
     * using require since we want to be able to accept any initial guess.
     */
    @tailrec
    def findSmallestDivisibleBy1thru20 ( guess: Int ) : Int = {
      require( guess > -1 )
      if ( divisors.forall( x => guess % x == 0 ) ) guess
      else findSmallestDivisibleBy1thru20( (guess - ( guess % divisors.last)) + divisors.last )
    }                                             
    
}