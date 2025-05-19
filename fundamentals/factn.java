// factorial of a num 

import java.util.*;

public class factn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");

        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i<=n; i++){
            fact = fact * i;
            System.out.println("Factorial of " + i + " : " + fact); 
        }
    }
}
