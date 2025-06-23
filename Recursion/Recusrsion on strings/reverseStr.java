import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();

        System.out.println(reverse(s, 0));
        System.out.println(reverse2(s));
        sc.close();
    }
    
    static String reverse(String s, int idx) {
        // base case
        if (idx == s.length()) {
            return "";
        }

        // recursive work
        String smallAns = reverse(s, idx + 1);

        // self work
        return smallAns + s.charAt(idx);
    }

    static String reverse2(String s) {
        if (s.length() == 0) return "";
        String smallAns = reverse2(s.substring(1));
        return smallAns + s.charAt(0);
    }
    
}
