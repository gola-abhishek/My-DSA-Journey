// check if a number is an Armstrong number.

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int total = armStrong(n);
        if (total == n) {
            System.out.println("Yes, " + n + " is an Armstrong number");
        } else {
            System.out.println("No, " + n + " is not an Armstrong number");
        }
        sc.close();
    }

    static int armStrong(int n) {
        if (n >= 0 && n <= 9) {
            return n * n * n;
        }
        int rem = n % 10;
        return armStrong(n / 10) + rem * rem * rem;
    }
}