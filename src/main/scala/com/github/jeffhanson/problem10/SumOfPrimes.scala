package com.github.jeffhanson.problem10

object SumOfPrimes {
  
  /**
   * function which takes a number to test for prime then a list of accumulated prime numbers
   * and an accumulated sum. It takes a function which is used to test a number is a prime given
   * a list of known primes, and also a function which can be used to test if the terminating 
   * condition is met.
   * 
   */
  def primeSum( 
      next: Int, 
      found: Vector[Int],
      sum: Long,
      isPrime: (Int,Vector[Int]) => Boolean, 
      termCriteria: Int => Boolean ): Long = {
     require( next > 0 && sum > 0 )
     
     if( termCriteria(next) ) 
       sum
     else
       if ( isPrime(next,Vector(2,3,5,7)) && isPrime(next, found) ) {
         // println(s"next = ${next} sum = ${sum}")
         primeSum( next + 1,  found :+ next, next + sum, isPrime, termCriteria )
       }
       else 
         primeSum( next + 1, found, sum, isPrime, termCriteria )
  }
  
  /**
   * Find the sum of the primes for a given number. Seed it with two primes, a 
   * next number to test and a sum.
   */
  def findSum( num: Int ):Long = {
    require( num > 0 )
    primeSum( 5, Vector(2,3), 5, (x,xs) => xs.filter(k => k*k <= x).forall( y => x % y != 0 ), z => z > num )
  }
  
}