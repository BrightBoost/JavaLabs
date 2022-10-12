package Fundamentals.mod02;

public class Main {
  public static void main(String[] args) {
    Helper h = new Helper();
    h.help();
    h.name = "Emma";

    Helper h2 = new Helper();
    h2.name = "Mario";
    h2.help();

    System.out.println(h.name + " " + h2.name);
    
    int i = Helper.giveRandomInt();
    System.out.println(i);

  }
}
