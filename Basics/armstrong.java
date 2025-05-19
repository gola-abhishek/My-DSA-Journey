// armstrong number 

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArmstrong(n));

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;

        }
        return sum == original;
    }
}
