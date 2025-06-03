import java.util.ArrayList;
import java.util.Collections;

public class revArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List : " + list);
        reverseList(list); // method 1
        System.out.println("Reverse list : " + list);
        Collections.reverse(list); // method 2
        System.out.println("Reverse list : " + list);

    }

    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            // int temp = i;
            // i = j;
            // j = temp;
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}