package employees;

import persons.Person;

public class Employee extends Person {
  public String employeeId;

  public Employee(String name, String phoneNr, String employeeId) {
    super(name, phoneNr);
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void test() {
    this.phoneNr = "012333423434";
    System.out.println("the nr is: " + this.phoneNr);
    Object o = new Exception();
  }

}
