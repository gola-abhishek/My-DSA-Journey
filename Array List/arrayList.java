// import java.util.arrayList;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(4);
        System.out.println(x);

        Float f = Float.valueOf(4f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>(); // defining array list 

        // add element in array list 
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        // getting element from index 
        System.out.println(l1.get(1)); //2
        
        // print array list with loop 
        for (int i = 0; i < l1.size(); i++) { // l1.size() <-- for length of array
            System.out.println(l1.get(i)); //1,2,3,4
        }

        // print without loops directly
        System.out.println(l1); // [1,2,3,4]

        // addding elements at index i 
        l1.add(1, 7);
        System.out.println(l1); // [1,7,2,3,4]

        //modifying element at index i
        l1.set(1, 5);
        System.out.println(l1);// [1,5,2,3,4]

        //deleting element at index i
        l1.remove(1);
        System.out.println(l1);// [1,2,3,4]

        // removing an element e
        l1.remove(Integer.valueOf(2));
        System.out.println(l1);// [1,3,4]

        // checking if element exists
        System.out.println(l1.contains(3)); // true

        // If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList<>();
        l.add("abc");
        l.add(1);
        l.add(true);
        System.out.println(l);
        
    }
}
