package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.WordPattern_290;
import org.junit.jupiter.api.Test;

class WordPattern_290Test {

  @Test
  void wordPatternTest() {
    WordPattern_290 wordPattern = new WordPattern_290();
    assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
  }
}