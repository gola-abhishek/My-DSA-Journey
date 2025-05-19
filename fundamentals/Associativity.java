// Associativity 

import java.util.Scanner;

public class Associativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pqr" + 4 + 2);

        System.out.println(4 + 2 + "pqr");

        System.out.println("Enter p");
        int p = sc.nextInt();

        System.out.println("Enter q");
        int q = sc.nextInt();

        System.out.println("Enter r");
        int r = sc.nextInt();

        int s = p - ++r - ++q;
        System.out.println(s);

        boolean x = false;
        boolean y = false;
        boolean z = true;

        System.out.println(x == y == z);// checking if p==q and then their result==r
    }

}
