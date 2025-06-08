import java.util.Scanner;

public class printNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Increasing Nums : ");
        printIncresing(n);

        System.out.println();

        System.out.println("Decreasing Nums : ");
        printDecresing(n);
        sc.close();
    }

    static void printIncresing(int n) {
        if (n == 1) { // base case
            System.out.print(n + " ");
            return;
        }
        printIncresing(n - 1);// recursive work 
        System.out.print(n + " ");// self work
    }
    static void printDecresing(int n) {
        if (n == 1) { // base case
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");// self work
        printDecresing(n - 1); // recursive work
    }
}