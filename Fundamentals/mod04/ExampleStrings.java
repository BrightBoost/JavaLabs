package Fundamentals.mod04;

public class ExampleStrings {
  public static void main(String[] args) {
    String str = "bla,bla,bla";
    String[] strArr = str.split(",");
    System.out.println(strArr[0] + " " + strArr[1]);
  }
}
