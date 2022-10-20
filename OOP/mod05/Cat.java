package OOP.mod05;

public class Cat extends Animal implements Predator {

  @Override
  public void catchAndEat() {
    System.out.println("Eating prey yum yum");
  }
  
}
