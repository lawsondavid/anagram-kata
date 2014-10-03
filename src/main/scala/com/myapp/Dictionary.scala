package com.myapp

import scala.io.Source

/**
 * Home - Created by dave on 01/10/14.
 */
object Dictionary {
  def getWords: List[String] = {
    List("live", "vile", "evil", "veil", "levi", "junk", "rubbish")
  }

  def getWordsFromFile: List[String] = {
    Source.fromFile("/usr/share/dict/words").getLines().toList
  }
}
