package animals;

public class Dog extends Animal {
  protected String breed;
  private boolean isGoodDog;
  
  public Dog() {

  }

  public Dog(String name, String species, String breed, boolean isGoodDog) {
    super(name, species);
    this.breed = breed;
    this.isGoodDog = isGoodDog;
  }

  public String getBreed() {
    return this.breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public boolean getIsGoodDog() {
    return this.isGoodDog;
  }

  public void setIsGoodDog(boolean isGoodDog) {
    this.isGoodDog = isGoodDog;
  }

  @Override
  public void eat() {
    System.out.println("Dog eating");
    
  } 
}
