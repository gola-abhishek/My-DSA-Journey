// print the a to the power b 

import java.util.*;

public class apowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans =1;
        for (int i = 1; i<=b; i++){
            ans = ans * a;
        }
        System.out.println(ans);
    }
}
