package Fundamentals.mod02;

public class Helper {

  public String name;

  public void help() {
    System.out.println("It's me, " + name + ". How can I help?");
  }

  public static int giveRandomInt() {
    return (int) Math.ceil(Math.random() * 1000);
  }
  
}
