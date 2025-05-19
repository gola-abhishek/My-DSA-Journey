// Largest of three num 

import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num 1 :");
        float a = input.nextFloat();
        System.out.println("Enter num 2 :");
        float b = input.nextFloat();
        System.out.println("Enter num 3 :");
        float c = input.nextFloat();

        float max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(" The maximum in all is : " + max);
    }
}
