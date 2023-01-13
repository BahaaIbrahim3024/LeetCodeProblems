package test.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import main.com.leetcode.solutions.easy.PowerOfFour_342;
import org.junit.jupiter.api.Test;

class PowerOfFour_342Test {

  @Test
  void isPowerOfFour() {
    PowerOfFour_342 powerOfFour = new PowerOfFour_342();
    assertTrue(powerOfFour.isPowerOfFour(16));
  }
}