import java.util.Scanner;

public class PpowerQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p and q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("P power Q = " + pow(p, q));
        System.out.println("P power Q = " + pow1(p, q));
        sc.close();
    }

    static int pow(int p, int q) { // TC - O(q)
        if (q == 0)
            return 1;
        return p * pow(p, q - 1);
    }

    static int pow1(int p, int q) { // TC - O(q/2)
        if (q == 0)
            return 1;
        if (q % 2 == 0) {
            return pow1(p, q / 2) * pow1(p, q / 2);
        }
        return p * pow1(p, q / 2) * pow1(p, q / 2);
    }
}