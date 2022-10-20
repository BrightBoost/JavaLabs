package animals;

public class Main {
  public static void main(String[] args) {
    Dog d = new Dog("Piper", "canine", "Super cute tiny dog", true);
    System.out.println(d.getName() + " - " + d.getBreed());

    Animal a = new Dog();
  }
  
}
