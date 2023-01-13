package main.com.leetcode.solutions.easy;

/**
 * Solution of leetCode problem#342
 */
public class PowerOfFour {

  public boolean isPowerOfFour(int n) {
    // Base Cases
    if (n == 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    // Check remainder is 0 or not when divided by 4, and recursion call.
    return ((n % 4 == 0) && isPowerOfFour(n / 4));
  }

}
