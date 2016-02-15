package com.github.jeffhanson.problem10

/**
 * Version which uses streams. This can cause out of memory problems for large numbers
 */
object SumOfPrimesStream {
  
  def findSumOfPrimesLessThanNum( num: Int ): Int = {
    require( num > 0 )
    def primes(s: Stream[Int]):Stream[Int] = 
      Stream.cons(s.head, primes( s.tail filter (x => x % s.head != 0)) )
    primes(Stream.from(2)).takeWhile( x => x < num ).sum
  }
  
}