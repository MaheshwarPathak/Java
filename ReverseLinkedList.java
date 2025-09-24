import java.util.*;

public class ReverseLinkedList {
     public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Original List: " + list);

        Iterator<String> itr = list.descendingIterator();
        System.out.print("Reverse Order: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
