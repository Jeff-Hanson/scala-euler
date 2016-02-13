package com.github.jeffhanson.problem7

import org.scalatest.FunSuite

class FindNthPrimeTest extends FunSuite {
  
  test("Find the 6th prime number") {
    assert(FindNthPrime.findPrimeByIndex(6) == 13 )
  }
  
  test("Find the 10001th prime number") {
    assert(FindNthPrime.findPrimeByIndex(10001) == 104743 )
  }
}