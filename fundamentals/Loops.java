// Loops 

import java.util.Scanner;
// print 1 to n 
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = sc.nextInt();

        int num = 1;
        int sum = 0;
        
        while(num <= n){
            // System.out.println(num);
            sum = sum + num;
            num++;
            
        }
        System.out.println("Result is :");
        System.out.println(sum); 
        System.out.println(num - 1 ); 
    }
}
