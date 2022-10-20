package vehicles;

public abstract class Vehicle {
  private String vin;
  private String color;
  private int maxSpeed;

  public Vehicle(String vin, String color, int maxSpeed) {
    this.vin = vin;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  public Vehicle() {
  }


  public String getVin() {
    return this.vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public abstract void makeWarningSound();


}
