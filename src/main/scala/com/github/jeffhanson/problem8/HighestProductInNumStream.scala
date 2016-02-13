package com.github.jeffhanson.problem8

object HighestProductInNumStream {
  
  /**
   * Given a string of digits, find the "size" adjacent digits when
   * multiplied together give you the largest product. 
   * 
   */
  def getLargestProductInNumString(str: String, size: Int ): Long = {
    require( size > 0 && str.matches("\\d+"))
    // First break up into strings of length size
    val iters: List[String] = str.sliding(size).toList
    // Now convert the strings to numbers so we can multiply them
    val asInts = iters.map(x => x.map( y => y.asDigit.toLong))
    // Now multiply the numbers in each list to create a List of products
    val products: List[Long] = asInts.map( x => x.product )
    products.max    
  }
}