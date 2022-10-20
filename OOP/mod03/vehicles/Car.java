package vehicles;

public class Car extends Vehicle {
  @Override
  public void makeWarningSound() {
    System.out.println("Toooot");
  }

  public void wipeWindshield() {
    System.out.println("wipe wipe");
  }
}
