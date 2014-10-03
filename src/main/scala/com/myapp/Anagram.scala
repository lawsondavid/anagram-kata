package com.myapp

object Anagram {
  def createAnagrams(word: String): List[String] = {
    Dictionary.getWords
      .groupBy(_.sorted)(word)
  }

  def createAllAnagrams() {
    Dictionary.getWordsFromFile
      .groupBy(_.sorted)
      .values
      .foreach((anagrams: List[String]) => if (anagrams.size > 1) println(anagrams.mkString(", ")))
  }
}