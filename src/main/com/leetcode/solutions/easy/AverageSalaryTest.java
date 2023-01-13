package main.com.leetcode.solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageSalaryTest {

  @Test
  void average() {
    AverageSalary averageSalary = new AverageSalary();
    int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
    assertEquals(averageSalary.average(salary), 41111.11111111111);
  }

  @Test
  void averageOptimal() {
    AverageSalary averageSalary = new AverageSalary();
    int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
    assertEquals(averageSalary.averageOptimal(salary), 41111.11111111111);
  }

  @Test
  void average2() {
    AverageSalary averageSalary = new AverageSalary();
    int[] salary = {4000, 3000, 1000, 2000};
    assertEquals(averageSalary.average2(salary), 2500.00);
  }

  @Test
  void average3() {
    AverageSalary averageSalary = new AverageSalary();
    int[] salary = {3000, 1000, 2000};
    assertEquals(averageSalary.average3(salary), 2000);
  }
}