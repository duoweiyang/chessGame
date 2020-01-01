public class ElementTester {
  public static void main(String[] args) {
    Element a = new Element("Hydrogen", 1, 1.01, false);
    Element b = new Element("Tungsten", 74, 183.84, false);
    Element c = new Element("Krypton", 36, 83, 83.8);
    System.out.println(c.getRadioactivity());

    System.out.println(a.getName());
    a.bondwith(b);
    System.out.println(b.getName());
    a.setName("Helium");
    System.out.println(a.getName());

    System.out.println(a.toString());
    System.out.println(a);
  }
}
