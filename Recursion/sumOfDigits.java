import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number  : ");
        int n = sc.nextInt();

        System.out.println("The sum of Digits is : " + sum(n));
        sc.close();
    }

    static int sum(int n) {

        if (n >= 0 && n <= 9)
            return n;

        return sum(n / 10) + n % 10;
    }
}
