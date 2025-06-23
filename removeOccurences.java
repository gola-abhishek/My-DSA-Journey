import java.util.Scanner;

public class removeOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to remove A : ");
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        System.out.println(removeA2(s));
        sc.close();
    }

    static String removeA(String s, int idx) {
        // base case
        if (idx == s.length()) {
            return " ";
        }

        // recursive work
        String smallAns = removeA(s, idx + 1);
        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a' && currChar != 'A') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    // method 2
    static String removeA2(String s) {
        // base case
        if (s.length() == 0) {
            return "";
        }

        // recursive work
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);

        // self work
        if (currChar != 'a' && currChar != 'A') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }
}
