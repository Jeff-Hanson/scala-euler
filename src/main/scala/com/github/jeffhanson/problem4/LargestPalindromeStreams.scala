package com.github.jeffhanson.problem4

object LargestPalindromeStreams {
    
    def make(x: Int, y: Int) : Stream[Int] = {
       if ( y <= 99 ) make( x - 1, 999 )
       else if ( x <= 99 ) Stream.Empty
       else 
         ( x * y) #:: make(x, y - 1)
    }
    
    def findLargestPalindrome( x:Int, y:Int ): Int = {
      make(x,y).filter( x => x.toString.equals( x.toString.reverse )).sorted.last
    }
    
    def main( args: Array[String] ): Unit = {
      println(findLargestPalindrome(999,999))
    }
}