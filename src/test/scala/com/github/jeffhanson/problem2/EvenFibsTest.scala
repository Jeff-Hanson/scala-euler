package com.github.jeffhanson.problem2

import org.scalatest.FunSuite

class EvenFibsTest extends  FunSuite {
  
  test("Small scale test to prove mechanism") {
    assert(EvenFibs.evenFibsSum(10) == 10)
  }
  
  test("Large scale test from Euler project for sum of even fibs") {
    assert(EvenFibs.evenFibsSum(4000000) == 4613732)
  }
 
}