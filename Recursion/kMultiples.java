import java.util.Scanner;

public class kMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter k :");
        int k = sc.nextInt();
        System.out.println("The k multiples of num are : ");
        printMultiple(n, k);
        sc.close();
    }
    
    static void printMultiple(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMultiple(n, k - 1);
        System.out.println(n*k);
    }
}
