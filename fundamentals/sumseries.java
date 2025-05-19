// sum of series 1-2+3-4+5-6+7-8+9-10.....

import java.util.*;

public class sumseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = sc.nextInt();
        int ans = 0;

        for(int i = 0; i<=n; i++)
        {
            if (i%2==0) {
                ans -= i;   
            }else{
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
