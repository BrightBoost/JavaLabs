package persons;

public class Person {
  private String name;
  protected String phoneNr;

  public Person(String name, String phoneNr) {
    this.name = name;
    this.phoneNr = phoneNr;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
