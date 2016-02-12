package com.github.jeffhanson.problem5

import scala.annotation.tailrec

/**
 * Solve using streams this time. Create a stream of candidate guesses which are 
 * incremented by the largest factor. Then process the stream to look for the first
 * (smallest) guess that satisfies the factor criteria.
 */
object SmallestDivisibleByRangeStream {
    val divisors = List.range(2,21)
        
    // create stream to use for guesses
    lazy val guesses: Stream[Int] = {
      def loop( v: Int ): Stream[Int] = v #:: loop( v + 20 )
      loop(20)
    }
    
    // throw away guesses that don't match our criteria until we find one that does
    def getSmallestMultiple : Int = {
      guesses.dropWhile( x => ! divisors.forall( x % _ == 0 )).head
    }

}