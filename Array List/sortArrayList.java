// program to sort arrayList
import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    
    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(10);
        // list.add(3);
        // list.add(5);
        // list.add(22);
        // list.add(10);
        // System.out.println("Original List : " + list); // num lit 
        // Collections.sort(list);
        // System.out.println("Sorted Ascending List : " + list); // sorted num list 
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println("Sorted Descending List : " + list); // sorted num list 

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("Hello");
        l1.add("Good");
        l1.add("Morning");
        System.out.println("Original : " + l1);
        Collections.sort(l1);
        System.out.println("sorted Ascending : " + l1); // lexographical order  
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("sorted : " + l1);
    }
}
