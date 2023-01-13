package main.com.leetcode.solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Solution of leetCode problem#1491
 */
public class AverageSalary {

  //Optimal solution
  public double averageOptimal(int[] salary) {
    Arrays.sort(salary);
    int sum = 0;
    for (int x = 1; x < salary.length - 1; ++x) {
      sum += salary[x];
    }

    return (double) sum / (salary.length - 2);
  }

  public double average(int[] salary) {
    Arrays.sort(salary);
    int sum = 0;
    for (int x = 0; x < salary.length; ++x) {
      if (salary[x] != salary[0] && salary[x] != salary[salary.length - 1]) {
        sum += salary[x];
      }
    }

    return (double) sum / (salary.length - 2);
  }

  public double average2(int[] salary) {
    List<Integer> salaryList = new ArrayList<>();
    for (int i = 0; i < salary.length; ++i) {
      salaryList.add(salary[i]);
    }
    int minSalary = Collections.min(salaryList);
    int maxSalary = Collections.max(salaryList);
    int sum = 0;
    for (int i = 0; i < salaryList.size(); ++i) {
      if (salaryList.get(i) != minSalary && salaryList.get(i) != maxSalary) {
        sum += salaryList.get(i);
      }
    }
    return (double) sum / (salary.length - 2);
  }

  public double average3(int[] salary) {
    int minSalary = Integer.MAX_VALUE;
    int maxSalary = 0;
    double sum = 0.0;
    for (int idx : salary) {
      sum += idx;
      if (minSalary > idx) {
        minSalary = idx;
      }
      if (maxSalary < idx) {
        maxSalary = idx;
      }
    }
    sum -= (minSalary + maxSalary);
    return sum / (salary.length - 2);
  }
}
