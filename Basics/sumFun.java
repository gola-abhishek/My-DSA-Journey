// sum of number using fxn

import java.util.Scanner;

public class sumFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter num 2 : ");
        int num2 = input.nextInt();

        sum(num1, num2);
    }

    static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The Sum is : " + sum);
    }
}
