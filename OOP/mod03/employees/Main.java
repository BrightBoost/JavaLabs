package employees;

import employees.Employee;
import persons.Person;

public class Main {
  public static void main(String[] args) {
    Employee emp = new Employee("blabla", "123", "67a");
    emp.setName("Bobbi");
    System.out.println(emp.getName());
  }
}
