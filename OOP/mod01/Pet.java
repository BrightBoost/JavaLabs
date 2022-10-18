package OOP.mod01;

public class Pet {
  private String name;

  public Pet() {}

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if(name.length() > 1) {
      this.name = name;
    }
  }

}
