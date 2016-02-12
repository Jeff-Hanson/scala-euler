package com.github.jeffhanson.problem6

import org.scalatest.FunSuite

class SumSquareDiffTest extends FunSuite {
  test("Find the sum square differences to 100") {
    assert( SumSquareDiff.findSumSquareDiff(100) == 25164150 )
  }
  
  test("Find the sum square difference to 10") {
    assert( SumSquareDiff.findSumSquareDiff(10) == 2640 )
  }
}