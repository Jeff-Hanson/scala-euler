package com.github.jeffhanson.problem1

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class Multi3or5Test extends FunSuite with BeforeAndAfter {
  
  test("Check if multiples of 3 and 5 under 1000 equal 233168") {
    assert(SumOfThreeAndFiveMult.getSumOfThreeAndFive(1000) == 233168)
  }
  
  test("Simple case multiples of 3 and 5 less than 10 equal to 23") {
    assert(SumOfThreeAndFiveMult.getSumOfThreeAndFive(10) == 23)
  }
  
  
}