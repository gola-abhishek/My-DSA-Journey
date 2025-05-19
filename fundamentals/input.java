// taking input from user

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();// for string next(); or nextLine();
        System.out.println(name);

        System.out.println("Enter Any Number");
        int x = sc.nextInt();// for integer
        System.out.println(x);
    }
}
// nextFloat(); nextDouble(); etc...