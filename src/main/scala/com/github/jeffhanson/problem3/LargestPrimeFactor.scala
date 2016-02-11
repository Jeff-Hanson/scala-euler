package com.github.jeffhanson.problem3

import scala.annotation.tailrec

object LargestPrimeFactor {
  
  /**
   * Find the largest factor of the given number which is also a prime. First get all the 
   * factors of the number which are prime then take the largest. We know that the last factor 
   * in the list returned by getPrimeFactors is the largest. If we wanted to be very sure we 
   * could sort the list then take either the head or last element depending on sort order but 
   * because we know how the list is constructed we can just take the last. We seed our call to 
   * getPrimeFactors with a starting divisor of 2. 
   */
  def getLargestPrimeFactor( num: Long ): Long = {
    getPrimeFactors( num, 2 ).last
  }
  
  /**
   * Get all the prime factors for a number. This function is seeded with a divisor for starting.
   * Usually 2 is a good starting point but larger numbers can be used to optimize execution if
   * they are known factors.
   */
  def getPrimeFactors( num: Long, div: Long ): List[Long] = {
    require( num > 0 && div > 0 )
    println(s"getting factors ${num} using ${div}")
    if ( num < div ) List()
    else
     (num % div) match {
       case 0 if ( num == div ) => List(div)
       case 0 if ( isPrime(div) ) => div :: getPrimeFactors( num/div, div )
       case 0 => getPrimeFactors(num/div, div + 1 )
       case _ => getPrimeFactors( num, div + 1 )
     }
  }
  
  /**
   * Check if a number is a prime number. True if it is, false otherwise. Takes numbers greater
   * than 1.
   */
  def isPrime( num: Long ) : Boolean = {
    require( num > 1 )
    // check numbers up to the sqrt of the number for factors, if we find one it is not a prime
    List.range(2, Math.sqrt(num).toInt ).map( x => num % x == 0 ).isEmpty
  }
}