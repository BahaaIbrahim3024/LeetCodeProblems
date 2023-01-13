package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.CountOddNumbers;
import org.junit.jupiter.api.Test;

class CountOddNumbersTest {

  @Test
  void countOddsTest() {
    CountOddNumbers countOddNumbers = new CountOddNumbers();
    assertEquals(countOddNumbers.countOdds(3, 7), 3);
  }

  @Test
  void countOdds2Test() {
    CountOddNumbers countOddNumbers = new CountOddNumbers();
    assertEquals(countOddNumbers.CountOdds2(8, 10), 1);
  }

  @Test
  void countOdds3Test() {
    CountOddNumbers countOddNumbers = new CountOddNumbers();
    assertEquals(countOddNumbers.CountOdds3(1, 10), 5);
  }
}