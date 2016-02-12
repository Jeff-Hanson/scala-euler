package com.github.jeffhanson.problem5

import org.scalatest.FunSuite

class SmallestDivisibleby20RangeTest extends FunSuite {
  test("Find using recursion for 1 to 20") {
    assert( SmallestDivisibleByRange.findSmallestDivisibleBy1thru20(20) == 232792560 )
  }
  
  test("Find using streams based approach for 1 to 20") {
    assert( SmallestDivisibleByRangeStream.getSmallestMultiple == 232792560 )
  }
}