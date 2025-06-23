import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();

        String rev = reverse(s, 0); // usking reverse fxn method 
        if (rev.equals(s)) {
            System.out.println("Palindrome ");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(isPalindrome(s, 0, s.length() - 1)); // Approach 2

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

    static boolean isPalindrome(String s, int l, int r) {
        if (l >= r)
            return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }
}
