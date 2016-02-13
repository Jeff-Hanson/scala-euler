package com.github.jeffhanson.problem7

object FindNthPrime {
  /**
   * Find the Nth prime number in the sequence of primes. Use a stream to generate the 
   * sequence of prime numbers then just use the apply method to access the number
   * by index.
   */
  def findPrimeByIndex( x: Int ): Int = {
    def sieve(s: Stream[Int]): Stream[Int] = {
    val s2 = s.tail.filter( _ % s.head != 0 )
    s.head #:: sieve(s2)
    }
    
    sieve(Stream.from(2))(x-1)
  }                                                      

}