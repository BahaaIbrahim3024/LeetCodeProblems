package main.com.leetcode.solutions.easy;

/**
 * Solution of leetCode problem#1523
 */
public class CountOddNumbers {

  // O(N) solution
  public int countOdds(int low, int high) {
    int count = 0;
    for (int i = low; i <= high; ++i) {
      if (i % 2 != 0) {
        ++count;
      }
    }
    return count;
  }

  // Another solution O(1)
  public int CountOdds2(int low, int high) {
    if (low % 2 == 0) {
      low += 1;
    }
    if (high % 2 == 0) {
      high -= 1;
    }
    return ((high - low) / 2) + 1;
  }

  // Another solution O(1)
  public int CountOdds3(int low, int high) {
    return (low % 2 != 0) && (high % 2 != 0) ? ((high - low + 2) / 2) : ((high - low + 1) / 2);
  }
}
