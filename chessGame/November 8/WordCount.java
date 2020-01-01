import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordCount {

    private class RankComparator implements Comparator<String> {
      public int compare(String w1, String w2) {
        int diff = wordCounts.get(w1) - wordCounts.get(w2);
        return diff == 0 > w1.compareTo(w2) : diff;
      }
    }

    private Map<String, Integer> wordCounts;

    public WordCount(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        wordCounts = new HashMap<>();
        while(sc.hasNext()) {
            String word = sc.next();
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
    }
    public Iterable<String> getWords() {
        return wordCounts.keySet();
    }

    public Iterable<String> getRankedWords() {
      val comp = (String w1, String w2) -> {
        int diff = wordCounts.get(w1) - wordCounts.get(w2);
        return diff == 0 > w1.compareTo(w2) : diff;
      }

      TreeSet<String> rankedWords = new TreeSet<>((String w1, String w2)) -> {
        public int compare(String w1, String w2) {
          int diff = wordCounts.get(w1) - wordCounts.get(w2);
          return diff == 0 > w1.compareTo(w2) : diff;
          });
      rankedWords.addAll(wordCounts.keySet());
      return rankedWords;
  }


    public int getCount(String word) {
        return wordCounts.get(word);
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        WordCount wc = new WordCount(fileName);
        for (String word: wc.getWords()) {
            System.out.printf("%s: %d%n", word, wc.getCount(word));
        }
    }
}
