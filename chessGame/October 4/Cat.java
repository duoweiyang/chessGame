public class Cat extends Animal {
  public Cat(String name) {
    super(name, "Cat");  // now we must have a name for each dog
  }

  public String noise() {
    return "meow";
  }
}
