import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();

        int ans = 0;// binary number
        int pwr = 1;// power of 10
        while (decimal_num > 0) {
            int parity = decimal_num % 2;
            ans += parity * pwr;
            pwr *= 10;
            decimal_num /= 2;

        }
        System.out.println(ans);
    }
}
 