package Fundamentals.mod05;

public class MainApp {
  public static void main(String[] args) {
    CellPhone phone1 = new CellPhone(12345, "iPhone", "ATT", "902-302-2938", "Austin");
    CellPhone phone2 = new CellPhone();
    phone2.setCarrier("tmobile");
    phone2.setModel("iPhone");
    phone2.setOwner("Joelle");
    phone2.setSerialNr(22222);
    phone2.setPhoneNr("602-555-2222");

    phone2.dial(phone1.getPhoneNr());
    display(phone1);
    System.out.println("***********");
    CellPhone.display(phone2);
  }

  public static void display(CellPhone phone) {
    System.out.println("Serial number: " + phone.getSerialNr());
    System.out.println("Model: " + phone.getModel());
    System.out.println("Owner: " + phone.getOwner());
    System.out.println("Phone number: " + phone.getPhoneNr());
    System.out.println("Carrier: " + phone.getCarrier());
  }
}
