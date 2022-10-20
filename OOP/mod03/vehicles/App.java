package vehicles;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
  public static void main(String[] args) {
    Bike b = new Bike();
    b.ringBell();
    b.setColor("red");
    b.makeWarningSound();

    Car c = new Car();
    c.makeWarningSound();
    c.setColor("black");

    Vehicle v = new Car();

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(c);
    vehicles.add(b);

    // you can only access vehicle props and methods here
    // vehicles.get(0).wipeWindshield();

  }

}
