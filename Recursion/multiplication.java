import java.util.Scanner;

public class multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Num 2 :");
        int num2 = sc.nextInt();

        System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + multiply(num1, num2));

        sc.close();
    }
    
    // Recursive method to multiply two numbers

    static int multiply(int a, int b) {
        // Base case
        if (b == 0) {
            return 0;
        }

        // If b is negative, convert to positive and negate the result
        if (b < 0) {
            return -multiply(a, -b);
        }

        // Recursive case
        return a + multiply(a, b - 1);
    }
}