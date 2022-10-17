package Fundamentals.mod05;

public class Main {
  public static void main(String[] args) {
    Student s = new Student();
    s.setName("Nathan");
    s.setGpa(4.0);
    System.out.println(s.getName() + ": " + s.getGpa());
  }
}
