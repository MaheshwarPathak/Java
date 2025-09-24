 import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> itr = list.iterator();
        System.out.println("Iterating using Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

