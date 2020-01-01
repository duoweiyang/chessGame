import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<GTStudent> list = new ArrayList<>();
        list.add(new GTStudent("Charles", 3.9));
        list.add(new GTStudent("Stephanie", 1.0));
        list.add(new GTStudent("Alan", 4.0));
        list.add(new GTStudent("James", 3.1));

        Collections.sort(list);
        System.out.println(list);

        Comparator byName = Comparator.comparing(GTStudent::);
        Collections.sort(list, byName);
        System.out.println(list);
    }
}
