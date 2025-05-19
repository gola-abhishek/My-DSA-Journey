// Nested Switch Case 

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String Dep = input.next();

        switch (empID) {
            case 1:
                System.out.println("Employ 1 ");
                break;
            case 2:
                System.out.println("Employ 2 ");
                break;
            case 3: {
                switch (Dep) {
                    case "it":
                        System.out.println("It Department");
                        break;
                    case "Management":
                        System.out.println("It Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
            }
                break;
            default: {
                System.out.println("enter correct empID ");
            }
        }

    }
}
