package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.CountOddNumbers_1523;
import org.junit.jupiter.api.Test;

class CountOddNumbers_1523Test {

  @Test
  void countOddsTest() {
    CountOddNumbers_1523 countOddNumbers = new CountOddNumbers_1523();
    assertEquals(countOddNumbers.countOdds(3, 7), 3);
  }

  @Test
  void countOdds2Test() {
    CountOddNumbers_1523 countOddNumbers = new CountOddNumbers_1523();
    assertEquals(countOddNumbers.CountOdds2(8, 10), 1);
  }

  @Test
  void countOdds3Test() {
    CountOddNumbers_1523 countOddNumbers = new CountOddNumbers_1523();
    assertEquals(countOddNumbers.CountOdds3(1, 10), 5);
  }
}