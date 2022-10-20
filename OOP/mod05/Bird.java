package OOP.mod05;

public class Bird extends Animal implements Predator, Prey {

  @Override
  public void catchAndEat() {
    System.out.println("Bird eating prey");
  }

  @Override
  public void runAndHide() {
    System.out.println("fly and hide");
  }

}
