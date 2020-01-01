public class Zoo {

public static void main(String[] args) {
    Animal[] animals = {new Dog("Chloe"),
                        new Cat("Gary"),
                        new Dachshund("Sausages"),
                        new Cat("Fiona")};
    Dachshund d = new Dachshund("Hans");
    System.out.println(d.wagTail());
    System.out.println(((Dog) d).noise()); //yip yip

//    for (Animal a: animals) {
//    System.out.println(a.noise()); // client code. Instantiation.
    }
  }


// Animal[] animals = {new Animal("Chloe")}; will not compile
// Can't be something like "Chloe". You cannot instantiate interfaces.
// Abstract v.s. concrete (non-instantiable v.s. instantiable)
// Cat d = new Dachshund("Hans"); will not work because it's not in the inheritance chain
// You can cast up and down the chain. Casting up the chain is always safe. Casting down the chain is not always safe. Be careful.
// Casting the object shuts the compiler up.
