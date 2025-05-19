import java.util.Scanner;

class algebra{
    int add(int a , int b){
        int ans = a + b ;
        return ans;
    }
}

public class sumfun {

    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int x = sc.nextInt();
        System.out.println("Enter Number 2 :");
        int y = sc.nextInt();

        System.out.println("The sum of two number is : " + obj.add(x, y) );
    }
}