//Switch case for week 

import java.util.Scanner;

public class Scase3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Day Number : ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wedday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please valid days Only");
        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
        }
    }
}
