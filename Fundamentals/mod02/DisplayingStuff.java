package Fundamentals.mod02;

public class DisplayingStuff {
  public static void main(String[] args) {
    int a = 4, b = 9, c = 10, d = 3;
    int sum;
    sum = addAndDisplay(a, b);
    display(a, b, sum);
    sum = addAndDisplay(b, c);
    display(b, c, sum);
    sum = addAndDisplay(a, d);
    display(a, d, sum);
  }

  public static int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public static void display(int num1, int num2, int sum) {
    System.out.printf("%d + %d = %d", num1, num2, sum);
  }
}
