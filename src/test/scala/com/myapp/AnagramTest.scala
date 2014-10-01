package com.myapp

import org.scalatest.{Matchers, FlatSpec}

/**
 * Home - Created by dave on 01/10/14.
 */
class AnagramTest extends FlatSpec with Matchers {

  "Anagram" should "generate new words from input word" in {
    val words = Anagram.createAnagrams("evil")
    assert(words.contains("live"))
    assert(words.contains("vile"))
    //assert(words.contains("evil"))
    assert(words.contains("veil"))
    assert(words.contains("levi"))
    assert(words.size === 5)
  }
}
