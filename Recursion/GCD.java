import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(approach1(x, y));// brute force
        System.out.println(approach2(x, y));// long division

        System.out.println("GCD : " + gcd(x, y));// Euclid's Algorithm
        System.out.println("LCM : " + lcm(x,y));// lcm of two numbers
        sc.close();
    }

    static int approach1(int x, int y) { // not efficient - Brute Force approach
        int min = Math.min(x, y);
        while (x % min != 0 || y % min != 0) {
            min--;
        }
        return min;
    }

    static int approach2(int x, int y) { // not efficient - Long Division approach
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y) { // Euclid's Algorithm - efficient approach
        if (y == 0)
            return x;
        return gcd(y, x % y); // to remember
    }

    static int lcm(int x, int y) { // lcm of two numbers
        return (x * y) / (gcd(x, y));
    }
}
