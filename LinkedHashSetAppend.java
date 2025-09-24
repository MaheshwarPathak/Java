import java.util.LinkedHashSet;

public class LinkedHashSetAppend {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");

        System.out.println("Before: " + set);

        // Append element
        set.add("Three");

        System.out.println("After: " + set);
    }
}
