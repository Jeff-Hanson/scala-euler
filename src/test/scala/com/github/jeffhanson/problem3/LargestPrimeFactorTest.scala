package com.github.jeffhanson.problem3

import org.scalatest.FunSuite


class LargestPrimeFactorTest  extends FunSuite {
  
  val x = 600851475143L
    
  test("Find the largest prime factor of 35") {
    assert(LargestPrimeFactor.getLargestPrimeFactor( 35 ) == 7 )
  }
  
  test("Find the largest prime factor for a large number") {
    assert(LargestPrimeFactor.getLargestPrimeFactor(x) == 6857 )
  }
  
  test("Find the largest prime factor for a medium number") {
    assert(LargestPrimeFactor.getLargestPrimeFactor(1500) == 5 )
  }
  
  
}