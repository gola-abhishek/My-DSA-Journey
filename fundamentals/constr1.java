import java.util.Scanner;

class Algebra {
    int a;
    int b;

    Algebra(int x, int y) {
        System.out.println("Constructor Called ");
        a = x;
        b = y;
    }

    int add() {
        int ans = a + b;
        return ans;
    }

    int sub() {
        int ans = a - b;
        return ans;
    }

    int mul() {
        int ans = a * b;
        return ans;
    }
}

public class constr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Algebra obj = new Algebra(x, y);
        
        // int ans1 = obj.add();
        // System.out.println(ans1);
        // int ans2 = obj.sub();
        // System.out.println(ans2);
        // int ans3 = obj.mul();
        // System.out.println(ans3);
        
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
    }
}
 