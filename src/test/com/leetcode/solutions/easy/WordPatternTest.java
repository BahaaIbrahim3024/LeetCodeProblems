package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.WordPattern;
import org.junit.jupiter.api.Test;

class WordPatternTest {

  @Test
  void wordPatternTest() {
    WordPattern wordPattern = new WordPattern();
    assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
  }
}