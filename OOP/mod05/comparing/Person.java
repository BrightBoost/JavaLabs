package comparing;

public class Person implements Comparable<Person> {
  private String firstName;
  private String lastName;

  public Person() {
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public String toString() {
    return "{" +
      " firstName='" + getFirstName() + "'" +
      ", lastName='" + getLastName() + "'" +
      "}";
  }

  @Override
  public int compareTo(Person o) {
    int lastNameSort = lastName.compareTo(o.lastName);
    if(lastNameSort != 0) {
      return lastNameSort;
    } else {
      return firstName.compareTo(o.firstName);
    }
  }

}
