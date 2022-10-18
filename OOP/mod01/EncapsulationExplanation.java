package OOP.mod01;

public class EncapsulationExplanation {
  public static void main(String[] args) {
    Pet p = new Pet();
    System.out.println(p.getName());
    p.setName("B");
    System.out.println(p.getName());
    p.setName("Bobbi");
    System.out.println(p.getName());
    
  }
}
