package animals;


public class Animal {
  protected String name;
  private String species;

  public Animal() {}

  public Animal(String name, String species) {
    this.name = name;
    this.species = species;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecies() {
    return this.species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

}