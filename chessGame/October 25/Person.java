import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String toString() {
    return String.format("%s (%d)", name, age);
  }

  public String getName() {
    return name;
  }

// Particular ordering we want for this class
  public int compareTo(Person other) {
    return this.age - other.age;
  }

  public static void main(String[] args) {
    List<Person> peeps = new ArrayList<>();
    peeps.add(new Person("Tyler", 30));
    peeps.add(new Person("Robert", 40));
    peeps.add(new Person("Marla", 31));

    System.out.println(peeps);
    Collections.sort(peeps);
    System.out.println(peeps);
  }
}
