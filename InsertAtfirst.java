import java.util.*;
public class InsertAtfirst {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

         System.out.println("Before: " + list);

        list.add(0, 5);

        System.out.println("After: " + list);
    }
}
