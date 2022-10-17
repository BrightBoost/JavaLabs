package Fundamentals.mod05;

public class CellPhone {
  private int serialNr;
  private String model;
  private String carrier;
  private String phoneNr;
  private String owner;

  public CellPhone() {}

  public CellPhone(int serialNr, String model, String carrier, String phoneNr, String owner) {
    this.serialNr = serialNr;
    this.model = model;
    this.carrier = carrier;
    this.phoneNr = phoneNr;
    this.owner = owner;
  }

  public void dial(String phoneNumber) {
    System.out.println(owner + " is dialing " + phoneNumber);
  }


  public int getSerialNr() {
    return this.serialNr;
  }

  public void setSerialNr(int serialNr) {
    this.serialNr = serialNr;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getCarrier() {
    return this.carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getPhoneNr() {
    return this.phoneNr;
  }

  public void setPhoneNr(String phoneNr) {
    this.phoneNr = phoneNr;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
  
  public static void display(CellPhone phone) {
    System.out.println("Serial number: " + phone.serialNr);
    System.out.println("Model: " + phone.model);
    System.out.println("Owner: " + phone.owner);
    System.out.println("Phone number: " + phone.phoneNr);
    System.out.println("Carrier: " + phone.carrier);
  }


}
