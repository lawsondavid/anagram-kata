package com.myapp

object Anagram {
  def createAnagrams(word: String): List[String] = {
    mapWords(word.sorted)
  }

  def mapWords: Map[String, List[String]] = {
    val words = Dictionary.getWords
    var wordMap = Map[String, List[String]]()
    words.foreach { word =>
      val sortedWord = word.sorted
      if (wordMap.contains(sortedWord)) {
        wordMap += sortedWord -> (word :: wordMap(sortedWord))
      }
      else wordMap += sortedWord -> (word :: Nil)
    }
    wordMap
  }
}