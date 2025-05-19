// variable length arguments 

import java.util.*;

public class varArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 9, 6, 23, 54, 67, 32, 2);

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
