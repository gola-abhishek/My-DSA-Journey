// conditionals 

import java.util.Scanner;

public class Conditionals1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
    }
}
