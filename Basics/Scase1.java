// switch case of fruits 

import java.util.Scanner;

public class Scase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "orange":
                System.out.println("Round Juicy Fruit");
                break;
            case "apple":
                System.out.println("A Sweet Red Fruit");
                break;
            case "mango":
                System.out.println("King Of Fruit");
                break;
            default:
                System.out.println("Please valid fruit Only");
        }
    }
}
