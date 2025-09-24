
import java.util.*;

public class MapSize {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Map: " + map);
        System.out.println("Size of Map: " + map.size());
    }
}
