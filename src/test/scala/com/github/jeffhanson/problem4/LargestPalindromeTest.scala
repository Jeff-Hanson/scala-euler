package com.github.jeffhanson.problem4

import org.scalatest.FunSuite

class LargestPalindromeTest extends FunSuite {
  test("Find largest Palindrome with two three digit factors.") {
    assert( LargestPalindrome.findLargestPalindrome() == 906609 )
  }
  
  test("Test stream of vals") {
    assert( LargestPalindromeStreams.findLargestPalindrome(999, 999) == 906609 )
  }
}