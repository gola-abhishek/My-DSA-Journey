// occurence of number 5

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 10 == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
