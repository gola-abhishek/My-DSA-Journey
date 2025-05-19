//Enhanced switch case of fruits 

import java.util.Scanner;

public class Scase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit( orange / apple / mango : )");
        String fruit = input.next();

        switch (fruit) {
            case "orange" -> System.out.println("Round Juicy Fruit");
            case "apple" -> System.out.println("A Sweet Red Fruit");
            case "mango" -> System.out.println("King Of Fruit");
            default -> System.out.println("Please valid fruit Only");
        }
    }
}