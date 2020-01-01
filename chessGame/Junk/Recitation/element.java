public class Element {
  private String name;  // private things are private to that file
  private int atomicNumber;
  private double atomicWeight;
  private boolean radioactive;

  public Element(String name, int atomicNumber, double atomicWeight, boolean radioactive) {
    this.name = name;
    this.atomicNumber = atomicNumber;
    this.atomicWeight = atomicWeight;
    this.radioactive = radioactive;
    charged = false;
  }
  public Element(String name, int atomicNumber, double atomicWeight) {
    this(name, atomicNumber, atomicWeight, false);
  }

  public void change() {
    this.charged = true;
  }
  public void bondWith(Element O) {
    System.out.println("I, " + name + "bonded with " + o.name);
    o.name = name + " " + o.name + "ide";
    System.out.println("BOOM");
  }
  public String getname() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public boolean getRadioactivity() {
    return this.radioactive;
  }
  public String toString() {
    return this.name;
  }
}
