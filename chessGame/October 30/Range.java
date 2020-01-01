import java.util.Iterator;

public class Range implements Iterator<Integer> {

  private int start;
  private int end;
  private int step;

  public Range(int start, int end, int step) {
    this.start = start;
    this.end = end;
    this.step = step;
  }

  public boolean hasNext() {
    return start < end;
  }

  public Integer next() {
    int ret = start;
    start += step;
    return ret;
  }

  public Iterator<Integer> iterator() {
    return this;
  }

  public static void main(String[] args) {
    Range evens = new Range(0, 10, 2);
    while (evens.hasNext()) {
      System.out.println(evens.next());
    }

    for (Integer i: new Range(0, 10, 2)) {
      System.out.println(i);
    }
  }
}
