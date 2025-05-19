// revrese the number

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println(ans);
    }
}
