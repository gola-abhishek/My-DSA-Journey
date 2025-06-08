import java.util.Scanner;

public class factorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

// Recurrrence Relation - relation between given value and smaller subproblem 