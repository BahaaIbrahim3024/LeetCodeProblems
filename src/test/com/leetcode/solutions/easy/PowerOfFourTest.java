package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.PowerOfFour;
import org.junit.jupiter.api.Test;

class PowerOfFourTest {

  @Test
  void isPowerOfFour() {
    PowerOfFour powerOfFour = new PowerOfFour();
    assertTrue(powerOfFour.isPowerOfFour(16));
  }
}