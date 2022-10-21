package OOP.mod06;

public class Main {
  public static void main(String[] args) {
    Bag<Groceries> groceriesBag = new Bag<>();
    groceriesBag.setContent(new Groceries());

    Bag<SuperCuteTinyDog> dogBag = new Bag<>();
    dogBag.setContent(new SuperCuteTinyDog());

    Bag<Laptop> laptopBag = new Bag<>();
    laptopBag.setContent(new Laptop());

    Bag<Object> objectBag = new Bag<>();
    objectBag.setContent(new Laptop());
    objectBag.setContent(new SuperCuteTinyDog());
  }
}
