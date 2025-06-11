import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Number of digits : " + count(n));

        sc.close();
    }

    // Count the no of digits using recursion

    static int count(int n) {

        if (n >= 0 && n <= 9)
            return 1;

        return count(n / 10) + 1;
    }

}
