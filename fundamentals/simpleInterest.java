// simple interset
 
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle Amount");
        Float principle = sc.nextFloat();
        System.out.println("Enter rate");
        Float rate = sc.nextFloat();
        System.out.println("Enter time");
        Float time = sc.nextFloat();

        Float SI = (principle * rate * time) / 1000;
        System.out.println(SI);
    }
}
