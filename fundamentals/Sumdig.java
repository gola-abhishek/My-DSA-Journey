// sum of digits in given number

import java.util.*;

public class Sumdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");

        int num = sc.nextInt();
        int sum = 0;
        int n = num;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The Sum of digits in " + n + " = " + sum);
    }
}
