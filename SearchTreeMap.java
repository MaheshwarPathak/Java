import java.util.*;
public class SearchTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "Red");
        tmap.put(2, "Blue");
        tmap.put(3, "Green");

        System.out.println("TreeMap: " + tmap);

        String searchValue = "Blue";
        if (tmap.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' found!");
        } else {
            System.out.println("Value not found!");
        }
    }
}
