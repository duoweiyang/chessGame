public class Dog extends Animal {
  public Dog(String name) {
    super(name, "Dog");  // now we must have a name for each dog
  }

  public String noise() {
    return "woof";
  }

  public String wagTail() {
    return "wag";
  }
}

// Dog is concrete because it doesn't have any abstract methods
