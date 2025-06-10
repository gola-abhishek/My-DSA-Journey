import java.util.Scanner;

public class seriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Simple Series Sum : " + seriesSum1(n)); // simple series sum 

        System.out.println("Alternate Series Sum : " + seriesSum2(n)); // alt. series sum 

        sc.close();
    }

    static int seriesSum1(int n) { // simple series 1+2+3+....N
        if (n == 0)
            return 0;
        return seriesSum1(n - 1) + n;
    }
    
    static int seriesSum2(int n) { // alternate series 1-2+3-4+5-......N
        if (n == 0)
            return 0;
        
        if (n%2 != 0) {
            return seriesSum2(n - 1) + n;
        } else {
            return seriesSum2(n - 1) - n;
        }
    }
}
