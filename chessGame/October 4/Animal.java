public abstract class Animal {

  private String name;
  private String species;

  public Animal(String name, String type) {           // constructor
    this.name = name;                               //initializing
    this.species = species;
  }

  public String getName() {
    return name;
  }

  public String getSpecies() {
    return species;
  }

  public abstract String noise();
}

// Write your code as generic as possible, so it's more reusable
// Try not to hardcode it. Makes reusing it difficult.
// Use subclasses to the detailed stuff
