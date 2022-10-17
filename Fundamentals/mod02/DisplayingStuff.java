package Fundamentals.mod02;

import java.util.Arrays;

public class DisplayingStuff {
  public static void main(String[] args) {
    int a = 4, b = 9, c = 10, d = 3;

    addAndDisplay(a, b);
    addAndDisplay(b, c);
    addAndDisplay(a, d);

  }

  public static int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public static void display(int num1, int num2, int sum) {
    System.out.printf("%d + %d = %d", num1, num2, sum);
  }

  public static void addAndDisplay(int num1, int num2) {
    int sum = add(num1, num2);
    display(num1, num2, sum);
    
  }
}
