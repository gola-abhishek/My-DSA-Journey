// conversion of binary to decimal 

import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int ans = 0; // converted decimal number
        int pwr = 1; // 2 ^ 0 = 1 ; power of 2
        while (binary_num > 0) {
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pwr);
            binary_num /= 10;
            pwr *= 2;

        }
        System.out.println(ans);
    }
}
