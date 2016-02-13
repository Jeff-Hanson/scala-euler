package com.github.jeffhanson.problem9

import org.scalatest.FunSuite

class PythagoreanTripletTest extends FunSuite {
  test("Find the pythagorean triplet that sums to 1000") {
    assert( PythagoreanTripletAndSum.findSumAndPythagTriplet(1000, PythagoreanTripletAndSum.isPythagAndSum) == 31875000)
  }
}