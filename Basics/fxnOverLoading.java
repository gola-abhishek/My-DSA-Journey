import java.util.Scanner;

public class fxnOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String name = sc.next();

        fun(x);
        fun(name);
    }

    static void fun(String name) {
        System.out.println("The Given Name is : " + name);
    }

    static void fun(int no) {
        System.out.println("The Given No. is : " + no);
    }
}
