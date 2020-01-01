import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;

public class WordCount {

  public Map<String, Integer> wordCounts;

  public WordCount(String fileName) throws FileNotFoundException {
    Scanner sc = new Scanner(new File(fileName));
wordCounts = new HashMap<>();
    while(sc.hasNext()) {
      String word = sc.next();
      if (wordCounts.containsKey(word)) {
        int count = wordCounts.get(word);
        wordCounts.put(word, count + 1); // Better than count++ 
      } else {
        wordCounts.put(word, 1); // Putting 1 is okay here.
      }
    }
  }

  public Iterable<String> getWords() {
    return wordCounts.keySet(); // Set interface
  }

  public int getCount(String word) {
    return wordCounts.get(word);
  }

  public static void main(String[] args) throws FileNotFoundException {
    String fileName = args[0]; // runtime: outofbounds
    WordCount wc = new WordCount(fileName);
    for (String word: wc.getWords()) {
      System.out.printf("%s: %d%n", word, wc.getCount(word));
    }
  }
}
