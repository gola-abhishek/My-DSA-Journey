// Fibonacci 

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Number of Fibonacci numbers to generate
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}