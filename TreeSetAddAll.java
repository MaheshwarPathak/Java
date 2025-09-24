import java.util.TreeSet;

public class TreeSetAddAll {
     public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(50);

        // Add all elements
        set2.addAll(set1);

        System.out.println("Combined TreeSet: " + set2);
    }
}
