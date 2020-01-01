class Alpaca {
  private int alpacaNum;
  private String name;
  private String hometown;

  public Alpaca(String name, int alpacaNum, String hometown) {
    alpacaNum++;
    this.name = name;
    this.hometown = hometown;
  }
  public int getAlpacaNum() {
    return alpacaNum;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
