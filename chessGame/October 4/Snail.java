public class Snail extends Animal {
  public Snail(String name) {
    super(name, "Snail");  // now we must have a name for each dog
  }

  public String noise() {
    return "tschlep";
  }
}
