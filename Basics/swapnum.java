// swapping numbers

import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int x = input.nextInt();
        System.out.println("Enter number 2 : ");
        int y = input.nextInt();

        System.out.println("Before Swapping : " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping : " + x + " " + y);

    }
}
