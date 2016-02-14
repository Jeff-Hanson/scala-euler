package com.github.jeffhanson.problem10

import org.scalatest.FunSuite

class PrimesLessThanNumTest extends FunSuite {
  
  test("Find sum of primes less than 200") {
    assert(SumOfPrimes.findSum(200) == 4227 )
  }
  /*
  test("Find sum of primes less than 200 stream") {
    assert(SumOfPrimes.findSumOfPrimesLessThanNum(200) == 4227 )
  }
  * 
  */

  test("Find sum of primes less than 2000000") {
    assert(SumOfPrimes.findSum(2000000) == 142913828922L )
  }

}