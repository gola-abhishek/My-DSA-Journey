// taking input from userr

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS :");

        System.out.println("ENTER NUM 1 :");
        int num1 = input.nextInt();
        System.out.println("ENTER NUM 2 :");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The Resulted Sum is : " + sum);

    }
}
