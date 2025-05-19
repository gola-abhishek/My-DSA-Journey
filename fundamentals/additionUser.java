// taking input from user and then adding 

import java.util.Scanner;

public class additionUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER BOTH THE NUMBER");

        int num1 = sc.nextInt();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println(sum);

    }
}
