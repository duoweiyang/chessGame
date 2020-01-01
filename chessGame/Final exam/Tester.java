public class Tester {
  public static void main(String[] args) {
    Alpaca fred = new Alpaca("Fred", 0, "Los Angeles, CA");
    Alpaca gina = new Alpaca("Gina", 1, "Pierre, SD");
    gina = fred;
    Alpaca henry = new Alpaca("Henry", 2, "Warm Springs, GA");
    System.out.println(gina.getAlpacaNum());
    System.out.println(henry.getAlpacaNum());
    fred.setName("Tony");
    System.out.print(henry.getName() + ", ");
    System.out.print(gina.getName() + ", ");
    System.out.print(fred.getName());
  }
}
