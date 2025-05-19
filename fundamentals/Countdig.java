// count number of digits in given number 
 
import java.util.*;

public class Countdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numer : ");

        int num = sc.nextInt();
        int Count = 0;
        int n = num;

        while (num > 0) {
            num = num / 10;
            Count++;
        }
        System.out.println("The number of digits in " + n + " = " + Count);
    }
}
